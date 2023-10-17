package models;

import java.util.*;

public class FillShop {
   private static Scanner scanner1 = new Scanner(System.in);

    public List<Toy> createToys() throws InputMismatchException {
        Random random = new Random();
        boolean flag = true;
        List<Toy> list = new ArrayList<>();
        while (flag) {
            System.out.println("Как бы ты хотел заполнить магазин? 1. - Рандомно, 2 - Самостоятельно");
            int ans = Integer.parseInt(scanner1.next());
            switch (ans) {
                case 1:
                    String[] toyName = new String[]{"Billi", "Filly", "Killy", "Gloin", "Nory", "Dory", "Biffur", "Boffur", "Bombur", "Torrin"};
                    int[] amount = new int[]{2, 2, 3, 2,2,3,2,2,3,2};
                    for (int i = 0; i < 5; i++) {
                        int index = random.nextInt(0, 3);
                        switch (ToyType.values()[index]) {
                            case Robot:
                                list.add(new Robot(toyName[random.nextInt(toyName.length)], amount[random.nextInt(amount.length)]));
                                break;
                            case Pazzle:
                                list.add(new Pazzle(toyName[random.nextInt(toyName.length)], amount[random.nextInt(amount.length)]));
                                break;
                            case Doll:
                                list.add(new Doll(toyName[random.nextInt(toyName.length)], amount[random.nextInt(amount.length)]));
                                break;
                        }
                    }
                    flag = false;
                    break;
                case 2:
                    System.out.println("Сколько игрушек ты хочешь создать (введи неотрицательную цифру):");
                    int ind = Integer.parseInt(scanner1.next());
                    for (int i = 0; i < ind; i++){
                        System.out.println("Введите название игрушки: ");
                        String name = scanner1.next();
                        System.out.println("Введите количество: ");
                        int qu = Integer.parseInt(scanner1.next());
                        System.out.println("Введите тип игрушки: 0 - Робот, 1 - Пазл, 2 - Кукла");
                        int type = Integer.parseInt(scanner1.next());
                        switch (ToyType.values()[type]) {
                            case Robot:
                                list.add(new Robot(name, qu));
                                break;
                            case Pazzle:
                                list.add(new Pazzle(name, qu));
                                break;
                            case Doll:
                                list.add(new Doll(name, qu));
                                break;
                        }
                    }
                    flag = false;
                    break;
                default:
                    System.out.println("Неверный выбор! Попробуй еще раз.");
            }
        }
        return list;
    }

}
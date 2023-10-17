import models.ToysModel;
import presenters.ShopPresenter;
import views.ShopView;

import java.util.Scanner;


public class Program {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ShopView shopView = new ShopView();
        ShopPresenter shopPresenter = new ShopPresenter(new ToysModel(), shopView);
        String userName = shopView.intro();
        boolean flag = true;
        System.out.println("Давайте начнем наш розыгрыш!");
        while (flag){
            System.out.println("Выберите один из следующих пунктов: 1.Добавить игрушки для розыгрыша; 2.Показать все имеющиеся игрушки; 3.Сменить шанс выпадения для игрушки;" +
                    " 4.Разыграть приз; 5.Принять приз; 6.Получить талон для выдачи приза.7.Выйти");
            try{
            if(scanner.hasNext()) {
                int key = Integer.parseInt(scanner.nextLine());
                switch (key) {
                    case 1:
                        shopPresenter.addToys();
                        break;
                    case 2:
                        shopPresenter.showToys();
                        break;
                    case 3:
                        try {
                            System.out.println("Tрубется ввести имя игрушки и шанс через ';'");
                            String[] arr = scanner.nextLine().trim().split(";");
                            shopPresenter.changeToyFrequency(arr[0], Double.parseDouble(arr[1]));
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            System.out.println("Не верный ввод данных. " + ex.getMessage());
                        }catch (NumberFormatException ex) {
                            System.out.println("Нет таких");
                        }
                        break;
                    case 4:
                        try {
                        shopPresenter.showYourPrize();
                        }catch(NullPointerException e){
                            System.out.println("Магазин пуст");
                        }
                        break;
                    case 5:
                        shopPresenter.confirm();
                        break;
                    case 6:
                        shopPresenter.createCoupon(userName);
                        break;
                    case 7:
                        System.out.println("Пока!");
                        flag = false;
                        scanner.close();
                        break;
                        default:
                            System.out.println("Мимо!");
                }

            }
            }catch(NumberFormatException e){
                System.out.println("Ввод букв вместо цифр. Попробуй еще раз");
            }
        }

    }
}
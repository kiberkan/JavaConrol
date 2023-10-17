package views;

import models.EmptyArrayException;
import models.Toy;
import presenters.Views;

import java.util.List;

public class ShopView implements Views {

    @Override
    public void showShowcase(List<Toy>arr){
        try {
            if(arr.size()>1) {
                for (Toy item : arr) {
                    System.out.println(item);
                }
            }else{
                throw new EmptyArrayException();
            }
        }catch(EmptyArrayException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void ShowFortuneRezult(Toy toy) {
        System.out.println(String.format("Congratulation! Your prize is id - %s, toyName  - %s, type - %s", toy.getId(), toy.getToyName(), toy.getClass().getSimpleName()));
    }

    public String intro(){
        Introduction introduction = new Introduction();
        String name = introduction.introHello();
        return name;
    }

}
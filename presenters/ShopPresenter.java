package presenters;

import models.Toy;

import java.util.ArrayList;
import java.util.List;

public class ShopPresenter {
    private final Model model;
    private final Views views;
    private List<Toy> tempArr;
    private Toy select;
    public ShopPresenter(Model model, Views views) {
        this.model = model;
        this.views = views;
        if(tempArr == null){
            tempArr = new ArrayList<>();
        }
    }

    public void addToys(){
        tempArr.clear();
        tempArr.addAll(model.addToys());
    }
    public void showToys(){
        views.showShowcase(tempArr);
    }
    public void changeToyFrequency(String name, double fr){
        views.showShowcase(model.changeFrequency(name, fr));
    }
    public void showYourPrize(){
        select = model.prizeSelection();
        views.ShowFortuneRezult(select);
    }
    public void confirm(){
        tempArr = model.listOfPresents(select);
    }
    public void createCoupon(String name){
        model.makeCheck(name);
    }
}
package presenters;

import models.Toy;

import java.util.List;

public interface Views {
    void showShowcase(List<Toy> toyArray);
    void ShowFortuneRezult(Toy toy);
}
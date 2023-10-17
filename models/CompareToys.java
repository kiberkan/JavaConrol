package models;


import java.util.Comparator;

public class CompareToys implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return (int) (o2.getFrequency() - o1.getFrequency());
    }

}
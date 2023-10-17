package models;

public abstract class Toy {
  
    public String getId() {
        return id;
    }

    public String getToyName() {
        return toyName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public Toy(String id, String toyName, int quantity, double frequency) {
        this.id = id;
        this.toyName = toyName;
        this.quantity = quantity;
        this.frequency = frequency;
        count += this.quantity;
    }
    public String showVin() {
        return String.format("toy name - %s, frecquency - %.1f , toy class - %s\n",
                getToyName(), getFrequency(), this.getClass().getSimpleName());
    }
    private final String id;
    private final String toyName;
    private int quantity;
    private double frequency;
    public static int count;
}
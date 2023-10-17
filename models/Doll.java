package models;
import java.util.UUID;

public class Doll extends Toy{
    public Doll(String toyName, int quantity) {
        super(UUID.randomUUID().toString(), toyName, quantity, 0.4);
    }
    @Override
    public String toString() {
        return String.format("toy id - %s, toy name - %s, toy quantity - %d, frecquency - %.1f , toy class - %s\n",
                getId(), getToyName(), getQuantity(), getFrequency(), this.getClass().getSimpleName());
    }
 }
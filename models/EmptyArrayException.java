package models;

public class EmptyArrayException extends Exception{
    @Override
    public String getMessage() {
        return "Магазин пуст, начните с заполнения";
    }
}
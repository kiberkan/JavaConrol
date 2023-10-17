package views;

import java.util.Scanner;

public class Introduction{
    public String introHello() {
            Scanner scanner = new Scanner(System.in);
            String text = null;
            System.out.println("Привет давай начнем! Как тебя зовут? ");
            while(((text = scanner.nextLine()).isEmpty()||(text.equals(" ")))){
                System.out.println("Как тебя зовут?");
            }
            return text;
    }
}

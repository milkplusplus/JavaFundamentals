package javase03.t02;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class GuessingGame {

    private void start(){
        Scanner in = new Scanner(System.in);
        System.out.print("Choose your language (English - 1, Russian - 2): ");
        Locale locale = new Locale(in.nextInt() == 2 ? "ru" : "en");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("guessinggame", locale);
        System.out.println(resourceBundle.getObject("q1"));
        System.out.println(resourceBundle.getObject("a1"));
        in.close();
    }

    public static void main(String[] args) {
        new GuessingGame().start();
    }
}

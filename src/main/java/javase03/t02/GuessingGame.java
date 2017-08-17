package javase03.t02;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class GuessingGame {

    private void start() {
        Scanner in = new Scanner(System.in);
        System.out.print("Choose your language (English - 1, Russian - 2): ");
        Locale locale = new Locale(in.nextInt() == 2 ? "ru" : "en");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("guessinggame", locale);
        //"index + 1" because in properties we start from q1
        for (int index = 0; index < getCountOfQuestions(resourceBundle); index++)
            System.out.println(String.format("%d) %s",  index + 1, resourceBundle.getObject(String.format("q%d",index + 1))));
        System.out.print("\n" + resourceBundle.getObject("i"));
        int key = in.nextInt();
        while (key != 0) {
            System.out.println(resourceBundle.getObject(String.format("q%d", key)));
            System.out.println(resourceBundle.getObject(String.format("a%d", key)));
            System.out.print("\n" + resourceBundle.getObject("i"));
            key = in.nextInt();
        }
        in.close();
    }

    @SuppressWarnings("InfiniteLoopStatement")
    private int getCountOfQuestions (ResourceBundle resourceBundle) {
        int count = 0;
        try {
            while (true) {
                resourceBundle.getObject(String.format("q%d", count + 1));
                count++;
            }
        } catch (java.util.MissingResourceException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        new GuessingGame().start();
    }
}

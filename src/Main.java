import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What's Your name?");
        String imie = new Scanner(System.in).nextLine();
        String out = "Marian";
        if (imie.equalsIgnoreCase(out)) {
            System.out.println("Spierdalaj " + imie);
        } else {
            System.out.println("siema " + imie);
        }
    }
}
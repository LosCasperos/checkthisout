import java.util.Scanner;

public class Calulator_Simple_1 {
    public static void main(String[] args) {
        System.out.println("Podaj liczba1"); // Prosba o pierwsza liczbe
        int liczba1 = new Scanner(System.in).nextInt();  // program zczytuje podana liczbe
        System.out.println("Podaj liczba2"); // Prosba o druga liczbe
        int liczba2 = new Scanner(System.in).nextInt(); // program zczytuje podana liczbe
        System.out.println(liczba1); // program wyswietla podane liczbe
        System.out.println(liczba2); // program wyswietla podane liczbe
        System.out.println(liczba1 + liczba2);

    }
}
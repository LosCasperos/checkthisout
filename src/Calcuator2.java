import java.util.Scanner;

public class Calcuator2 {
    public static void main(String[] args) {
        System.out.println("Jakie chcesz wykonac dzialanie (+ - * /)");
        String dodac = "+";
        String odjac = "-";
        String podzielic = "/";
        String pomnozyc = "*";
        String dzialanie = new Scanner(System.in).nextLine();

        System.out.println("Podaj liczba1"); // Prosba o pierwsza liczbe
        int liczba1 = new Scanner(System.in).nextInt();  // program zczytuje podana liczbe
        System.out.println("Podaj liczba2"); // Prosba o druga liczbe
        int liczba2 = new Scanner(System.in).nextInt(); // program zczytuje podana liczbe

        if (dzialanie.equals(dodac)) {
            System.out.println(liczba1 + liczba2);
        }
        if (dzialanie.equals(odjac)) {
            System.out.println(liczba1 - liczba2);
        }
        if (dzialanie.equals(podzielic)) {
            System.out.println(liczba1 / liczba2);
        }
        if (dzialanie.equals(pomnozyc)) {
            System.out.println(liczba1 * liczba2);
        }
    }
}
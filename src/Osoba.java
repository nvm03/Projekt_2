import java.util.Scanner;

public class Osoba {
    Scanner scanner = new Scanner(System.in);
    String nazwisko;
    String imie;
    String ulica;
    String kod;
    String miasto;
    public void inicjuj(){
        System.out.println("Podaj swoje nazwisko: ");
        nazwisko = scanner.nextLine();
        System.out.println("Podaj swoje imie: ");
        imie = scanner.nextLine();
        System.out.println("Podaj swoja ulice: ");
        ulica = scanner.nextLine();
        System.out.println("Podaj swoj kod: ");
        kod = scanner.nextLine();
        System.out.println("Podaj swoje miasto: ");
        miasto = scanner.nextLine();

    }
    public void drukuj(){
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Imie: " + imie);
        System.out.println("Twoja ulica: " + ulica);
        System.out.println("Twoj kod: " + kod);
        System.out.println("Twoje miasto: " + miasto);
    }
}

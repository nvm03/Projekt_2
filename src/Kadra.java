import java.util.Scanner;

public class Kadra extends Osoba{
    Scanner scanner = new Scanner(System.in);
    String wyksztalcenie;
    String stanowisko;
    public void inicjuj1(){
        inicjuj();
        System.out.println("Podaj swoje wyksztalcenie: " );
        wyksztalcenie = scanner.nextLine();
        System.out.println("Podaj swoje stanowisko: ");
        stanowisko = scanner.nextLine();

    }
    public void drukuj1(){
        drukuj();
        System.out.println("Twoje wyksztalcenie: " + wyksztalcenie);
        System.out.println("Twoje stanowisko: " + stanowisko);
    }

}

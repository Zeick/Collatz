
import java.util.Scanner;
import Collatz.*;
        
public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Collatz col = new Collatz(lukija);
        int valinta;
        alkutekstit();
        while (true) {
            tulostaValikko();
            valinta = Integer.parseInt(lukija.nextLine());
            if (valinta == 1) {
                col.montakoIteraatiota();
            } else if (valinta == 2) {
                System.out.println("Rakenteilla...");
            } else if (valinta == 3) {
                System.out.println("Rakenteilla...");
            } else if (valinta == 4) {
                break;
            }
        }
        lopputekstit();
    }

    public static void alkutekstit() {
        System.out.println("COLLATZ-ohjelma.\n(C) 2017 Urbanautti ja Zeick.");
        System.out.println("LOADING...");
    }

    public static void lopputekstit() {
        System.out.println("Kiitos ja näkemiin!");

    }

    public static void tulostaValikko() {
        System.out.print("----------------------------------------\n"
                         + "|(1) Tulosta iteraatioiden määrä       |\n"
                         + "|(2) Tulosta kaikki iteraatiot         |\n"
                         + "|(3) Tulosta iteraatio reaaliajassa    |\n"
                         + "|(4) Lopeta                            |\n"
                         + "----------------------------------------\n? ");
    }
}

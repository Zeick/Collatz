
import java.util.Scanner;
import Collatz.*;

public class Main {

    private static final int ITERAATIOMAARA = 1;
    private static final int TULOSTA_KAIKKI = 2;
    private static final int REAALIAIKAINEN_PAIVITYS = 3;
    private static final int LOPETA_OHJELMA = 4;

    public static void main(String[] args) throws InterruptedException {
        alkutekstit();
        ohjelmanSuoritus();
        lopputekstit();
    }

    public static void alkutekstit() {
        System.out.println("COLLATZ-ohjelma.\n(C) 2017 Urbanautti ja Zeick.");
        // Tähän joku (satunnaisgeneroitu?) alkutervehdys?
    }

    public static void ohjelmanSuoritus() throws InterruptedException {
        Scanner lukija = new Scanner(System.in);
        Collatz col = new Collatz(lukija);
        int valinta;
        while (true) {
            tulostaValikko();
            valinta = Integer.parseInt(lukija.nextLine());
            if (valinta == LOPETA_OHJELMA) {
                break;
            } else if (valinta == TULOSTA_KAIKKI) {
                col.tulostusPaalle();
            } else if (valinta == REAALIAIKAINEN_PAIVITYS) {
                col.realTimePaalle();
            } else if (valinta == ITERAATIOMAARA) {
                ;
            } else {
                continue;
            }
            col.montakoIteraatiota();
            Thread.sleep(3000);
        }
    }

    public static void lopputekstit() {
        System.out.println("Kiitos ja näkemiin!");
        // Tähän joku (satunnaisgeneroitu?) lopputervehdys?
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

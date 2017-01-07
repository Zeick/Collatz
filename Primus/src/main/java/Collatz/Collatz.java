/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collatz;

import java.util.Scanner;

/**
 *
 * @author tjkarkka
 */
public class Collatz {

    private Scanner lukija;
    private int iteraatiot;
    private long luku;
    private boolean printAll;
    private boolean realTime;

    public Collatz(Scanner lukija) {
        this.lukija = lukija;
        reset();
    }

    public void reset() {
        this.iteraatiot = 0;
        this.printAll = this.realTime = false;
    }

    public void tulostusPaalle() {
        this.printAll = true;
    }

    public void realTimePaalle() {
        this.realTime = true;
    }

    public void montakoIteraatiota() throws InterruptedException {
        kysyLuku();
        while (luku > 1) {
            iteroi();
            iteraatiot++;
        }
        System.out.println("Iteraatioita suoritettu " + iteraatiot);
        reset();
    }

    public void iteroi() throws InterruptedException {
        if (luku % 2 == 0) {
            luku = luku / 2;
        } else {
            luku = (luku * 3) + 1;
        }
        if (printAll) {
            System.out.println(luku);
        } else if (realTime) {
            System.out.print(luku);
            Thread.sleep(300);
            System.out.print("\r");
            System.out.print("                    ");
            System.out.print("\r");
        }
    }

    public void kysyLuku() {
        System.out.print("Syötä positiivinen kokonaisluku: ");
        try {
            luku = Long.parseLong(lukija.nextLine());
        } catch (Exception e) {
            System.out.println("VIRHE: Et syöttänyt lukua.");
            return;
        }
        if (luku <= 0) {
            System.out.println("VIRHE: Luku ei ole positiivinen.");
            return;
        }
    }
}

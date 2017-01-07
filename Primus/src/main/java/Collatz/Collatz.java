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
    private int luku;
    private boolean printAll;

    public Collatz(Scanner lukija) {
        this.lukija = lukija;
        reset();
    }

    public void reset(){
        this.iteraatiot = 0;
        this.printAll = false;
    }
    
    public void tulostusPaalle() {
        this.printAll = true;
    }

    public void montakoIteraatiota() {
        kysyLuku();
        while (luku > 1) {
            iteroi();
            iteraatiot++;
        }
        System.out.println("Iteraatioita suoritettu " + iteraatiot);
        reset();
    }

    public void iteroi() {
        int jakojaannos = luku % 2;
        if (jakojaannos == 0) {
            luku = luku / 2;
        } else {
            luku = (luku * 3) + 1;
        }
        if (printAll) {
            System.out.println(luku);
        }
    }

    public void kysyLuku() {
        System.out.print("Syötä positiivinen kokonaisluku: ");
        try {
            luku = Integer.parseInt(lukija.nextLine());
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

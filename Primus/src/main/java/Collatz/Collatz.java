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

    public Collatz(Scanner lukija) {
        this.lukija = lukija;
        this.iteraatiot = 0;
    }

    public void montakoIteraatiota() {
        kysyLuku();
        while(luku > 1){
            iteroi();
        }
    }

    public void iteroi(){
        System.out.println("iteroidaan...");
        luku = 1;
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

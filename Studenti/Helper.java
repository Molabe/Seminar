package Studenti;

import java.util.Scanner;

public class Helper {
    public double vypocetPercentChlapci(int chlapci, int pocetZiakov) {
        return chlapci * 100 / pocetZiakov;
    }

    public double vypocetPercentDievcata(int dievcata, int pocetZiakov) {
        return dievcata * 100 / pocetZiakov;
    }

    public int zistiVek(int pocetZiakov) {
        int vek = 0;

        for (int i = 0; i <= pocetZiakov-1; i++) {
            System.out.println("Zadaj vek pre jedneho studenta: ");
            Scanner sc = new Scanner(System.in);
            vek += sc.nextInt();
        }
        vek /= pocetZiakov;
        return vek;
    }
}



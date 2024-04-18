package Studenti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chlapci, dievcata, pocetZiakov, priemernyVek;

        Helper help = new Helper();

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj celkovy pocet ziakov: ");
        pocetZiakov = sc.nextInt();
        System.out.println("Zadaj celkovy pocet chlapcov: ");
        chlapci = sc.nextInt();
        System.out.println("Zadaj celkovy pocet dievcat: ");
        dievcata = sc.nextInt();

        System.out.println(help.vypocetPercentChlapci(chlapci, pocetZiakov));
        System.out.println(help.vypocetPercentChlapci(dievcata, pocetZiakov));

        priemernyVek = help.zistiVek(pocetZiakov);
        System.out.println("Priemerny vek je: " + priemernyVek);

    }
}

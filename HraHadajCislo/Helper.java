package HraHadajCislo;

import java.util.Scanner;

public class Helper {

    public void hra(int bot) {

        int hrac;

        System.out.println("Zadaj cislo pre start hry: ");
        Scanner sc = new Scanner(System.in);

        hrac = sc.nextInt();

        int pocetPokus = 3;

        while (pocetPokus >= 0) {
            if (hrac == bot) { /* Vyhlasi vyhru a program sa vypne */
                System.out.println("Vyhral si");
                break;
            } else if (hrac > bot) { /* Vypise mensie cislo */
                System.out.println("Cislo je mensie");
                pocetPokus -= 1; /* Odcita pokus */
                System.out.println("Mas este: " + pocetPokus + " pocet pokusov"); /* vypise pocet pokusov */
                hrac = sc.nextInt(); /* Vyziada dalsie cislo */

                if (pocetPokus > 0) {
                    System.out.println("Cislo je mensie");
                    pocetPokus -= 1;
                    System.out.println("Mas este: " + pocetPokus + " pocet pokusov");
                    hrac = sc.nextInt();
                } else if (pocetPokus == 0) {
                    System.out.println("Cislo je mensie");
                    pocetPokus -= 1;
                    System.out.println("Mas posledny pokus");
                    hrac = sc.nextInt();
                }
            } else {
                System.out.println("Cislo je vacsie");
                pocetPokus -= 1;
                System.out.println("Mas este: " + pocetPokus + " pocet pokusov");
                hrac = sc.nextInt();
                if (pocetPokus > 0) {
                    System.out.println("Cislo je vacsie");
                    pocetPokus -= 1;
                    System.out.println("Mas este: " + pocetPokus + " pocet pokusov");
                    hrac = sc.nextInt();
                } else if (pocetPokus == 0) {
                    System.out.println("Cislo je vacsie");
                    pocetPokus -= 1;
                    System.out.println("Mas posledny pokus");
                    hrac = sc.nextInt();
                }
            }
        }
    }
}

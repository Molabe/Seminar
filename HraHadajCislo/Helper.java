package HraHadajCislo;

import java.util.Scanner;

public class Helper {

    public void hra(int bot) {

        int hrac;

        System.out.println("Zadaj cislo pre start hry: ");
        Scanner sc = new Scanner(System.in);

        hrac = sc.nextInt();

        int pocetPokus = 3;

        while (pocetPokus >= 1) {
            if (hrac == bot) { /* Vyhlasi vyhru a program sa vypne */
                System.out.println("Vyhral si");
                break;
            }
            if (hrac >= bot) { /* Vypise mensie cislo */
                System.out.println("Cislo je mensie");
                pocetPokus--; /* Odcita pokus */
                System.out.println("Mas este: " + pocetPokus + " pocet pokusov"); /* vypise pocet pokusov */
                hrac = sc.nextInt(); /* Vyziada dalsie cislo */

            } else {
                System.out.println("Cislo je vacsie");
                pocetPokus--;
                System.out.println("Mas este: " + pocetPokus + " pocet pokusov");
                hrac = sc.nextInt();
            }
        }
    }
}

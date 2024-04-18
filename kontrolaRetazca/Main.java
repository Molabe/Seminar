package kontrolaRetazca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        Scanner sc = new Scanner(System.in);

        String retazec;

        System.out.println("Zadaj slovo");
        retazec = sc.nextLine();

        helper.vypocetPismen(retazec);
        helper.vypocetCisiel(retazec);
        helper.vypocetMedzier(retazec);
    }
}

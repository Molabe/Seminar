package Kalkulacka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Helper help = new Helper();
        Scanner sc = new Scanner(System.in);

        double prveCislo = 0;
        double druheCislo = 0;
        char operacia;

        System.out.println("Zadaj prve cislo: ");
        prveCislo = sc.nextDouble();
        System.out.println("Zadaj druhe cislo: ");
        druheCislo = sc.nextDouble();
        System.out.println("Zadaj operaciu ( +, -, *, / ): ");
        operacia = sc.next().charAt(0);

        help.proces(operacia, prveCislo, druheCislo);
    }
}

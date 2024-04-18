package Kalkulacka;

public class Helper {

    public void proces(char znamienko, double a, double b) {
        switch (znamienko) {
            case '+':
                double sucet = a + b;
                System.out.println("Sucet cisiel " + a + " a " + b + " je: " + sucet);
                break;
            case '-':
                double odcitanie = a - b;
                System.out.println("Odcitanie cisiel " + a + " a " + b + " je: " + odcitanie);
                break;
            case '*':
                double nasobok = a * b;
                System.out.println("Nasobok cisiel " + a + " a " + b + " je: " + nasobok);
                break;
            case '/':
                double delenie = a / b;
                System.out.println("Delenie cisiel " + a + " a " + b + " je: " + delenie);
                break;
            default:
                System.out.println("Zadaj si neznamu operaciu");

        }
    }

}

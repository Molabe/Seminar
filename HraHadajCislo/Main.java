package HraHadajCislo;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Helper help = new Helper();
        Random rand = new Random();

        int hrac, bot;

        bot = rand.nextInt(0, 10)+1;

        help.hra(bot);
    }
}

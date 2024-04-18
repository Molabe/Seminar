package kontrolaRetazca;

public class Helper {
    public void vypocetPismen(String retazec) {
        int pocetPismen = 0;

        for (int i = 0; i < retazec.length(); i++) {
            char ch = retazec.charAt(i);
            if (Character.isLetter(ch)) {
                pocetPismen++;
            }
        }
        System.out.println("V texte je: " + pocetPismen + " pismen");
    }

    public void vypocetCisiel(String retazec) {
        int num = 0;

        for (int i = 0; i < retazec.length(); i++) {
            char ch = retazec.charAt(i);
            if (Character.isDigit(ch)) {
                num++;
            }
        }
        System.out.println("V texte je: " + num + " cisiel");
    }

    public void vypocetMedzier(String retazec) {
        int medzery = 0;

        for (int i = 0; i < retazec.length(); i++) {
            char ch = retazec.charAt(i);
            if (Character.isWhitespace(ch)) {
                medzery++;
            }
        }
        System.out.println("V texte je: " + medzery + " medzier");
    }
}

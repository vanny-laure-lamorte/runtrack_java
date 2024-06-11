package jour02.job09;

public class Boucle {
    public static void main(String[] args) {
        int Nb = 1234;

    String strNb = Integer.toString(Nb);

    char firstNb = strNb.charAt(0);

    char lastNb = strNb.charAt(strNb.length() - 1);

    System.out.println("Premier chiffre : " + firstNb);
    System.out.println("Dernier chiffre : " + lastNb);
    }
}

    

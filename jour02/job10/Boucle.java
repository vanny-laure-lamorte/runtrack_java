package jour02.job10;

public class Boucle {

    public static void main(String[] args) {

        int resultat = 0;

        int Nb = 1234; 
        String strNb = Integer.toString(Nb);

        int longueur =  strNb.length();   
        
        for (int i = 0; i <= longueur; i++ ) {
            resultat = resultat + i;
        }
        
        System.out.println("La somme des chiffre est " + resultat);
    }
}

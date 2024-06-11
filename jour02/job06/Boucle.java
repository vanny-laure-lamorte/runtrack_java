package jour02.job06;

public class Boucle {
    public static void main(String[] args) {

        int resultat = 0;

        for (int i=0; i<=100; i++) {
            if (i%2 == 0 && i !=0) {
                resultat = resultat +i; 
            }
        }

        System.out.println("La somme des nombres pairs entre 1 et 100 est : " + resultat);
    }
    
}

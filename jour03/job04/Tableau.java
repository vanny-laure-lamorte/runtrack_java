package jour03.job04;

public class Tableau {
    public static void main(String[] args) {

        // Initialisation du tableau
        int[] tableau = {3, 7, 3, 9, 8};

        // Tableau pour compter les doublons
        int[] count = new int[10]; 
        int i, tmp = 0;

        // Boucle pour compter les occurrences dans le tableau
        for (i = 0; i < tableau.length; i++) {
            tmp = tableau[i];
            count[tmp]++;
        }

        // Affichage des occurrences
        for (i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                if (count[i] == 1) {
                    System.out.print(i + " se produit " + count[i]+" fois\n");
                } else {
                    System.out.print(i + " se produit " + count[i]+" fois\n" );
                }
            }
        }
    }
}

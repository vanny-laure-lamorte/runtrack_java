package jour03.job05;

import java.util.HashSet;

public class Tableau {
    public static void main(String[] args) {

        //Initialisation du tableau
        int[] tableau = {10, 20, 30, 40, 50, 10, 20, 30, 1, 2, 3, 4, 5};

        // Stocker les valeurs uniques
        HashSet<Integer> valeursUniques = new HashSet<>();

        // Ajout des éléments uniques dans le HashSet
        for (int valeur : tableau) {
            valeursUniques.add(valeur);
        }

        // Affichage des valeurs uniques
        System.out.print("Les valeurs uniques dans le tableau sont: ");
        for (int valeur : valeursUniques) {
            System.out.print(valeur  + " ");
        }
    }
}

package jour03.job08;
import java.util.Arrays;

public class Tableau {
    
    public static void main(String[] args) {

        // Initialisation de la matrice
        int[][] tableau = {
            { 5, 9, 3 },
            { 7, 2, 8 },
            { 1, 6, 4 }
        };

        // Afficher les éléments de la matrice
        System.out.println("Matrice avant le trie:  ");
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();


        // Trier les éléments de la matrice
        for (int i = 0; i < tableau.length; i++) {
            Arrays.sort(tableau[i]);         
        }

        // Afficher la matrice après le trie
        System.out.println("Matrice après le trie :  ");        
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

    }
        
    };



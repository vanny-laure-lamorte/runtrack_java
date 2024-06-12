package jour03.job06;

import java.util.Random;

public class Tableau {
    public static void main(String[] args) {

        // Tableau de 10 entiers
        int[] tableau = new int[10];

        // Remplissage le tableau de façon random
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            tableau[i] = random.nextInt(100); // Nombres aléatoires entre 0 et 99
        }

        // Affichage le tableau
        System.out.print("Tableau de nombres randoms: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(tableau[i] + " ");
        }
    }
}
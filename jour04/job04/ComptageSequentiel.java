package jour04.job04;

import java.util.Scanner;

public class ComptageSequentiel {

    public static void main(String[] args) {
        
        // Saisie de l'utilisateur
        Scanner input = new Scanner(System.in);
        System.out.print("Nombre maximum à compter: ");
        int NbMax = input.nextInt();
        input.close();

        // Boucle pour compter
        for (int i = 1; i < NbMax+1; i ++) {
            System.out.println(i);
        }

        //  Calcul du temps écoulé
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;     
        System.out.println("Temps d'exécution : " + duration + " nanosecondes");

    }
    
}

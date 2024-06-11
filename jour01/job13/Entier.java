package jour01.job13;

import java.util.Scanner;

public class Entier {

    public static void main(String[] args) {
        
        // Saisie de l'utilisateur
        Scanner input = new Scanner(System.in);
        System.out.print("Choisir un nombre entier 1 :");
        int nombre = input.nextInt();
        input.close();

        // Afficher le nombre entier
        System.out.println("Voici le nombre entier choisi par l'utilisateur : " + nombre);

        // Boucle pour affichier les nombres entier jusqu'au chiffre choisi par l'utilisateur
        for (int i = 1; i <= nombre; i++) {
            System.out.println(i);
        }
    }
}

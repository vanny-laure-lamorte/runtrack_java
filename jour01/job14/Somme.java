package jour01.job14;

import java.util.Scanner;

public class Somme {

    public static void main(String[] args) {
        
        int somme; 
        // Saisie de l'utilisateur
        Scanner input = new Scanner(System.in);
        System.out.print("Choisir un nombre entier 1: ");
        int nombre1 = input.nextInt();
        System.out.print("Choisir un nombre entier 2: ");
        int nombre2 = input.nextInt();        
        input.close();

        // Addition
        somme = nombre1 + nombre2;

        // Afficher le resultat
        System.out.println(nombre1+" + " + nombre2 + " = " + somme);
    }
}

package jour02.job08;

import java.util.Scanner;

public class Boucle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Choisir un nombre :");
        int numero = input.nextInt();
        input.close();

        int longeur = String.valueOf(numero).length(); 

        System.out.println("Le nombre de chiffres dans " + numero + " est : " + longeur);
    }
}

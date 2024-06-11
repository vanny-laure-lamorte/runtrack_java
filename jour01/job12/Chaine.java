package jour01.job12;

import java.util.Scanner;

public class Chaine {
    public static void main(String[] args) {

        // Saisie de l'utilisateur
        Scanner input = new Scanner(System.in);
        System.out.print("Chaine de caractère 1 :");
        String chaine1 = input.nextLine();
        System.out.print("Chaine de caractère 2 :");
        String chaine2 = input.nextLine();
        input.close();

        // Afficher la saisie de l'utilisateur
        System.out.println("Avant l'échange");
        System.out.println("Chaine 1 : " + chaine1);
        System.out.println("Chaine 2 : " + chaine2);

        // Echange de chaine de caractère
        chaine1 = chaine1 + chaine2;
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length());
        chaine1 = chaine1.substring(chaine2.length());

        // Afficher la saisir de l'utilisateur après avoir fait l'échange
        System.out.println("\nAprès l'échange :");
        System.out.println("Chaine 1 : " + chaine1);
        System.out.println("Chaine 2 : " + chaine2);
    }
}




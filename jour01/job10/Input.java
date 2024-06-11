package jour01.job10;

import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Veuillez saisir votre prénom :");
            String prenom = input.nextLine();   
            System.out.println("Veuillez saisir votre Nom :");
            String nom = input.nextLine();
            input.close();

            System.out.println("Votre nom est: " + prenom + " " + nom);       
    }
}

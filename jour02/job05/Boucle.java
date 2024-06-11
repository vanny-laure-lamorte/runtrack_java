package jour02.job05;

import java.util.Scanner;

public class Boucle {
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);    
        System.out.print("Veuillez saisir votre age :");
        int age = input.nextInt();  
        input.close();

        if (age < 16) {
            System.out.println("Tu ne peux pas travailler");
        }

        else if (age >= 16 && age <=55 ) {
            System.out.println("Tu peux travailler");
        }

        else if (age > 55 && age <67) {
            System.out.println("Tu vas avoir du mal à trouver un empoi");
        }

        else if (age >= 67) {
            System.out.println("Tu es à la retraite");
        }
        else {
            System.out.println("Error");
        }
    }
    
}

package jour02.job11;

import java.util.Scanner;

public class Boucle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Choisir un chiffre :");
        int numero = input.nextInt();
        input.close();   

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

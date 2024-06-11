package jour02.job07;
import java.util.Scanner;

public class Boucle {
    public static void main(String[] args) {

        int y = 1;  
        Scanner input = new Scanner(System.in);    
        System.out.print("Choisir un nombre :");
        int nb = input.nextInt();  
        input.close();

        for (int i = 1; i<= nb; i++) {
            y = y*i;
        }
        
        System.out.println("La factorielle du nombre " + nb + " est : " + y);
    }
}


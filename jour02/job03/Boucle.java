package jour02.job03;

import java.util.Scanner;

public class Boucle {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);    
    System.out.print("Veuillez saisir un chiffre :");
    int number = input.nextInt();  
    System.out.println(); 
    input.close();
 
    for (int i =0 ; i <11 ; i++){
        System.out.println(i + "x"+ number +"="+ i * number);
    }

}
}

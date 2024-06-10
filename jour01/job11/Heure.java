package jour01.job11;

import java.util.Scanner;

public class Heure {
    public static void main(String[] args) {

        int heure; 
        int min; 

      Scanner input = new Scanner(System.in); 
      System.out.println("Entrez une durée en minute : ");
      int minute = input.nextInt();
      input.close();

      heure = minute / 60; 
      min = minute %60; 

      System.out.println(minute + " est équivalent à " + heure + " heures " + min + " minutes.");      
    }
    
}

package jour04.job06;

import java.util.Scanner;

public class CalculSomme {

    public static void main(String[] args) {
        
        // Demander à l'utilisateur de saisir la taille du table
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau: ");
        int size = input.nextInt();


        // Initialiser le tableau 
        int[] numbers = new int[size]; 

        // Demander à l'utilisateur de saisir les données du tableau  
        System.out.println("Entrez les éléments du tableau ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        } 


        input.close();  
        
        
        // Calculer la somme et mesurer le temps d'exécution
        long startTime = System.nanoTime(); 
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        long endTime = System.nanoTime(); 
        
        // Calculer le temps d'exécution en millisecondes et convertir les nanosecondes en millisecondes
        long duration = (endTime - startTime) / 1000000; 
        
        // Afficher la somme et le temps d'exécution
        System.out.println("La somme de tous les éléments du tableau est: " + sum);
        System.out.println("Temps d'exécution: " + duration + " ms");      
    }
    
}

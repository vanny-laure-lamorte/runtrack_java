package jour03.job01;

public class Tableau {
    public static void main(String[] args) {

        int []tableau = new int[5];

        tableau[0] = 10; 
        tableau[2] = 2; 
        tableau[4] = 69;

        // Boucle pour afficher les éléments du tableau
        System.out.print("Voici les élément du tableau : ");

        for (int i = 0; i <tableau.length; i++){
            System.out.print(tableau[i] + " ");
        }  
        
        // Afficher la valeur de l'index 1
        System.out.println();
        System.out.println("Valeur de l'index 1 : " + tableau[1]);
    }
}

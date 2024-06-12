package jour03.job02;

public class Tableau {
    public static void main(String[] args) {

        // Initialisation du tableau
        int []monTableau = {12,6, 76, 89};       

        // Afficher éléments du tableau
        System.out.print("Tableau avant changement: ");
        for (int i=0; i< monTableau.length; i++){
            System.out.print(monTableau[i] + " ");
        }

        // Nouvelle valeur du tableau
        monTableau[0] = 1; 
        monTableau[1] = 2; 
        monTableau[2] = 3; 
        monTableau[3] = 4;        

        // Afficher nouveaux éléments du tableau
        System.out.println();
        System.out.print("Tableau après changement: ");
        for (int i=0; i< monTableau.length; i++){
            System.out.print(monTableau[i] + " ");
        }
    }
    
}

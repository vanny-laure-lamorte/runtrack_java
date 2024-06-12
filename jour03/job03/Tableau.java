package jour03.job03;

public class Tableau {
    public static void main(String[] args) {

        // Initialisation du tableau
       String []Nom = {"Josette", "John","Myrtille", "Marc"}; 

       // Afficher le prénom John
       System.out.println(Nom[1]);

       // Modifier la valeur du tableau
       Nom[2] = "Mireille";

       // Afficher le tableau après changements
       System.out.print("Les prénoms du tableau: ");
       for(String noms: Nom) {        
        System.out.print(noms + " ");
       }
    }
}

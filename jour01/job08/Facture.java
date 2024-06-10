package jour01.job08;

public class Facture {
    public static void main(String[] args) {
        float prix = (float)49.99; 
        int quantite = 3; 

        float tarifHT = prix*quantite; 

        System.out.println("Le montant total est : " + tarifHT);

        float tva = (float) tarifHT*20/100;
        System.out.println("Le montant de la taxe est : " + tva);

        float tarifTTC = tarifHT + tva;
        System.out.println("Le montant total à payer est : " + tarifTTC);
    }
}

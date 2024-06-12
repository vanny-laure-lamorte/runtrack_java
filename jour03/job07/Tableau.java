package jour03.job07;

public class Tableau {
    public static void main(String[] args) {

        // Matrice 1
        int[][] matrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Matrice 2
        int[][] matrix2 = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        // Afficher la matrice 1
        System.out.println("La valeurs de la matrice 1:  ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();


        // Additionner les valeurs de la matrice1 à la matrice 2
        int l = 3, c = 3;
        int[][] S = new int[l][c];
        for(int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                S[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }        

        // Afficher la somme entre la matrice 1 et 2
        System.out.println("La somme des matrices est: ");
        for(int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(S[i][j] +"\t");
            }
            System.out.println();
        }
    }
}

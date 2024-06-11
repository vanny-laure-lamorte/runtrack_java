package jour02.job12;
public class Boucle{

    public static void main(String[] args) {
        int[] dice = {1, 2, 3, 4, 5, 6};
        int totalCombinations = 0;

        for (int d1 : dice) {
            for (int d2 : dice) {
                for (int d3 : dice) {
                    System.out.println(d1 + " " + d2 + " " + d3);
                    totalCombinations++;
                }
            }
        }
        System.out.println("Total number of combinations: " + totalCombinations);
    }
}

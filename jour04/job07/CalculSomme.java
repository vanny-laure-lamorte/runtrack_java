package jour04.job07;

import java.util.Scanner;

public class CalculSomme {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Demander à l'utilisateur de saisir les éléments du tableau
        System.out.println("Entrez les éléments du tableau ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Définir le temps de début
        long startTime = System.currentTimeMillis();

        int mid = size / 2;

        SumThread firstHalf = new SumThread(array, 0, mid);
        SumThread secondHalf = new SumThread(array, mid, size);

        // Démarrer les deux threads
        Thread thread1 = new Thread(firstHalf);
        Thread thread2 = new Thread(secondHalf);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Calculer la somme totale
        int totalSum = firstHalf.getSum() + secondHalf.getSum();

        // Définir le temps de fin
        long endTime = System.currentTimeMillis();

        // Afficher la somme totale et le temps d'exécution
        System.out.println("La somme totale est: " + totalSum);
        System.out.println("Temps d'exécution: " + (endTime - startTime) + " millisecondes");

        scanner.close();
    }
}

class SumThread implements Runnable {
    private int[] array;
    private int start;
    private int end;
    private int sum;

    public SumThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
    


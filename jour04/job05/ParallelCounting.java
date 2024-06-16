package jour04.job05;

import java.util.Scanner;

public class ParallelCounting {
    public static void main(String[] args) {

        // Saisie de l'utilisateur
        Scanner input = new Scanner(System.in);
        System.out.print("Nombre maximum à compter: ");
        int maxCount = input.nextInt();
        input.close();        

        int midPoint = maxCount / 2; 

        CounterThread thread1 = new CounterThread(1, midPoint);
        CounterThread thread2 = new CounterThread(midPoint + 1, maxCount);

        long startTime = System.currentTimeMillis();
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        int totalCount = thread1.getCount() + thread2.getCount();        
        long endTime = System.currentTimeMillis();        
        System.out.println("Compte total: " + totalCount);
        System.out.println("Temps d'exécution: " + (endTime - startTime) + " millisecondes");
    }
}




class CounterThread extends Thread {
    private int start;
    private int end;
    private int count;
    
    public CounterThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.count = 0;
    }
    
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            count++;
        }
    }
    
    public int getCount() {
        return count;
    }
}

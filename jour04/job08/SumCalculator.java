package jour04.job08;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;

public class SumCalculator {

    public static void main(String[] args) {

        // Nombre de threads utilisés
        int numberOfThreads = 10; 

        // Limite supérieure des nombres à additionner
        long range = 10000000; 
        long chunkSize = range / numberOfThreads; // 

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        List<Future<Long>> futures = new ArrayList<>();

        for (int i = 0; i < numberOfThreads; i++) {
            long start = i * chunkSize + 1;
            long end = (i == numberOfThreads - 1) ? range : (i + 1) * chunkSize;
            futures.add(executor.submit(new SumTask(start, end)));
        }

        long totalSum = 0;
        for (Future<Long> future : futures) {
            try {
                totalSum += future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        System.out.println("Total Sum: " + totalSum);
    }

    

    static class SumTask implements Callable<Long> {
        private final long start;
        private final long end;

        public SumTask(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Long call() throws Exception {
            long sum = 0;
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }
    }
}

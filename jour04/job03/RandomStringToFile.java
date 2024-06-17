package jour04.job03;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class RandomStringToFile {
    public static void main(String[] args) {

        // Saisie de l'utilisateur
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne de caractères à générer : ");
        int length = input.nextInt();
        input.close();
        
        //
        long startTime = System.currentTimeMillis();
        
        // Générer la chaîne de caractères en random
        String randomString = generateRandomString(length);

        // Définir les points de découpage pour les deux moitiés
        int midPoint = length / 2;
        String firstHalf = randomString.substring(0, midPoint);
        String secondHalf = randomString.substring(midPoint);
        
        // Création 2 threads pour écrire les deux moitiés dans le fichier
        Thread writerThread1 = new Thread(new StringWriterTask(firstHalf, "jour04/job03/output.txt", false));
        Thread writerThread2 = new Thread(new StringWriterTask(secondHalf, "jour04/job03/output.txt", true));
        
        writerThread1.start();
        writerThread2.start();
        
        try {
            writerThread1.join();
            writerThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long endTime = System.currentTimeMillis();
        
        System.out.println("Temps d'exécution : " + (endTime - startTime) + " ms");
    }

    // Générer une chaîne de caractères de façon random
    private static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char) ('a' + random.nextInt(26)));
        }
        return sb.toString();
    }

    // Classe Runnable pour écrire une chaîne de caractères dans un fichier
    private static class StringWriterTask implements Runnable {
        private String text;
        private String fileName;
        private boolean append;

        public StringWriterTask(String text, String fileName, boolean append) {
            this.text = text;
            this.fileName = fileName;
            this.append = append;
        }

        @Override
        public void run() {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, append))) {
                writer.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
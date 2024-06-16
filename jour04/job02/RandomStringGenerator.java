package jour04.job02;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {
    public static void main(String[] args) {

        // Saisie de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne de caractères à générer  : ");
        int length = scanner.nextInt();
        scanner.close();

        long startTime = System.currentTimeMillis();
        String randomString = generateRandomString(length);
        
        // Création du dossier si inexistant
                try {
            Files.createDirectories(Paths.get("jour04/job02"));
        } catch (IOException e) {
            System.err.println("Erreur lors de la création du dossier : " + e.getMessage());
            return;
        }

        // Création du fichier si inexistant
        try (FileWriter writer = new FileWriter("jour04/job02/output.txt")) {
            writer.write(randomString);
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }


        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Le programme a généré et écrit la chaîne en " + executionTime + " millisecondes.");
    }

    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
}

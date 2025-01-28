import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter text to hash:");
        String input = scanner.nextLine();

        try {
            // Get SHA-256 MessageDigest instance
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

            // Convert input string to byte array
            byte[] inputBytes = input.getBytes();

            // Compute the hash
            byte[] hashBytes = messageDigest.digest(inputBytes);

            // Convert hash bytes to hexadecimal format
            StringBuilder hashHex = new StringBuilder();
            for (byte b : hashBytes) {
                hashHex.append(String.format("%02x", b));
            }

            // Print the hash
            System.out.println("Hashed value (SHA-256): " + hashHex.toString());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error: SHA-256 algorithm not found.");
        }
    }
}

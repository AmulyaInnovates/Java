import java.util.Scanner;

public class EmailCharFrequency {

    public static void findFrequencies(String email) {
        
        char[] chars = new char[email.length()];
        int[] freq = new int[email.length()];
        int uniqueCount = 0;

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            if (!Character.isLetter(ch)) {
                boolean found = false;

                for (int j = 0; j < uniqueCount; j++) {
                    if (chars[j] == ch) {
                        freq[j]++;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    chars[uniqueCount] = ch;
                    freq[uniqueCount] = 1;
                    uniqueCount++;
                }
            }
        }

        System.out.println("Frequencies of numeric and special characters:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(chars[i] + " --> " + freq[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email ID: ");
        String email = scanner.nextLine();

        findFrequencies(email);

        scanner.close();
    }
}

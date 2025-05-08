import java.util.Scanner;

public class SubStringCounter {

    // Function to count substrings of a given length using arrays
    public static void countSubstrings(String input, int length) {
        String[] substrings = new String[input.length() - length + 1];
        int[] counts = new int[substrings.length];
        int uniqueCount = 0;

        for (int i = 0; i <= input.length() - length; i++) {
            String sub = input.substring(i, i + length);
            boolean found = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (substrings[j].equals(sub)) {
                    counts[j]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                substrings[uniqueCount] = sub;
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        // Display the results
        System.out.println("Substring counts of length " + length + ":");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(substrings[i] + " : " + counts[i]);
        }
    }

    // Main method for input/output
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the length of substrings to count: ");
        int length = scanner.nextInt();

        if (length <= 0 || length > input.length()) {
            System.out.println("Invalid substring length!");
        } else {
            countSubstrings(input, length);
        }

        scanner.close();
    }
}

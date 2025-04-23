import java.util.ArrayList;
import java.util.Scanner;

public class StringCall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> letters = new ArrayList<>();

        System.out.println("Type one character at a time. Type '0' to stop:");

        while (true) {
            char letter = scanner.next().charAt(0);
            if (letter == '0') {
                break;
            }
            letters.add(letter);
        }

        String word = "";
        for (char letter : letters) {
            word = word + letter;
        }

        System.out.println("Full word: " + word);
        System.out.println("Length of word: " + word.length());

        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }

        System.out.println("Reversed word: " + reverseWord);

        int size = word.length();
        if (size % 2 == 0) {
            String firstHalf = word.substring(0, size / 2);
            String secondHalf = word.substring(size / 2);
            System.out.println("First part: " + firstHalf);
            System.out.println("Second part: " + secondHalf);
        } else {
            System.out.println("The word cannot be divided into two equal parts.");
        }

        scanner.close();
    }
}

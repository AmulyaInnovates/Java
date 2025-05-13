import java.util.Scanner;

public class KMP_String_Matching {

    void searchPattern(String pattern, String text) {
        int patternLength = pattern.length();
        int textLength = text.length();

        int[] lps = new int[patternLength];
        computeLPSArray(pattern, patternLength, lps);

        int i = 0;
        int j = 0;

        while (i < textLength) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == patternLength) {
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1];
            } else if (i < textLength && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }

    void computeLPSArray(String pattern, int length, int[] lps) {
        int len = 0;
        lps[0] = 0;
        int i = 1;

        while (i < length) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text to search in: ");
        String text = scanner.nextLine();

        System.out.print("Enter the pattern to search for: ");
        String pattern = scanner.nextLine();

        KMP_String_Matching kmp = new KMP_String_Matching();
        kmp.searchPattern(pattern, text);
    }
}


// Step 1: Ask the user to enter the main text and the pattern to search for
// Step 2: Create an array (lps) to store the longest prefix that is also a suffix
// Step 3: Fill this lps array using a helper method
// Step 4: Start comparing characters of pattern and text
// Step 5: If characters match, move forward
// Step 6: If full pattern matches, print the index and continue
// Step 7: If characters don't match, use lps to skip comparisons
// Step 8: Repeat until the whole text is checked

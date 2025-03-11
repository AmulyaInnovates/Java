//CHECK THIS FILE FOR TEMPLATE :- Keypad.png

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneKeypadCombinations {

    // Keypad mapping
    static Map<Integer, String> keypad = new HashMap<>();

    static {
        keypad.put(2, "abc");
        keypad.put(3, "def");
        keypad.put(4, "ghi");
        keypad.put(5, "jkl");
        keypad.put(6, "mno");
        keypad.put(7, "pqrs");
        keypad.put(8, "tuv");
        keypad.put(9, "wxyz");
    }

    // Recursive function to find all combinations
    public static void findCombinations(int[] digits, int index, String current, List<String> result) {
        if (index == digits.length) {
            result.add(current);
            return;
        }

        int digit = digits[index];
        String letters = keypad.get(digit);

        if (letters != null) {
            for (char letter : letters.toCharArray()) {
                findCombinations(digits, index + 1, current + letter, result);
            }
        } else {
            findCombinations(digits, index + 1, current, result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of digits
        System.out.print("Enter the number of digits: ");
        int n = sc.nextInt();

        int[] digits = new int[n];

        // Take inputs individually
        System.out.println("Enter the digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        List<String> result = new ArrayList<>();

        // Add an empty string for blank possibility
        result.add("");

        if (digits.length > 0) {
            findCombinations(digits, 0, "", result);
        }

        // Output the result
        for (String combination : result) {
            System.out.println(combination);
        }

        sc.close();
    }
}

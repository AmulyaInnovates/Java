import java.util.*;
import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Taking user input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // Swapping first and last elements
        if (numbers.size() > 1) { // Ensure there are at least two elements
            int first = numbers.get(0);
            int last = numbers.get(numbers.size() - 1);
            numbers.set(0, last);
            numbers.set(numbers.size() - 1, first);
        }

        // Printing the modified ArrayList
        System.out.println("Modified ArrayList: " + numbers);
        
        scanner.close();
    }
}

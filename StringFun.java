import java.util.Scanner;

class StringFun {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scn = new Scanner(System.in);

        // Ask the user to input the size of the string
        System.out.print("Enter the number of characters: ");
        int n = scn.nextInt();

        // Read the string characters as a single input
        System.out.print("Enter the string: ");
        scn.nextLine(); // Consume the newline character left by nextInt
        String original = scn.nextLine();

        // Display the original string
        System.out.println("Original String: " + original);

        // Reverse the string using StringBuilder
        String reverse = new StringBuilder(original).reverse().toString();

        // Display the reversed string
        System.out.println("Reverse String: " + reverse);

        // Display the concatenated string
        System.out.println("Concatenated String: " + original + " ⟶ " + reverse);
    }
}

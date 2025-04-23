import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String result = "";

        if (!input.contains(" ")) {
            result = new StringBuilder(input).reverse().toString();
        } else {
            String[] words = input.split(" ");
            for (int i = words.length - 1; i >= 0; i--) {
                result += new StringBuilder(words[i]).reverse().toString();
                if (i > 0) result += " ";
            }
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}

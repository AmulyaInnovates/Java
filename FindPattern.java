import java.util.Scanner;

public class FindPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pattern (P): ");
        String P = scanner.next();
        System.out.println("Enter text (T): ");
        String T = scanner.next();
        scanner.close();

        P = P.toLowerCase();
        T = T.toLowerCase();

        int count = 0;
        int index = T.indexOf(P);

        while (index != -1) {
            count++;
            index = T.indexOf(P, index + 1);
        }

        System.out.println("Occurrences: " + count);
    }
}

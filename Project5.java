import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Maximum number till Fibunacci Series !!!");
        int n = sc.nextInt();
        int first = 0, second = 1;
        int a=0;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + "  |||  ");

            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

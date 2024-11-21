import java.util.Scanner;

public class Project6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = "";
        int i = input.length() - 1;
        while (i >= 0) {
            reversed += input.charAt(i);
            i--; 
        }
        System.out.println("Reversed string: " + reversed);
    }
}

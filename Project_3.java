import java.util.Scanner;

public class Project_3 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number for different tasks !!!");
    int num = sc.nextInt();

    System.out.println("What do you want to check for integer? 1. Odd or Even 2. Square 3. Cube");
    int choice = sc.nextInt();
    switch(choice) {
        case 1:
        if (num % 2 == 0) {
            System.out.println("The number is even.");
            System.out.println("-_-_-_-_-_-_Thank You-_-_-_-_-_-_");
        }
        else {
            System.out.println("The number is odd.");
            System.out.println("-_-_-_-_-_-_Thank You-_-_-_-_-_-_");
        }
        break;

        case 2:
            int square= num * num;
            System.out.println("The square of the number is: " + square);
            System.out.println("-_-_-_-_-_-_Thank You-_-_-_-_-_-_");
            break;

        case 3:
            int cube= num * num * num;
            System.out.println("The cube of the number is: " + cube);
            System.out.println("-_-_-_-_-_-_Thank You-_-_-_-_-_-_");
            break;

        default:
            System.out.println("Invalid choice!");
    }

    
    

}
}

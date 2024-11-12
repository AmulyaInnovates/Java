import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("What is your name? ");
        String str= sc.nextLine();
        System.out.println("What is your age? ");
        int age= sc.nextInt();
        System.out.println("How much Percentage you got in Previous Year? ");
        float marks= sc.nextFloat();
        System.out.println("-----------------------------------------------------");
        System.out.println("Name: "+ str + " |Age: " + age + " |Percentage: " + marks);
    }
}
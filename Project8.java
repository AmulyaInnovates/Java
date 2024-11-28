import java.util.Scanner;

public class Project8 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number :- ");
        int num1= sc.nextInt();
        System.out.println("Enter the second number :- ");
        int num2= sc.nextInt();
        System.out.println("Enter the third number :- ");
        int num3= sc.nextInt();
        System.out.println("Do you want to 1) Add 2) Subtract 3) Multiply 4) Highest 5) Lowest");
        int choice= sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("The sum is "+(num1+num2+num3));
            break;

            case 2:
            System.out.println("The difference is "+(num1-num2-num3));
            break;

            case 3:
            System.out.println("The product is "+(num1*num2*num3));
            break;

            case 4:
            System.out.println("The highest number is "+(Math.max(Math.max(num1,num2),num3)));
            break;

            case 5:
            System.out.println("The lowest number is "+(Math.min(Math.min(num1,num2),num3)));
            break;
        }
}}

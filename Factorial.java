import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Give the number for finding factorials");
        int n= sc.nextInt();
        System.out.println("Factorial of number " + n +" is :-" + factorial_find(n));
        
    }

    public static int factorial_find(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n*factorial_find((n-1));
    }
}

import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number you want to find descreasing values for :- ");
        int n= sc.nextInt();
        
        System.out.println("-----------------------------------------------------");
        decreasing(n);
    }

    public static void decreasing(int n){
        if (n<=0){
            return;
        }
         System.out.println(n);
         decreasing(n-1);
        }
}

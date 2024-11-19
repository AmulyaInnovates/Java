import java.util.Scanner;

public class Loops_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("The maximum value :- ");
        int sum= 0;
        int n= sc.nextInt();
        for (int i=1;i<(n+1);i++){
                sum = sum + i;
        }
        System.out.println("The Addition of numbrs from 1 till "+n+ " is as follows :- "+ sum);
    }
}

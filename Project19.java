import java.util.Scanner;

public class Project19 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of values you want in the Array");
    int n= sc.nextInt();
    int[] myarray= new int[n];

    System.out.println("Enter the first value :- ");
    for(int i=0;i<n;i++){
        myarray[i]= sc.nextInt();
        System.out.println("Enter the next Value :- ");
    }
    for(int i=0;i<n;i++){
        System.out.println("Value at " +(i+1)+ " is :- " + myarray[i]);
    }
    }
}

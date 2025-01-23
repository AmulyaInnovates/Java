import java.util.Scanner;

public class 2D_Array {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of rows required :-");
        int n= sc.nextInt();
        
        System.out.println("Enter the number of columns required :-");
        int m= sc.nextInt();

        int[][] arr= new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("Enter the value for :- [" + i + "][" +j+"]");
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println("Now We will print the values :-");
        System.out.println("-------------------------------");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("The value at:- [" + i + "][" +j+"]");
                System.out.println(arr[i][j]);
            }
        }

    }
}

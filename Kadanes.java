import java.util.Scanner;

public class Kadanes {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of elements you require in the array");
        int n= sc.nextInt();

        int[] myArray= new int[n];

        for(int i=0;i<n;i++){
            myArray[i]= sc.nextInt();
            System.out.println("Enter Next Value");
        }
        for (int i = 0; i <n; i++) {
            System.out.print(myArray[i] + " ");
        }
        
        System.out.println("\nThe maximum Subarray is :- "+ Subarray_max(myArray));
    
    }

    static int Subarray_max(int myArray[]){
        int size= myArray.length;
        int max_so_far= Integer.MIN_VALUE;
        int max_ending_here= 0;

        for(int i=0;i<size;i++){
            max_ending_here= max_ending_here + myArray[i];

            if(max_ending_here > max_so_far){
                max_so_far=max_ending_here;
            }

            if(max_ending_here<0){
                max_ending_here=0;
            }
        }
        return max_so_far;

    }
}

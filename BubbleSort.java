import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void bubblesort(int[] arr, int n){
        int i,j,temp;
        boolean swapped;

        for(i=0;i<n-1;i++){
            swapped=false;
            for(j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }

        }
    }

    static void printthenumber(int[] arr, int n1){
        for(int i=0; i<n1;i++){
            System.out.print(arr[i] + " ");
        System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter the number of values in the array.");
        int n= sc.nextInt();

        int[] arr= new int[n];

        System.out.println("Now one-by-one give the values for each and every index.");
        for(int i=0;i<n;i++){
            System.out.println("Enter the value at index number :- " + i);
            arr[i]= sc.nextInt();
        }

        bubblesort(arr, n);
        System.out.println("Sorted Array :- ");
        printthenumber(arr, n);
    }
}

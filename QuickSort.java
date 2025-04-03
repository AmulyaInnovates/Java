import java.util.Scanner;
import java.util.Arrays;

public class QuickSort{
    static void swap(int[] arr, int i,int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    static int partition(int[] arr, int low, int high){
        int pivot= arr[high];
        int i= low-1;

        for (int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    static void sort_quick(int[] arr, int low, int high){
        if(low<high){
            int pi= partition(arr,low,high);

            sort_quick(arr,low,pi-1);
            sort_quick(arr,pi+1,high);
    }
    }

    public static void print_Array(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of values required in the array.");
        int n= sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<n;i++){     
            System.out.println("Enter the value in array at index value :- "+ i);
            arr[i]= sc.nextInt();
        }

        sort_quick(arr, 0, n-1);
        print_Array(arr,n);
    }
}
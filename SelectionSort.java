import java.util.*;
import java.util.Scanner;

public class SelectionSort {
    public static void sort(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp= arr[min_index];
            arr[min_index]= arr[i];
            arr[i]= temp;
        }
    }

    public static void printarr(int[] arr){
        int n= arr.length;
        System.out.println("The entire array is :- ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array :- ");
        int n= sc.nextInt();

        int[] arr= new int[n];
        
        System.out.println("Enter the values for all the indexes");
        for(int i=0;i<n;i++){
            System.out.println("Enter the value at index number :- "+ i);
            arr[i]= sc.nextInt();
        }

        sort(arr);
        printarr(arr);

    }
}

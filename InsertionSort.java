import java.util.*;
import java.util.Scanner;

public class InsertionSort {

    public static void sort(int[] arr){
        int n = arr.length;

        for (int i=1;i<n;i++){
            int key= arr[i];
            int j= i -1;

            while(j>=0 && arr[j]> key){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void print(int[] arr){
        int n= arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values you want in the array");
        int n= sc.nextInt();


        int[] arr=new int[n];

        for (int i=0;i<n;i++){
            System.out.println("Enter the value at index number :- "+ i);
            arr[i]= sc.nextInt();
        }

        System.out.println("--------------------------------");

        System.out.println("The initial Array :-");
        print(arr);
        System.out.println("--------------------------------");

        
        sort(arr);
        System.out.println("The Sorted Array :-");
        print(arr);
        System.out.println("--------------------------------");
    }
}

import java.util.*;

public class MergeSort{

    public static void merge(int[] arr, int l,int m,int r){
        int n1= m-l+1;
        int n2= r-m;

        int[] L=new int[n1];
        int[] R=new int[n2];

        for(int i=0;i<n1;i++){
            L[i]= arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]= arr[m+1+j];
        }

        int k=l;
        int i=0;
        int j=0;

        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k]= L[i];
            i++ ;
            }
            else{
                arr[k]= R[j];
                j++ ;
            }
            k++ ;
        }

        while(i<n1){
            arr[k]= L[i];
            i++;
            k++;
        }
        
        while(j<n2){
            arr[k]= R[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] arr, int l, int r){
        if(l<r){
            int m= l+(r-l)/2;

            sort(arr,l,m);
            sort(arr,m+1,r);

            merge(arr, l, m,r);
        }
    }

    public static void print(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr= {9,8,3,78,21,75,25,93,6,2,1,};
        int n=arr.length;
        System.out.println("The intial array is :-");
        print(arr,n);
        sort(arr,0,n-1);
        System.out.println("The final sorted array is :- ");
        print(arr,n);

    }
}
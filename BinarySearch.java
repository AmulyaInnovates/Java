import java.util.*;

public class BinarySearch {

    int binarysearch(int[] arr, int x){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int m= l+ (r-l)/2;

            if(arr[m]==x){
                return m;
            }
            else if(arr[m]<x){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the number of elements inside your array :-");
        int n= sc.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter the values for each and every index(GIVE ELEMENTS IN ASCENDING ORDER)");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("What number are you finding?");
        int x= sc.nextInt();

        BinarySearch obj= new BinarySearch();
        int result= obj.binarysearch(arr,x);

        if(result==-1){
            System.out.println("We were not able to find the number you were looking for inside the array you provided us!");
        }
        else{
            System.out.println("We were able to find your value which was :- "+x+" at index value :- "+ result);
        }
    }

}

import java.util.*;

class GetSubArray{
    public int[] getSubArray(int[] arr, int si, int ei){
        int length = ei-si;
        int[] result =new int[length];
        for(int i= si; i<ei;i++){
            result[i-si] = arr[i];
        }
        
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        GetSubArray obj= new GetSubArray();
        
        System.out.println("Enter the number of elements required :- ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the values into the array :- ");
        
        for(int i=0; i<n;i++){
            System.out.println("Enter the value at index value :- " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the starting value of the sub-array :- ");
        int si= sc.nextInt();
        
        System.out.println("Enter the ending value of the sub-array :- ");
        int ei= sc.nextInt();
        
        int[] result= obj.getSubArray(arr,si,ei);
        System.out.println("The array :-");
        for(int num : arr){
            System.out.print(num + " ");
        }
        
        System.out.println("--------------------");
        System.out.println("The sub-array is as follows :- ");
        for(int num : result){
            System.out.print(num + " ");
        }
        }
}
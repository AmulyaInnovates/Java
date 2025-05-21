import java.util.*;

public class RemoveDuplicates {
    
    public int[] removeDuplicates(int[] arr){
        int[] result= new int[arr.length];
        int index=0;
        
        for(int i=0; i<arr.length; i++){
            boolean duplicate= false;
            
            for(int j=0;j<index;j++){
                if(arr[i] ==  arr[j] ){
                    duplicate =true;
                    break;
                }
            }
            
            if(!duplicate){
                result[index]= arr[i];
                index++;
            }
        }
        
        int[] trimmedresult= new int[index];
        for(int i=0;i<index;i++){
            trimmedresult[i]= result[i];
        }
        
        return trimmedresult;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the number of values you want in the array :- ");
        int number= sc.nextInt();
        int[] arr= new int[number];
        
        System.out.println("Enter the values in the array :- ");
        for(int i=0;i<number;i++){
            System.out.println("Enter the value at "+i+" :-");
            arr[i]= sc.nextInt();
        }
        
        
        RemoveDuplicates obj= new RemoveDuplicates();
        int[] result1= obj.removeDuplicates(arr);
        
        
        System.out.println("The set of this array is :-");
        for(int i : result1){
            System.out.print(i + " ");
        }
    }
}
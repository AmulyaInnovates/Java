import java.util.*;

class ReturnDuplicates {
    
    public int[] findDuplicates(int[] arr){
        Set<Integer> uv= new HashSet<>();
        Set<Integer> dv= new HashSet<>();
        
        for(int num : arr){
            if(!uv.add(num)){
                dv.add(num);
            }
        }
        
        int[] result= new int[dv.size()];
        int index= 0;
        
        for(int num : dv){
            result[index]= num;
            index++;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ReturnDuplicates obj = new ReturnDuplicates();
        System.out.println("Enter the number of values you require in your array :- ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        
        System.out.println("Enter the valeus for the array :- ");
        for(int i=0; i<n;i++){
            System.out.println("Enter the value at index :- " + i);
            arr[i]= sc.nextInt();
        }
        
        int[] result= obj.findDuplicates(arr);
        
        if(result.length >0){
            System.out.println("Duplicates Found");
            System.out.println("Duplicates are as follows :-");
             for(int num : result){
                 System.out.print(num + " ");
             }}
        else{
                 System.out.println("Duplicates Not Found.");
             }
        
    }
}
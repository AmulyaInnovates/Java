import java.util.Scanner;
import java.util.ArrayList;

class EvenNumbers {
    
    public ArrayList<Integer> evenNumbers(ArrayList<Integer> arr){
        ArrayList<Integer> result= new ArrayList<>();
        
        for(int i=0;i<arr.size();i++){
            Integer new_comment= arr.get(i);
            if(new_comment%2 == 0){
                result.add(new_comment);
            }
        }
        
        return result;
        
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        EvenNumbers obj= new EvenNumbers();
        System.out.println("Enter the number of elemnts in ArrayList");
        int n = sc.nextInt();
        sc.nextLine();
        
        ArrayList<Integer> arr= new ArrayList<>();
        
        for(int i=0;i<n;i++){
            System.out.println("Enter the number at "+ i + " :-");
                Integer comment= sc.nextInt();
            arr.add(comment);
        }
        
        ArrayList<Integer> result= obj.evenNumbers(arr);
        
        for(Integer num : result){
            System.out.println("The Even No.'s are as follows :- ");
            System.out.print(num + " ");
        }
        
    }
}
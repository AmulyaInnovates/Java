import java.util.*;

public class Recursion_Array_Reverse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the total nuber of values you want in the Array :-");
        int n= sc.nextInt();

        int[] array1=new int[n];

        System.out.println("Enter the values for all the index in this Array :-");
        for(int i=0;i<n;i++){
            System.out.println("Enter the value for index :- "+ i);
            array1[i]= sc.nextInt();
        }

        Reverse_Array(array1);
    }
    public static void Reverse_Array(int[] array1){
        int[] new_array= new int[array1.length];

        for (int i = array1.length - 1, j = 0; i >= 0; i--, j++) {
            new_array[j] = array1[i]; // Copy elements in reverse order
        }
        
                displayArr(new_array,0);
        }

    public static void displayArr(int[] new_array,int index){
        if(index== new_array.length){
            return;
        }
    
        System.out.println("The value at " + index+ " is :- " + new_array[index]);
        displayArr(new_array, index+1);
    
        }
}


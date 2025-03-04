import java.util.*;

public class Recursion_Arrays {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the total number of values for this given Array :- ");
        int n= sc. nextInt();

        int[] array1= new int[n];

        System.out.println("Give the values for each and every element");
        for(int i=0;i<n;i++){
            System.out.println("Add the value at following index :-  "+ i);
            array1[i]=sc.nextInt();
        }

        displayArr(array1, 0);

    }

    public static void displayArr(int[] array1,int index){
        if(index== array1.length){
            return;
        }

        System.out.println("The value at " + index+ " is :- " + array1[index]);
        displayArr(array1, index+1);

    }
}

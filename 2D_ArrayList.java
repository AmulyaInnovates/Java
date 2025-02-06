import java.util.Scanner;
import java.util.*;

public class 2D_ArrayList{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of sub-arrays you require");
        int n=sc.nextInt();

        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        
        for(int i=0; i<n;i++){
            System.out.println("Enter the number of values for the array "+ (i+1) + " :-");
            int n1=sc.nextInt();
            ArrayList<Integer> l2= new ArrayList<>();

            for(int j=0;j<n1;j++){
                System.out.println("Enter the value at "+ j + " inside the array "+ (i+1));
                l2.add(sc.nextInt());
            }
            list.add(i,l2);
        }

        System.out.println("Enter the number of queries to process :-");
        int num= sc.nextInt();

        for(int k=0;k<num;k++){
            System.out.println("Enter the Row and Column number for your query no."+ (k+1));
            int r =sc.nextInt();
            int c=sc.nextInt();

            try{
                System.out.println("The Element at ["+r+"]["+c+"] is :- "+ list.get(r-1).get(c-1));
            }
            catch(Exception e){
                System.out.println("{ERROR}");
            }
        }
    }
}
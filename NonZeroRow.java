import java.util.*;

public class NonZeroRow{
    
    public static boolean isNonZeroRow(int rn, int[][] Array){
        for(int i=0;i<Array[rn].length;i++){
            if(Array[rn][i] == 0){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows :-");
        int rows= sc.nextInt();
        System.out.println("Enter the number of columns :-");
        int columns= sc.nextInt();
        
        int[][] Array= new int[rows][columns];
        
        System.out.println("Enter the values for the 2D Array :- ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Enter te value at Row :- "+i+" & Column :- "+j);
                Array[i][j]= sc.nextInt();
            }
        }
        
        System.out.println("Enter the row number you want to check :-");
        int rn= sc.nextInt();
        
        boolean result= isNonZeroRow(rn, Array);
        
        if(result){
            System.out.println("This row has zero(s)");
        }
        else{
            System.out.println("This row does not have zero(s)");
        }
        
    }
}
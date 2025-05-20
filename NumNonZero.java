import java.util.*;

public class NumNonZero{
    
    public static int NonZeroRow(int rows,int columns, int[][] Array){
        int count=0;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(Array[i][j] == 0){
                    count++;
                    break;
                }
            }
        }
        
        return count;
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
        
        int result= NonZeroRow(rows,columns,Array);
        
        System.out.println("This 2D Array has " + result+" number of rows having 0 in any of it's columns");
        System.out.println("This 2D Array has " + (rows-result)+" number of rows that do not have 0 in any of it's columns");
        
        }
        
    }

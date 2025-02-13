import java.util.Scanner;

public class ZigZag_Array {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of values you require in this Array.");
        int n= sc.nextInt();
        System.out.println("---------------------------------");

        int[] array1= new int[n];

        for(int i=0;i<n;i++){
            array1[i]= sc.nextInt();
        }

        int left=1;
        
        System.out.println("                                 ");
        System.out.println("---------------------------------");
        for(int i=0;i<n;i++){
            if(left==1){
                System.out.println(array1[i]);
                left=0;
            }
            else{
                System.out.println("     "+ array1[i]);
                left=1;
            }
        }
    }
}

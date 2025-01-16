import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the element you require.");
        int d= sc.nextInt();
        System.out.println("---------------------------------");

        System.out.println("Enter the number of values you require in this Array.");
        int n= sc.nextInt();
        System.out.println("---------------------------------");

        int[] array1= new int[n];

        for(int i=0;i<n;i++){
            array1[i]= sc.nextInt();
        }

        int min=array1[0];
        int max=array1[0];

        for(int i=0;i<n;i++){
            if(array1[i]< min){
                min=array1[i];
            }
            if(array1[i]> max){
                max=array1[i];
            }
        }
        int span= max-min;
        System.out.println("The Span of this Array is :- "+ span);
        System.out.println("---------------------------------");

        int ans= Find(array1, d);
        System.out.println(ans);
    }

    public static int Find(int[] array1, int d){
        for(int i=0;i<array1.length;i++){
            if(array1[i]== d){
                System.out.println("The value of the Class-Index :- "+i);
                System.out.println("---------------------------------");

            }
        }

        return -1;
    }
}
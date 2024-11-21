import java.util.Scanner;

public class Nest_For_Loops {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Lowest Value.");
        int low= sc.nextInt();
        System.out.println("Enter the Highest Value.");
        int high= sc.nextInt();
        for(int i=low; i <= high;i++){
            int count= 0;
            for(int a=2;a*a<=i;a++){
                if(i % a == 0){
                    count=count+1;
                    break;
                }
            }
            if(count == 0){
                System.out.println(i);
                System.out.println("-------------OuPuT-------------");
            }
        }
    }
}

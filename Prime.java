import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Give the number of time you want to check the value");
        int x= sc.nextInt();
        for(int i= 1; i<=x;i++){
            int count= 0;
            System.out.println("Give the number you want to check whether it is Prime or not :-");
            int y= sc.nextInt();
            for(int a=2;a*a<=y;a++){
                if(y % a == 0){
                    count=count+1;
                    break;
                }
            }
            if(count == 0){
                System.out.println("This Value is a Prime Number.");
            }
            else{
                System.out.println("This Value is not a Prime Number.");
            }
        }
    }
    
}

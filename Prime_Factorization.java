import java.util.Scanner;


public class Prime_Factorization {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Give the number you want to check :-");
        int y= sc.nextInt();
        for(int i=2;i*i<=y;i++){
            while(y % i == 0){
                y= y/i;
                System.out.println(i);
            }
        }
        if(y != 1){
            System.out.println(y);
        }
    }
}

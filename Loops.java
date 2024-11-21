import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int z=0;
        System.out.println("Give the maximum Value :-");
        int x= sc.nextInt();
        System.out.println("-------------Printing in For Loop-------------");
        for(int y=x; y>0;y--){
            System.out.println("The Value for y is :-" + y);
        }
        System.out.println("---------------Printing in While Loop------------");
        while(z<=(x-1)){
            z=z+1;
            System.out.println("The value of z is :- "+ z);
    }}
}

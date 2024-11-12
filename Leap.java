import java.util.Scanner;

public class Leap {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Give a Year no. and I will check whether it was leap or not !!!");
        int year= sc.nextInt();
        if (year % 4 == 0){
            System.out.println(year + " is a Leap Year.");
        }
        else{
            System.out.println(year+ " is not a Leap Year");
        }
        System.out.println("----------------------------------");
    }
}

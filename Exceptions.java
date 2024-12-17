import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

    try{
        System.out.println("Enter the 1st Value :- ");
        int x= sc.nextInt();
        
        System.out.println("Enter the 2nd Value :- ");
        int y=sc.nextInt();
        int z= x/y;

        System.out.println(x + "/" + y + " = " + z);
    }
    catch(ArithmeticException ex){
        System.out.println("----------------- CATCH Statement -------------------");
        System.out.println("This Expression can not be executed.");
        System.out.println(ex.toString());
    }
    finally{
        System.out.println("Made By :- Amulya Gupta");
        System.out.println("Made on Date :- 17/12/2024");
    }

    }
}

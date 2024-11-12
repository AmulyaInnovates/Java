import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("What is your preferable size option? (1,2,3,4,5)");
        int size= sc.nextInt();
        System.out.println("------------------------------");
        switch(size){
            case 1: System.out.println("Extra Small"); 
            break;
            case 2: System.out.println("Small");
            break;
            case 3: System.out.println("Medium");
            break;
            case 4: System.out.println("Large");
            break;
            case 5: System.out.println("Extra Large");
            break;
            default:System.out.println("This size does not Exist !!!");
        }
        System.out.println("------------------------------");
    }
}

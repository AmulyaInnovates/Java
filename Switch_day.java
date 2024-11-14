import java.util.Scanner;

public class Switch_day {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose a day from Monday to Friday (1:9) :-");
        int day_value= sc.nextInt();

        switch(day_value){

            case 1:
            System.out.println("The day is Monday");
            break;
            case 2:
            System.out.println("The day is Tuesday");
            break;
            case 3:
            System.out.println("The day is Wednesday");
            break;
            case 4:
            System.out.println("The day is Thursday");
            break;
            case 5:
            System.out.println("The day is Friday");
            break;
            case 6:
            System.out.println("The day is Saturday");
            break;
            case 7:
            System.out.println("The day is Sunday");
            break;
            default:
            System.out.println("Enter a valid value !!!");
            break;
            
        }
    }
}

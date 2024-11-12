import java.util.Scanner;

public class marks {
    public static void main(String[] args){
        System.out.println("Give me your marks this tiem, I will tell your Grades !!!");
        Scanner sc= new Scanner(System.in);
        int marks= sc.nextInt();
        if (marks>90){
            System.out.println("You got Grade: O");
        }else if (marks>80 && marks<90){
            System.out.println("You got Grade: A+");
        }else if (marks>70 && marks<80){
            System.out.println("You got Grade: A");
        }else if (marks>60 && marks<70){
            System.out.println("You got Grade: B");
        }else{
            System.out.println("You got Grade: C");
        }
    }
}

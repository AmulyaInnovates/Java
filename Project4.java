import java.util.Scanner;

public class Project4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Good Ratings of the Movie:");
        int rating= sc.nextInt();
        if (rating<5000){
            System.out.println("This is a 1.5 Star Movie");
        }
        else if  (rating>=5000 && rating<25000){
            System.out.println("This is a 2.5 Star Movie");
        }
        else if (rating>=25000 && rating<45000){
            System.out.println("This is a 3.5 Star Movie");
        }
        else if (rating>=45000 && rating<70000){
            System.out.println("This is a 4 Star Movie");
        }
        else if (rating>=75000){
            System.out.println("This is a 5 Star Movie");
        }

    }
    }


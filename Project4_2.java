import java.util.Scanner;

public class Project4_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Good Ratings of the Movie: (0-5000: 1 | 5000-25000: 2 | 25000-45000: 3 | 45000-70000: 4 | 70000+ : 5)");
        int rating= sc.nextInt();
        switch(rating){
            case 1: System.out.println("This is a 1.5 Star Movie");
            break;
            case 2: System.out.println("This is a 2.5 Star Movie");
            break;
            case 3: System.out.println("This is a 3.5 Star Movie");
            break;
            case 4: System.out.println("This is a 4 Star Movie");
            break;
            case 5: System.out.println("This is a 5 Star Movie");
            break;}
    }
}


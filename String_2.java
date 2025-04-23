import java.util.*;

class String_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your text :- ");
        String s1= sc.nextLine();
        int length= s1.length();
        System.out.println(length);
        System.out.println("Enter the posiion of string you want :-");
        int n= sc.nextInt();
        System.out.println("The character at " + n + " is :- " + s1.charAt(n));
        System.out.println("Enter the substring starting value :- ");
        int ss1= sc.nextInt();
        System.out.println("Enter the substring ending value :- ");
        int ss2= sc.nextInt();
        System.out.println("The substring is :- " + s1.substring(ss1,ss2));
        
        System.out.println("What should it start with?"); 
        sc.nextLine();
        String sw= sc.nextLine();
        boolean starting= s1.startsWith(sw);
        System.out.println("It starts with it :- " +starting);
        System.out.println("What should it end with?"); 
        String ew= sc.nextLine();
        boolean ending= s1.endsWith(ew);
        System.out.println("It starts with it :- " +ending);
        
        System.out.println("Your text in UpperCase :- "+ s1.toUpperCase());
        System.out.println("Your text in LowerCase :- "+ s1.toLowerCase());
        
    }
}
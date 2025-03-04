import java.util.*;

public class Tower_Of_Hanoi {
    public static void toh(int n,int t1,int t2,int t3){
        if (n>0){
        toh(n-1,t1,t3,t2);
        System.out.println("The Disk number "+n+" will be moved from "+t1+" to "+t3);
        toh(n-1,t2,t1,t3);
    }
}
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value of disks for the Tower of Hanoi");
        int n= sc.nextInt();
        
        System.out.println("Enter the value for Tower 1");
        int t1= sc.nextInt();
        System.out.println("Enter the value for Tower 2");
        int t2= sc.nextInt();
        System.out.println("Enter the value for Tower 3");
        int t3= sc.nextInt();

        toh(n,t1,t2,t3);
        
    }
}

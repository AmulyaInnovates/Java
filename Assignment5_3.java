import java.util.Scanner;

class Assignment5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max= Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;
        char choice;
        do
        {
            System.out.println("Enter the number");
            int n= sc.nextInt();
            
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
            System.out.println("Do you want to continue? (y/n)");
            choice= sc.next().charAt(0);
            }while(choice =='y' || choice == 'Y');
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        
        }}
    


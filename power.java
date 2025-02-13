import java.util.Scanner;

public class power {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);

        System.out.println("Give the Base value :-");
        int x= sc.nextInt();
        System.out.println("Give the Exponent value :-");
        int n= sc.nextInt();

        int powered_value= power(x,n);
        System.out.println("The value after power "+ n +" is " + powered_value);
    }

    public static int power(int x, int n){
        if (n==0){
            return 1;
        }

        int xpn2=power(x,n/2);
        int xpnb= xpn2*xpn2;

        if (n % 2 ==1){
            xpnb=xpnb*x;
        }

        return xpnb;
    }
}

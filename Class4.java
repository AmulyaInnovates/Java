public class Class4 {
    public static void main(String[] args){
        int a=10;
        int b=5;

        System.out.println("Unary 1st Method: " + a++);
        System.out.println("Unary 2nd Method: " + ++b);

        System.out.println("------------------------");
        System.out.println("Binary 1st Method: " + "1+2 = " + 1+2);
        System.out.println("Binary 2nd Method: " + "1+2 = " + (1+2));
        System.out.println("Binary 3rd method: " + (1+2) + " = 3") ;
        System.out.println("--------------------------");
        int incremented= ++a*b++ ;
        System.out.println("The incremented Values: " +  incremented);

        System.out.println("------------------------");
        System.out.println("Ternary Operations: ");
        int Largestnumber= (a>b)?a:b;
        System.out.println("The Largest number among a & b is: "+ Largestnumber);
        System.out.println("-------------------------");
    }
}

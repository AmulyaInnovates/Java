public class Class3 {
    public static void main(String[] args){
        int a= 20;
        int b= 10;
        int addition= a+b;
        int subtraction= a-b;
        int multiplication= a*b;
        int division= a/b;

        System.out.println("=========Method 1=========");
        System.out.println("Addition of a and b is: "+ addition);
        System.out.println("Subtraction of a and b is: "+ subtraction);
        System.out.println("Multiplication of a and b is: "+ multiplication);
        System.out.println("Division of a and b is: "+ division);

        System.out.println("=========Method 2=========");
        System.out.println("Addition of a and b is: "+ (a+b));
        System.out.println("Subtraction of a and b is: "+ (a-b));
        System.out.println("Multiplication of a and b is: "+ (a*b));
        System.out.println("Division of a and b is: " + (a/b));

        System.out.println("-----------------------------------------");
        System.out.println("Addition: " +(a+b) +"   Subtraction: " + (a-b) + "   Multiplication: "+ (a*b) +"   Division: " + (a/b));
        System.out.println("-------------------------------------------");
        System.out.println("Thank You");
        
    }
    
}

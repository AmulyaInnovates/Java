import java.util.Scanner;

public class Nest_If {
    public static void main(String[] args){
        boolean new_sunny= true ;
        boolean hot= false  ;

        if (new_sunny){
            if (hot){
                System.out.println("Wear half T-Shirt with cap! ");
            }
            else{
                System.out.println("Wear a Half T-Shirt");
            }
        }
        else{
            System.out.println("Bring an umbrella for safety");
        }
    }
}

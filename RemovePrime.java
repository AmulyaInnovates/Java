import java.util.*;

public class RemovePrime {

    public static void solution(ArrayList<Integer> al){
        
        for(int i=al.size()-1;i>=0;i--){
            if(isPrime(al.get(i)) == true){
                al.remove(i);
            }
        }

    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int div=2;div*div <=n;div++){
            if(n%div == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of integers wanted inside this Array List");
        int n = sc.nextInt();

        ArrayList<Integer> al= new ArrayList<>();
        System.out.println("Enter the value for "+n+" values !!! ");
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }

        solution(al);

        System.out.println("The Modified List without prime numbers :-"+ al);
    
    }
}

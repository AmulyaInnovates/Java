import java.util.ArrayList;
import java.util.Scanner;

public class Staircase {

    public static ArrayList<String> findWays(int n) {
        ArrayList<String> result = new ArrayList<>();

        if (n == 0) {
            result.add("");
            return result;
        }
        
        // If n becomes negative, return an empty list (no valid way)
        if (n < 0) {
            return result;
        }
        
        // Recursive calls for 1, 2, and 3 steps
        ArrayList<String> step1 = findWays(n - 1);
        ArrayList<String> step2 = findWays(n - 2);
        ArrayList<String> step3 = findWays(n - 3);
        

        for (String s : step1) {
            result.add("1" + s);
        }
        for (String s : step2) {
            result.add("2" + s);
        }
        for (String s : step3) {
            result.add("3" + s);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();
    

        ArrayList<String> ways = findWays(n);
        
        
        System.out.println("\nNumber of ways to climb " + n + " stairs: " + ways.size());
        System.out.println("Ways are:");
        for (String way : ways) {
            System.out.println(way.replaceAll("", " ").trim());
        }
        
        sc.close();
    }
}

import java.util.*;
import java.util.Scanner;

public class ArrayList {
    
    public static int findLastIndex(ArrayList<Integer> al, int p) {
        for (int i = al.size() - 1; i >= 0; i--) {
            if (al.get(i) == p) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the ArrayList:");
        int N = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        
        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            al.add(sc.nextInt());
        }
        
        System.out.println("Enter the number of queries:");
        int Q = sc.nextInt();
        
        for (int i = 0; i < Q; i++) {
            System.out.println("Enter query type (1 for insertion, 2 for search):");
            int queryType = sc.nextInt();
            
            if (queryType == 1) {
                System.out.println("Enter the index where you want to insert:");
                int p = sc.nextInt();
                System.out.println("Enter the value to insert:");
                int r = sc.nextInt();
                
                if (p >= 0 && p <= al.size()) {
                    al.add(p, r);
                } else {
                    System.out.println("Invalid index. Skipping insertion.");
                }
                
                System.out.println("Updated ArrayList: " + al);
            } 
            else if (queryType == 2) {
                System.out.println("Enter the value to find its last occurrence:");
                int p = sc.nextInt();
                
                int lastIndex = findLastIndex(al, p);
                
                if (lastIndex == -1) {
                    System.out.println("Number " + p + " not found in the array.");
                } else {
                    System.out.println("Last occurrence index: " + lastIndex);
                }
            } 
            else {
                System.out.println("Invalid query type. Please enter 1 or 2.");
            }
        }
    }
}

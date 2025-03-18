import java.util.*;

public class TargetSumSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target sum:");
        int tar = sc.nextInt();
        
        int jkl = 0;
        for(int i = 0; i < arr.length; i++) {
            jkl = jkl + arr[i];
        }
        
        if (jkl < tar) {
            System.out.println("NOT EVEN POSSIBLE, wrong given target");
        } else {
            System.out.println("Subsets with the target sum:");
            printTargetSumSubsets(arr, 0, "", 0, tar);
        }
        
        sc.close();
    }
    
    public static void printTargetSumSubsets(int[] arr, int index, String set, int sos, int tar) {
        if (index == arr.length) {
            if (sos == tar) {
                System.out.println(set + ".");
            }
            return;
        }
        
        printTargetSumSubsets(arr, index + 1, set + arr[index] + ", ", sos + arr[index], tar);
        
        printTargetSumSubsets(arr, index + 1, set, sos, tar);
    }
}
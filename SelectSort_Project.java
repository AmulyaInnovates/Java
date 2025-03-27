import java.util.*;

public class SelectSort_Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input size
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] sortedArr = new int[N];

        // Read input elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sortedArr[i] = arr[i]; // Copy elements for sorting
        }

        // Sort the array
        Arrays.sort(sortedArr);

        // Find and print the index of each element in sorted array
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i] == sortedArr[j]) {
                    System.out.print(j + " ");
                    break; // Stop after finding the position
                }
            }
        }
        sc.close();
    }
}

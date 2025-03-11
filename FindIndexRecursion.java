import java.util.Scanner;

public class FindIndexRecursion {

    // Recursive function to find the index of the target element
    public static int findIndex(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1; // Element not found
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the target element
        System.out.print("Enter the number to find indices: ");
        int target = sc.nextInt();

        // Call the recursive function
        int index = findIndex(arr, target, 0);

        // Output result
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}

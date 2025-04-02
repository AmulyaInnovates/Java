import java.util.Scanner;
import java.util.Arrays;  // Add this import statement

public class BubbleSortMerge {
    
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }
        
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }
        
        return mergedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of elements in first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter number of elements in second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        System.out.println("Actual first array: " + Arrays.toString(arr1));
        System.out.println("Actual second array: " + Arrays.toString(arr2));
        
        bubbleSort(arr1);
        bubbleSort(arr2);
        
        System.out.println("Sorted first array: " + Arrays.toString(arr1));
        System.out.println("Sorted second array: " + Arrays.toString(arr2));
        
        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        
        System.out.println("Sorted Merged Array: " + Arrays.toString(mergedArray));
    }
}

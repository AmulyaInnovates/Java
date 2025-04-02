import java.util.Scanner;

public class InsertionSortPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of values you want in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sortedArr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at index number " + i + ":");
            arr[i] = sc.nextInt();
            sortedArr[i] = arr[i]; 
        }

        System.out.println("--------------------------------");
        System.out.println("The initial Array:");
        printArray(arr);
        System.out.println("--------------------------------");

        sort(sortedArr);
        System.out.println("The Sorted Array:");
        printArray(sortedArr);
        System.out.println("--------------------------------");

        System.out.println("Positions in sorted array:");
        printPositions(arr, sortedArr);
        System.out.println("--------------------------------");

        sc.close();
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printPositions(int[] arr, int[] sortedArr) {
        for (int i = 0; i < arr.length; i++) {
            int position = findIndex(sortedArr, arr[i]) + 1; 
            System.out.println(arr[i] + " at index " + i + " : " + position);
        }
    }

    public static int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

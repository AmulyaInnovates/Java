import java.util.*;

public class Combine_Project {
    
    public static void toh(int n, int t1, int t2, int t3) {
        if (n > 0) {
            toh(n - 1, t1, t3, t2);
            System.out.println("Move disk " + n + " from Tower " + t1 + " to Tower " + t3);
            toh(n - 1, t2, t1, t3);
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void findMinMax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements:");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Lowest number: " + min);
        System.out.println("Highest number: " + max);
    }

    public static void rotateMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows (N): ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns (M): ");
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(sc.nextInt());
            }
            matrix.add(row);
        }

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        ArrayList<ArrayList<Integer>> rotatedMatrix = rotate90(matrix);
        System.out.println("Matrix after 90-degree rotation:");
        displayMatrix(rotatedMatrix);
    }

    public static ArrayList<ArrayList<Integer>> rotate90(ArrayList<ArrayList<Integer>> matrix) {
        int n = matrix.size();
        int m = matrix.get(0).size();
        ArrayList<ArrayList<Integer>> rotated = new ArrayList<>();

        for (int j = 0; j < m; j++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int i = n - 1; i >= 0; i--) {
                newRow.add(matrix.get(i).get(j));
            }
            rotated.add(newRow);
        }
        return rotated;
    }

    public static void displayMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Tower of Hanoi");
            System.out.println("2. Rotate a 2D Matrix 90 degrees");
            System.out.println("3. Factorial using Recursion");
            System.out.println("4. Find Lowest and Highest Number in an Array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the number of disks:");
                    int n = sc.nextInt();
                    System.out.println("Enter the value for Tower 1:");
                    int t1 = sc.nextInt();
                    System.out.println("Enter the value for Tower 2:");
                    int t2 = sc.nextInt();
                    System.out.println("Enter the value for Tower 3:");
                    int t3 = sc.nextInt();
                    toh(n, t1, t2, t3);
                    break;

                case 2:
                    rotateMatrix();
                    break;

                case 3:
                    System.out.println("Enter a number for factorial calculation:");
                    int num = sc.nextInt();
                    System.out.println("Factorial of " + num + " is: " + factorial(num));
                    break;

                case 4:
                    findMinMax();
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    return;

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }
}

import java.util.Scanner;

public class Rotate90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows (N) :- ");
        int n = sc.nextInt();
        
        System.out.println("Enter the number of columns (M) :- ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter the elements of the " + n + "x" + m + " matrix :- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix: ");
        display(matrix);

        int[][] rotatedMatrix = rotate90(matrix);

        System.out.println("Matrix after 90-degree rotation to the right: ");
        display(rotatedMatrix);
    }

    public static int[][] rotate90(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        // Create new matrix for rotated version
        int[][] rotated = new int[m][n];

        // Rotate by moving elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        return rotated;
    }

    public static void display(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

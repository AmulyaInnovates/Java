import java.util.Scanner;

public class MinZeroes_Array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
        int minZeroColumn = findMinZeroColumn(matrix);
        System.out.println("Column with the minimum number of zeros: " + minZeroColumn);
    }

    public static int findMinZeroColumn(int[][] matrix) {
        int columns = matrix[0].length;
        int[] zeroCount = new int[columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount[j]++;
                }
            }
        }

        int minZeroes = Integer.MAX_VALUE;
        int minColumn = -1;

        for (int j = 0; j < columns; j++) {
            if (zeroCount[j] < minZeroes) {
                minZeroes = zeroCount[j];
                minColumn = j;
            }
        }

        return minColumn;
    }
}

import java.util.Scanner;

public class Project23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrix (n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the " + n + "x" + n + " matrix row-wise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int minCol = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }

            boolean isSaddle = true;
            for (int k = 0; k < n; k++) {
                if (matrix[k][minCol] > matrix[i][minCol]) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle Price: " + matrix[i][minCol]);
                sc.close();
                return;
            }
        }

        System.out.println("No Saddle Price Found");
        sc.close();
    }
}

import java.util.Scanner;

public class Project22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter te Row value for A");
        int n1 = sc.nextInt();

        System.out.println("Enter te Column value for A");
        int m1 = sc.nextInt();
        int[][] A = new int[n1][m1];

        System.out.println("Enter first value for A :- ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter te Row value for B");
        int n2 = sc.nextInt();

        System.out.println("Enter te Column value for B");
        int m2 = sc.nextInt();
        int[][] B = new int[n2][m2];

        System.out.println("Enter first value for B :- ");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        if (m1 != n2) {
            System.out.println("------------------------Invalid input------------------------------");
            return;
        }

        int[][] result = new int[n1][m2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < m1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

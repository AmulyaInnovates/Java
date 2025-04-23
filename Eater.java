import java.util.*;

public class Eater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] row = new int[N];
        int[] col = new int[N];
        for (int i = 0; i < N; i++) {
            row[i] = sc.nextInt();
            col[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int eatenBefore = 0;
            for (int j = 0; j < N; j++) {
                if (row[j] < row[i]) {
                    eatenBefore++;
                }
            }
            System.out.println(eatenBefore);
        }
    }
}

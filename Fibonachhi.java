import java.util.*;

public class Fibonachhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(0, 0);
        al.add(1, 1);

        System.out.println("Tell how many numbers in the series you want? ");
        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {
            int value_behind = al.get(i - 1);
            int value_behind_behind = al.get(i - 2);
            al.add(i, value_behind + value_behind_behind);
        }

        System.out.println("Fibonacci series: " + al);
    }
}

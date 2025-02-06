import java.util.*;

class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int n = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter the " + n + " integers:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        ArrayList<Integer> ans = reverse(al);

        System.out.println("Reversed list: " + ans);
    }

    static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            ans.add(list.get(i));
        }

        return ans;
    }
}

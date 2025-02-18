import java.util.*;

public class KthPermutationArray {
    public static List<String> getAllPermutations(int[] arr) {
        List<String> result = new ArrayList<>();
        Arrays.sort(arr); // Ensure permutations are in lexicographical order
        permute(arr, new boolean[arr.length], new ArrayList<>(), result);
        return result;
    }

    private static void permute(int[] arr, boolean[] used, List<Integer> current, List<String> result) {
        if (current.size() == arr.length) {
            result.add(current.toString().replaceAll("[\\[\\],]", ""));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(arr[i]);
                permute(arr, used, current, result);
                used[i] = false;
                current.remove(current.size() - 1);
            }
        }
    }

    public static String getPermutation(int[] arr, int k) {
        List<String> allPermutations = getAllPermutations(arr);

        if (k > allPermutations.size()) {
            return "Invalid value as there are only " + allPermutations.size() + " possible permutations for this array.";
        }

        return allPermutations.get(k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k (or type 'X' to list all permutations): ");
        if (sc.hasNextInt()) {
            int k = sc.nextInt();
            System.out.println("K-th permutation: " + getPermutation(arr, k));
        } else {
            String input = sc.next();
            if (input.equalsIgnoreCase("X")) {
                System.out.println("All possible permutations:");
                List<String> allPermutations = getAllPermutations(arr);
                for (int i = 0; i < allPermutations.size(); i++) {
                    System.out.println((i + 1) + ": " + allPermutations.get(i));
                }
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}

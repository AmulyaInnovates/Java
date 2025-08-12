import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int sum = 0;

        while (!stack.isEmpty() || index < candidates.length) {
            if (sum == target) {
                result.add(new ArrayList<>(stack));
                if (stack.isEmpty()) break;
                sum -= stack.pop();
                index++;
            } else if (sum > target || index >= candidates.length) {
                if (stack.isEmpty()) break;
                sum -= stack.pop();
                index++;
            } else {
                stack.push(candidates[index]);
                sum += candidates[index];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> res = combinationSum(candidates, target);
        System.out.println(res);
    }
}

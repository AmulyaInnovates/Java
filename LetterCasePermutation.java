import java.util.*;

public class LetterCasePermutation {
    public static List<String> getPermutations(String s) {
        List<String> result = new ArrayList<>();
        helper(s, 0, "", result);
        return result;
    }

    private static void helper(String s, int index, String current, List<String> result) {
        if (index == s.length()) {
            result.add(current);
            return;
        }

        char c = s.charAt(index);
        if (Character.isLetter(c)) {
            helper(s, index + 1, current + Character.toLowerCase(c), result);
            helper(s, index + 1, current + Character.toUpperCase(c), result);
        } else {
            helper(s, index + 1, current + c, result);
        }
    }

    public static void main(String[] args) {
        String s = "a1b2";
        List<String> res = getPermutations(s);
        System.out.println(res);
    }
}

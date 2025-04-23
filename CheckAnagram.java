import java.util.*;

class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first text: ");
        String n1 = sc.nextLine();
        System.out.println("Enter your second text: ");
        String n2 = sc.nextLine();
        
        if (checkAnagram(n1, n2)) {
            System.out.println("These texts are an Anagram");
        } else {
            System.out.println("These texts are not an Anagram");
        }
        
        sc.close();
    }

    static boolean checkAnagram(String n1, String n2) {
        n1 = n1.replaceAll("\\s", "").toLowerCase();
        n2 = n2.replaceAll("\\s", "").toLowerCase();

        if (n1.length() != n2.length()) {
            return false;
        }

        char[] a1 = n1.toCharArray();
        char[] a2 = n2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
}

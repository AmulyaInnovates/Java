public class CheckPangram {
    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] foundLetters = new boolean[26];
        int totalLetters = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char current = sentence.charAt(i);
            if (current >= 'a' && current <= 'z') {
                int index = current - 'a';
                if (!foundLetters[index]) {
                    foundLetters[index] = true;
                    totalLetters++;
                }
            }
        }

        if (totalLetters == 26) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(input);

        if (result) {
            System.out.println("The sentence is a Pangram.");
        } else {
            System.out.println("The sentence is NOT a Pangram.");
        }
    }
}

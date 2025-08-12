import java.util.*;

public class UniqueElementsFinder {
    public static ArrayList<String> findUniqueElements(ArrayList<String> inputList) {
        // Use a LinkedHashSet to preserve order and ensure uniqueness
        Set<String> uniqueSet = new LinkedHashSet<>(inputList);
        // Return a new ArrayList, not a reference to inputList
        return new ArrayList<>(uniqueSet);
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("banana");
        
        ArrayList<String> uniqueWords = findUniqueElements(words);
        System.out.println(uniqueWords); // Output: [apple, banana, orange]
    }
}

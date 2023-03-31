import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog.";
        HashMap<String, Integer> wordCounts = new HashMap<>();

        
        String[] words = sentence.split(" ");

       
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
               
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                
                wordCounts.put(word, 1);
            }
        }

       
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            if (count > 1) {
                System.out.printf("%s appears %d times\n", word, count);
            }
        }
    }
}

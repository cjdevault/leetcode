public class mergeAlternately {
    public String mergeAlternatelySolution(String word1, String word2) {
        StringBuilder result = new StringBuilder(); // Use StringBuilder for efficiency

        int w1L = word1.length();
        int w2L = word2.length(); 

        // Calculate the minimum length for looping
        int minLen = Math.min(w1L, w2L); 

        // Alternately merge characters from both strings
        for (int i = 0; i < minLen; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }

        // Append the remainder of the longer string
        if (w1L > w2L) {
            result.append(word1.substring(minLen));
        } else if (w2L > w1L) {
            result.append(word2.substring(minLen));
        }

        return result.toString();
                                                    }
    
}

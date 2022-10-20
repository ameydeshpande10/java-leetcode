package easy;

// 1768
public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd", word2 = "pq";
        // word1 = "abc", word2 = "pqr"
        // word1 = "ab", word2 = "pqrs"
        // word1 = "abcd", word2 = "pq"
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        String result = "";
        for (int i = 0; i < (word1.length() > word2.length() ? word1.length() : word2.length()); i++) {

            if (i < word1.length() && i < word2.length()) {

                result += "" + word1.charAt(i) + "" + word2.charAt(i);
            } else if (i >= word1.length()) {

                result += "" + word2.charAt(i);
            } else if (i >= word2.length()) {

                result += "" + word1.charAt(i);
            }

        }
        return result;
    }
}

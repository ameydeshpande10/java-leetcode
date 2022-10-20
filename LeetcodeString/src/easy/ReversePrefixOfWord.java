package easy;

// 2000
public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word = "abcd"; // "xyxzxe" // "abcdefd" // "abcd"
        char ch = 'z'; // 'z' // 'd' // 'z'
        System.out.println(reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch) {
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        String toRe = new StringBuilder(word.substring(0, index + 1)).reverse().toString();
        // System.out.println(toRe + word.substring(index + 1, word.length()));
        return toRe + word.substring(index + 1, word.length());
    }

}

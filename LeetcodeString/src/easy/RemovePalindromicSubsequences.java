package easy;

import java.util.HashMap;

// 1332
public class RemovePalindromicSubsequences {
    public static void main(String[] args) {
        String s = "baabb"; // "ababa" // "abb" // "baabb"
        System.out.println(removePalindromeSub(s));
    }

    public static int removePalindromeSub(String s) {
        return s.isEmpty() ? 0 : (s.equals(new StringBuilder(s).reverse().toString()) ? 1 : 2);
    }
}

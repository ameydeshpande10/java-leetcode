package easy;

import java.util.Arrays;

public class CheckiftheSentenceIsPangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        // "thequickbrownfoxjumpsoverthelazydog"
        // "leetcode"
        System.out.println(checkIfPangram(s));
        // checkIfPangram(s);
    }

    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char[] ca = sentence.toCharArray();
        Arrays.sort(ca);
        String sorted = "";
        for (char c : ca) {
            if (!sorted.contains(c + "")) {
                sorted += c;
            }
        }
        System.out.println(sorted);
        System.out.println(sorted.matches(alphabets));

        return sorted.matches(alphabets);
    }
}

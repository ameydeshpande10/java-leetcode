package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = new String[] { "a", "b", "c", "ab", "ac", "bc", "abc" };

        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<String> set = new HashSet<String>(Arrays.asList(allowed.split("")));

        outer: for (String string : words) {

            for (char c : string.toCharArray()) {

                if (!set.contains(c + "")) {
                    continue outer;
                }

            }
            count++;
        }

        return count;
    }
}

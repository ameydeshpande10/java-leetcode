package day6;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        String res = "";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            res = res.split(" ")[res.split(" ").length - 1];

            System.out.println(s.charAt(i));
            if (!res.contains(s.charAt(i) + "")) {
                res += s.charAt(i);
                index++;

            } else {
                System.out.println(res);
                // return res.length();
            }

        }
        // System.out.println(res);
        return res.length();
    }
}

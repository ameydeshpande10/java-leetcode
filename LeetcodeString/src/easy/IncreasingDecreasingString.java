package easy;

import java.util.Arrays;

// 1370. X
public class IncreasingDecreasingString {
    public static void main(String[] args) {
        String s = "leetcode"; // "aaaabbbbcccc" // "rat" //"leetcode"

        System.out.println(sortString(s));
    }

    public static String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder repeat = new StringBuilder();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (Character c : chars) {
            if (!sb.toString().contains(c + "")) {
                sb.append(c);
            } else {
                repeat.append(c);
            }
        }
        // System.out.println(new String(chars));
        String unique = sb.toString();
        int n = s.length() / unique.length();
        System.out.println(repeat);
        // System.out.println(unique);
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                sb.append(new StringBuffer(unique).reverse());
            } else {
                sb.append(unique);
            }

        }

        return sb.toString() + repeat.toString();
    }
}

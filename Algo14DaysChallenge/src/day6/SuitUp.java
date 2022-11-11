package day6;

import java.util.Arrays;
import java.util.HashMap;

public class SuitUp {
    public static void main(String[] args) {
        int a = 5;
        int[] b = new int[] { 1, 3, 2, 4, 5 };
        double d1 = 0.899;
        double d2 = 0.899;
        // System.out.println(d1 == d2);
        // System.out.println(maximum(a, b));
        String s = "helliiiiiiiiiio", ans = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
                ans += c + "" + 1;

            } else {
                ans = ans.substring(0, ans.length() - 2);
                map.put(c, map.get(c) + 1);
                // ans.replace(c, c + "" + map.get(c));
                ans += c + "" + map.get(c);
                // ans.replaceFirst(s, ans)
            }

        }
        // System.out.println(map);
        // System.out.println(ans);
        String ab = "GeeksforGeeks";
        System.out.println(ab.substring(2, ab.length()) + ab.substring(0, 2));

    }

    public static int maximum(int input1, int[] input2) {
        int noOfGroups = input1 / 2;
        // Arrays.sort(input2);
        System.out.println(Arrays.toString(input2));
        int sum = 0;
        for (int i = 0, j = input2.length - 1; i < noOfGroups; i++, j--) {

            sum += input2[j] - input2[i];

        }
        return sum;
    }
}

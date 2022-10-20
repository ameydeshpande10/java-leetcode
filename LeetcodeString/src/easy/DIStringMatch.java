package easy;

import java.util.Arrays;

// 942.
public class DIStringMatch {
    public static void main(String[] args) {
        String s = "IDID"; // "IDID" // "III" // "DDI"
        System.out.println(diStringMatch(s));
    }

    public static int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        int index = 0, counter1 = 0, counter2 = s.length();
        for (char c : s.toCharArray()) {
            if (c == 'I') {
                result[index++] = counter1++;
            } else {
                result[index++] = counter2--;
            }

        }
        if (s.charAt(s.length() - 1) == 'I') {
            result[index] = counter1;
        } else {
            result[index] = counter2;
        }

        System.out.println(Arrays.toString(result));

        return result;
    }
}

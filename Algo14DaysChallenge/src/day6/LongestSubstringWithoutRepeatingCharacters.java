package day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        int[] a = new int[] { 100, 100, 100, -10 };
        String[] b = new String[] { "2022-12-31", "2022-12-22", "2022-12-03", "2022-12-29" };
        // System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution2(a, b));
    }

    public static int solution(int[] A, String[] D) {
        int finalBalance = 0;
        int cardFee = 0;
        TreeMap<String, Integer> map = new TreeMap<>();
        TreeMap<String, Integer> card = new TreeMap<>();
        for (int i = 0; i < D.length; i++) {
            map.put(D[i], A[i]);
            card.put(D[i].split("-")[1], null);
        }
        for (Entry<String, Integer> entry : map.entrySet()) {
            // System.out.println(entry.getKey() + "/" + entry.getValue());
            finalBalance += entry.getValue();
            System.out.println(entry.getKey().split("-")[1]);
        }

        System.out.println(map);
        return finalBalance;
    }

    public static int solution2(int[] A, String[] D) {

        int balance = 0;

        int[][] cardPayments = new int[12][2];

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                String monthString = D[i].substring(5, 7);
                int month = Integer.parseInt(monthString);
                cardPayments[month - 1][0]++;
                cardPayments[month - 1][1] += A[i];
            }
            balance += A[i];
        }

        balance -= 5 * 12;

        for (int i = 0; i < cardPayments.length; i++) {
            if (cardPayments[i][0] >= 3 && cardPayments[i][1] * -1 >= 100) {
                balance += 5;
            }
        }

        return balance;
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

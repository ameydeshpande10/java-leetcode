package easy;

import java.util.HashSet;
import java.util.Set;

public class RingsAndRods {
    public static void main(String[] args) {
        String s = "B0B6G0R6R0R6G9"; // "G4" "B0R0G0R9R0B0G0" "B0B6G0R6R0R6G9"
        System.out.println(countPoints(s));
    }

    public static int countPoints(String rings) {

        Set<Integer> Blue = new HashSet<Integer>(), Green = new HashSet<Integer>(), Red = new HashSet<Integer>();

        for (int i = 0; i < rings.length() - 1; i++) {
            if (rings.charAt(i) == 'B') {
                Blue.add(rings.charAt(i + 1) - '0');
            } else if (rings.charAt(i) == 'G') {
                Green.add(rings.charAt(i + 1) - '0');
            } else if (rings.charAt(i) == 'R') {
                Red.add(rings.charAt(i + 1) - '0');
            }
        }

        Set<Integer> highest = null;
        if (Blue.size() > Green.size() && Blue.size() > Red.size()) {
            highest = Blue;
        } else if (Green.size() > Blue.size() && Green.size() > Red.size()) {
            highest = Green;
        } else {
            highest = Red;
        }

        int res = 0;
        for (Integer i : highest) {
            if (Blue.contains(i) && Green.contains(i) && Red.contains(i)) {
                res++;
            }
        }

        return res;
    }
}

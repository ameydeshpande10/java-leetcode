package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 1941
public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static void main(String[] args) {
        String s = "abacbc"; // "abacbc" //"aaabb"
        System.out.println(areOccurrencesEqual(s));
    }

    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);

            } else {
                map.replace(c, map.get(c), map.get(c) + 1);
            }
        }
        Set<Integer> values = new HashSet<Integer>(map.values());
        boolean isUnique = values.size() == 1;
        // System.out.println(map);

        return isUnique;
    }
}

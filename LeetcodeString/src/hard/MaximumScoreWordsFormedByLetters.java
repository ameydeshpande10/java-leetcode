package hard;

import java.nio.charset.Charset;
import java.util.*;
import java.util.Map.Entry;

//1255
public class MaximumScoreWordsFormedByLetters {
    public static void main(String[] args) {
        String[] words = new String[] { "aac", "ab", "cc", "aab" };
        // "xxxz","ax","bx","cx" // "dog", "cat", "dad", "good" // "leetcode" //
        // ["get","set"]
        // "aac","ab","cc","aab"
        char[] letters = new char[] { 'a', 'a', 'a', 'b', 'c', 'c' };
        // 'z','a','b','c','x','x','x'
        // 'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'
        // 'l','e','t','c','o','d'
        // 'g','s','e','t'
        // 'a','a','a','b','c','c'
        int[] score = new int[] { 1, 5, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        // 1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        // 4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10
        // 0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0
        // 0,0,0,0,1,0,2,0,0,0,0,0,0,0,0,0,0,0,3,1,0,0,0,0,0,0
        // 1,5,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
        System.out.println(maxScoreWords2(words, letters, score));
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Entry<String, Integer>> list = new ArrayList(map.entrySet());
        list.sort(Entry.comparingByValue());
        map = new LinkedHashMap();
        for (Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }

    public static Map<String, Integer> sortByValueDec(Map<String, Integer> map) {
        List<Entry<String, Integer>> list = new ArrayList(map.entrySet());
        list.sort(Entry.comparingByValue());
        Collections.reverse(list);
        map = new LinkedHashMap();
        for (Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }

    public static int maxScoreWords2(String[] words, char[] letters, int[] score) {
        String l = "", n = "";
        for (char c : letters) {
            if (!l.contains(c + ""))
                l += c;
        }
        for (int i : score) {
            if (i != 0)
                n += "" + i;
        }
        HashMap<Character, Integer> charCount = new HashMap<>();
        HashMap<Character, Integer> charCount2 = new HashMap<>();
        for (char c : letters) {
            if (!charCount.containsKey(c)) {
                charCount.put(c, 1);
                charCount2.put(c, 1);
            } else {
                charCount.put(c, charCount.get(c) + 1);
                charCount2.put(c, charCount.get(c) + 1);
            }
        }

        HashMap<Character, Integer> alphbetValue = new HashMap<>();
        for (int i = 0; i < l.length(); i++) {
            alphbetValue.put(l.charAt(i), Integer.parseInt(n.charAt(i) + ""));
        }
        HashMap<String, Integer> weightMap = new HashMap<>();
        for (String s : words) {

            weightMap.put(s, 0);
            int count = 0;
            for (char c : s.toCharArray()) {
                if (alphbetValue.containsKey(c)) {
                    count += alphbetValue.get(c);
                } else {
                    count = 0;
                    break;
                }
            }
            weightMap.replace(s, count);
        }

        System.out.println("char count : " + charCount);

        weightMap = (HashMap<String, Integer>) sortByValueDec(weightMap);
        int highest = 0;
        for (var entry : weightMap.entrySet()) {
            boolean pass = false;
            String[] removed = new String[entry.getKey().length()];
            int index = 0;
            for (char c : entry.getKey().toCharArray()) {

                if (!charCount.containsKey(c)) {
                    pass = false;
                    break;
                }
                if (charCount.get(c) > 0) {
                    charCount.replace(c, charCount.get(c) - 1);
                    removed[index++] = c + "";
                    pass = true;
                } else {
                    pass = false;
                    break;
                }
            }

            if (!pass) {

                for (String c : removed) {
                    if (c != null) {
                        char ca = c.charAt(0);
                        charCount.replace(ca, charCount.get(ca) + 1);
                    }

                }
            }
            if (pass) {
                System.out.println(entry.getValue());
                highest += entry.getValue();
            }

        }

        weightMap = (HashMap<String, Integer>) sortByValue(weightMap);
        int highest2 = 0;
        for (var entry : weightMap.entrySet()) {
            boolean pass = false;
            String[] removed = new String[entry.getKey().length()];
            int index = 0;
            for (char c : entry.getKey().toCharArray()) {

                if (!charCount2.containsKey(c)) {
                    pass = false;
                    break;
                }
                if (charCount2.get(c) > 0) {
                    charCount2.replace(c, charCount2.get(c) - 1);
                    removed[index++] = c + "";
                    pass = true;
                } else {
                    pass = false;
                    break;
                }
            }

            if (!pass) {

                for (String c : removed) {
                    if (c != null) {
                        char ca = c.charAt(0);
                        charCount2.replace(ca, charCount2.get(ca) + 1);
                    }

                }
            }
            if (pass) {
                System.out.println(entry.getValue());
                highest2 += entry.getValue();
            }

        }
        System.out.println("alphabet values : " + alphbetValue);
        System.out.println("weight map :" + sortByValue(weightMap));
        System.out.println("weight map DEC :" + sortByValueDec(weightMap));
        System.out.println(highest + " :: " + highest2);
        return highest > highest2 ? highest : highest2;
    }

    public static int maxScoreWords(String[] words, char[] letters, int[] score) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        LinkedHashSet<Character> lettersSet = new LinkedHashSet<>();
        HashMap<Character, Integer> charCount = new HashMap<>();
        HashMap<Character, Integer> charCount2 = new HashMap<>();
        for (char c : letters) {

            lettersSet.add(c);
            if (!charCount.containsKey(c)) {
                charCount.put(c, 1);
                charCount2.put(c, 1);
            } else {
                charCount.put(c, charCount.get(c) + 1);
                charCount2.put(c, charCount.get(c) + 1);
            }
        }

        List<Integer> scoreList = new ArrayList<>();
        for (int i : score) {
            scoreList.add(i);
        }
        scoreList.removeAll(Collections.singleton(0));

        int i = 0;
        for (Character c : lettersSet) {

            map.put(c, scoreList.get(i++));
        }

        Map<String, Integer> weightMap = new TreeMap<>(Collections.reverseOrder());
        Map<String, Integer> weightMap2 = new TreeMap<>();

        for (String s : words) {

            weightMap.put(s, 0);
            weightMap2.put(s, 0);
            int count = 0;
            for (char c : s.toCharArray()) {

                if (map.containsKey(c)) {
                    count += map.get(c);
                } else {
                    count = 0;
                    break;
                }

            }

            weightMap.replace(s, count);
            weightMap2.replace(s, count);
        }

        System.out.println(weightMap);
        System.out.println(weightMap2);

        System.out.println(charCount);
        int highest = 0;
        for (var entry : weightMap.entrySet()) {
            boolean pass = false;
            String[] removed = new String[entry.getKey().length()];
            int index = 0;
            for (char c : entry.getKey().toCharArray()) {

                if (!charCount.containsKey(c)) {
                    pass = false;
                    break;
                }
                if (charCount.get(c) > 0) {
                    charCount.replace(c, charCount.get(c) - 1);
                    removed[index++] = c + "";
                    pass = true;
                } else {
                    pass = false;
                    break;
                }
            }

            if (!pass) {

                for (String c : removed) {
                    if (c != null) {
                        char ca = c.charAt(0);
                        charCount.replace(ca, charCount.get(ca) + 1);
                    }

                }
            }
            if (pass) {
                highest += entry.getValue();
            }

        }

        int highest2 = 0;
        for (var entry : weightMap2.entrySet()) {
            boolean pass = false;
            String[] removed = new String[entry.getKey().length()];
            int index = 0;
            for (char c : entry.getKey().toCharArray()) {

                if (!charCount2.containsKey(c)) {
                    pass = false;
                    break;
                }
                if (charCount2.get(c) > 0) {
                    charCount2.replace(c, charCount2.get(c) - 1);
                    removed[index++] = c + "";
                    pass = true;
                } else {
                    pass = false;
                    break;
                }
            }

            if (!pass) {

                for (String c : removed) {
                    if (c != null) {
                        char ca = c.charAt(0);
                        charCount2.replace(ca, charCount2.get(ca) + 1);
                    }

                }
            }
            if (pass) {
                System.out.println(entry.getValue());
                highest2 += entry.getValue();
            }

        }

        System.out.println("map : " + map);

        System.out.println("weightmaps :: ");
        System.out.println(weightMap);
        System.out.println(weightMap2);
        System.out.println(highest + " :: " + highest2);
        return highest > highest2 ? highest : highest2;

    }
}

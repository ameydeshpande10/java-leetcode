package easy;

// 2185
public class CountingWordsWithAGivenPrefix {
    public static void main(String[] args) {
        String[] words = new String[] { "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh",
                "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh",
                "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh",
                "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh",
                "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh",
                "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh",
                "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh",
                "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh",
                "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh",
                "sxyjellhlh", "sxyjellhlh", "vbx", "fsi", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh",
                "gqira", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh",
                "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh",
                "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh",
                "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh", "sxyjellhlh" };
        String prefix = "sxyjellhlh";
        // "pay", "attention", "practice", "attend" // "at"
        // "leetcode","win","loops","success" // "code"
        // "sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","vbx","fsi","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","gqira","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh"
        System.out.println(prefixCount(words, prefix));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String string : words) {
            if (string.length() >= pref.length()) {
                if (string.substring(0, pref.length()).equals(pref)) {
                    count++;
                }
            }

        }
        return count;
    }
}

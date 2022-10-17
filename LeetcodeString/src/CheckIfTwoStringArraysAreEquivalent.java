public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = new String[] { "fvnzyxfmvtsezl" };
        String[] word2 = new String[] { "f", "v", "nzyx", "fmvt", "sez", "l" };

        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "", w2 = "";

        int limit = word1.length > word2.length ? word1.length : word2.length;
        for (int i = 0; i < limit; i++) {
            if (word1.length > i)
                w1 += word1[i];
            if (word2.length > i)
                w2 += word2[i];
        }
        System.out.println(w1 + " :: " + w2);
        if (w1.matches(w2)) {
            return true;
        } else {
            return false;
        }

    }
}

// ["fvnzyxfmvtsezl"]["f","v","nzyx","fmvt","sez","l"]
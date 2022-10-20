package easy;

// 1704
public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "textbook"; // "book" // "textbook"
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String vowels = "aeiou";
        int lvc = 0, rvc = 0;
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            // System.out.println("i : " + i + " j: " + j);
            if (vowels.contains(s.charAt(i) + "")) {
                lvc++;
            }
            if (vowels.contains(s.charAt(j) + "")) {
                rvc++;
            }

        }
        return lvc == rvc ? true : false;
    }
}

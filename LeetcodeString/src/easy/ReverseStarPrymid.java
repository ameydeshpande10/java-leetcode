package easy;

public class ReverseStarPrymid {
    public static void main(String[] args) {
        String s = "eeeellee";

        ReverseStarPrymid a = new ReverseStarPrymid();

        System.out.println(a.pair(s));
    }

    public int pair(String s) {

        int count = 0;
        if (s.length() < 2) {
            return 0;
        }

        String str = "";
        for (int i = 0; i < s.length() - 2; i++) {
            // str += s.charAt(i);
            if (!str.contains(s.charAt(i) + "")) {
                if (s.charAt(i) == s.charAt(i + 1) && !str.contains(s.charAt(i) + "")) {
                    count++;
                }
                str = " ";
            }

            str += s.charAt(i);
        }

        return count;
    }

}

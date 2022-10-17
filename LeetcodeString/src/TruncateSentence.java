import java.util.Arrays;

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;

        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k) {

        int spaceCount = 0;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                spaceCount++;
            if (spaceCount < k)
                res += s.charAt(i);

        }

        return res;
    }
}

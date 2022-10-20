package easy;

// 1309
public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        String s = "1326#"; // "10#11#12" //"1326#"
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                if (Integer.parseInt(s.charAt(i - 1) + "") < 10) {
                    result += (char) (Integer.parseInt(s.charAt(i - 2) + "" + s.charAt(i - 1)) + 96);
                    i -= 2;
                } else {
                    result += (char) (Integer.parseInt(s.charAt(i - 1) + "") + 96);
                    i--;
                }
            } else {
                result += (char) (Integer.parseInt(s.charAt(i) + "") + 96);
            }
        }

        return new StringBuilder(result).reverse().toString();
    }
}

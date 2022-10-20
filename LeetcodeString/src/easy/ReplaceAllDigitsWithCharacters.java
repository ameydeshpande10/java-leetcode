package easy;

//1844
public class ReplaceAllDigitsWithCharacters {
    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        System.out.println(replaceDigits(s));
    }

    public static String replaceDigits(String s) {
        s = s.toLowerCase();
        String result = "";
        for (int i = 0; i < s.length(); i += 2) {
            if (i + 1 > s.length() - 1) {
                result += s.charAt(i);
            } else {
                int n = Integer.parseInt(s.charAt(i + 1) + "");
                result += "" + s.charAt(i) + ((char) (s.charAt(i) + n));
            }

        }
        return result;
    }
}

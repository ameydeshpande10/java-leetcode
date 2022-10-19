package coderbyte;

public class StringChallenge {
    public static void main(String[] args) {
        String s = "Hello 45";

        System.out.println(encodeString(s));
    }

    public static String encodeString(String s) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz", result = "";
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (alphabets.indexOf(c) != -1) {
                result += "" + (alphabets.indexOf(c) + 1);
            } else {
                result += c;
            }

        }

        return result;
    }
}

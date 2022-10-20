package easy;

// 2351
public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String s = "abcdd"; // "abccbaacz" // "abcdd"
        System.out.println(repeatedCharacter(s));
    }

    public static char repeatedCharacter(String s) {
        String unique = "";
        for (char c : s.toCharArray()) {
            if (unique.contains(c + "")) {
                return c;
            } else {
                unique += c;
            }
        }
        return 'a';
    }
}

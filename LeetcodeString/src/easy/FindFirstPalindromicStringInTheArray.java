package easy;

//2108
public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
        String[] words = new String[] { "abc", "car", "ada", "racecar", "cool" };
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        for (String string : words) {
            if (string.equals(new StringBuilder(string).reverse().toString())) {
                return string;
            }
        }
        return "";
    }
}

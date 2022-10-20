package easy;

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public static void main(String[] args) {
        String[] patterns = new String[] { "a", "abc", "bc", "d" };
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String string : patterns) {
            if (word.contains(string)) {
                count++;
            }
        }
        return count;
    }
}

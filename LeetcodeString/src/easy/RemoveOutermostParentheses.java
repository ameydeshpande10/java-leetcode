package easy;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))"; // "(()())(())(()(()))" // "(()())(())"
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int opened = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && opened++ > 0)
                sb.append(c);
            if (c == ')' && opened-- > 1)
                sb.append(c);
        }
        return sb.toString();
    }
}

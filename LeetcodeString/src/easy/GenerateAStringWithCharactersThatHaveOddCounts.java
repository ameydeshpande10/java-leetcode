package easy;

// 1374
public class GenerateAStringWithCharactersThatHaveOddCounts {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(generateTheString(n));
    }

    public static String generateTheString(int n) {

        String s = "";
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                s += "f";
            }
            s += "u";
        } else {
            for (int i = 0; i < n; i++) {
                s += "f";
            }
        }

        return s;
    }
}

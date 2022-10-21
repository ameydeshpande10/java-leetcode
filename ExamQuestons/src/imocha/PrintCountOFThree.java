package imocha;

public class PrintCountOFThree {
    public static void main(String[] args) {
        int n = 45;

        System.out.println(countOfThree(n));
    }

    public static int countOfThree(int n) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.toString(i).contains("3")) {
                count++;
            }

        }
        return count;
    }

}

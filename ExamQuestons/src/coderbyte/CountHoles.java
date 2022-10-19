package coderbyte;

public class CountHoles {
    private static void DFS(String strArr[], int r, int c, int val) {
        int rows = strArr.length;
        int cols = strArr[0].length();

        if (r < rows && c < cols && strArr[r].charAt(c) == '0') {
            String s = strArr[r];
            strArr[r] = s.substring(0, c) + val;
            if (c < cols - 1) {
                strArr[r] += s.substring(c + 1);
            }
            DFS(strArr, r + 1, c, val);
            DFS(strArr, r, c + 1, val);
        }
    }

    public static int SearchingChallenge(String strArray[]) {
        int count = 0;

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length(); j++) {

                if (strArray[i].charAt(j) == '0') {
                    // strArray[i] = strArray[i].replace('0', '2');
                    DFS(strArray, i, j, ++count + 1);
                }

            }
            System.out.println(strArray[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        String arr[] = { "10111", "10101", "11101", "11110" };
        System.out.println(SearchingChallenge(arr));
    }

}

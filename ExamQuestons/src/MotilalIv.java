public class MotilalIv {
    public static void main(String[] args) {

        int[][] arr = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int sum = 0, j = 0;

        for (int i = 0; i < 10; i++) {
            sum += arr[j++];
        }
    }

}

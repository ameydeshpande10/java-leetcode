package easy;

// 1672.
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] aaccounts = new int[][] { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        // { 1, 2, 3 }, { 3, 2, 1 }
        // {1,5},{7,3},{3,5}
        System.out.println(maximumWealth(aaccounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int curTotal = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                curTotal += accounts[i][j];
            }
            if (curTotal > highest) {
                highest = curTotal;
            }
        }
        return highest;
    }
}

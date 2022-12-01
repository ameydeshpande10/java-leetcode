package easy;

import java.util.Arrays;

// 1470.
public class ShuffleTheArray {
    public static void main(String[] args) {
        int n = 2; // 4 // 3 // 2
        int[] nums = new int[] { 1, 1, 2, 2 }; // 1,2,3,4,4,3,2,1 // 2, 5, 1, 3, 4, 7 // 1,1,2,2
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[n * 2];

        for (int i = 0, j = n, index = 0; i < n; i++, j++) {

            res[index++] = nums[i];
            res[index++] = nums[j];
        }
        return res;
    }
}

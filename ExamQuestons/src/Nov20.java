import java.util.Arrays;

public class Nov20 {
    public static void main(String[] args) {
        // int[] arr = new int[] { 3, 4, 5, 3, 100, 1, 83, 54, 23, 20 };
        // System.out.println();
        // printSub2(arr);

        // printSub2(arr);

        String s = "eemmeellee";
        System.out.println(findPairs(s));

    }

    public static int findPairs(String s) {
        int count = 0;
        char lastChar = s.charAt(0);
        for (int i = 1; i < s.length() - 1; i++) {
            if (i == 1 && s.charAt(i) == lastChar) {
                count++;
            }
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) != lastChar) {
                lastChar = s.charAt(i);
                System.out.println(s.charAt(i));
                count++;
            }
        }

        return count;
    }

    public static void printSub(int[] arr) {
        int[] arr1 = new int[arr.length / 2];
        int[] arr2 = new int[arr.length / 2];

        Arrays.sort(arr);
        for (int n = 1, index = 0, i = arr.length - 1; i > 0; i -= 2, n++) {
            if (n % 2 != 0) {
                arr1[index] = arr[i];
                arr2[index++] = arr[i - 1];
            } else {
                arr2[index] = arr[i];
                arr1[index++] = arr[i - 1];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void printSub2(int[] arr) {
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
        Arrays.sort(arr);
        int sum1 = 0, index1 = 0, index2 = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (sum1 + arr[i] <= sum / 2) {
                sum1 += arr[i];
                arr1[index1++] = arr[i];
            } else {
                arr2[index2++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}

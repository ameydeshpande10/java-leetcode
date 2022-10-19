package imocha;

import java.util.ArrayList;
import java.util.List;

public class EqualSplitArray {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = new int[] { 1, 2, 2, 1 };
        System.out.println(equalSplitArrayIndex(arr, n));
    }

    public static int equalSplitArrayIndex(int[] arr, int n) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int i : arr) {
            if (!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        }
        int un = uniqueList.size();
        if (arr.length == un) {
            return -1;
        }

        uniqueList = new ArrayList<>();
        int count = 0;
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            // System.out.println("i :: " + arr[i] + ", j :: " + arr[j]);
            if (!uniqueList.contains(arr[i])) {
                uniqueList.add(arr[i]);
                count++;
                if (count == un) {
                    return j;
                }
            }
            if (!uniqueList.contains(arr[j])) {
                uniqueList.add(arr[j]);
                count++;
                if (count == un) {
                    return j;
                }
            }

        }
        return -1;
    }
}

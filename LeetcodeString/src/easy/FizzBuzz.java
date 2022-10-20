package easy;

import java.util.ArrayList;
import java.util.List;

// 412
public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15; // 3 // 5 // 15
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(i + "");
            }
        }

        return list;
    }
}

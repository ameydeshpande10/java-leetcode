package imocha;

import java.util.Arrays;
import java.util.HashMap;

public class PrintCountOFThree {
    public static void main(String[] args) {
        int n = 45;

        String date = "2/1/2019";
        String day = "sunday";
        System.out.println(weekNo(date, day));

        // System.out.println(countOfThree(n));
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

    public static int weekNo(String date, String day) {
        HashMap<Integer, Integer> daysInMonths = new HashMap<>();
        HashMap<String, Integer> days2 = new HashMap<>();
        days2.put("monday", 1);
        days2.put("tuesday", 2);
        days2.put("wednesday", 3);
        days2.put("thursday", 4);
        days2.put("friday", 5);
        days2.put("saturday", 6);
        days2.put("sunday", 7);

        String[] date1 = date.split("/");

        daysInMonths.put(1, 31);
        if (Integer.parseInt(date1[2]) % 4 == 0) {
            daysInMonths.put(2, 29);
        } else {
            daysInMonths.put(2, 28);
        }
        daysInMonths.put(3, 31);
        daysInMonths.put(4, 30);
        daysInMonths.put(5, 31);
        daysInMonths.put(6, 30);
        daysInMonths.put(7, 31);
        daysInMonths.put(8, 31);
        daysInMonths.put(9, 30);
        daysInMonths.put(10, 31);
        daysInMonths.put(11, 30);
        daysInMonths.put(12, 31);

        int days = 0;
        for (int i = 1; i < Integer.parseInt(date1[1]); i++) {
            days += daysInMonths.get(i);
        }
        days += Integer.parseInt(date1[0]);
        // System.out.println(days2.get(day));

        if (days % 7 != 0) {
            if (days2.get(day) != 1) {
                return (days / 7) + 2;
            }
            return (days / 7) + 1;
        } else {
            if (days2.get(day) != 1) {
                return (days / 7) + 2;
            }
            return (days / 7);
        }

    }

}

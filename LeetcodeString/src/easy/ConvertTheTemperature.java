package easy;

import java.util.Arrays;

// 2469.
public class ConvertTheTemperature {
    public static void main(String[] args) {
        double temp = 122.11; // 122.11 // 36.50
        System.out.println(Arrays.toString(convertTemperature(temp)));
    }

    public static double[] convertTemperature(double celsius) {
        double[] temps = new double[2];

        temps[0] = celsius + 273.15;
        temps[1] = celsius * 1.80 + 32.00;

        return temps;
    }
}

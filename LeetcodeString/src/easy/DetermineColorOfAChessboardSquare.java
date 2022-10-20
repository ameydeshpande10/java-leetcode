package easy;

// 1812
public class DetermineColorOfAChessboardSquare {
    public static void main(String[] args) {
        String coordinates = "h3"; // "c7" //"h3" //"a1"
        System.out.println(squareIsWhite(coordinates));
    }

    public static boolean squareIsWhite(String coordinates) {
        // coordinates = coordinates.toLowerCase();
        // String white = "abcdefgh";
        // System.out.println((int) coordinates.charAt(0));

        // if ((white.indexOf(coordinates.charAt(0)) + 1) % 2 != 0) {
        // if (Integer.parseInt(coordinates.charAt(1) + "") % 2 == 0) {
        // return true;
        // } else {
        // return false;
        // }
        // } else {
        // if (Integer.parseInt(coordinates.charAt(1) + "") % 2 != 0) {
        // return true;
        // } else {
        // return false;
        // }
        // }

        // 2nd method
        return (((int) coordinates.charAt(0) - 96) + (int) coordinates.charAt(1)) % 2 == 0 ? false : true;

    }
}

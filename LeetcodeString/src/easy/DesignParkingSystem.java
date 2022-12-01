package easy;

import java.util.List;

// 1603.
public class DesignParkingSystem {
    public static void main(String[] args) {

    }

}

class Polygon {
    List<Double> sides;

    Polygon(Double... side) {
        for (Double s : side) {
            sides.add(s);
        }
    }

    public List<Double> getSides() {
        return sides;
    }

    public Double getArea() {
        Double area = 0.0;
        for (Double s : sides) {
            area += s;
        }
        return area;
    }
}

class Rectangle extends Polygon {
    Double side1 = 1.0;
    Double side2 = 2.0;

    Rectangle(Double side1, Double side2) {
        super(side1, side2, side1, side2);

    }

    @Override
    public Double getArea() {
        return side1 * side2;
    }
}

class Square extends Polygon {

    Double side = 1.0;

    Square(Double side) {
        super(side, side, side, side);
    }

    @Override
    public Double getArea() {
        return side * side;
    }

}
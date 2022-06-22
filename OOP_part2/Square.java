package OOP_part2;

public class Square extends Rectangle {

    public Square(Point point, double side) {
        super(point, side, side);
    }

    public double getSide() {
        return getHeight();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }
 
}

package OOP_part2;

public class Rectangle extends Figure {

    private double width;
    private double height;

    public Rectangle(Point point, double width, double height) {
        super(point, name(width, height));
        this.width = width;
        this.height = height;
    }

    private static String name(double width, double height){
        if (width == height)
            return "Square";
        return "Rectangle";
    }

    public double area(){
        return (width * height);
    }

    public double perimeter(){
        return (width + height) * 2; 
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}

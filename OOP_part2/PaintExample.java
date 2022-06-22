package OOP_part2;

public class PaintExample {
    public static void main(String[] args) {
        Point point = new Point(10, 20);
       
        Rectangle rectangle = new Rectangle(point, 30.0, 10.0);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        rectangle.draw();
        rectangle.draw(Color.WHITE);
        rectangle.setHeight(5);
        System.out.println(rectangle.area());
        System.out.println();

        Point point2 = new Point(15, 30);

        Square square = new Square(point2, 5);
        System.out.println(square.getSide());
        System.out.println(square.area());
        System.out.println(square.perimeter());
        square.draw();
        square.draw(Color.ORANGE);
        square.setSide(4);
        System.out.println(square.area());
        System.out.println();

        Circle circle = new Circle(point2, 3);
        System.out.println(circle.getRadius());
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        circle.draw();
        circle.draw(Color.PINK);
        circle.setRadius(6);
        System.out.println(circle.area());
        System.out.println();

        Triangle triangle = new Triangle(point, 10, 4, 10);
        System.out.println(triangle.getSide1());
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());
        triangle.draw();
        triangle.draw(Color.YELLOW);
        triangle.setSide1(5);
        System.out.println(triangle.perimeter());
        System.out.println();
        
        System.out.println(FigureUtil.area(rectangle));
        System.out.println(FigureUtil.perimeter(square));
        FigureUtil.draw(circle);
        FigureUtil.draw(triangle, Color.GREEN);
    }
}

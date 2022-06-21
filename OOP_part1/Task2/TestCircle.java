package OOP_part1.Task2;

public class TestCircle {
    public static void main(String[] args) {
        
        Circle circle = new Circle(3, "Black");
        
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " +circle.perimeter());
        System.out.println(circle);
    }
}

package OOP_part1.Task2;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double area(){
        return (Math.PI * radius * radius);
    }

    public double perimeter(){
        return (2 * Math.PI * radius);
    }

    public String toString(){
        return "Circle(Радиус: " + radius + ", Цвет: " + color + ", Площадь: " + area() + ", Периметр: " + perimeter() + ")";
    }
}

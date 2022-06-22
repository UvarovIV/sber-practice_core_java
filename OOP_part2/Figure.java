package OOP_part2;

public abstract class Figure implements Drawable {

    private Point point;
    private String figure;

    public Figure(Point point, String figure){
        this.point = point; 
        this.figure = figure;
    }

    public abstract double area();
    public abstract double perimeter();

    public void draw(){
        System.out.println(String.format("Нарисована фигура: %s с координатами ( %s , %s )", figure, point.getX(), point.getY()));
    }

    public void draw(Color color){
        System.out.println(String.format("Нарисована фигура: %s с координатами ( %s , %s ). Цвет: %s", figure, point.getX(), point.getY(), color));
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

}

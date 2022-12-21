package Lab2;

public class Circle {
    private String color;
    private double radius;
    private double area;

    public Circle() {
        radius = 3.0;
        color = "Неизвестный";
    }
    public Circle(String c) {
        color = c;
        radius = 5.0;
    }
    public Circle(double r) {
        radius = r;
        color = "Неизвестный";
    }
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return area = radius*radius*Math.PI;
    }
}

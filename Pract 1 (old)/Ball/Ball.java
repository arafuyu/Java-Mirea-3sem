package Pract1.Ball;

public class Ball {
    private String color;
    private int radius;

    public Ball(String c, int r) {
        color = c;
        radius = r;
    }
    public Ball (String c) {
        color = c;
        radius = 1;
    }
    public Ball (int r) {
        color = "Неизвестный";
        radius = r;
    }

    public Ball () {
        color = "Синий";
        radius = 1;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String getColor(String color) {
        return color;
    }
    public int getYear() {
        return radius;
    }
    public String toString() {
        return this.color+" цвет, радиус = "+this.radius;
    }
}
package Lab2;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "Синий");
        Circle c2 = new Circle(4.0);
        Circle c3 = new Circle("Черный");
        Circle c4 = new Circle();

        System.out.println();
        System.out.println(c1.getColor()+" цвет, радиус = "+c1.getRadius()+", площадь = "+ c1.getArea());
        System.out.println(c2.getColor()+" цвет, радиус = "+c2.getRadius()+", площадь = "+ c2.getArea());
        System.out.println(c3.getColor()+" цвет, радиус = "+c3.getRadius()+", площадь = "+ c3.getArea());
        System.out.println(c4.getColor()+" цвет, радиус = "+c4.getRadius()+", площадь = "+ c4.getArea());
    }
}
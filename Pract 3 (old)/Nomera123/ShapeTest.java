package Pract3.Nomera123;

public class ShapeTest {
    public static void main(String[] args) {

        Shape s1 = new Circle("Красный", false, 8);  // Upcast Circle to Shape

        System.out.println(); //пробел

        // Возвращает методы Circle, определенные в Shape
        System.out.println(s1);
        System.out.println("Площадь = " + s1.getArea());
        System.out.println("Периметр = " + s1.getPerimeter());
        System.out.println("Цвет = " + s1.getColor());
        System.out.println("Заливка = " + s1.isFilled());
        //System.out.println(s1.getRadius());   // Не в Shape

        System.out.println(); //пробел

        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        // Возвращает методы Circle
        System.out.println(c1);
        System.out.println("Площадь = " + c1.getArea());
        System.out.println("Периметр = " + c1.getPerimeter());
        System.out.println("Цвет = " + c1.getColor());
        System.out.println("Заливка = " + c1.isFilled());
        System.out.println("Радиус = " + c1.getRadius());

        System.out.println();
        //Shape s2 = new Shape();   //  Абстрактный

        Shape s3 = new Rectangle("Белый", false, 1.0, 2.0);   // Upcast
        // Возвращает методы Rectangle, определенные в Shape
        System.out.println(s3);
        System.out.println("Площадь = " + s3.getArea());
        System.out.println("Периметр = " + s3.getPerimeter());
        System.out.println("Цвет = " + s3.getColor());
        //System.out.println("Длинна" + s3.getLength()); // Не в Shape

        System.out.println();

        Rectangle r1 = (Rectangle)(s3);   // Downcast
        // Возвращает методы Rectangle
        System.out.println(r1);
        System.out.println("Площадь = " + r1.getArea());
        System.out.println("Цвет = " + r1.getColor());
        System.out.println("Длинна = " + r1.getLength());

        System.out.println();

        Shape s4 = new Square(12);     // Upcast
        // Возвращает Square методы, определенные в Shape
        System.out.println(s4);
        System.out.println("Площадь = " + s4.getArea());
        System.out.println("Цвет = " + s4.getColor());
        //System.out.println(s4.getSide());  // Не в Rectangle

        System.out.println();

        //Мы уменьшаем форму s4 до Rectangle, который является суперклассом Square, вместо Square.
        Rectangle r2 = (Rectangle)s4;
        //Возвращает квадратные методы, определенные в Rectangle
        System.out.println(r2);
        System.out.println("Площадь = " + r2.getArea());
        System.out.println("Цвет = " + r2.getColor());
        System.out.println("Длинна = " + r2.getLength());
        //System.out.println(r2.getSide());  // Не в Rectangle

        System.out.println();

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        // Возврат Square методов
        System.out.println(sq1);
        System.out.println("Площадь = " + sq1.getArea());
        System.out.println("Цвет = " + sq1.getColor());
        System.out.println("Ширина = " + sq1.getSide());
        System.out.println("Длинна = " + sq1.getLength());
    }
}
package Pract1.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Белый", 4);
        Ball b2 = new Ball("Желтый");
        b2.setRadius(8);
        Ball b4 = new Ball(3);
        System.out.println();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b4);
    }
}
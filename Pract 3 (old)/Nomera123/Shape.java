package Pract3.Nomera123;

public abstract class Shape { //публичный абстрактный класс (класс, который не предполагает создания экземпляров. Абстрактные классы реализуют на практике полиморфизм.)
    protected String color;
    protected boolean filled; //В Java ключевое слово boolean является примитивным типом данных . Он используется для хранения только двух возможных значений: true или false.

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
        color = "Серый";
        filled = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape" + "Цвет = " + color + ", Заливка = " + filled + '}';
    }
}
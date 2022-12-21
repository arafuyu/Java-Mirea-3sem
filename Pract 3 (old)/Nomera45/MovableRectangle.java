package Pract3.Nomera45;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void setSpeed(int xSpeed, int ySpeed){
        //метод с ошибкой для проверки работы isEqualSpeed
        topLeft.ySpeed = ySpeed;
        topLeft.xSpeed = xSpeed;
    }

    private boolean isEqualSpeed(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed; //проверка одинаковости скоростей
    }

    @Override
    public String toString() {
        return "MovableRectangle (" +
                "Левый верх = MovablePoint (x = " + topLeft.x + ", y = "+ topLeft.y + "), " +
                "Правый низ = MovablePoint (x = " + bottomRight.x + ", y = " + bottomRight.y + "), " +
                "xSpeed = " + topLeft.xSpeed + ", " +
                "ySpeed=" + topLeft.ySpeed + ")";
    }

    @Override //расписывание команды ВВЕРХ
    public void moveUp() {
        if(!isEqualSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "\nЛевый верх:\n\txSpeed = " + topLeft.xSpeed + "\n\tySpeed = " + topLeft.ySpeed +
                "\n\nПравый низ:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);
        topLeft.moveUp();
        bottomRight.moveUp();

    }

    @Override //расписывание команды ВНИЗ
    public void moveDown() {
        if(!isEqualSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "\nЛевый верх:\n\txSpeed = " + topLeft.xSpeed + "\n\tySpeed = " + topLeft.ySpeed +
                "\n\nПравый низ:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);
        topLeft.moveDown();
        bottomRight.moveDown();

    }

    @Override //расписывание команды ВЛЕВО
    public void moveLeft() {
        if(!isEqualSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" + // метод try, catch и throw для проверки на одиковость скоростей
                "\nЛевый верх:\n\txSpeed = " + topLeft.xSpeed + "\n\tySpeed = " + topLeft.ySpeed +
                "\nПравый низ:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);
        topLeft.moveLeft();
        bottomRight.moveLeft();

    }

    @Override //расписывание команды ВПРАВО
    public void moveRight() {
        if(!isEqualSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "\nЛевый верх:\n\txSpeed = " + topLeft.xSpeed + "\n\tySpeed = " + topLeft.ySpeed +
                "\nПравый верх:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
package Lab4;

public abstract class Service implements Priceable {
    private double price;

    public Service(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Стоимость = " + price;
    }
}

package Lab4;

public class Delivery extends Service{
    private String Date;
    private String Place;

    public Delivery(double price, String Date, String Place) {
        super(price);
        this.Date = Date;
        this.Place = Place;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date){
        this.Date = Date;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String Place){
        this.Place = Place;
    }

    @Override
    public String toString() {
        return "Доставка. " +
                "Дата - " + Date + ", " + "Место - " + Place + ", " + super.toString() + " рублей";
    }
}

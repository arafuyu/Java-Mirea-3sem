package Lab4;

public class TestPriceable {
    public static void main(String[] args) {
        System.out.println();
        Priceable p = new Delivery(500, "18.10.2022", "ул. Пушкина, дом 1, кв. 15");
        System.out.println(p);
        p = new Vilka1(73.5, "Металл");
        System.out.println(p);
        p = new Cup1(488, 200, "Керамика");
        System.out.println(p);
    }
}

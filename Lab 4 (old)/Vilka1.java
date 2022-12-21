package Lab4;

public class Vilka1 extends Product{
    private String material;

    public Vilka1(double price, String material) {
        super(price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    @Override
    public String toString() {
        return "Вилка. " +
                "Материал - " + material + ", " + super.toString() + " рублей";
    }
}

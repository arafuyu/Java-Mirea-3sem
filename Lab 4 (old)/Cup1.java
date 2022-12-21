package Lab4;

public class Cup1 extends Product{
    private double Volume;
    private String material;

    public Cup1 (double price, double Volume, String material) {
        super(price);
        this.Volume = Volume;
        this.material = material;
    }

    public double getVolume() {
        return Volume;
    }

    public void setVolume(double Volume) {
        this.Volume = Volume;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Чашка. " +
                "Материал - " + material + ", " + "Объём = " + Volume + "(мл), " + super.toString() + " рублей";
    }

}

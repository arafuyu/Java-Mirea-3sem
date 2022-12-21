package Pract3.Nomera45.Lab3;

abstract class Dish {
    double length;
    int count;
    String material;
    public abstract void OutSpec();
}

class Vilka extends Dish{


    public Vilka(){
        this.material = "Metal";
        this.length = 0;
        this.count = 0;

    }

    public Vilka(String material, double length, int count) {
        this.material = material;
        this.length = length;
        this.count = count;

    }

    public void OutSpec() {
        System.out.println("\nВилка. \nМатериал - " + material + "\nДлина = " + length + "\nКоличество = " + count);
    }
}

class Cup extends Dish{
    double capacity;

    public Cup() {
        this.material = "Керамика";
        this.capacity = 400;
        this.count = 1;

    }

    public Cup (String material, int capacity, int count) {
        this.material = material;
        this.capacity = capacity;
        this.count = count;

    }
    public void OutSpec() {
        System.out.println("\nЧашка. \nМатериал - " + material + "\nОбъем = " + capacity + " миллилитров" + "\nКоличество = " + count);
    }

}
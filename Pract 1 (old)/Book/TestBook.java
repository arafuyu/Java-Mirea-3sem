package Book;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Лев Николаевич Толстой", "Война и мир", 1873);
        Book b2 = new Book("Лев Николаевич Толстой");
        b2.setYear(1869);
        Book b3 = new Book(2077);
        b3.setTitle("Cyberpunk");
        System.out.println();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}

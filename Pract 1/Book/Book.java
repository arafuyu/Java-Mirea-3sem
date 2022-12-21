package Book;

public class Book {
    private String author;
    private String title;
    private int year;

    public Book (String u, String t, int y) {
        author = u;
        title = t;
        year = y;
    }
    public Book (String u) {
        author = u;
        title = "-";
        year = 0;
    }
    public Book (int y) {
        author = "-";
        title = "-";
        year = y;
    }
    public Book () {
        author = "-";
        title = "-";
        year = 0;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getAuthor(String author) {
        return author;
    }
    public String getTitle(String title) {
        return title;
    }
    public int getYear(int year) {
        return year;
    }
    public String toString() {
        return this.author+" | "+this.title+" | "+this.year+" год";
    }
}

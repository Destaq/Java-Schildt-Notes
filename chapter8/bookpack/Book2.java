package chapter8.bookpack;

public class Book2 {
    // these are now protected
    protected String title;
    protected String author;
    protected int pubDate;

    public Book2(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.println(title + " " + author + " " + pubDate);
    }
}
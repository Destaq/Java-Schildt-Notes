package bookpack.bookpackext;

class ExtBook extends bookpack.Book2 {
    // for protection - would also work in another file, as long as it is a subclass
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher + "\n");
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[2];

        books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2019, "Hyperion");
        books[1] = new ExtBook("The Trilogic Worlds: The Impossible War", "Ilincev", 2019, "Penguin");

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }

        // books[0].title = "test title"; // -> illegal, it is protected and not in the same package
        // System.out.println(books[0].title);
    }
}
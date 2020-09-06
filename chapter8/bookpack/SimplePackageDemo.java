package chapter8.bookpack;

class Book {
    private String title;
    private String author;
    private int pubDate;

    Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

class SimplePackageDemo {
    public static void main(String[] args) {
        Book books[] = new Book[2];

        books[0] = new Book("Java: A Beginner's Guide", "Schildt", 2019);
        books[1] = new Book("The Trilogic Worlds: The Impossible War", "Ilincev", 2019);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}

// Note: if you want to run this from the root directory, you need to javac bookpack/SimplePackageDemo.java
// and then likewise run java bookpack.SimplePackageDemo

// Secondary note: Imagine if we had a situation where Book and SimplePackageDemo were in different packages. This is what we'd have to do:
// 1. add the public modifier to the Book class
// 2. make the Book constructor public as well
// 3. any methods we want to use outside of the package must be public too (e.g. show)

// PS. If we want to use it from another package, we need to import it - `import bookpack.Book` or access it through the package name - `new bookpack.Book[2]`
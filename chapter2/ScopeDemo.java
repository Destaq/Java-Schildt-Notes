package chapter2;

public class ScopeDemo {
    public static void main(String[] args) {
        int x; // known to all code in main

        x = 10;
        if (x == 10) {
            int y = 20; // known only to this block

            // x and y both known here

            System.out.println("x: " + x + " y: " + y);
            x = y * 2;
        }
        // y = 100; // error, y not known here

        // x is still known here
        System.out.println(x);
    }
}
import java.io.IOException;

public class ForLoop {
    public static void main(String[] args) throws IOException {
        int i, j;

        for (i = 0, j = 10; i < j; i++, j--) { // support for multiple values
            System.out.println("i and j: " + i + " " + j);
        }

        // loop until S is typed
        int k;

        System.out.println("Print S to stop.");

        for (k = 0; (char) System.in.read() != 'S'; k++) {
            System.out.println("Pass #: " + k);
        }

        // support for missing pieces
        int l;

        for (l = 0; l < 10;) {
            System.out.println("Pass #: " + l);
            l++;
        }

        // you can even do this as a while loop
        for (; i < 10;) { // must be declared somewhere else
            System.out.println("i is less than ten");
            i++;
        }

        /*
         * e.g. infinite loop // for (;;) { // do something }
         */

        // empty for loop
        int m;
        int sum = 0;

        for (m = 1; m <= 5; sum += m++) {

        }
        System.out.println("Sum is: " + sum); // note you can't print m, it is outside of scope

        // do-while (same as JS, runs at least once)
        char ch;

        do {
            System.out.println("Press a key followed by ENTER: ");
            ch = (char) System.in.read();
        } while (ch != 'q'); // outside of brackets
    }
}
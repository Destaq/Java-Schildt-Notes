package chapter10;

import java.io.*;

public class SelfTest {
    public static void main(String[] args) {
        /*
         * 1. Java has both byte and character streams for internationalization and file
         * handling. 2. Java uses byte streams for console input and output, despite the
         * fact that it is text-based, because the streams were the 'original'. 3.
         * FileInputStream fin = new FileInputStream("test"); 4. FileReader fr = new
         * FileReader("test"); 5. randfile = new RandomAccessFile("test", "rw"); 6. You
         * convert a numeric string using the Integer, Binary, etc. type wrappers
         */

        int i;
        FileInputStream fin = null;
        FileOutputStream fou = null;

        try {
            fin = new FileInputStream("test");
            fou = new FileOutputStream("test");
            do {
                i = fin.read();

                if ((char) (i) == ' ')
                    i = '-';
                if (i != -1)
                    fou.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                fin.close();
            } catch (IOException exc) {
                System.out.println("I/O Error: " + exc);
            }
            try {
                fou.close();
            } catch (IOException exc) {
                System.out.println("I/O Error: " + exc);
            }
        }

        // rewritten with character streams we would use FileReader & FileWriter, and try (creating fin and fou)

        /*
        9. System.in is an InputStream
        10. The read method of InputStream returns -1 when the end of the Stream is reached
        11. Binary data is read with DataInputStream
        12. Reader and Writer are at the top of the character-based I/O class hierarchies
        13. The try-with-resources statement is used for automatic resource management
        14. Closing a file within the finally block is generally a good approach
        15. Local variable type inference can be used when declaring resources in a try-with-resources statement
        */
    }
}
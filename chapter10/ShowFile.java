package chapter10;
/* Display a text file

To use this program, specify the name
of the file that you want to see.
For example, to see the file called TEST.TXT,
use the following command line.

java ShowFile TEST.TXT
*/

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {

        int i;
        FileInputStream fin;

        // first make sure that a file has been specified
        if (args.length != 1) {
            System.out.println("Usage: ShowFile file");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException exc) {
            System.out.println("File not found!");
            return;
        }

        try {
            // read bytes until EOF is encountered
            do {
                i = fin.read();
                if (i != -1)
                    System.out.print((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Error reading file!");
        } finally {

            try {
                fin.close();
            } catch (IOException exception) {
                System.out.println("Error closing file!");
            }
        }
    }
}

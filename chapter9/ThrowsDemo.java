package chapter9;

public class ThrowsDemo {
    // throws is in the function definition; it is what exceptions the method might throw
    // we didn't do this before because we don't need to for subclasses of Exception
    public static char prompt(String str) 
        throws java.io.IOException {
            System.out.print(str + ": ");
            return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            // since prompt() might throw an exception we need to wrap it in a try-catch loop
            ch = prompt("Enter a letter."); 
        } catch (java.io.IOException exc) {
            System.out.println("I/O Exception occurred.");
            ch = 'X';
        }

        System.out.println("You pressed: " + ch);
    }
}

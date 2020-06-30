package chapter3;

public class LowerToUpper {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        do {
            ch = (char) System.in.read();
            ch -= 32;
            System.out.println(ch);
        } while (ch != 'Q');
    }
}
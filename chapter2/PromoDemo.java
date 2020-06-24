package chapter2;

public class PromoDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // no cast required, already elevated to int (p. 61)

        b = 10;
        b = (byte) (b * b); // cast needed to assign int to byte since ^^ int

        System.out.println("i and b: " + i + " " + b);
    }
}
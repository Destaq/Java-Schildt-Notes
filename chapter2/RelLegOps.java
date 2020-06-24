package chapter2;

public class RelLegOps {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;

        j = 10;
        i = 11;
        if (i < j)
            System.out.println("i < j");
        if (i <= j)
            System.out.println("i <= j");
        if (i != j)
            System.out.println("i != j");
        if (i == j)
            System.out.println("NOPE");
        if (i >= j)
            System.out.println("NOPE");
        if (i > j)
            System.out.println("NOPE");

        b1 = true;
        b2 = false;

        if (b1&b2) System.out.println("NOPE");
        if (!(b1&b2)) System.out.println("NAND is True");
        if (b1 | b2) System.out.println("OR is True");
        if (b1 ^ b2) System.out.println("XOR is True");
    }
}
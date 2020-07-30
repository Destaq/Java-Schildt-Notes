package chapter5;

public class ShiftDemo {
    public static void main(String[] args) {
        /* Java has the power to shift bytes
        There are three such shift operators:
        << - Left Shift
        >> - Right Shift
        >>> - Unsigned Right Shift (used when shifting bit patterns that do not represeent integers)

        For all shifts, the bits shifted out are lost. You also need be careful
        when shifting byte and short values. That is because these values will
        first be promoted to an int and then shifted, so e.g. if you shift
        negative bytes or shifts then they will have their sign extended.

        So, if you do this with a zero-fill right shift (>>>) on a byte then
        you will find that there are 24 ones to be shifted before the byte itself
        begins to be shifted as well.

        Likewise, one thing to note is that all bitwise operators have a shorthand
        form that combines an assignment with the bitwise operation.

        Examples:
        - x ^= 127;
        - x &= 127;
        - x >>>= 1; // yes you read that right

        This program will visually demonstrate this.
        */
        int val = 1;
        for (int i = 0; i < 8; i++) {
            for (int t = 128; t > 0; t = t/2) {
                if ((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val = val << 1; // left shift
        }
        System.out.println();
        val = 128;
        for (int i = 0; i < 8; i++) {
            for (int t = 128; t > 0; t = t/2) {
                if ((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val = val >> 1; // right shift
        }

        /*
        The output follows what we would expect:

        0 0 0 0 0 0 0 1 
        0 0 0 0 0 0 1 0 
        0 0 0 0 0 1 0 0 
        0 0 0 0 1 0 0 0 
        0 0 0 1 0 0 0 0 
        0 0 1 0 0 0 0 0 
        0 1 0 0 0 0 0 0 
        1 0 0 0 0 0 0 0 

        1 0 0 0 0 0 0 0 
        0 1 0 0 0 0 0 0 
        0 0 1 0 0 0 0 0 
        0 0 0 1 0 0 0 0 
        0 0 0 0 1 0 0 0 
        0 0 0 0 0 1 0 0 
        0 0 0 0 0 0 1 0 
        0 0 0 0 0 0 0 1 
        */
    }
}
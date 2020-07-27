public class Bitwise {
    public static void main(String[] args) {
        /*
        Operators:
        & - AND
        | - OR
        ^ - XOR
        ~ - NOT

        They perform whatever it is they do, for example ~ true gives false
        */
        char ch;
        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.println(ch);

            // This statement turns off the 6th bit as it is 1 and 0
            ch = (char) ((int) ch & 65503); // ch is now uppercase
            System.out.println(ch + " ");
        }
    }
}
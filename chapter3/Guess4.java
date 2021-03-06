package chapter3;

public class Guess4 {
    public static void main(String[] args) throws java.io.IOException{
        char ch, ignore, answer = 'K';

        do {
            System.out.println("I am thinking of a number between A and Z");
            System.out.println("Can you guess it?");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("** Right **");
            else {
                System.out.print("... Sorry, you are ");
                if (ch < answer) System.out.println("too low.");
                else System.out.println("too high.");
            }
        } while (answer != ch);
    }
}
class SystemInExample {
    public static void main(String[] args) throws java.io.IOException { // handles input errors

        char ch;

        System.out.print("Press a key, followed by ENTER: ");

        ch = (char) System.in.read(); // get a char
        System.out.println("Your key is: " + ch);

    }
}

// note: if and else do not require the curly brackets
// we need to include breaks in switch statements because otherwise all other
// switches will also run

// N.B. you can also have empty cases (although doing so is pointless)
// nested switch statements are supported
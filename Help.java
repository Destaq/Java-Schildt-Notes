/*
Try This 3-1
Build a help system that displays the syntax for the Java control statements
*/

public class Help {
    public static void main(String[] args) throws java.io.IOException {
        System.out.print("Help on:\n1. if\n2. switch\nChoose one: ");
        char choice = (char) System.in.read();

        switch (choice) {
            case '1':
                System.out.println("The if:\n\nif (condition) statement;\nelse statement");
                break;
            case '2':
                System.out.println(
                        "The switch:\n\nswitch (expression) {\n\tcase constant:\n\t\tstatement sequence;\n\t\tbreak;\n\t// ...\n}");
                break;
            default:
                System.out.println("Case not found!");
        }
    }
}
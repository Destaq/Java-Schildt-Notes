package chapter5;

public class CommandLine {
    public static void main(String[] args) {
        System.out.println("There are " + args.length + " command-line arguments.");

        System.out.println("They are: ");

        for (int i = 0; i < args.length; i++) {
            System.out.println("arg[" + i + "]: " + args[i]);
        }
    }
}

// run with, for example, java CommandLine one two three and you get one two three printed out

/*
Another Short Lesson: Inferred Variable Types

Tired of writing int x = 1? Don't want to specify what kind of variable it is?

Well, then say hello to `var`, your new best friend. `var` can infer the type of the variable that you are trying to use!
This is used for long class types and for streamlining (e.g. better than FileInputStream file = ...)

Usage:
instead of -> double avg = 10.0;
do -> var avg = 10.0; // will be a double

It can be used with arrays and primitives, as well as user defined variable types!

Example:
class MyClass {
    private int i;
    int geti () { return i; }
    MyClass(int k) { i = k; }
    void seti(int k) { if (k >= 0) i = k; }
}

class VarDemo {
    public sdtatic void main(String[] args) {
        var mc = new MyClass(10); // notice the use of var!
    }
}

You also can't just do `var something;` because it can't infer the type. Obviously.

*/
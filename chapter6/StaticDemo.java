package chapter6;

class SDemo {
    int x; // normal instance variable
    static int y; // thre is one copy of y, it is global

    int sum() {
        return x * y;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        SDemo ob1 = new SDemo();
        SDemo ob2 = new SDemo();

        // each object has its own copy of the instance variable
        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Non-static variables are independent!\n" + ob1.x + " " + ob2.x);

        // static variables are shared
        System.out.println("The static variable is shared!");
        ob1.y = 92;
        System.out.println(ob1.sum() + " " + ob2.sum());

        /*
        Note: you cannot access non-static variables from within a static method.
         */
    }
}
package chapter6;

public class VarArgsDemo {
    // supports multiple types of args

    // NOTE: there can only ever be one vararg parameter
    static void vaTest(String msg, int ... v) {
        System.out.println(msg);
        System.out.println("Number of args " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // var args = variable number of args
        vaTest("One vararg: ", 1);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs.");
    }
}
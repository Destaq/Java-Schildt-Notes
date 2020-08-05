class OverloadTest {
    void ovlDemo() {
        System.out.println("No parameters");

    }

    // method overloading - can have same methods, as long as they have different parameters
    void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    // overload ovldemo for two integer parameters 
    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    // overload ovldemo for two double parameters
    double ovlDemo(double a, double b) {
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }
}

public class Overload {
    public static void main(String[] args) {
        OverloadTest ob = new OverloadTest();
        int resI;
        double resD;

        // call all version of ovlDemo()
        ob.ovlDemo();
        System.out.println();
        ob.ovlDemo(2);
        System.out.println();
        resI = ob.ovlDemo(4, 6);
        System.out.println("Result is: " + resI);
        resD = ob.ovlDemo(1.1, 2.6);
        System.out.println("Result is: " + resD);
    }
}
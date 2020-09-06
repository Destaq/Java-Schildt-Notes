package chapter8;

interface interfaceDemo {
    int getNext(); // return next number in series
    void reset();
    void setStart(int x); // set starting value
}

class ByTwos implements interfaceDemo {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }

    // must make implemented methods defined by interfaces public

    // it is also permissible and even common to implement further methods
    public void doNothing() {

    }
}

// any number of classes can implement an interface
class ByThrees implements interfaceDemo {
    public int getNext() {
        return 0;
    }
    public void reset() {

    }

    public void setStart(int x) {

    }
}

class InterfDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + ob.getNext());
        }

        // you can also access the methods from the interface
        interfaceDemo ob1;
        ob1 = ob; // this can store references to any object that implements its interface (in this case, interfaceDemo)

        System.out.println("With the interface, next value is " + ob1.getNext());
    }
}
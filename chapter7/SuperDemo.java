package chapter7;

// using super to overcome name hiding
class A {
    int i;
}

class B extends A {
    int i; // this i hides the i in A

    B(int a, int b) {
        super.i = a; // can access higher-level variables with super. syntax
        i = b;
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

class SuperDemo {
    public static void main(String[] args) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}
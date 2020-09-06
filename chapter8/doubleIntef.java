package chapter8;

interface A {
    void meth1();
    void meth2();
}

// B now includes meth1() and meth2(), but it adds meth3()
interface B extends A {
    void meth3();
}

// this class must implement all of A and B
class myClass implements B {
    public void meth1() {
        System.out.println("Implemented method 1.");
    }

    public void meth2() {
        System.out.println("Implements method 2.");
    }

    public void  meth3() {
        System.out.println("Implements method 3.");
    }
}
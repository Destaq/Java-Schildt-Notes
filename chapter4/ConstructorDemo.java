package chapter4;

class MyClass {
    int x;

    MyClass(int i) {
        x = i;
    } // this is the constructor

}

public class ConstructorDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10); // constructor is called when an object is created
        MyClass t2 = new MyClass(88); // better than minivan.mpg

        System.out.println(t1.x + " " + t2.x);
    }
}
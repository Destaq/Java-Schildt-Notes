package chapter7;

// we can use final to prevent a method from being overriden
class D {
    final void meth() {
        System.out.println("This is a final method!");
    }
}

class E extends D {
    // void meth() { // get error - you cannot override the final method from D...
    //     System.out.println("Your friendly neighborhood overriding!");
    // }
}

// you can also add the final keyword to classes, to prevent inheritance
final class F {
    // do something interesting...
}

// ILLEGAL!
// class G extends F {
    // something likewise interesting...
// }

// special note: final constants cannot be ever modified (like const in JS)
// it is common to use all-uppercase variable names for constants
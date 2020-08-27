package chapter7;

class A1 {
    A1() {
        System.out.println("Constructing A...");
    }
}
class B1 extends A1 {
    B1() {
        System.out.println("Constructing B...");
    }
}
class C1 extends B1 {
    C1() {
        System.out.println("Constructing C...");
    }
}

class OrderOfConstruction {
    public static void main(String[] args) {
        C1 c = new C1();
    }
}

// RESULT:
// Constructing A...
// Constructing B...
// Constructing C...

// Another note on constructing
/*
Triangle (Triangle ob) {
    super(ob);
    style = ob.style;
}
*/  
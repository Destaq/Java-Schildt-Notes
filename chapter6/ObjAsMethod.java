package chapter6;

class Block {
    // passing objects to methods
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a*b*c;
    }

    // return true if ob defines same block
    boolean sameBlock(Block ob) {
        if ((ob.a == a) & (ob.b == b) & (ob.c==c)) return true;
        else return false;
    }

    // return true if ob has the same volume
    boolean sameVolume(Block ob) {
        if (ob.volume == volume) return true;
        else return false;
    }
}

class ObjAsMethod {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 same dimensions as ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob1 same dimensions as ob3: " + ob1.sameBlock(ob3));
        System.out.println("ob1 same volume as ob3: " + ob1.sameVolume(ob3));
    }
}

/*
One thing to note about this however as how calling-by-value and calling-by-reference works.
Primitive types are passed by value; that is, their values are copied and even if something
modifies those values in the function nothing happens to the actual original variable.

However, this changes drastically with Objects, as these are passed through references.
This means that if they are modified in the function the original Object is modified as well.
*/
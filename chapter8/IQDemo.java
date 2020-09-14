package chapter8;

class FixedQueue implements ICharQ {
    private char q[]; // holds the queue
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println("Queue is full!");
            return;
        }

        q[putloc++] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println("Queue is empty!");
            return (char) 0;
        }

        return q[getloc++];
    }
}

class CircularQueue implements ICharQ {
    private char q[]; // holds the queue
    private int putloc, getloc;

    public CircularQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc + 1 == q.length | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println("Queue is full!");
            return;
        }

        q[putloc++] = ch;
        if (putloc == q.length) {
            putloc = 0; // loop back
        }
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println("Queue is empty!");
            return (char) 0;
        }

        char ch = q[getloc++];
        if (getloc == q.length) {
            getloc = 0;
        }
        return ch;
    }
}

class DynQueue implements ICharQ {
    private char q[]; // holds the queue
    private int putloc, getloc;

    public DynQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length) {
            char t[] = new char[q.length * 2];

            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }

            q = t;
        }

        q[putloc++] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println("Queue is empty!");
            return (char) 0;
        }

        return q[getloc++];
    }
}

// Demonstration
class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }

        System.out.print("Contents of fixed queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);

        }

        //... etc, you get the idea
    }
}
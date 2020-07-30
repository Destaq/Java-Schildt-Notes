package chapter5;

/*
Try This 5-2
A Queue class for characters.
*/
class Queue {
    char q[]; // this array holds the queue
    int putloc, getloc; // the put and get indices

    Queue(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
        }

    void put(char ch) {
        if (putloc==q.length) {
            System.out.println(" - Queue is full - ");
            return;
        }

        q[putloc++] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty - ");
            return (char) 0;
        }

        return q[getloc++];
    }
}

// Demonstrate the Queue class
public class QDemo {
    public static void main(String[] args) {
        Queue bigQueue = new Queue(100);
        Queue smallQueue = new Queue(4);

        char ch;
        int i;

        System.out.println("Using bigQueue to store the alphabet!");
        for (i = 0; i < 26; i++) {
            bigQueue.put((char) ('A' + i));
        }

        // retrieve and display elements from bigQueue
        System.out.println("Content: ");
        for (i = 0; i < 26; i++) {
            ch = bigQueue.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
        System.out.println();

        System.out.println("Using smallQueue to generate errors!");
        for (i = 0; i < 5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQueue.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        // more errors on smallQueue
        System.out.print("Contents of smallQueue: ");
        for (i = 0; i < 5; i++) {
            ch = smallQueue.get();

            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
    }
}
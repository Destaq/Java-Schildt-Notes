// Threads are threads of execution in a program that can run concurrently

class BetterFirstThread implements Runnable {
    Thread thrd;

    BetterFirstThread(String name) {
        thrd = new Thread(this, name);
    }

    // create and start thread
    public static BetterFirstThread createAndStart(String name) {
        BetterFirstThread myThrd = new BetterFirstThread(name);

        myThrd.thrd.start();
        return myThrd;
    }

    // entry point of thread
    public void run() {
        System.out.println(thrd.getName() + " starting...");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");

    }

}

// use isAlive().
class ThreadVariations {
    public static void main(String[] args) {
        System.out.println("Main thread starting...");

        // create and start a thread
        BetterFirstThread t1 = BetterFirstThread.createAndStart("Child #1");
        BetterFirstThread t2 = BetterFirstThread.createAndStart("Child #2");
        BetterFirstThread t3 = BetterFirstThread.createAndStart("Child #3");

        // join() syntax. join() waits until the thread finishes execution
        /*
        try {
            t1.thrd.join();
            System.out.println("Child #1 joined");
            t2.thrd.join();
            System.out.println("Child #2 joined");
            t3.thrd.join();
            System.out.println("Child #3 joined");
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ending.");
        */

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        } while (t1.thrd.isAlive() || t2.thrd.isAlive() || t3.thrd.isAlive()); // keep running until all child threads
                                                                               // terminate

        System.out.println("Main thread ending.");
    }
}

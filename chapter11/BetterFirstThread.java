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

class ThreadVariations {
    public static void main(String[] args) {
        System.out.println("Main thread starting...");

        // create and start a thread
        BetterFirstThread.createAndStart("Child #1");
        BetterFirstThread.createAndStart("Child #2");
        BetterFirstThread.createAndStart("Child #3");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}

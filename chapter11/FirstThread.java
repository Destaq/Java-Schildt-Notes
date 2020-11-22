// Threads are threads of execution in a program that can run concurrently

class FirstThread implements Runnable {
    String thrdName;

    FirstThread(String name) {
        thrdName = name;
    }

    // entry point of thread
    public void run() {
        System.out.println(thrdName + " starting...");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");

    }

}

class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting...");

        // construct a FirstThread object
        FirstThread ft = new FirstThread("Child #1");

        // create a thread from that object
        Thread newThread = new Thread(ft);

        // start execution of that thread
        newThread.start();

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

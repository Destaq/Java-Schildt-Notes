// Use wait() and notify() to create a ticking clock.

class TickTock {
    String state; // contains the state of the clock

    synchronized void tick(boolean running) {
        if (!running) { // stop the clock
            state = "ticked";
            notify(); // notify any waiting threads
            return;
        }

        System.out.print("Tick ");

        state = "ticked"; // set the current state to ticked

        notify(); // let tock() run -- tick() notifies tock()
        try {
            while (!state.equals("tocked")) {
                wait(); // wait for tock() to complete -- tick() waits for tock()
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { // stop the clock
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock");

        state = "tocked";

        notify();
        try {
            while (!state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

class MyThread3 implements Runnable {
    Thread thrd;
    TickTock ttOb;

    // construct a new thread.
    MyThread3(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    // a factory method that creates and starts a thread
    public static MyThread3 createAndStart(String name, TickTock tt) {
        MyThread3 myThrd = new MyThread3(name, tt);

        myThrd.thrd.start(); // start the thread
        return myThrd;
    }

    // entry point of thread.
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) {
                ttOb.tick(true);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException exc) {
                    System.out.println("Thread interrupted.");
                }
                ttOb.tick(false);
            }
        } else {
            for (int i = 0; i < 5; i++) {
                ttOb.tock(true);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException exc) {
                    System.out.println("Thread interrupted.");
                }
                ttOb.tock(false);
            }
        }
    }
}

class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread3 mt1 = MyThread3.createAndStart("Tick", tt);
        MyThread3 mt2 = MyThread3.createAndStart("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}

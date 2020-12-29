// Suspending, resuming, and stopping a thread

class MyThread4 implements Runnable {
    Thread thrd;
    boolean suspended;
    boolean stopped;

    MyThread4(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    // A factory method that creates and starts a thread
    public static MyThread4 createAndStart(String name) {
        MyThread4 myThrd = new MyThread4(name);

        myThrd.thrd.start(); // start the thread
        return myThrd;
    }

    // entry point of the thread
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                // Use synchronized block to check suspended and stopped
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped)
                        break;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " exiting.");
    }

    // stop the thread
    synchronized void mystop() {
        stopped = true;

        // the following ensures that a suspended thread can be stopped
        suspended = false;
        notify();
    }

    // suspend the thread
    synchronized void mysuspend() {
        suspended = true;
    }

    // resume the thread
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}

class Suspend {
    public static void main(String[] args) {
        MyThread4 mt1 = MyThread4.createAndStart("My Thread");

        try {
            Thread.sleep(1000); // let ob1 start executing

            mt1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Stopping thread.");
            mt1.mystop();

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // wait for thread to finish
        try {
            mt1.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}

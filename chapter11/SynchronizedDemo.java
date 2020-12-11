// use synchronize to control access

class SumArray {
    private int sum;

    // Because this method is synchronized, it can only be used by one thread at a time
    synchronized int sumArray(int nums[]) {
        sum = 0; // reset sum

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(10); // allow task-switch
            } catch (InterruptedException exception) {
                System.out.println("Thread interrupted.");
            }
        }

        return sum;
    }
}

class MyThread2 implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    // construct a new thread
    MyThread2(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
    }

    // a factory method that creates and starts a thread
    public static MyThread2 createAndStart(String name, int nums[]) {
        MyThread2 myThrd = new MyThread2(name, nums);

        myThrd.thrd.start();
        return myThrd;
    }

    // entry point of the thread
    public void run() {

        System.out.println(thrd.getName() + " starting.");

        answer = sa.sumArray(a);
        /* 
        If the method were not to be synchronized, you can do so yourself by
        wrapping it inside of a synchronized method.
        Demonstration:

        synchronized(sa) {
            answer = sa.sumArray(a);
        }
        */
        System.out.println("Sum for " + thrd.getName() + " is " + answer);
        System.out.println(thrd.getName() + " terminating.");
    }
}

class SynchronizedDemo {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread2 mt1 = MyThread2.createAndStart("Child #1", a);
        MyThread2 mt2 = MyThread2.createAndStart("Child #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exception) {
            System.out.println("Main thread interrupted.");
        }
    }
}

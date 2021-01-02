public class SelfTest {
    /*
    1. How does Java's multithreading capability enable you to write more efficient programs?
    A: Because programs do not use a single thread, therefore they do not have to wait for a command to execute before running other commands.

    2. Multithreading is supported by the *Thread* class and the *Runnable* interface.

    3. You may want to extend Thread rather than implementing Runnable because it allows for overriding of some methods.

    4. Show how to use join() to wait for a thread object called MyThrd to end.
    A: myThrd.join()

    5. myThrd.setPriority(Thread.NORM_PRIORITY + 3)

    6. Adding the `synchronized` keyword to a method allows us to control access to it. More specifically, it allows only
    one thread at a time to use the method for any given object of its class.

    7. The `wait` and `notify` methods are used to perform interthread communication.

    8. Task: change the TickTock method so that each tick + tock takes one second. DONE

    9. You can't use `suspend`, `resume`, and `stop` for new programs because Java dropped support for them as they can
    cause serious run-time problems.

    10. The name of the thread can be accessed using the `getName()` method.

    11. `isAlive` returns `true` if the thread is currently running and `false` if it has been terminated.

    12. Skipped ---
    */
}

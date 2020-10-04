package chapter9;

public class SelfTest {
    public static void main(String[] args) {
        // 1. at the top of the exception hierarchy we have Throwable
        // 2. `try` to do something and if there is an error, `catch` it
        // 3. this fragment does not have a `try` in it, only a `catch`
        // 4. If an exception is not caught, it will appear in the console and the program will fail to compile
        // 5. Catching A before B means that B will never be caught, as it is a subclass
        // 6. An inner catch **can** rethrow an exception to an outer catch
        // 7. The `finally` block runs after the `try` and `catch` blocks, regardless of whether or not there is an error
        // 8. Unchecked exceptions must be explicitly declared in a `throws` clause of a method. Only ignore RuntimeException and Error
        // 9. You can't throw an instance of a class X it does not extend Throwable
        // 10. Implemented in chapter 6...
        // 11. The two direct subclasses of Throwable are: Error and Exception
        // 12. The multi-catch features allow you to catch different types of errors the same way
        // 13. An exception can be thrown by the user with `throw`, the JVM, or caused by the program
        // 14. Your code should typically **not** catch exceptions of type `Error`
    }
}

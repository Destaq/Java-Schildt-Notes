package chapter9;

public class ThrowExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw...");
            throw new ArithmeticException();
        } catch (ArithmeticException exc) {
            System.out.println("Exception caught!");
        }

        System.out.println("After try-catch block.");
    }
}

// you can also throw multiple exceptions throghout multiple try-catch loops,
// they will simply propagate downwards
package chapter9;

/*
Try Catch Syntax

try {
    // block of code to monitor for errors
}
catch (ExcepType1 exOb) {
    // handler for ExcepType1
}
catch (ExcepType2 exOb) {
    // handler for ExcepType2
}
*/

class TryCatchDemo {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("Before exception is generated...");

            // generate an index-out-of-bounds exception

            nums[7] = 10;
            System.out.println("This won't be displayed...");
        } catch (ArrayIndexOutOfBoundsException exc) { // only catches the type of exception within
            // catch the exception
            System.out.println("Index out of bounds!");
        }

        // NOTE: you can also catch multiple exceptions
        // catch (ExceptionOne | ExceptionTwo e) {}
        // e.g. catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {}

        System.out.println("After catch has played out...");
    }
}

/*
 * Note: you can catch Exceptions based on classes, so you could catch any
 * exception with Throwable
 */
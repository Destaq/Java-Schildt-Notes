package chapter9;

class ExcTest {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("Before exception is generated...");

        // generate an index out-of-bounds exception
        nums[7] = 10;
        System.out.println("This won't be displayed.");
    }
}

public class ExceptionObj {
    public static void main(String[] args) {
        
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Standard message is: ");
            System.out.println(exc);
            System.out.println("\nStack trace: ");
            exc.printStackTrace();
        }

        System.out.println("After catch statement.");
    }
}

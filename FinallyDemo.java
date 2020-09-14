class useFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Receiving " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what; // generate a div-by-zero error
                    break;
                case 1:
                    nums[4] = 4; // generate array index error
                case 2:
                    return; // returns from try block
            }
        } catch (ArithmeticException exc) {
            System.out.println("Can't divide by zero!");
            return; // return from catch
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No matching elements found!");
        } finally {
            // this is executed on the way out of try/catch blocks. always
            System.out.println("Leaving try.");
        }
    }
}

public class FinallyDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            useFinally.genException(i);
            System.out.println();
        }
    }
}
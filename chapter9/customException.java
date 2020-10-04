package chapter9;

// create a custom exception
class NonIntResultException extends Exception {
    private static final long serialVersionUID = -3683811987707533430L;
    int d;
    int n;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Result of " + n + " / " + d + " is non-integer.";
    }
}

public class customException {
    public static void main(String[] args) {
        // numer contains some odd values
        int numer[] = { 4, 8, 15, 32, 64, 127, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++) {
            try {
                if (numer[i]%2 != 0) {
                    throw new NonIntResultException(numer[i], denom[i]);
                }

                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i]/denom[i]);
            } catch (ArithmeticException exc) {
                // catch the exception
                System.out.println("Can't divide by zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("No matching elements found!");
            } catch (NonIntResultException exc) {
                System.out.println(exc);
            }

            // NOTE: you can also catch multiple exceptions in the same loop with |
        }
    }
}
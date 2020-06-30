package chapter4;

class CheckNumber {
    // return true if x is even
    boolean isEven(int x) { // comma separated for multiple parameters
        if ((x%2) == 0) return true;
        else return false;
    }
}

public class Parameters {
    public static void main(String[] args) {
        CheckNumber e = new CheckNumber();

        System.out.println("10 is even: " + e.isEven(10));
        System.out.println("9 is even: " + e.isEven(9));
    }
}
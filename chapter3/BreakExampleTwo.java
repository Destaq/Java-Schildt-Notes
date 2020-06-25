package chapter3;

public class BreakExampleTwo {
    public static void main(String[] args) {
        done: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break done; // breaks OUT of done
                }
                System.out.println("After k loop");
            }
            System.out.println("After j loop");
        }
        System.out.println("After i loop");
    }
}

// note: you cannot break to any loop that is not defined in an enclosing block
// note: continue causes a loop to break early
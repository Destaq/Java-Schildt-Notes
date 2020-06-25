package chapter3;

// something akin to goto, breaks and goes to something else (break <label>)

public class BreakLabel {
    public static void main(String[] args) {
        // a labels is a java identifier followed by a colon
        int i;

        for (i = 1; i < 4; i++) {
            one: {
                two: {
                    three: {
                        System.out.println("\nis " + i);
                        if (i == 1)
                            break one; // break to a label
                        if (i == 2)
                            break two;
                        if (i == 3)
                            break three;

                        // this is never reached
                        System.out.println("Won't print!");
                    }
                    System.out.println("After block three!");
                }
                System.out.println("After block two!");
            }
            System.out.println("After block one!");
        }
        System.out.println("After for loop!");
    }
}
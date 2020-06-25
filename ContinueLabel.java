public class ContinueLabel {
    public static void main(String[] args) {
        outerloop: for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop pass: " + i + " -- Inner loop pass: ");
            for (int j = 0; j < 10; j++) {
                if (j == 5) continue outerloop; // continue outer loop
                System.out.print(j);
            }
        }
    }
}
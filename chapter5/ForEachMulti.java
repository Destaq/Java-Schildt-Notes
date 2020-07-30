package chapter5;

public class ForEachMulti {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        // give nums some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + j) * (j + 1);
            }
        }

        // use for-each loop to display and sum values
        for (int x[] : nums) { // x is declared as int, it is counting over each array
            // x is a reference to a one-dimensional array of integers, if it was a 2d array not made up of only arrays it'd break
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }

        System.out.println("Sumation is: " + sum);
    }
}
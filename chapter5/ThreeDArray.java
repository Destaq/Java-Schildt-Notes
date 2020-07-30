package chapter5;

public class ThreeDArray {
    public static void main(String[] args) {
        // create a regular one
        // int multi[][][] = new int[10][3][6];

        // initializing arrays from start
        int sqrs[][] = { { 1, 1 }, { 2, 4 }, { 3, 9 }, { 4, 16 } }; // a 4x2 array

        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(sqrs[i][j] + " ");
            }
            System.out.println();
        }
    }
}
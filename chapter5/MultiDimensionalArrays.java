package chapter5;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // int twod[][] = new int[10][20]; // ten by twenty array
        int t, i;
        int table[][] = new int[3][4];

        // assigning from left to right and top to bottom
        for (t=0; t < 3; ++t) {
            for (i=0; i<4; ++i) {
                table[t][i] = (t*4)+i+1;
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }

        // Irregular arrays
        int riders[][] = new int[7][]; // 7 days a week, unknown number of riders
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];

        int j, k;

        // fabricate some fake data
        for (j = 0; j<5; j++) {
            for (k = 0; k < 10; k++) {
                riders[j][k] = k + j + 10;
            }
        }
        for (j = 5; j < 7; j++) {
            for (k = 0; k<2; k++) {
                riders[j][k] = k + j + 10;
            }
        }

        System.out.println("Riders per trip during the week: ");
        for (j = 0; j<5; j++) {
            for (k = 0; k < 10; k++) {
                System.out.print(riders[j][k] + " ");
            }
            System.out.println();
        }

        for (j = 5; j<7; j++) {
            for (k = 0; k < 2; k++) {
                System.out.print(riders[j][k] + " ");
            }
            System.out.println();
        }
    }
}
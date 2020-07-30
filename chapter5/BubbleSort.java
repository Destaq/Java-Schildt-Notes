package chapter5;

/*
Try This 5-1
Demonstrate the Bubble Sort
*/
public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {-535, 6, 3525, 04,-56, -266, 2, 53, 1, 52, -2235, -3, 8};
        int a, b, t;

        // display original array
        System.out.print("Original array is: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        // The Bubble Sort
        for (a = 1; a < nums.length; a++) {
            for (b = 1; b < nums.length; b++) {
                if (nums[b-1] > nums[b]) {
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        System.out.print("Sorted list: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }
}
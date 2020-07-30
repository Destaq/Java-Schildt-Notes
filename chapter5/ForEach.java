package chapter5;

public class ForEach {
    public static void main(final String[] args) {
        // for (type itr-var: collection) statement-block

        // Traditional for loop
        final int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        var sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += nums[i];
        }
        System.out.println(sum);

        // The for-each loop
        for (int x: nums) sum += x; // for <type> <counter> <what it iterates over> <what happens>
        for (int x: nums) {
            sum += x; // alernative way of calling it
        }

        // note: iterations is read-only 
        for (int x: nums) {
            System.out.print(x + " ");
            x = x * 10; // no effect on nums
        }
        System.out.println(); // stays the same

        // sum only the first 5 elements
        for (int x: nums) {
            System.out.println("Value of x is: " + x);
            sum += x;
            if (x==5) break; // read only so even if x is modified, this is fine
        }
    } 
}
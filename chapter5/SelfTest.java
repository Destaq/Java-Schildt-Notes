package chapter5;

class SelfTest {
    public static void main(String[] args) {
        // 1. show two ways to declare a one-dimensional array of twelve doubles
        double joe[] = new double[12];
        double[] moe = new double[12];

        // 2. Show how to initialize a one-dimensional array of integers to the values 1 through 5
        int doe[] = { 1, 2, 3, 4, 5 };

        // 3. Write a program that uses an array to find  the average of ten double values.
        double test[] = { 1, 2, 3, 4, 5 , 6, 7, 8, 9, 10 };
        int sum = 0;

        for (int i = 0; i < test.length; i++) {
            sum += test[i];
        }

        System.out.println(sum/test.length);

        // 4. Change the sort in Try This 5-1 so that it sorts an array of strings
        String nums[] = { "and", "aaaa", "zzzz", "hello", "justno"};

        int a, b, size;
        String t;

        size = 5; // number of elements to sort

        for (a = 1; a < size; a++) {
            for (b = size-1; b >= a; b--) {
                if ((nums[b-1].compareTo(nums[b])) >= 0) {
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }

        /* 5. What is the difference between indexOf() and lastIndexOf()?
        Well, indexOf() finds the first instance of what is being looked for in the string
        while lastIndexOf() finds the last instance.
        */

        /* 6. since strings are objects, how do you call length() and charAt() methods on them?
        You just go <String object>.length() or .charAt()
        */

        // 7. Expand on the Encode class so that it takes an 8-character string as a key
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "oisdaber";

        int j = 0;
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j==8) j = 0;
        }
        
        System.out.println("\n\nEncoded message: " + encmsg);
        
        
        j = 0;
        for (int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }
        
        System.out.println("\nDecoded message: " + decmsg);

        // 8. Can the bitwise operators be applied to the double class? No.

        // 9. Rewrite some code in ternary
        int y;
        y = (j < 0) ? 10 : 20;

        // 10. & is logical as it checks if something is true

        // 11. It is an error to overrun an array, and to access a negative value.

        // 12. The unsigned right shift shifts everything to the right regardless of two's complement. >>>

        // 13. Rewriting MinMax
        /*
        for (int v : nums) {
            // run code
        }
        */

        // 14. Can the for loops that perform sorting the Bubble class be converted into foreach? No, because you are accessing the index

        // 15. Can a String control a switch statement? Yes

        // 16. var is reserved

        // 17. var done = false; is an example

        // 18. var can be the name of a variable but it cannot be of a class

        // 19. var[] avgTemps = new double[7]; is invalid because vars must have a value when intialized

        // 20. nope, var cannot be assigned to two things at once

        // 21. long mask = 1; // same as var mask = (long) 1; or var mask = 1L;

    }
}
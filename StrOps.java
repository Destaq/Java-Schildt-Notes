public class StrOps {
    public static void main(String[] args) {
        String s1 = "When it comes to Web Programming, Java is #1.";
        String s2 = new String(s1);
        String s3 = "Java strings are powerful";

        int result, ix;

        System.out.println("Length of s1: " + s1.length());

        // display s1, one character at a time
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i));
        }
        System.out.println();

        if (s1.equals(s2)) {
            System.out.println("s1 = s2");
        }

        if (s1.equals(s3)) {
            System.out.println("s1 = s3");
        }

        result = s1.compareTo(s3); // compares length, as a number difference no abs
        System.out.println(result);

        // find indexes
        ix = s2.indexOf("Java");
        System.out.println("Index of first occurence of Java: " + ix);
        // also support for lastIndexOf

        String strs[] = { "This", "is", "an", "array" };

        System.out.println("Original array: ");
        for (String s: strs) {
            System.out.print(s + " ");
        } 
        System.out.println();

        // change a string
        strs[1] = "was";
        strs[3] = "test, too (with grammatical errors)!";
        
        System.out.println("Modified array: ");
        for (String s: strs) {
            System.out.print(s + " ");
        } 
    }
}
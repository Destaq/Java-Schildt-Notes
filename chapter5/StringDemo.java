package chapter5;

public class StringDemo {
    public static void main(String[] args) {
        // strings are objects, they can be declared various ways
        String str1 = new String("Java strings are objects!");
        String str2 = "they are constructed various ways";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
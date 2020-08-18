package chapter6;

class StaticBlock {
    static double rootof2;
    static double rootof3;

    // this block is executed when the class is loaded
    static {
        System.out.println("Inside static block!");
        rootof2 = Math.sqrt(2.0);
        rootof3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }

}

class SDemo3 {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Inside Constructor!");

        System.out.println("Square root of two is " + StaticBlock.rootof2);
        System.out.println("Square root of two is " + StaticBlock.rootof3);
    }
}
package chapter8;

// interfaces can have variables
interface IConst {
    int MIN = 0; // industry standard is all caps
    int MAX = 10;
    String ERRORMSG = "Boundary Error";
}

class interfVar implements IConst {
    public static void main(final String[] args) {
        final int nums[] = new int[MAX];

        for (int i = MIN; i < 11; i++) {
            if (i >= MAX) System.out.println(ERRORMSG);
            else {
                nums[i] = i;
                System.out.print(nums[i] + " ");
            }
        }
    }
}
// arrays can only hold elements of the same size
class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10]; // base type, name, length

        // option 2:
        // int sample2[];
        // sample2 = new int[10];

        int i;

        for (i = 0; i < 10; i++) {
            sample[i] = i;
        }

        // specify at setuptime / later
        int sample2[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (i = 0; i < 10; i++) {
            System.out.println(sample2[i]);
        }
    }
}
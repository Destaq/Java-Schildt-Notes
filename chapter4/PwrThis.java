package chapter4;

class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        b = base; // same as b or this.b
        e = exp;

        /*
         * REASON TO USE THIS: Equals(int number) { this.number = number; // we can use
         * the <number> keyword twice }
         */

        val = 1;
        if (exp == 0)
            return;
        for (; exp > 0; exp--) {
            val = val * base;
        }
    }

    double get_pwr() {
        return val;
    }
}

public class PwrThis {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " raised to the " + x.e + " power is " + x.get_pwr());
        System.out.println(y.b + " raised to the " + y.e + " power is " + y.get_pwr());
        System.out.println(z.b + " raised to the " + z.e + " power is " + z.get_pwr());
    }
}
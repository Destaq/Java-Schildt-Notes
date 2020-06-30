package chapter4;

class MultiClass {
    int passengers;
    int fuelcap;
    int mpg;

    // Display the range
    int range() {
        // System.out.println("Range is " + fuelcap * mpg);
        return fuelcap * mpg;
    }

    double fuel_needed(int miles) {
        return (double) miles / mpg;
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        MultiClass minivan = new MultiClass();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        System.out.println("Minivan can carry " + minivan.passengers);
        int range = minivan.range();
        System.out.println("Range is " + range);
        // another option below
        System.out.println("Returned range is " + minivan.range());
        System.out.println("For a 150 mile trip, " + minivan.fuel_needed(150) + " gallons needed.");
    }
}
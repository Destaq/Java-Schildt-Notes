// it's possible for both superclasses and subclasses  to have their own constructors. 

// add a constructor to triangle (a demonstration)

class TwoDShape3 {
    private double width;
    private double height;

    void showDim() {
        System.out.println("Width and height are " + width + " " + height);
    }

    // how to solve this problem? Simple. Create accessor methods
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
}

class Triangle3 extends TwoDShape3 {
    private String style;

    // below is an example of a subclass constructor
    Triangle3(String s, double w, double h) {
        setWidth(w);
        setHeight(h);

        style = s;
    }

    // for the sake of conciseness we won't actually be initializing this triangle
    // but if we were too then it would look something like the below:
    // Triangle3 t1 = new Triangle("filled", 4.0, 8.0) -> works simply like this as the numbers are used in functions, not immediately assigned

    double area() {
        // return width * height / 2; // error - you cannot access a private member of a superclass
        // instead we can access them with the aptly named accessor classes
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Style is " + style);
    }
}
package chapter7;

// it's possible for both superclasses and subclasses  to have their own constructors. 
// let's take a look at what it looks like when this happens...

class TwoDShape4 {
    private double width;
    private double height;

    void showDim() {
        System.out.println("Width and height are " + width + " " + height);
    }

    // superclass constructor
    TwoDShape4(double w, double h) {
        width = w;
        height = h;
    }

    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
}

class Triangle4 extends TwoDShape4 {
    private String style;

    // below is an example of a subclass constructor, when their is a superclass
    
    Triangle4(String s, double w, double h) {
        super(w, h); // calls superclass constructor

        style = s;
    }
    // Triangle3 t1 = new Triangle("filled", 4.0, 8.0) -> called the same way as usual

    double area() {
        // return width * height / 2; // error - you cannot access a private member of a superclass
        // instead we can access them with the aptly named accessor classes
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Style is " + style);
    }
}
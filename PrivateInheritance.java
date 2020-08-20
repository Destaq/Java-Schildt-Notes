// if you inherit from a superclass, even though you are inheriting, you won't be able
// to access private variables

class TwoDShape2 {
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

// another subclass example
class Triangle2 extends TwoDShape2 {
    String style;

    double area() {
        // return width * height / 2; // error - you cannot access a private member of a superclass
        // instead we can access them with the aptly named accessor classes
        return getWidth() * getHeight();
    }

    void showStyle() {
        System.out.println("Style is " + style);
    }
}
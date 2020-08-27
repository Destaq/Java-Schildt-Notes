package chapter7;

abstract class TwoDShape9 {
    private double width;
    private double height;
    private String name;

    TwoDShape9() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape9(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape9(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape9(TwoDShape9 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() { return width; }
    double getHeight() { return height; }

    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    String getName() { return name; }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

    // now area() is abstract, it cannot be invoked from here
    abstract double area();

}

// Triangle subclass
class Triangle9 extends TwoDShape9 {
    private String style;

    Triangle9() {
        super();
        style = "none";
    }

    Triangle9(String s, double w, double h) {
        super(w, h, "triangle");

        style = s;
    }

    Triangle9(double x) {
        super(x, "triangle");
        style = "filled";
    }

    // and so on...

    // must implement area, as this is not an abstract class
    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is: " + style);
    }
}

// skipping rectangle constructor...

class AbstractDemo {
    public static void main(String[] args) {
        TwoDShape9 shapes[] = new TwoDShape9[2];

        shapes[0] = new Triangle9("outlined", 8.0, 9.0);
        shapes[1] = new Triangle9(7.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Object is " + shapes[i].getName());

            System.out.println("Area is " + shapes[i].area() + "\n");
        }
    }
}


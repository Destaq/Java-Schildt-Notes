package chapter7;

// demonstrating simple class hierarchy + inheritance
class TwoDShape {
    double width;
    double height;

    void showDim() {
        System.out.println("Width and height are " + width + " " + height);
    }
}

// subclass of TwoDShape for triangles
class Triangle extends TwoDShape {
    String style;

    double area() {
        // triangle can refer to members of TwoDShape as if they were part of Triangle
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

// quick example demonstrating multi-level inheritance
class ColorTriangle extends Triangle {
    private String color;

    // ColorTriangle(String c, String s, double w, double h) {
    //     super(s, w, h);
    //     color = c;
    // }

    // Note: super always refers to the closest superclass

    void showColor() {
        System.out.println(color);
    }


}

class Rectangle extends TwoDShape {
    boolean isSquare() {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }

    // subclass methods override superclass methods
    double area() {
        return width * height;
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "filled";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        // Note: TwoDShape can stand by itself as well; look below
        TwoDShape shape = new TwoDShape();

        shape.width = 10;
        shape.height = 20;

        shape.showDim();

        // rectangle example
        Rectangle r1 = new Rectangle();
        r1.height = 20;
        r1.width = 20;

        System.out.println("Rectangle area " + r1.area());
        System.out.println("Rectangle is a square " + r1.isSquare());
        
        // rectangle that is not a square example
        r1.width = 21;
        System.out.println("Rectangle is a square " + r1.isSquare());

    }
}
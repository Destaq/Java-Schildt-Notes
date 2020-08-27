package chapter7;

public class SelfTest {
    public static void main(String[] args) {

        // 1. does a superclass have access to members of a subclass, and vice versa?
        // my answer - no and yes

        // 2. create a subclass of TwoDShape called Circle, include an area method that
        // computes the area of the circle and a
        // constructor that uses super to initialize the TwoDShape portion
        // my answer - tested and completed successfully

        CircleLast c = new CircleLast(3);
        c.area();

        // 3. How do you prevent a subclass from having access to a member of a
        // superclass?
        // my answer - you use private

        // 4. Describe the purpose and the use of the two versions of super described in
        // this chapter
        // my answer - don't understand the question, but I guess that one is for
        // constructors and the other
        // for methods
        // textbook answer - one is for superclass constructors (with param lists), and
        // the other to access members (super.member)

        // 5. Given the following hierarchy... what is the order of execution?
        // my answer - it trickles down, starting from the highest superclass

        // 6. My answer - The fact that a superclass reference can refer to a subclass
        // object is important because it means we
        // have to define custom methods for the subclass if it wants to have its own
        // methods

        // 7. What is an abstract class?
        // my answer - an abstract class is a class that cannot be instantiated on its
        // own but instead serves as a framework
        // superclass for sucblasses to inherit from and define their own methods for
        // the abstract methods

        // 8. My answer - You can prevent a method and a class from being overriden by
        // calling final on it

        // 9. Explain how inheritance, method overriding, and abstract classes are used
        // to support polymorphism
        // my answer - they allow encapsulation, and inheritance is one of the pillars
        // of polymorphism. With method overriding
        // you can have the methods work on different objects
        // Textbook answer - They support polymorphism by enablnig you to create a
        // generalized class structure that can be implemented
        // by a variety of classes. This embodies the concept of 'one interface,
        // multiple methods'

        // 10. My answer - Object is a superclass of every other class

        // 11. A class that contains at least one abstract method, must, itself, be
        // declared abstract.
        // my answer - True

        // 12. My answer - you can create a named constant with the final keyword

        // 13. My answer - I guess that it will return the superclass A since that is
        // what is being specified as the return type

        // 14. My answer - B

        // Final Results:
        // 12.5/14 - 89% - good job
    }
}

class TwoDShapeLast {
    float width;

    TwoDShapeLast(float w) {
        width = w;
    }
}

class CircleLast extends TwoDShapeLast {
    CircleLast(float w) {
        super(w);
    }

    void area() {
        System.out.println(3.14159 * Math.pow(width, 2) + " = area in units of circle with width " + width + ".");
    }
}
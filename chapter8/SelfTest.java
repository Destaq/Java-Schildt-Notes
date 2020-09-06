package chapter8;

class SelfTest {
    public static void main(String[] args) {
        // 1. put ICharQ in a package called qpack; import and use classes
        // my anwer - simply add package qpack; to the top, move to a qpack folder, and
        // use the qpack preceder

        // 2. a namespace is a space where names are held, and it is important that Java
        // allows us to
        // partition this because otherwise we might have naming conflicts in larger
        // code

        // 3. typically, packages are stored in directories

        // 4. the protected access means that it can only be accessed by those within
        // the same package and subpackages; default can be accessed only in the main one

        // 5. one way a member of a package can be used in another package is by having
        // it be public and using it's modifier
        // another way could be to...

        // 6. One interface, multiple methods - demonstrated by the `interface` feature

        // 7. An interface can be implemented by an infinite number of interfaces, and
        // same for vice versa

        // 8. interfaces CAN be extended

        // 9.
        /*
         * public interface IVehicle { int mileage(); int fuelcap(); void show(); }
         */

        // 10. variables defined in an interface can be shared with other parts of the program

        // 11. a package is, in essence, a container for classes - True

        // 12. java X java.lang

        // 13. default

        // 14. Yes

        // 15. we can add a default/optional interface method

        // 16. ? X through its interface name with the dot operator

        // 17. Yes
    }
}
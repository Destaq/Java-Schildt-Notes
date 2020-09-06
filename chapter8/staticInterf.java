package chapter8;

public interface staticInterf {
    // this is a normal interface method declaration
    // it does not define a default implementation
    int getUserId();

    // default method, default implementation, optional
    default int getAdminID() {
        return 1;
    }

    // this is a static interface method
    static int getUniversalId() {
        System.out.println(essentiallyNothing());
        return 0;
    }
    // this method can be called directly with `int uID = staticInterf.getUniversalId();`

    private static String essentiallyNothing() {
        return "Nothing, just a demo";
    }
    // this can only be called within the interface as it is private
}

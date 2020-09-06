package chapter8;

public interface defaultInterf {
    // this is a normal inteface method declaration without a default implementation
    int getUserID();

    // this is the opposite, preceded by default modifier
    // this does not need to be implemented, since it already "functions"
    default int getAdminID() {
        return 1;
    }
}
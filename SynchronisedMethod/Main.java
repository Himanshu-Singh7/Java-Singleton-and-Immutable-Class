package SynchronisedMethod;

public class Main {
    public static void main(String[] args) {
        DBConnection instance = DBConnection.getInstance();
        System.out.println(instance);
    }
}

package LazyInitialisation;

public class Main {
    public static void main(String[] args) {
        DBconnection instance = DBconnection.getInstance();
        System.out.println(instance);
    }
}

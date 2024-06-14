package SynchronisedMethod;

public class DBConnection {
    private static  DBConnection connection;

    private DBConnection(){

    }
    synchronized public static DBConnection getInstance(){
        if (connection == null){

            connection = new DBConnection();
        }
        return connection;
    }
}

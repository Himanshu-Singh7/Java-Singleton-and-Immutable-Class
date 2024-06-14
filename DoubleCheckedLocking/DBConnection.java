package DoubleCheckedLocking;

public class DBConnection {
    private static volatile DBConnection connection;

    private DBConnection(){

    }
    public static DBConnection getInstance(){
        if(connection == null){
            synchronized (DBConnection.class){
                if(connection == null){
                    connection = new DBConnection();
                }
            }
        }
        return connection;
    }

}

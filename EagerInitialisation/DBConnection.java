package EagerInitialisation;

public class DBConnection {
    //private -->> this is access only this class
    //static -->> it is not belong for object , it is belonged for this class
    private  static  DBConnection connection = new DBConnection();

    // private constructor : Nobody is allowed to create new Object
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        return connection;
    }
}

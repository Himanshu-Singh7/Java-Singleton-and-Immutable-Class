package LazyInitialisation;

public class DBconnection {
    private static DBconnection dBconnection;

    private DBconnection(){

    }

    public  static  DBconnection getInstance(){
        if(dBconnection == null){
            dBconnection = new DBconnection();
        }
        return dBconnection;
    }
}

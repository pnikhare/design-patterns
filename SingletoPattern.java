
class Database {
    // Lazy Initialization method
    private static volatile Database conn = null;
    
    private Database(){}

    public static Database getConnection() {
        if (conn == null){
            synchronized(Database.class) {
                if (conn == null){
                    conn = new Database();
                    System.out.println("Creating new Db");
                }
            } 
        }         
            return conn;
    }

    public boolean isConnected(){
        if(conn != null) {
            System.out.println("It is Connected");
            return true;
        }
        return false;
        
    }
}

public class SingletoPattern {

    public static void main(String args[]) {

        Database connection = Database.getConnection();
        connection.isConnected();
        connection = Database.getConnection();
        connection.isConnected();   
    }

}
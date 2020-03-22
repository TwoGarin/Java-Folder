package tamsahallu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class DB_Utils {
    
    private static Connection theConnection=null;
    private static final String DATAFOLDER="data";
    private static final String DATAFILENAME="spices.accdb";
    private static final String CONNECTIONSTRING = "jdbc:ucanaccess://" + DATAFOLDER + "\\" + DATAFILENAME;
    private static final String DATABASEDRIVERCLASS="net.ucanaccess.jdbc.UcanaccessDriver";
    
    public static boolean isDatabaseDriversExist(){

      boolean exist=false;     
        try {
            Class.forName(DATABASEDRIVERCLASS);
            exist=true;
            System.out.println("ucanaccess drivers found ");
        } 
        catch(ClassNotFoundException e){
            System.out.println("ucanaccess drivers NOT found "+ e.getMessage());
        }
       return exist;   
    }
    
    public static Connection getConnection(){
        if (theConnection != null) return theConnection; 
        return getANewConnection();
    }

    private static Connection getANewConnection(){
        try{
            Class.forName(DATABASEDRIVERCLASS);
            theConnection = DriverManager.getConnection (CONNECTIONSTRING); 
        }
        catch (SQLException ex){
            System.out.println("SQL exception occured\n" + ex);
        } 
        catch (ClassNotFoundException ex){
            System.out.println("Class not found exception occured\n" + ex);
        }
        return theConnection;        
    }
}

package tamsahallu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Users_DATA_Handler {
    
    public User getValidUser(User pUser){
        DB_Utils.isDatabaseDriversExist();
        try {
            Connection con = DB_Utils.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery ("SELECT * FROM users WHERE username='" + pUser.getUserName()+ "' AND " + " pinnumber=" + pUser.getPinNumber() );      
            rs.next();
            pUser.setFirstName(rs.getString("firstname"));
            pUser.setLastName(rs.getString("lastname"));
            pUser.setPinNumber(Integer.parseInt(rs.getString("pinnumber")));
            pUser.setRole(rs.getString("role"));
        }
        catch(SQLException e){
            System.out.println("getValidUser : Error");
            System.out.println("SQL exception occured" + e);
        } 
        return pUser;
    }
   
    public boolean checkUserIsValid(User pUser){
        boolean userExistsInDatabase = false;
        try{
            Connection con=DB_Utils.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery ("SELECT * FROM users WHERE username='" + pUser.getUserName()+ "' AND " + " PinNumber=" + pUser.getPinNumber() );
            while (rs.next()){        
              userExistsInDatabase=true;
            }
        }
        catch(SQLException ex){
            System.out.println("checkUserIsValid : Error");
            System.out.println("SQL exception occured\n" + ex);
        }
        return (userExistsInDatabase);
    }
    
    public void updateUser(User pUser, User user){
        Connection con = DB_Utils.getConnection();
        PreparedStatement PS;
        String UpdateQuery = "";
        UpdateQuery = "UPDATE Users SET `FirstName`, `LastName`, `PinNumber`, `Role`, `UserName` WHERE `ID` = ?";
        try{
            PS = con.prepareStatement(UpdateQuery);
            PS.setString(1, user.getFirstName());
            PS.setString(2, user.getLastName());
            PS.setInt(3, user.getPinNumber());   
            PS.setString(4, user.getRole());
            PS.setString(5, user.getUserName());
            PS.setInt(6, user.getUserID());
            if (PS.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null, "User Updated"); 
            }else{
                JOptionPane.showMessageDialog(null, "Something went Wrong");
            }
        }
        catch (SQLException ex){
            System.out.println(ex);
        }
    }
    
    public void deleteUser(int pID){
        Connection con = DB_Utils.getConnection();
        PreparedStatement PS;
        try {
            String SQL =("DELETE FROM `Users` WHERE `ID`=?");
            PS = con.prepareStatement(SQL);
            PS.setInt(1, pID);
            if (PS.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null, "Contact Deleted"); 
            }
            else{
                JOptionPane.showMessageDialog(null, "Something went Wrong");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users_DATA_Handler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertUser(User pUser){
        try{
            Connection con=DB_Utils.getConnection();
            Statement stmt = con.createStatement();
            String mySql = "INSERT INTO Users";
            mySql = mySql +  ("(FirstName  , LastName , PinNumber , Role, UserName)");
            mySql = mySql +  ("VALUES (") ;
            mySql = mySql +  ("'" +    pUser.getFirstName()    + "',") ;
            mySql = mySql +  ("'" +    pUser.getLastName()   + "',") ;
            mySql = mySql +  ( ""  +   pUser.getPinNumber() + "," ) ;
            mySql = mySql +  ("'" +   pUser.getRole()   + "',") ;   
            mySql = mySql +  ("'" +  pUser.getUserName()   + "'") ;  
            mySql = mySql +  (")") ;     
            System.out.println(mySql);
            stmt.executeUpdate(mySql);
           }
        catch(SQLException ex){
            System.out.println("checkUserIsValid : Error");
            System.out.println("SQL exception occured\n" + ex);
        }
    }          
}    
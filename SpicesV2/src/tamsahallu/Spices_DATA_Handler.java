package tamsahallu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Spices_DATA_Handler {
    
    public void insertSpices(Spice Spice){
        try{
            Connection con=DB_Utils.getConnection();
            PreparedStatement PS;
            
            String SQL = ("INSERT INTO Spices (SpiceName, Description) VALUES (?, ?)");
            PS = con.prepareStatement(SQL);
            PS.setString(1, Spice.getSpiceName());
            PS.setString(2, Spice.getSpiceDecs());
            if (PS.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null, "New Spice Added"); 
            }
            else{
                JOptionPane.showMessageDialog(null, "Something went Wrong");
            }
        }
        catch(SQLException ex){
            System.out.println("checkUserIsValid : Error");
            System.out.println("SQL exception occured\n" + ex);
        }
    } 
    
    public void EditSpices(Spice spices){
        Connection con=DB_Utils.getConnection();
        PreparedStatement PS;
        String UpdateQuery = "";
        try{
            UpdateQuery = "UPDATE `Spices` SET `SpiceName` = ?, `Decsription` = ? WHERE `ID` = ?";
            PS = con.prepareStatement(UpdateQuery);
            PS.setString(1, spices.getSpiceName());
            PS.setString(2, spices.getSpiceDecs());
            PS.setInt(3, spices.getSpiceID());
            if (PS.executeUpdate() !=0){
                    JOptionPane.showMessageDialog(null, "Spice Data Updated"); 
                }
            else{
                JOptionPane.showMessageDialog(null, "Something went Wrong");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Spices_DATA_Handler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void DeleteSpice(int SID){
        try{
            Connection con=DB_Utils.getConnection();
            PreparedStatement PS;
            String SQL = ("DELETE FROM `Spices` WHERE `ID` =?");
            PS = con.prepareStatement(SQL);
            PS.setInt(1, SID);
            if (PS.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null, "Spice Deleted"); 
            }
            else{
                JOptionPane.showMessageDialog(null, "Something went Wrong");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Spices_DATA_Handler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Spice> spiceList(int UserID){
        ArrayList<Spice> sList = new ArrayList<>();
        Connection con=DB_Utils.getConnection();
        Statement ST;
        ResultSet RS;
        try{
            ST = con.createStatement();
            RS = ST.executeQuery("SELECT `ID`, `SpiceName`, `Description` FROM Spices WHERE UserID = "+UserID);
            Spice S;
            while(RS.next()){
                S = new Spice (RS.getInt("ID"),
                               RS.getString("SpiceName"),
                               RS.getString("Description"),
                               UserID);
                sList.add(S);
            }
        } catch (SQLException ex) {       
            Logger.getLogger(Spices_DATA_Handler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sList;
    }
}

package tamsahallu;

public class User {
    
    private int UserID;
    private String firstName;
    private String lastName;
    private int pinNumber;
    private String userName;
    private String role;
    
    public User(){}
    
    public User (int pUserID ,String pFirstName, String pLastName, String pUserName, int pPinNumber , String pRole){
        this.UserID = pUserID;
        this.pinNumber=pPinNumber;
        this.firstName=pFirstName; 
        this.lastName=pLastName;
        this.userName=pUserName;
        this.role=pRole;
    }

    public void setUserID(int pUID){
            this.UserID = pUID;
    }
    public void setRole(String pRole){
        if (!pRole.equals("")){
            this.role=pRole;
        }
    }     
    public void setPinNumber(int pPinNumber){
        if (pPinNumber > 999){
            this.pinNumber=pPinNumber;
        }
    }
    public void setFirstName(String pFirstName){
        if (!pFirstName.equals("")){
            this.firstName=pFirstName;
        }
    }
    public void setLastName(String pLastName){
        if (!pLastName.equals("")){
            this.lastName=pLastName;
        }
    }
    public void setUserName(String pUserName){
       if (!pUserName.equals("")){
           this.userName=pUserName;
       }
    }
    
    public int getUserID(){
        return this.UserID;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getUserName(){
        return this.userName;
    }
    public int getPinNumber(){
        return this.pinNumber;
    }
    public String getRole(){
         return this.role;
    }   
    
    @Override
    public String toString(){
        StringBuilder theStringVersionOfTheUser= new StringBuilder();
        theStringVersionOfTheUser.append(this.pinNumber).append(" , ");
        theStringVersionOfTheUser.append(this.firstName).append(" , ");
        theStringVersionOfTheUser.append(this.lastName).append(" , ");
        theStringVersionOfTheUser.append(this.role).append(" , ");
        theStringVersionOfTheUser.append(this.userName).append(" , ");
        return theStringVersionOfTheUser.toString();
    }
}

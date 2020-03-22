package tamsahallu;

public class Spice {
    private Integer SpiceID; 
    private String SpiceName;
    private String SpiceDecs;
    private int UserID;

    Spice(){}

    public Spice(Integer SpiceID, String SpiceName, String SpiceDecs, int UserID){
        this.SpiceID = SpiceID;
        this.SpiceName = SpiceName;
        this.SpiceDecs = SpiceDecs;
        this.UserID = UserID;
    }
    
/************************************************/
    public int getUserID() {
        return UserID;
    }
    public void setUserID(int UserID) {
        this.UserID = UserID;
    }
/************************************************/
    public int getSpiceID(){
        return SpiceID;
    }
    public void setSpiceID(int SID){
        this.SpiceID = SID;
    }
/************************************************/
    public String getSpiceName() {
        return SpiceName;
    }
    public void setSpiceName(String SpiceName) {
        this.SpiceName = SpiceName;
    }
/************************************************/
    public String getSpiceDecs() {
        return SpiceDecs;
    }
    public void setSpiceDecs(String SpiceDecs) {
        this.SpiceDecs = SpiceDecs;
    }
/************************************************/
    @Override
    public String toString(){
        StringBuilder theStringVersionOfTheSpices= new StringBuilder();
        theStringVersionOfTheSpices.append(this.SpiceName).append(" , ");
        theStringVersionOfTheSpices.append(this.SpiceDecs ).append(" , ");
        return theStringVersionOfTheSpices.toString();
    }
}

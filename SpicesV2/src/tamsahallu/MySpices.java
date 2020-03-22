package tamsahallu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MySpices extends javax.swing.JFrame {

    User theUser;

    public MySpices() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabMain = new javax.swing.JTabbedPane();
        pnlSpiceInformation = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaSpices = new javax.swing.JTextArea();
        comboSpiceName = new javax.swing.JComboBox<>();
        pnlInsertSpiceData = new javax.swing.JPanel();
        txtSpiceName = new javax.swing.JTextField();
        lblNameofSpice = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSpiceDescription = new javax.swing.JTextArea();
        pnlCreateUser = new javax.swing.JPanel();
        btnCreateUser = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JTextField();
        lblPinNumber = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSpiceDescription1 = new javax.swing.JTextArea();
        cboListOfAllUsernames = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtareaSpices.setColumns(20);
        txtareaSpices.setRows(5);
        jScrollPane1.setViewportView(txtareaSpices);

        javax.swing.GroupLayout pnlSpiceInformationLayout = new javax.swing.GroupLayout(pnlSpiceInformation);
        pnlSpiceInformation.setLayout(pnlSpiceInformationLayout);
        pnlSpiceInformationLayout.setHorizontalGroup(
            pnlSpiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSpiceInformationLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(pnlSpiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboSpiceName, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlSpiceInformationLayout.setVerticalGroup(
            pnlSpiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSpiceInformationLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(comboSpiceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        tabMain.addTab("Spice Information", pnlSpiceInformation);

        pnlInsertSpiceData.setForeground(new java.awt.Color(240, 240, 240));

        lblNameofSpice.setText("Name of spice");

        lblDescription.setText("Description");

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        txtSpiceDescription.setColumns(20);
        txtSpiceDescription.setRows(5);
        jScrollPane2.setViewportView(txtSpiceDescription);

        javax.swing.GroupLayout pnlInsertSpiceDataLayout = new javax.swing.GroupLayout(pnlInsertSpiceData);
        pnlInsertSpiceData.setLayout(pnlInsertSpiceDataLayout);
        pnlInsertSpiceDataLayout.setHorizontalGroup(
            pnlInsertSpiceDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertSpiceDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInsertSpiceDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInsertSpiceDataLayout.createSequentialGroup()
                        .addGroup(pnlInsertSpiceDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNameofSpice)
                            .addComponent(lblDescription))
                        .addGap(18, 18, 18)
                        .addGroup(pnlInsertSpiceDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSpiceName)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInsertSpiceDataLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInsert)))
                .addContainerGap())
        );
        pnlInsertSpiceDataLayout.setVerticalGroup(
            pnlInsertSpiceDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertSpiceDataLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlInsertSpiceDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNameofSpice)
                    .addComponent(txtSpiceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInsertSpiceDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnInsert)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        tabMain.addTab("Insert Spice Data", pnlInsertSpiceData);

        btnCreateUser.setText("Create a user");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        lblFirstName.setText("First Name");

        lblLastName.setText("Last name");

        lblUserName.setText("User Name");

        lblRole.setText("Role");

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Manager" }));

        lblPinNumber.setText("Pin Number");

        javax.swing.GroupLayout pnlCreateUserLayout = new javax.swing.GroupLayout(pnlCreateUser);
        pnlCreateUser.setLayout(pnlCreateUserLayout);
        pnlCreateUserLayout.setHorizontalGroup(
            pnlCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreateUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCreateUserLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCreateUser))
                    .addGroup(pnlCreateUserLayout.createSequentialGroup()
                        .addGroup(pnlCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreateUserLayout.createSequentialGroup()
                                .addGroup(pnlCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUserName)
                                    .addComponent(lblPinNumber))
                                .addGap(57, 57, 57))
                            .addGroup(pnlCreateUserLayout.createSequentialGroup()
                                .addGroup(pnlCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblRole))
                                .addGap(60, 60, 60)))
                        .addGroup(pnlCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName)
                            .addComponent(txtLastName)
                            .addComponent(txtUserName)
                            .addGroup(pnlCreateUserLayout.createSequentialGroup()
                                .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 123, Short.MAX_VALUE))
                            .addComponent(txtPassword))))
                .addGap(101, 101, 101))
        );
        pnlCreateUserLayout.setVerticalGroup(
            pnlCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreateUserLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPinNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRole))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnCreateUser)
                .addGap(51, 51, 51))
        );

        tabMain.addTab("Create User", pnlCreateUser);

        txtSpiceDescription1.setColumns(20);
        txtSpiceDescription1.setRows(5);
        jScrollPane3.setViewportView(txtSpiceDescription1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cboListOfAllUsernames, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(cboListOfAllUsernames, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        tabMain.addTab("Users Information", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMain)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMain))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed

        User myUser = new User();
        myUser.setFirstName(txtFirstName.getText());
        myUser.setLastName(txtLastName.getText());
        myUser.setUserName(txtUserName.getText());
        myUser.setPinNumber(Integer.parseInt(txtPassword.getText()));
        myUser.setRole((String)comboRole.getSelectedItem());  

        Users_DATA_Handler myUsersDataHandler = new Users_DATA_Handler();
        myUsersDataHandler.insertUser(myUser);
        JOptionPane.showMessageDialog(this, "The user has been inserted.");   
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        Spice mySpice = new Spice();
        mySpice.setSpiceName(txtSpiceName.getText());
        mySpice.setSpiceDecs(txtSpiceDescription.getText());
        Spices_DATA_Handler mySpicesDataHandler = new Spices_DATA_Handler();
        mySpicesDataHandler.insertSpices(mySpice);
        RefreshSpices();
        JOptionPane.showMessageDialog(this, "Spice has been inserted."); 
    }//GEN-LAST:event_btnInsertActionPerformed
      
    public void checkTheLogin(){
        JLabel label_login = new JLabel("Username:");
        JTextField login = new JTextField();
        JLabel label_password = new JLabel("Password:");
        JPasswordField password = new JPasswordField();
        Object[] login_GUI_Elelemnts = { label_login, login, label_password, password };

        int userInteraction = JOptionPane.showConfirmDialog(null, login_GUI_Elelemnts, "Login",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE);

        if (userInteraction == JOptionPane.OK_OPTION){
            String user=login.getText().trim();
            String pass=new String(password.getPassword());
            Boolean entryGranted = false ;
            theUser=new User();
            theUser.setPinNumber(Integer.parseInt(pass));
            theUser.setUserName(user);
            System.out.println("The users data is now: " + theUser.toString());
            Users_DATA_Handler myUsersHandler= new Users_DATA_Handler();

            if (myUsersHandler.checkUserIsValid(theUser)){
                theUser = myUsersHandler.getValidUser(theUser);
                System.out.println("The users data is now: " + theUser.toString());
            };
            if(theUser.getRole().toUpperCase().equals("USER")){
                  JOptionPane.showMessageDialog(this, "Logged in as user\nAdmin panel will be removed");
                  this.tabMain.remove(pnlInsertSpiceData);
                  this.tabMain.remove(pnlCreateUser);
                  entryGranted=true;
            }
            if (theUser.getRole().toUpperCase().equals("MANAGER")){
             JOptionPane.showMessageDialog(this, "Logged in as manager\nAccess granted to all areas");
             entryGranted=true;
            }
            if(!entryGranted){
               JOptionPane.showMessageDialog(this, "Entry denied");
               userInteraction = JOptionPane.CANCEL_OPTION;
            }   
        }
        else{
           userInteraction = JOptionPane.CANCEL_OPTION;
        }
        if ((userInteraction == JOptionPane.CANCEL_OPTION) || (userInteraction == JOptionPane.CLOSED_OPTION)){
            JOptionPane.showMessageDialog(this, "You have not supplied valid credentials\n the application will now terminate");
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       RefreshSpices();
       RefreshUsers();
       //checkTheLogin();
    }//GEN-LAST:event_formWindowOpened
    
    private void RefreshUsers(){
        try{
            User user = new User();
            Connection con = DB_Utils.getConnection();
            Statement stmt = con.createStatement();
            ResultSet RS = stmt.executeQuery("SELECT `UserName` FROM Users");
            while(RS.next()){
                cboListOfAllUsernames.addItem(RS.getString("UserName"));
                System.out.println("Username: " + RS.getString("UserName"));
            } 
        }
        catch(SQLException e){
            System.out.println("SQL exception occured" + e);
        }
    }
    
    private void RefreshSpices(){
        try{
            User user = new User();
            Connection con = DB_Utils.getConnection();
            Statement stmt = con.createStatement();
            ResultSet RS = stmt.executeQuery("SELECT `SpiceName` FROM Spices");
            while(RS.next()){
                comboSpiceName.addItem(RS.getString("SpiceName"));
                System.out.println("Spices: " + RS.getString("SpiceName"));
            } 
        }
        catch(SQLException e){
            System.out.println("SQL exception occured" + e);
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MySpices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MySpices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MySpices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MySpices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MySpices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnInsert;
    private javax.swing.JComboBox<String> cboListOfAllUsernames;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JComboBox<String> comboSpiceName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblNameofSpice;
    private javax.swing.JLabel lblPinNumber;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlCreateUser;
    private javax.swing.JPanel pnlInsertSpiceData;
    private javax.swing.JPanel pnlSpiceInformation;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextArea txtSpiceDescription;
    private javax.swing.JTextArea txtSpiceDescription1;
    private javax.swing.JTextField txtSpiceName;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextArea txtareaSpices;
    // End of variables declaration//GEN-END:variables
}

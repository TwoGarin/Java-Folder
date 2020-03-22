package tamsahallu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class QuotationsGUI extends javax.swing.JFrame {

    public QuotationsGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        tabQuotations = new javax.swing.JTabbedPane();
        pnlRead = new javax.swing.JPanel();
        cboQuotes = new javax.swing.JComboBox<>();
        lblQuotes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaQuotation = new javax.swing.JTextArea();
        lblQuotations = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        pnlAdd = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textareaAddQuotation = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtAddAuthor = new javax.swing.JTextField();
        lblAuthorAdd = new javax.swing.JLabel();
        btnAddQuote = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quotations");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(204, 0, 204));
        lblHeading.setText("Quotations");

        cboQuotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboQuotesActionPerformed(evt);
            }
        });

        lblQuotes.setText("Quotes");

        txtareaQuotation.setColumns(20);
        txtareaQuotation.setRows(5);
        jScrollPane1.setViewportView(txtareaQuotation);

        lblQuotations.setText("Quotation");

        lblAuthor.setText("Author");

        javax.swing.GroupLayout pnlReadLayout = new javax.swing.GroupLayout(pnlRead);
        pnlRead.setLayout(pnlReadLayout);
        pnlReadLayout.setHorizontalGroup(
            pnlReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReadLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuotes)
                    .addComponent(lblQuotations)
                    .addComponent(lblAuthor))
                .addGap(40, 40, 40)
                .addGroup(pnlReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(cboQuotes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAuthor))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        pnlReadLayout.setVerticalGroup(
            pnlReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReadLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboQuotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuotes))
                .addGroup(pnlReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReadLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlReadLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblQuotations)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(pnlReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuthor)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        tabQuotations.addTab("Read", pnlRead);

        textareaAddQuotation.setColumns(20);
        textareaAddQuotation.setRows(5);
        jScrollPane2.setViewportView(textareaAddQuotation);

        jLabel1.setText("Quotation");

        lblAuthorAdd.setText("Author");

        btnAddQuote.setText("Add Quote");
        btnAddQuote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddQuoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblAuthorAdd))
                .addGap(38, 38, 38)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddAuthor)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddQuote)
                .addGap(29, 29, 29))
        );
        pnlAddLayout.setVerticalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1)))
                .addGap(28, 28, 28)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAuthorAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddQuote)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        tabQuotations.addTab("Add Quote", pnlAdd);

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClose)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(203, 203, 203)
                            .addComponent(lblHeading))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tabQuotations, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addGap(18, 18, 18)
                .addComponent(tabQuotations, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        refreshCombo();
    }//GEN-LAST:event_formWindowOpened

    private void btnAddQuoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddQuoteActionPerformed
        try {
            Connection con = DriverManager.getConnection ("jdbc:ucanaccess://Data\\Quatations.accdb");
            Statement stmt = con.createStatement();
            if (textareaAddQuotation.getText().length()<=0){
                JOptionPane.showMessageDialog(this, "You must add a Quote");
                textareaAddQuotation.requestFocusInWindow();
            }
            else if (txtAddAuthor.getText().length()<=0){
                JOptionPane.showMessageDialog(this, "You must add an Author");
                txtAddAuthor.requestFocusInWindow();
            }
            else{
                String theSql= "INSERT INTO Quotations (Quatation, Author) VALUES('";
                theSql = theSql + textareaAddQuotation.getText() + "' , '";
                theSql = theSql + txtAddAuthor.getText() + "')";

                stmt.executeUpdate(theSql);
                JOptionPane.showMessageDialog(this, "Your quotation has been added");
                textareaAddQuotation.setText("");
                txtAddAuthor.setText("");
                refreshCombo();
            }
        }
        catch(SQLException e){
            System.out.println("SQL exception occured" + e);
        }
    }//GEN-LAST:event_btnAddQuoteActionPerformed

    private void cboQuotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboQuotesActionPerformed
        if ((cboQuotes.getItemCount())>0) {
            try{
                Connection con = DriverManager.getConnection ("jdbc:ucanaccess://Data\\Quatations.accdb");
                Statement stmt = con.createStatement();
                String theUsersQuote = (String)cboQuotes.getSelectedItem();
                String theID =theUsersQuote.substring(0,theUsersQuote.lastIndexOf(":"));
                String theSql= "SELECT * FROM Quotations WHERE ID=" + theID ;
                ResultSet rs = stmt.executeQuery (theSql);
                rs.next();
                txtareaQuotation.setText(rs.getString("Quatation"));
                txtAuthor.setText(rs.getString("Author"));
            }
            catch(SQLException e){
                System.out.println("SQL exception occured" + e);
            }
        }
    }//GEN-LAST:event_cboQuotesActionPerformed

    private void refreshCombo(){
        try{
            Connection con = DriverManager.getConnection ("jdbc:ucanaccess://Data\\Quatations.accdb"); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery ("SELECT * FROM Quotations");
            while (rs.next()){        
                    cboQuotes.addItem(rs.getString("ID") + ":" + rs.getString("Quatation").substring(0,10));
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
            java.util.logging.Logger.getLogger(QuotationsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuotationsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuotationsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuotationsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuotationsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddQuote;
    private javax.swing.JButton btnClose;
    private javax.swing.JComboBox<String> cboQuotes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblAuthorAdd;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblQuotations;
    private javax.swing.JLabel lblQuotes;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlRead;
    private javax.swing.JTabbedPane tabQuotations;
    private javax.swing.JTextArea textareaAddQuotation;
    private javax.swing.JTextField txtAddAuthor;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextArea txtareaQuotation;
    // End of variables declaration//GEN-END:variables
}

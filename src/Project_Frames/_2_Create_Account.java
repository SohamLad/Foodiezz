/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Frames;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class _2_Create_Account extends javax.swing.JFrame {

    /**
     * Creates new form Create
     */
    public _2_Create_Account() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        ConPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        ConRobo = new javax.swing.JCheckBox();
        Skip = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create Account");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("User Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Email ID :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Password :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Confirm Password :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        User.setToolTipText("Enter Username");
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 330, 30));

        Email.setToolTipText("Enter Email ID");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 330, 30));

        Pass.setEchoChar('\u2022');
        getContentPane().add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 330, 30));

        ConPass.setEchoChar('\u2022');
        getContentPane().add(ConPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 330, 30));

        jButton1.setBackground(new java.awt.Color(17, 108, 0));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 27)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 130, 40));

        ConRobo.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        ConRobo.setForeground(new java.awt.Color(0, 153, 153));
        ConRobo.setText("Confirmation of Robot");
        ConRobo.setBorder(null);
        ConRobo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConRoboMouseClicked(evt);
            }
        });
        ConRobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConRoboActionPerformed(evt);
            }
        });
        ConRobo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ConRoboKeyPressed(evt);
            }
        });
        getContentPane().add(ConRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 330, 30));

        Skip.setFont(new java.awt.Font("Sylfaen", 2, 18)); // NOI18N
        Skip.setForeground(new java.awt.Color(204, 204, 204));
        Skip.setText("<< Go back to Sign in");
        Skip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Skip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SkipMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SkipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SkipMouseExited(evt);
            }
        });
        getContentPane().add(Skip, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 190, 30));

        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create Account", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 36), new java.awt.Color(204, 98, 0))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 360, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background/Create Account.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String Un = User.getText(), Emailid = Email.getText(), Pwd = new String(Pass.getPassword()), CPwd = new String(ConPass.getPassword());

if(Un.isEmpty() || Emailid.isEmpty() || Pwd.isEmpty() || CPwd.isEmpty())
   JOptionPane.showMessageDialog(this, "<html><font face = rockwell color = green size = 15>Fill All The Fields",null,-1);
else{
    if(ConRobo.isSelected()){
        try{
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/vatsalproject", "root", "mysql");
            Statement stat = c.createStatement();
            String query1 = "Select * from login; ";    
            ResultSet rs = stat.executeQuery(query1);
            while (rs.next()){
                String ei = rs.getString("Email_ID");
                String un = rs.getString("Username");

                if(Emailid.equals(ei))
                    JOptionPane.showConfirmDialog(this, "<html><font face = rockwell size = 15>Email ID has been used", null, -1, 0);
           
                if(!Emailid.equals(ei) && Pwd.equals(CPwd)){
                    String query = "Insert into login values('" + Un + "','" + Emailid + "','" + Pwd + "');";
                    stat.executeUpdate(query);
                    _2_Login.main(null);
                    this.dispose();
                    break;
                }
                else{
                    if(!Pwd.equals(CPwd))
                        JOptionPane.showMessageDialog(this, "<html><font face = rockwell color = blue size = 15>Password doesn not match to Confirm Password",null,1);
                    break;
                }
                                  
            }
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(this, "<html><font face = rockwell size = 15>This Username already exists<br>      OR      <br>System Error ", null, -1, 0);
        }
    }
    else
        JOptionPane.showMessageDialog(this, "Confirm that you are not a Robot");
} 
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ConRoboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConRoboMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ConRoboMouseClicked

    private void ConRoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConRoboActionPerformed
Recaptcha.main(null);
ConRobo.setSelected(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_ConRoboActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
setLocationRelativeTo(null);       // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void ConRoboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConRoboKeyPressed
    // TODO add your handling code here:
    }//GEN-LAST:event_ConRoboKeyPressed

    private void SkipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SkipMouseClicked
this.dispose();
_2_Login.main(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_SkipMouseClicked

    private void SkipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SkipMouseEntered
        Skip.setForeground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_SkipMouseEntered

    private void SkipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SkipMouseExited
        Skip.setForeground(Color.LIGHT_GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_SkipMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(_2_Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_2_Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_2_Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_2_Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _2_Create_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConPass;
    public static javax.swing.JCheckBox ConRobo;
    private javax.swing.JTextField Email;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JLabel Skip;
    private javax.swing.JTextField User;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

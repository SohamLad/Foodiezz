/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Frames;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.ImageIcon;


/**
 *
 * @author admin
 */
public class _3_Location extends javax.swing.JFrame {
Connection con;
Statement stat;
ResultSet rs;


    /**
     * Creates new form ax
     */
    public _3_Location() {


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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        SigninLabel = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Pincode = new javax.swing.JTextField();
        Plotno = new javax.swing.JTextField();
        Residence = new javax.swing.JTextField();
        Landmark = new javax.swing.JTextField();
        Area = new javax.swing.JTextField();
        City = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Location");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1370, 940));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Gujarat");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 80, -1));

        SigninLabel.setFont(new java.awt.Font("BankGothic Lt BT", 0, 24)); // NOI18N
        SigninLabel.setForeground(new java.awt.Color(142, 142, 142));
        SigninLabel.setText("Sign in /");
        SigninLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SigninLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SigninLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SigninLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SigninLabelMouseExited(evt);
            }
        });
        jPanel1.add(SigninLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        LocationLabel.setFont(new java.awt.Font("BankGothic Lt BT", 0, 24)); // NOI18N
        LocationLabel.setForeground(new java.awt.Color(51, 51, 51));
        LocationLabel.setText("Location");
        LocationLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(LocationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logos/Foodiezz.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 40, 190, 70));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Cooking gone wrong?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Order food from your favourite restaurant near you");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 470, -1));

        jLabel2.setFont(new java.awt.Font("Poor Richard", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Plot NO. :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, 40));

        jLabel3.setFont(new java.awt.Font("Poor Richard", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Landmark :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 40));

        jLabel4.setFont(new java.awt.Font("Poor Richard", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Residence :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 40));

        jLabel5.setFont(new java.awt.Font("Poor Richard", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Area :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, 40));

        jLabel7.setFont(new java.awt.Font("Poor Richard", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("City :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 70, -1));

        jLabel8.setFont(new java.awt.Font("Poor Richard", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Pincode :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, 40));

        Pincode.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        Pincode.setForeground(new java.awt.Color(102, 102, 102));
        Pincode.setToolTipText("Enter Pincode");
        jPanel1.add(Pincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 540, 40));

        Plotno.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        Plotno.setForeground(new java.awt.Color(102, 102, 102));
        Plotno.setToolTipText("Enter Plot No.");
        jPanel1.add(Plotno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 540, 40));

        Residence.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        Residence.setForeground(new java.awt.Color(102, 102, 102));
        Residence.setToolTipText("Enter Residence");
        jPanel1.add(Residence, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 540, 40));

        Landmark.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        Landmark.setForeground(new java.awt.Color(102, 102, 102));
        Landmark.setToolTipText("Enter Landmark ");
        jPanel1.add(Landmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 540, 40));

        Area.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        Area.setForeground(new java.awt.Color(102, 102, 102));
        Area.setToolTipText("Enter Pincode");
        jPanel1.add(Area, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 540, 40));

        City.setFont(new java.awt.Font("Poor Richard", 0, 30)); // NOI18N
        City.setForeground(new java.awt.Color(51, 51, 51));
        City.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--------------", "Ahemdabad", "Surat" }));
        City.setToolTipText("Select City");
        City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityActionPerformed(evt);
            }
        });
        jPanel1.add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 240, -1));

        jButton1.setBackground(new java.awt.Color(51, 123, 255));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 26)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Proceed");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 160, 40));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background/Location.png"))); // NOI18N
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 940));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Pl = Plotno.getText(), Rsd = Residence.getText(), Ld = Landmark.getText(), Pn = Pincode.getText(), Ar = Area.getText();

        if(Pl.isEmpty() || Rsd.isEmpty() || Ld.isEmpty() || Pn.isEmpty() || City.getSelectedItem() == null || City.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this, "<html><font size = 15 color = orange face = rockwell>Fill All Fields",null,2);
        }

        else
        {
            try{
                Class.forName("java.sql.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/vatsalproject", "root", "mysql");
                stat = con.createStatement();
                String query1 = "Delete from Location;";
                String query = "Insert into location values ('" + Pl + "','" + Ld + "','" + Rsd + "','" + Ar + "'," + Pn + ",'" + City.getSelectedItem() + "');";
                stat.executeUpdate(query1);
                stat.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "<html><font size = 15 face = Rockwell color = Red>Loca</font><<font size = 15 face = Rockwell color = Orange>tion A</font><font size = 15 face = Rockwell color = Green>dded", null, -1);

                if(City.getSelectedIndex() == 1){
                    _4_Main_Order_Gujarat_Ahemdabad.main(null);
                    this.dispose();}
                if(City.getSelectedIndex() == 2){
                     _4_Main_Order_Gujarat_Surat.main(null);
                    this.dispose();}
                    }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "<html><font color = red face = rockwell size = 15>Error in Proceeding <br> or <br> Pincode not valid", null, 2);
            }
        }
     // TOO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SigninLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SigninLabelMouseClicked
        int Ans = JOptionPane.showConfirmDialog(this, "<html><font size = 15 face = rockwell color = blue>Go back to Sign in Page ?", null, 1,-1);
        if(Ans == JOptionPane.YES_OPTION){
            _2_Login.main(null);
            this.dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_SigninLabelMouseClicked

    private void SigninLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SigninLabelMouseEntered
        SigninLabel.setText("<html><u>Sign in</u> /</html>");
        // TODO add your handling code here:
    }//GEN-LAST:event_SigninLabelMouseEntered

    private void SigninLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SigninLabelMouseExited
        SigninLabel.setText("Sign in /");
        // TODO add your handling code here:
    }//GEN-LAST:event_SigninLabelMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
setLocationRelativeTo(null);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(_3_Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_3_Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_3_Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_3_Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new _3_Location().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Area;
    private javax.swing.JLabel Back;
    public static javax.swing.JComboBox City;
    public static javax.swing.JTextField Landmark;
    private javax.swing.JLabel LocationLabel;
    public static javax.swing.JTextField Pincode;
    public static javax.swing.JTextField Plotno;
    public static javax.swing.JTextField Residence;
    private javax.swing.JLabel SigninLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

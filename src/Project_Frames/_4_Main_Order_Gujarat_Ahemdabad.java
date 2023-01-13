/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Frames;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
/**
 *
 * @author admin
 */
public class _4_Main_Order_Gujarat_Ahemdabad extends javax.swing.JFrame {
Connection con;
ResultSet rs;
    /**
     * Creates new form Main
     */
    public _4_Main_Order_Gujarat_Ahemdabad() {
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

        jPanel1 = new javax.swing.JPanel();
        RestPanel = new javax.swing.JPanel();
        RestScroll = new javax.swing.JScrollPane();
        RestP = new javax.swing.JPanel();
        MakhanBhog_Btn = new javax.swing.JButton();
        Vimal_Btn = new javax.swing.JButton();
        Bread_Btn = new javax.swing.JButton();
        Dhosa_Btn = new javax.swing.JButton();
        Shanchi_Btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SigninLabel = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        RestaurantLabel = new javax.swing.JLabel();
        LabelBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RestPanel.setBackground(new java.awt.Color(255, 255, 255));
        RestPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "   Restaurants", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Light", 0, 24))); // NOI18N

        RestScroll.setBorder(null);
        RestScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        RestScroll.setPreferredSize(new java.awt.Dimension(750, 570));

        RestP.setBackground(new java.awt.Color(255, 255, 255));
        RestP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MakhanBhog_Btn.setBackground(new java.awt.Color(198, 198, 198));
        MakhanBhog_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Restaurants/Ahemdabad/Makhan Bhog.jpg"))); // NOI18N
        MakhanBhog_Btn.setText("<html><font size = '15' face = 'Corbel' color = 'black'>Makhan Bhog</font><br><font size = '5' face = 'Corbel' color = 'gray'><b>Sweets</b></font><br> <br> <br> <br> <br><font size = '6' color = 'green' face = 'Calibri'> &#9733 &#9733 &#9733 &#9733 &#9734  Ratings<br><font size = '5' face = 'Calibri' color = 'gray'><b> 550+ Reviews</b></font>");
        MakhanBhog_Btn.setBorderPainted(false);
        MakhanBhog_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MakhanBhog_Btn.setFocusPainted(false);
        MakhanBhog_Btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MakhanBhog_Btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MakhanBhog_Btn.setIconTextGap(20);
        MakhanBhog_Btn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        MakhanBhog_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakhanBhog_BtnActionPerformed(evt);
            }
        });
        RestP.add(MakhanBhog_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 1240, 220));

        Vimal_Btn.setBackground(new java.awt.Color(198, 198, 198));
        Vimal_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Restaurants/Ahemdabad/Vimal Ice Creams.png"))); // NOI18N
        Vimal_Btn.setText("<html><font size = '15' face = 'Corbel' color = 'black'>Vimal Ice Creams</font><br><font size = '5' face = 'Corbel' color = 'gray'><b>Ice Creams and Cakes</b></font><br> <br> <br> <br> <br><font size = '6' color = 'green' face = 'Calibri'> &#9733 &#9733 &#9733 &#9733 &#9734  Ratings<br><font size = '5' face = 'Calibri' color = 'gray'><b> 620+ Reviews</font>");
        Vimal_Btn.setBorderPainted(false);
        Vimal_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Vimal_Btn.setFocusPainted(false);
        Vimal_Btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Vimal_Btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Vimal_Btn.setIconTextGap(100);
        Vimal_Btn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Vimal_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vimal_BtnActionPerformed(evt);
            }
        });
        RestP.add(Vimal_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 1240, 220));

        Bread_Btn.setBackground(new java.awt.Color(198, 198, 198));
        Bread_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Restaurants/Ahemdabad/Breadliner.jpeg"))); // NOI18N
        Bread_Btn.setText("<html><font size = '15' face = 'Corbel' color = 'black'>Breadliner</font><br><font size = '5' face = 'Corbel' color = 'gray'><b>Bakery</b></font><br> <br> <br> <br> <br><font size = '6' color = 'green' face = 'Calibri'> &#9733 &#9733 &#9733 &#9733 &#9734  Ratings<br><font size = '5' face = 'Calibri' color = 'gray'><b> 820+ Reviews</font>");
        Bread_Btn.setBorderPainted(false);
        Bread_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bread_Btn.setFocusPainted(false);
        Bread_Btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bread_Btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Bread_Btn.setIconTextGap(20);
        Bread_Btn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Bread_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bread_BtnActionPerformed(evt);
            }
        });
        RestP.add(Bread_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 1240, 220));

        Dhosa_Btn.setBackground(new java.awt.Color(198, 198, 198));
        Dhosa_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Restaurants/Ahemdabad/Dhosa Platform.jpg"))); // NOI18N
        Dhosa_Btn.setText("<html><font size = '15' face = 'Corbel' color = 'black'>Dhosa Platform</font><br><font size = '5' face = 'Corbel' color = 'gray'><b>Dhosa</b></font><br> <br> <br> <br> <br><font size = '6' color = 'green' face = 'Calibri'> &#9733 &#9733 &#9733 &#9734 &#9734  Ratings<br><font size = '5' face = 'Calibri' color = 'gray'><b> 470+ Reviews</font>");
        Dhosa_Btn.setBorderPainted(false);
        Dhosa_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dhosa_Btn.setFocusPainted(false);
        Dhosa_Btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Dhosa_Btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Dhosa_Btn.setIconTextGap(25);
        Dhosa_Btn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Dhosa_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dhosa_BtnActionPerformed(evt);
            }
        });
        RestP.add(Dhosa_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 800, 1240, 220));

        Shanchi_Btn.setBackground(new java.awt.Color(198, 198, 198));
        Shanchi_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Restaurants/Ahemdabad/Shan Chi.jpg"))); // NOI18N
        Shanchi_Btn.setText("<html><font size = '15' face = 'Corbel' color = 'black'>Shan Chi</font><br><font size = '5' face = 'Corbel' color = 'gray'><b>Chinese Fast Food</b></font><br> <br> <br> <br> <br><font size = '6' color = 'green' face = 'Calibri'> &#9733 &#9733 &#9733 &#9734 &#9734  Ratings<br><font size = '5' face = 'Calibri' color = 'gray'><b> 520+ Reviews</font>");
        Shanchi_Btn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Shanchi_Btn.setBorderPainted(false);
        Shanchi_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Shanchi_Btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Shanchi_Btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Shanchi_Btn.setIconTextGap(25);
        Shanchi_Btn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Shanchi_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Shanchi_BtnActionPerformed(evt);
            }
        });
        RestP.add(Shanchi_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1060, 1240, 220));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("More Restaurants Coming Soon ......");
        RestP.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 1290, 600, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background/newlist.png"))); // NOI18N
        RestP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 1360));

        RestScroll.setViewportView(RestP);

        javax.swing.GroupLayout RestPanelLayout = new javax.swing.GroupLayout(RestPanel);
        RestPanel.setLayout(RestPanelLayout);
        RestPanelLayout.setHorizontalGroup(
            RestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1328, Short.MAX_VALUE)
            .addGroup(RestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RestPanelLayout.createSequentialGroup()
                    .addComponent(RestScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );
        RestPanelLayout.setVerticalGroup(
            RestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
            .addGroup(RestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(RestScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
        );

        jPanel1.add(RestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 142, 1340, 540));

        Address.setFont(new java.awt.Font("Narkisim", 0, 24)); // NOI18N
        Address.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Papyrus", 0, 24))); // NOI18N
        jPanel1.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 460, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logos/Foodiezz.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

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
        jPanel1.add(SigninLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 100, -1, 40));

        LocationLabel.setFont(new java.awt.Font("BankGothic Lt BT", 0, 24)); // NOI18N
        LocationLabel.setForeground(new java.awt.Color(142, 142, 142));
        LocationLabel.setText("Location /");
        LocationLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LocationLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LocationLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LocationLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LocationLabelMouseExited(evt);
            }
        });
        jPanel1.add(LocationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, 40));

        RestaurantLabel.setFont(new java.awt.Font("BankGothic Lt BT", 0, 24)); // NOI18N
        RestaurantLabel.setForeground(new java.awt.Color(51, 51, 51));
        RestaurantLabel.setText("Restaurant(Ahemdabad) ");
        RestaurantLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(RestaurantLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, 40));

        LabelBack.setOpaque(true);
        jPanel1.add(LabelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1350, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
setLocationRelativeTo(null);
        try{
    Class.forName("java.sql.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost/vatsalproject", "root", "mysql");
    Statement stat = con.createStatement();
    String query = "Select * from Location;";
    rs = stat.executeQuery(query);
    while(rs.next()){
        String pn = rs.getString("Plot_no");
        String ar = rs.getString("Area");
        String land = rs.getString("Landmark");
        String pin = rs.getString("Pincode");
        String ct = rs.getString("City");
        String resi = rs.getString("Residence");
        Address.setText(pn + ", " + land + ", " + resi + ", " + ar + ", " + ct + ", Gujarat" + " - " + pin);
        Address.setToolTipText(pn + ", " + land + ", " + resi + ", " + ar + ", " + ct + ", Gujarat"+ " - " + pin);
                
    }
}
catch(Exception e){
    JOptionPane.showMessageDialog(this, "Error in Address", null, 2);
}  
    // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void MakhanBhog_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakhanBhog_BtnActionPerformed
Restaurants.Ahemdabad_Makhan_Bhog.main(null);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_MakhanBhog_BtnActionPerformed

    private void Vimal_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vimal_BtnActionPerformed
Restaurants.Ahemdabad_Vimal_Ice_Creams.main(null);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Vimal_BtnActionPerformed

    private void Bread_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bread_BtnActionPerformed
Restaurants.Ahemdabad_Breadliner.main(null);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Bread_BtnActionPerformed

    private void Dhosa_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dhosa_BtnActionPerformed
Restaurants.Ahemdabad_Dhosa_Platform.main(null);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Dhosa_BtnActionPerformed

    private void Shanchi_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Shanchi_BtnActionPerformed
Restaurants.Ahemdabad_Shan_Chi.main(null);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Shanchi_BtnActionPerformed

    private void SigninLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SigninLabelMouseClicked
int Ans = JOptionPane.showConfirmDialog(this, "<html><font size = 15 face = rockwell color = orange>Go back to Sign in Page ?", null, 1, -1);
if (Ans == JOptionPane.YES_OPTION) {
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

    private void LocationLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LocationLabelMouseClicked
int Ans = JOptionPane.showConfirmDialog(this, "<html><font size = 15 face = rockwell color = Green>Go back to Location Page ?", null, 1, -1);
if (Ans == JOptionPane.YES_OPTION) {
    _3_Location.main(null);
    this.dispose();
}
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationLabelMouseClicked

    private void LocationLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LocationLabelMouseEntered
        LocationLabel.setText("<html><u>Location</u> /</html>");
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationLabelMouseEntered

    private void LocationLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LocationLabelMouseExited
        LocationLabel.setText("Location /");
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationLabelMouseExited

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
            java.util.logging.Logger.getLogger(_4_Main_Order_Gujarat_Ahemdabad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_4_Main_Order_Gujarat_Ahemdabad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_4_Main_Order_Gujarat_Ahemdabad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_4_Main_Order_Gujarat_Ahemdabad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new _4_Main_Order_Gujarat_Ahemdabad().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JButton Bread_Btn;
    private javax.swing.JButton Dhosa_Btn;
    private javax.swing.JLabel LabelBack;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JButton MakhanBhog_Btn;
    private javax.swing.JPanel RestP;
    private javax.swing.JPanel RestPanel;
    private javax.swing.JScrollPane RestScroll;
    private javax.swing.JLabel RestaurantLabel;
    private javax.swing.JButton Shanchi_Btn;
    private javax.swing.JLabel SigninLabel;
    private javax.swing.JButton Vimal_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

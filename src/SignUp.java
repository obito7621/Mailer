
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dane
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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

        BG1 = new javax.swing.ButtonGroup();
        L1 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        L2 = new javax.swing.JLabel();
        T5 = new javax.swing.JTextField();
        L4 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        L5 = new javax.swing.JLabel();
        T4 = new javax.swing.JTextField();
        L6 = new javax.swing.JLabel();
        PF2 = new javax.swing.JPasswordField();
        L7 = new javax.swing.JLabel();
        PF1 = new javax.swing.JPasswordField();
        B1 = new javax.swing.JButton();
        T3 = new javax.swing.JTextField();
        L3 = new javax.swing.JLabel();
        L8 = new javax.swing.JLabel();
        T6 = new javax.swing.JTextField();
        L9 = new javax.swing.JLabel();
        RB1 = new javax.swing.JRadioButton();
        RB2 = new javax.swing.JRadioButton();
        RB3 = new javax.swing.JRadioButton();
        L10 = new javax.swing.JLabel();
        L11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        T7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignUp");
        setLocation(new java.awt.Point(220, 110));

        L1.setFont(new java.awt.Font("United Kingdom", 0, 18)); // NOI18N
        L1.setText("First Name");

        L2.setFont(new java.awt.Font("United Kingdom", 0, 18)); // NOI18N
        L2.setText("Last Name");

        T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T5ActionPerformed(evt);
            }
        });

        L4.setFont(new java.awt.Font("United Kingdom", 0, 18)); // NOI18N
        L4.setText("Email");

        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });

        L5.setFont(new java.awt.Font("United Kingdom", 0, 18)); // NOI18N
        L5.setText("Confirm Email");

        L6.setFont(new java.awt.Font("United Kingdom", 0, 18)); // NOI18N
        L6.setText("Password");

        PF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PF2ActionPerformed(evt);
            }
        });

        L7.setFont(new java.awt.Font("United Kingdom", 0, 18)); // NOI18N
        L7.setText("Confirm Password");

        PF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PF1ActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Vermin Vibes V", 0, 18)); // NOI18N
        B1.setText("COnfirm");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        L3.setFont(new java.awt.Font("United Kingdom", 0, 18)); // NOI18N
        L3.setText("Choose Username");

        L8.setFont(new java.awt.Font("United Kingdom", 0, 18)); // NOI18N
        L8.setText("Date Of Birth");

        L9.setFont(new java.awt.Font("United Kingdom", 0, 18)); // NOI18N
        L9.setText("Gender");

        BG1.add(RB1);
        RB1.setText("Male");

        BG1.add(RB2);
        RB2.setText("Female");

        BG1.add(RB3);
        RB3.setText("Others");

        L10.setFont(new java.awt.Font("United Kingdom", 0, 18)); // NOI18N
        L10.setText("Phone No");

        L11.setFont(new java.awt.Font("Vermin Vibes V", 0, 24)); // NOI18N
        L11.setText("Sign Up form");

        jLabel1.setText("(YYYY-MM-DD)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(L5)
                            .addComponent(L7)
                            .addComponent(L6)
                            .addComponent(L2)
                            .addComponent(L1)
                            .addComponent(L3)
                            .addComponent(L8)
                            .addComponent(L9)
                            .addComponent(L10)
                            .addComponent(L4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(T3)
                            .addComponent(T2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(T1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(T4, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(PF1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(T5, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(PF2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RB1)
                                .addGap(90, 90, 90)
                                .addComponent(RB2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RB3))
                            .addComponent(T6)
                            .addComponent(T7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(B1)
                        .addGap(304, 304, 304))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(L11)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(L11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L1)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L2)
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L3))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L4))
                        .addGap(18, 18, 18)
                        .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(L5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PF1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PF2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L8)
                    .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L9)
                    .addComponent(RB1)
                    .addComponent(RB2)
                    .addComponent(RB3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L10)
                    .addComponent(T7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(B1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1019, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PF1ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2ActionPerformed

    private void PF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PF2ActionPerformed

    private void T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T5ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        try 
        {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
           
            String uid = "root";
            String pw = "sql";
            String db_url = "jdbc:mysql://localhost:3306/sem";
            Connection conn = DriverManager.getConnection(db_url, uid, pw);
            Statement stmt = conn.createStatement();
            String gen;
            gen = "";
            if(RB1.isSelected()== true)
            {
                gen = "male";
            
            }
            else if(RB2.isSelected()== true)
            { 
                gen = "female";
            }
            else if(RB3.isSelected()== true)
            {
                gen = "others" ;
            }
            
            String aa = "insert into userdata values('"+T1.getText()+"','"+T2.getText()+"','"+T3.getText()+"','"+T4.getText()+"','"+PF1.getText()+"','"+T6.getText()+"','"+gen+"',"+Long.parseLong(T7.getText())+");";
            
            int rs = stmt.executeUpdate(aa);
            JOptionPane.showMessageDialog(this, "THANK YOU for Signing Up in our Mailing Service. We will redirect you to the Login Page.");
            new FirstFrame().setVisible(true);
            this.setVisible(false);
    
        }
         catch (ClassNotFoundException ex)
        {
         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_B1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.ButtonGroup BG1;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L11;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JPasswordField PF1;
    private javax.swing.JPasswordField PF2;
    private javax.swing.JRadioButton RB1;
    private javax.swing.JRadioButton RB2;
    private javax.swing.JRadioButton RB3;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

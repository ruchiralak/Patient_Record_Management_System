
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class K_ConsultationForm extends javax.swing.JFrame {

    /**
     * Creates new form K_ConsultationForm
     */
    public K_ConsultationForm() {
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

        time = new cambodia.raven.Time();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        treat = new javax.swing.JTextField();
        medi = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fin = new javax.swing.JTextField();
        aller = new javax.swing.JTextField();
        compl = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        did = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dte = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        did1 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        time.setTextRefernce(jTextField1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 105, 137), 2));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Consultation Form");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(330, -30, 500, 190);
        jPanel3.add(jLabel1);
        jLabel1.setBounds(1010, 30, 0, 70);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 1030, 130));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0,153,204));
        jLabel6.setText("Patient ID :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 370, 130, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0,153,204));
        jLabel8.setText("Date :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 70, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0,153,204));
        jLabel9.setText("Complains :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 360, 140, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0,153,204));
        jLabel10.setText("Medicines :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 121, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0,153,204));
        jLabel11.setText("Time :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, 70, 40));

        id.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 290, 40));

        treat.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        treat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treatActionPerformed(evt);
            }
        });
        jPanel1.add(treat, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 490, 285, 40));

        medi.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        medi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediActionPerformed(evt);
            }
        });
        jPanel1.add(medi, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 560, 285, 40));

        jButton2.setBackground(new java.awt.Color(0,153,204,240));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 140, 50));

        jButton3.setBackground(new java.awt.Color(0,153,204,240));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 180, 140, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0,153,204));
        jLabel12.setText("Findings :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 110, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0,153,204));
        jLabel13.setText("Treatment :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, -1, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0,153,204));
        jLabel14.setText("Allergies :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, 110, 40));

        fin.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finActionPerformed(evt);
            }
        });
        jPanel1.add(fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, 285, 40));

        aller.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        aller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allerActionPerformed(evt);
            }
        });
        jPanel1.add(aller, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 620, 285, 40));

        compl.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        compl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complActionPerformed(evt);
            }
        });
        jPanel1.add(compl, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 285, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 43, -1, 222));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/imageedit_29_7811728922.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 230));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 719, 110, 40));

        did.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jPanel1.add(did, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 290, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0,153,204));
        jLabel7.setText("Doctor Name :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 160, 40));

        dte.setDateFormatString("yyyy-MM-dd");
        dte.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jPanel1.add(dte, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 290, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0,153,204));
        jLabel15.setText("Doctor ID :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 117, 40));

        did1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jPanel1.add(did1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 290, 40));

        jTextField1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, 250, 40));

        jButton5.setText(".....");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1305, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void treatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_treatActionPerformed

    private void mediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String p_id=id.getText();
        String d_id =did.getText();
        
        String d_name =did1.getText();
        String date =((JTextField)dte.getDateEditor().getUiComponent()).getText();
        
        String time =jTextField1.getText();
        String Complains =compl.getText();
        
        String finding =fin.getText();
        String Treatment =treat.getText();
        
        String medicines =medi.getText();
        String allergic =aller.getText();
       

        try
        {
           Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trojan_squad","root","");
           String q = "INSERT INTO  consultation(patient_id,doctor_id,doctor_Name,date,time,complains,findings,treatment,medicine,alergies) values ('"+p_id+"','"+d_id+"','"+d_name+"','"+date+"','"+time+"','"+Complains+"','"+finding+"','"+Treatment+"','"+medicines+"','"+allergic+"')";
          
          
           PreparedStatement pst =null;
           
           pst =Con.prepareStatement(q); 
         
           
          
           
           pst.execute(q);
           
              JOptionPane.showMessageDialog(rootPane,"Saved Successfully");
         
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        id.setText("");
        did.setText("");
        did1.setText("");
        jTextField1.setText("");
        compl.setText("");
        fin.setText("");
        treat.setText("");
        medi.setText("");
        aller.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void finActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finActionPerformed

    private void allerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allerActionPerformed

    private void complActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        I_DocterPanel dp =new I_DocterPanel();
        dp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        time.showPopup();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(K_ConsultationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(K_ConsultationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(K_ConsultationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(K_ConsultationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new K_ConsultationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aller;
    private javax.swing.JTextField compl;
    private javax.swing.JTextField did;
    private javax.swing.JTextField did1;
    private com.toedter.calendar.JDateChooser dte;
    private javax.swing.JTextField fin;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField medi;
    private cambodia.raven.Time time;
    private javax.swing.JTextField treat;
    // End of variables declaration//GEN-END:variables
}

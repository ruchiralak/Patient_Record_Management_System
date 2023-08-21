
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Splash_screen extends javax.swing.JFrame {

    /**
     * Creates new form Splash_screen
     */
    public Splash_screen() {
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

        BackgroundPannel = new javax.swing.JPanel();
        LoadingBar = new javax.swing.JProgressBar();
        DoctorTeam = new javax.swing.JLabel();
        LoadingLabel = new javax.swing.JLabel();
        ProjectName = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundPannel.setBackground(new java.awt.Color(153, 204, 255));
        BackgroundPannel.setPreferredSize(new java.awt.Dimension(1312, 800));
        BackgroundPannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadingBar.setBackground(new java.awt.Color(255, 255, 255));
        LoadingBar.setForeground(new java.awt.Color(255, 51, 102));
        BackgroundPannel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 1310, 20));

        DoctorTeam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/resize-removebg-preview.png"))); // NOI18N
        BackgroundPannel.add(DoctorTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 670, 410));

        LoadingLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LoadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoadingLabel.setText("Loading....");
        BackgroundPannel.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, 320, -1));

        ProjectName.setFont(new java.awt.Font("Serif", 1, 55)); // NOI18N
        ProjectName.setForeground(new java.awt.Color(255, 255, 255));
        ProjectName.setText("Patient Record Management System");
        BackgroundPannel.add(ProjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 880, -1));

        LoadingValue.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(255, 255, 255));
        LoadingValue.setText("0 %");
        BackgroundPannel.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 740, -1, -1));

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/WhatsApp Image 2022-12-28 at 21.22.49.jpeg"))); // NOI18N
        BackgroundImage.setPreferredSize(new java.awt.Dimension(1312, 800));
        BackgroundPannel.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[] ) throws UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException{
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
            java.util.logging.Logger.getLogger(Splash_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        Splash_screen sp = new Splash_screen();
       
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               sp.setVisible(true);
            }
        });
            
            
            try{
                for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                    UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                }
            }
            catch(ClassNotFoundException ex)
            {
                java.util.logging.Logger.getLogger(Login.class.getName()).log( java.util.logging.Level.SEVERE, null, ex);
            }
                
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                sp.LoadingValue.setText(i +"%");
                
                if(i==10)
                {
                    sp.LoadingLabel.setText("Turning On Modules....");
                }
                if(i==20)
                {
                    sp.LoadingLabel.setText("Loading Modules....");
                }
                if(i==50)
                {
                    sp.LoadingLabel.setText("Connecting to Database....");
                }
                if(i==70)
                {
                    sp.LoadingLabel.setText("Connection Succcessful....");
                }
                if(i==80)
                {
                    sp.LoadingLabel.setText("Launching Application....");
                }
                sp.LoadingBar.setValue(i);
                
              
         
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        //Home Page Screen
        
        A_HomePage hp = new A_HomePage();
        
        //Close or Hide before Home Screen
        
        sp.setVisible(false);
        hp.setVisible(true);
        
        //close Splash screen
        
        sp.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JPanel BackgroundPannel;
    private javax.swing.JLabel DoctorTeam;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel ProjectName;
    // End of variables declaration//GEN-END:variables

    private static class Login {

        public Login() {
        }
    }
}

package hotel_management_systemprj;

public class WelcomeWindow extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(WelcomeWindow.class.getName());
    
    public WelcomeWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegisterOption = new javax.swing.JButton();
        btnLoginOption = new javax.swing.JButton();
        WelcomeIcon_Jlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 237, 255));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Welcome to");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 90, 210, 70);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Grand Hotel");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 130, 210, 70);

        btnRegisterOption.setBackground(new java.awt.Color(102, 0, 255));
        btnRegisterOption.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterOption.setText("REGISTER");
        btnRegisterOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterOptionActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegisterOption);
        btnRegisterOption.setBounds(40, 210, 90, 40);

        btnLoginOption.setBackground(new java.awt.Color(102, 0, 255));
        btnLoginOption.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginOption.setText("LOGIN");
        btnLoginOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginOptionActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoginOption);
        btnLoginOption.setBounds(250, 210, 90, 40);

        WelcomeIcon_Jlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel_resized.png"))); // NOI18N
        jPanel1.add(WelcomeIcon_Jlabel);
        WelcomeIcon_Jlabel.setBounds(150, 20, 80, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterOptionActionPerformed
        // TODO add your handling code here:
        new RegisterWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterOptionActionPerformed

    private void btnLoginOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginOptionActionPerformed
        // TODO add your handling code here:
        new LoginWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginOptionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WelcomeIcon_Jlabel;
    private javax.swing.JButton btnLoginOption;
    private javax.swing.JButton btnRegisterOption;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

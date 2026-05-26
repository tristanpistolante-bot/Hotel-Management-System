package hotel_management_systemprj;

import javax.swing.JOptionPane;

public class LoginWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginWindow.class.getName());

    public LoginWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        tfLoginUsername = new javax.swing.JTextField();
        pfLogin = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 237, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnBack.setBackground(new java.awt.Color(102, 0, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(10, 10, 63, 34);

        tfLoginUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        tfLoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(tfLoginUsername);
        tfLoginUsername.setBounds(10, 230, 340, 30);

        pfLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        jPanel1.add(pfLogin);
        pfLogin.setBounds(10, 300, 340, 30);

        btnLogin.setBackground(new java.awt.Color(102, 0, 255));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(10, 350, 340, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 280, 60, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 210, 60, 16);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel_resized.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 30, 80, 70);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Grand Hotel");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 110, 210, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Your Luxury Experience Awaits");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 150, 170, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String Username = tfLoginUsername.getText();
        String Password = new String(pfLogin.getPassword());

        if (HotelData.login(Username, Password)) 
        {
            JOptionPane.showMessageDialog(this, "LOGIN SUCCESSFUL!");
            new DashboardWindow().setVisible(true);
            this.dispose();
        } else 
        {
            JOptionPane.showMessageDialog(this, "INCORRECT CREDENTIALS.");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new WelcomeWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfLoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLoginUsernameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pfLogin;
    private javax.swing.JTextField tfLoginUsername;
    // End of variables declaration//GEN-END:variables
}

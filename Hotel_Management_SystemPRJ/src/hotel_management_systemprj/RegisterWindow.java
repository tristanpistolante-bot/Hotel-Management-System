package hotel_management_systemprj;

import javax.swing.JOptionPane;

public class RegisterWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegisterWindow.class.getName());

    public RegisterWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        lblFullName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        tfFullName = new javax.swing.JTextField();
        lblRegisterUsername = new javax.swing.JLabel();
        tfRegisterUsername = new javax.swing.JTextField();
        lblRegisterPassword = new javax.swing.JLabel();
        tfPhoneNumber = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        pfRegister = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        RegisterIcon_JLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 237, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setText("Your Luxury Experience Awaits");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 150, 180, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Grand Hotel");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 100, 210, 50);

        btnRegister.setBackground(new java.awt.Color(102, 0, 255));
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister);
        btnRegister.setBounds(20, 560, 310, 40);

        lblFullName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFullName.setText("Full Name:");
        jPanel1.add(lblFullName);
        lblFullName.setBounds(20, 200, 60, 16);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setText("Email:");
        jPanel1.add(lblEmail);
        lblEmail.setBounds(20, 270, 60, 16);

        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPhoneNumber.setText("Phone Number:");
        jPanel1.add(lblPhoneNumber);
        lblPhoneNumber.setBounds(20, 340, 110, 16);

        tfFullName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        jPanel1.add(tfFullName);
        tfFullName.setBounds(20, 220, 310, 40);

        lblRegisterUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRegisterUsername.setText("Username:");
        jPanel1.add(lblRegisterUsername);
        lblRegisterUsername.setBounds(20, 410, 60, 16);

        tfRegisterUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        jPanel1.add(tfRegisterUsername);
        tfRegisterUsername.setBounds(20, 430, 310, 40);

        lblRegisterPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRegisterPassword.setText("Password:");
        jPanel1.add(lblRegisterPassword);
        lblRegisterPassword.setBounds(20, 480, 60, 16);

        tfPhoneNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        jPanel1.add(tfPhoneNumber);
        tfPhoneNumber.setBounds(20, 360, 310, 40);

        tfEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        jPanel1.add(tfEmail);
        tfEmail.setBounds(20, 290, 310, 40);

        pfRegister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        jPanel1.add(pfRegister);
        pfRegister.setBounds(20, 500, 310, 40);

        btnBack.setBackground(new java.awt.Color(102, 0, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(270, 10, 72, 23);

        RegisterIcon_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel_resized.png"))); // NOI18N
        jPanel1.add(RegisterIcon_JLabel);
        RegisterIcon_JLabel.setBounds(130, 20, 80, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        if (tfFullName.getText().isEmpty() || tfEmail.getText().isEmpty() || 
        tfPhoneNumber.getText().isEmpty() || tfRegisterUsername.getText().isEmpty() || 
        pfRegister.getPassword().length == 0) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "PLEASE FILL IN ALL THE FIELDS.");
            return;
        }
        
        try 
        {
            Long.parseLong(tfPhoneNumber.getText());
        } 
        catch (NumberFormatException e) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "INVALID PHONE NUMBER.");
            return;
        }
        
        String FullName = tfFullName.getText();
        String Email    = tfFullName.getText();
        String PhoneNumber = tfFullName.getText();
        String Username = tfRegisterUsername.getText();
        String Password = new String(pfRegister.getPassword());

        Guest newGuest = new Guest(FullName, Email, PhoneNumber, Username, Password);
        
        if (HotelData.registerGuest(newGuest)) 
        {
            JOptionPane.showMessageDialog(this, "REGISTERED SUCCESSFULLY!");
            new WelcomeWindow().setVisible(true);
            this.dispose();
        } else 
        {
            JOptionPane.showMessageDialog(this, "USERNAME ALREADY TAKEN.");
        }    
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new WelcomeWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegisterIcon_JLabel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRegisterPassword;
    private javax.swing.JLabel lblRegisterUsername;
    private javax.swing.JPasswordField pfRegister;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFullName;
    private javax.swing.JTextField tfPhoneNumber;
    private javax.swing.JTextField tfRegisterUsername;
    // End of variables declaration//GEN-END:variables
}

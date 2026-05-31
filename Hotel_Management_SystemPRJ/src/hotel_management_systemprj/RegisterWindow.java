package hotel_management_systemprj;

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class RegisterWindow extends javax.swing.JFrame {
    
    public RegisterWindow() {
        initComponents();
    }

    private void saveRegistry(String fullName, String phoneNumber, String username, String password) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src\\hotel_management_systemprj\\users.txt", true));
            writer.append(String.format("%s - %s - %s - %s", fullName, phoneNumber, username, hashPassword(password)));
            writer.newLine();
            writer.close();
            System.out.println("Registry save successful");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving registry: " + e.getMessage());
        }
    }

    private boolean isUsernameTaken(String username) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\hotel_management_systemprj\\users.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" - ");
                if (parts.length >= 3 && parts[2].trim().equalsIgnoreCase(username)) {
                    reader.close();
                    return true;
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return false;
    }
    
        private String hashPassword(String password) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] hashed = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashed) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            return password;
        }
    }
        
        private void Register() {
            if (tfFullName.getText().isEmpty() || tfPhoneNumber.getText().isEmpty() || 
            tfRegisterUsername.getText().isEmpty() || pfRegister.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "PLEASE FILL IN ALL THE FIELDS.");
            return;
        }

        try {
            Long.parseLong(tfPhoneNumber.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "INVALID PHONE NUMBER.");
            return;
        }

        String FullName = tfFullName.getText();
        String PhoneNumber = tfPhoneNumber.getText();
        String Username = tfRegisterUsername.getText();
        String Password = new String(pfRegister.getPassword());

        if (isUsernameTaken(Username)) {
            JOptionPane.showMessageDialog(this, "USERNAME ALREADY TAKEN.");
            return;
        }

        saveRegistry(FullName, PhoneNumber, Username, Password);
        JOptionPane.showMessageDialog(this, "REGISTERED SUCCESSFULLY!");
        new LoginWindow().setVisible(true);
        this.dispose();
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        lblFullName = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        tfFullName = new javax.swing.JTextField();
        lblRegisterUsername = new javax.swing.JLabel();
        tfRegisterUsername = new javax.swing.JTextField();
        lblRegisterPassword = new javax.swing.JLabel();
        tfPhoneNumber = new javax.swing.JTextField();
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
        jLabel1.setBounds(90, 160, 180, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Sovereign Suites");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 110, 290, 50);

        btnRegister.setBackground(new java.awt.Color(102, 0, 255));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister);
        btnRegister.setBounds(50, 490, 250, 40);

        lblFullName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFullName.setText("Full Name:");
        jPanel1.add(lblFullName);
        lblFullName.setBounds(50, 200, 60, 16);

        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPhoneNumber.setText("Phone Number:");
        jPanel1.add(lblPhoneNumber);
        lblPhoneNumber.setBounds(50, 270, 110, 16);

        tfFullName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        jPanel1.add(tfFullName);
        tfFullName.setBounds(50, 220, 250, 40);

        lblRegisterUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRegisterUsername.setText("Username:");
        jPanel1.add(lblRegisterUsername);
        lblRegisterUsername.setBounds(50, 340, 60, 16);

        tfRegisterUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        jPanel1.add(tfRegisterUsername);
        tfRegisterUsername.setBounds(50, 360, 250, 40);

        lblRegisterPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRegisterPassword.setText("Password:");
        jPanel1.add(lblRegisterPassword);
        lblRegisterPassword.setBounds(50, 410, 60, 16);

        tfPhoneNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        jPanel1.add(tfPhoneNumber);
        tfPhoneNumber.setBounds(50, 290, 250, 40);

        pfRegister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        jPanel1.add(pfRegister);
        pfRegister.setBounds(50, 430, 250, 40);

        btnBack.setBackground(new java.awt.Color(102, 0, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(270, 20, 72, 23);

        RegisterIcon_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel_resized.png"))); // NOI18N
        jPanel1.add(RegisterIcon_JLabel);
        RegisterIcon_JLabel.setBounds(140, 40, 80, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        Register();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new LoginWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegisterIcon_JLabel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRegisterPassword;
    private javax.swing.JLabel lblRegisterUsername;
    private javax.swing.JPasswordField pfRegister;
    private javax.swing.JTextField tfFullName;
    private javax.swing.JTextField tfPhoneNumber;
    private javax.swing.JTextField tfRegisterUsername;
    // End of variables declaration//GEN-END:variables
}

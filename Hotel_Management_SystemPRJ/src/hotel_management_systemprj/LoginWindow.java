package hotel_management_systemprj;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginWindow extends javax.swing.JFrame {
    
    public LoginWindow() {
        initComponents();
    }
    
    private boolean loginFromFile(String username, String password) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\hotel_management_systemprj\\users.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                //this line is for debug if it reads the users from the users.txt and prints put in terminal
                System.out.println("Read line: " + line); 
                String[] parts = line.split(" - ");
                System.out.println();
                if (parts.length >= 4 && parts[2].trim().equals(username) && parts[3].trim().equals(hashPassword(password))) {
                    reader.close();
                    String fullName = parts[0].trim();
                    String phoneNumber = parts[1].trim();
                    Guest guest = new Guest(fullName, phoneNumber, username, password);
                    HotelData.setLoggedInGuest(guest);
                    return true;
                }
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading user file: " + e.getMessage());
        }
        return false;
    }
    
        private String hashPassword(String password) {
        try {
            //used md5 for one way hashing to scramble passwords and not easily be accessed
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] hashed = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashed) {
                sb.append(String.format("%02x", b));// this line causes the hashing
            }
            return sb.toString();
        } catch (Exception e) {
            return password;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfLoginUsername = new javax.swing.JTextField();
        pfLogin = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegisterOption1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 237, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 440));
        jPanel1.setLayout(null);

        tfLoginUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        tfLoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(tfLoginUsername);
        tfLoginUsername.setBounds(50, 231, 250, 40);

        pfLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        jPanel1.add(pfLogin);
        pfLogin.setBounds(50, 300, 250, 40);

        btnLogin.setBackground(new java.awt.Color(102, 0, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(50, 370, 250, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 280, 60, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 210, 60, 16);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel_resized.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 40, 80, 70);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Sovereign Suites");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 110, 280, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Your Luxury Experience Awaits");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 160, 180, 20);

        btnRegisterOption1.setBackground(new java.awt.Color(102, 0, 255));
        btnRegisterOption1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegisterOption1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterOption1.setText("REGISTER");
        btnRegisterOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterOption1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegisterOption1);
        btnRegisterOption1.setBounds(50, 420, 250, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String Username = tfLoginUsername.getText().trim();
        String Password = new String(pfLogin.getPassword()).trim();

        if (Username.isEmpty() || Password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "PLEASE ENTER USERNAME AND PASSWORD.");
            return;
        }

        if (loginFromFile(Username, Password)) {
            JOptionPane.showMessageDialog(this, "LOGIN SUCCESSFUL!");
            new DashboardWindow().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "INCORRECT CREDENTIALS.");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void tfLoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLoginUsernameActionPerformed

    private void btnRegisterOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterOption1ActionPerformed
        // TODO add your handling code here:
        new RegisterWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterOption1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegisterOption1;
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

package hotel_management_systemprj;


public class GuestProfileWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GuestProfileWindow.class.getName());

   public GuestProfileWindow() {
    initComponents();

    tfBookingStatus.setEditable(false);
    tfRoom.setEditable(false);

    Guest guest = HotelData.getLoggedInGuest();

    if (guest == null) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "No guest is logged in.");
        dispose();
        return;
    }

    tfFullName.setText(guest.getFullName());
    tfPhoneNumber.setText(guest.getPhoneNumber());
    tfUsername.setText(guest.getUsername());
    tfPassword.setText(guest.getPassword());

    if (guest.getBooking() != null) {
        tfBookingStatus.setText("Active Booking");

        tfRoom.setText(
                guest.getBooking().getRoom().getRoomType()
                + " - "
                + guest.getBooking().getNumberOfNights()
                + " nights"
        );
    } else {
        tfBookingStatus.setText("No Active Booking");
        tfRoom.setText("N/A");
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfFullName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfPhoneNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        lblPASSWORD1 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        lblBOOKINGSTATUS1 = new javax.swing.JLabel();
        tfBookingStatus = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblROOM1 = new javax.swing.JLabel();
        tfRoom = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 255));
        jLabel4.setText("Guest Profile");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 148, 32);

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 0, 255));
        btnBack.setText("BACK");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(341, 10, 60, 30);

        jLabel5.setForeground(new java.awt.Color(102, 0, 255));
        jLabel5.setText("Manage your account information");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 40, 182, 16);

        tfFullName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(tfFullName);
        tfFullName.setBounds(10, 110, 390, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 255));
        jLabel6.setText("FULL NAME");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 90, 90, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 255));
        jLabel7.setText("PHONE NUMBER");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 160, 110, 16);

        tfPhoneNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(tfPhoneNumber);
        tfPhoneNumber.setBounds(10, 180, 390, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 255));
        jLabel8.setText("USERNAME");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 230, 80, 16);

        tfUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(tfUsername);
        tfUsername.setBounds(10, 250, 390, 30);

        lblPASSWORD1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPASSWORD1.setForeground(new java.awt.Color(102, 0, 255));
        lblPASSWORD1.setText("PASSWORD");
        jPanel1.add(lblPASSWORD1);
        lblPASSWORD1.setBounds(10, 300, 66, 10);

        tfPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(tfPassword);
        tfPassword.setBounds(10, 320, 390, 30);

        lblBOOKINGSTATUS1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBOOKINGSTATUS1.setForeground(new java.awt.Color(102, 0, 255));
        lblBOOKINGSTATUS1.setText("BOOKING STATUS");
        jPanel1.add(lblBOOKINGSTATUS1);
        lblBOOKINGSTATUS1.setBounds(10, 370, 104, 16);

        tfBookingStatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        tfBookingStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBookingStatusActionPerformed(evt);
            }
        });
        jPanel1.add(tfBookingStatus);
        tfBookingStatus.setBounds(10, 390, 390, 30);

        btnSave.setBackground(new java.awt.Color(102, 0, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);
        btnSave.setBounds(150, 520, 90, 30);

        lblROOM1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblROOM1.setForeground(new java.awt.Color(102, 0, 255));
        lblROOM1.setText("ROOM");
        jPanel1.add(lblROOM1);
        lblROOM1.setBounds(10, 440, 37, 16);

        tfRoom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(tfRoom);
        tfRoom.setBounds(10, 460, 390, 30);

        jLabel24.setForeground(new java.awt.Color(102, 0, 255));
        jLabel24.setText("_________________________________________________________________________________");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(10, 50, 400, 16);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new DashboardWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
    Guest guest = HotelData.getLoggedInGuest();

    String newName = tfFullName.getText().trim();
    String newPhone = tfPhoneNumber.getText().trim();
    String newUsername = tfUsername.getText().trim();
    String newPassword = tfPassword.getText().trim();

    guest.setName(newName);
    guest.setPhoneNumber(newPhone);
    guest.setUsername(newUsername);
    guest.setPassword(newPassword);

    saveChangesToFile(newName, newPhone, newUsername, newPassword, guest.getUsername());
 
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tfBookingStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBookingStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBookingStatusActionPerformed

    private void saveChangesToFile(String fullName, String phoneNumber, String username, String password,  String oldUsername) {
        try {
            // Read all lines
            java.util.ArrayList<String> lines = new java.util.ArrayList<>();
            java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader("src\\hotel_management_systemprj\\users.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Find and replace the logged in guest's line
            Guest guest = HotelData.getLoggedInGuest();
            java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter("src\\hotel_management_systemprj\\users.txt", false));
            for (String l : lines) {
                String[] parts = l.split(" - ");
                if (parts.length >= 3 && parts[2].trim().equalsIgnoreCase(oldUsername)) {
                    writer.write(String.format("%s - %s - %s - %s", fullName, phoneNumber, username, hashPassword(password)));
                } else {
                    writer.write(l);
                }
                writer.newLine();
            }
            writer.close();
        } catch (java.io.IOException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error saving changes: " + e.getMessage());
        }
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBOOKINGSTATUS1;
    private javax.swing.JLabel lblPASSWORD1;
    private javax.swing.JLabel lblROOM1;
    private javax.swing.JTextField tfBookingStatus;
    private javax.swing.JTextField tfFullName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfPhoneNumber;
    private javax.swing.JTextField tfRoom;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

}
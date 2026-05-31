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
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPASSWORD1 = new javax.swing.JLabel();
        lblBOOKINGSTATUS1 = new javax.swing.JLabel();
        lblROOM1 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        tfPhoneNumber = new javax.swing.JTextField();
        tfUsername = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        tfBookingStatus = new javax.swing.JTextField();
        tfRoom = new javax.swing.JTextField();
        tfFullName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 255));
        jLabel4.setText("Guest Profile");

        jLabel5.setForeground(new java.awt.Color(102, 0, 255));
        jLabel5.setText("Manage your account information");

        btnBack.setForeground(new java.awt.Color(102, 0, 255));
        btnBack.setText("BACK");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 255));
        jLabel6.setText("FULL NAME:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 255));
        jLabel7.setText("PHONE NUMBER:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 255));
        jLabel8.setText("USERNAME:");

        lblPASSWORD1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPASSWORD1.setForeground(new java.awt.Color(102, 0, 255));
        lblPASSWORD1.setText("PASSWORD:");

        lblBOOKINGSTATUS1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBOOKINGSTATUS1.setForeground(new java.awt.Color(102, 0, 255));
        lblBOOKINGSTATUS1.setText("BOOKING STATUS:");

        lblROOM1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblROOM1.setForeground(new java.awt.Color(102, 0, 255));
        lblROOM1.setText("ROOM:");

        tfPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));

        tfPhoneNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));

        tfUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(102, 0, 255));
        btnSave.setText("SAVE");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tfBookingStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));
        tfBookingStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBookingStatusActionPerformed(evt);
            }
        });

        tfRoom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));

        tfFullName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tfRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(tfFullName, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(2, 2, 2))
                        .addComponent(tfPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                        .addComponent(tfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblROOM1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPASSWORD1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfBookingStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                                    .addComponent(lblBOOKINGSTATUS1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel8))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(18, 18, 18))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(167, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addComponent(tfRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblPASSWORD1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblBOOKINGSTATUS1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tfBookingStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblROOM1)
                    .addGap(58, 58, 58)
                    .addComponent(btnSave)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
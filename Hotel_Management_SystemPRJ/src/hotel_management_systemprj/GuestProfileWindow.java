package hotel_management_systemprj;

public class GuestProfileWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GuestProfileWindow.class.getName());

    public GuestProfileWindow() {
        initComponents();
        
            Guest guest = HotelData.getLoggedInGuest();

           tfFullName.setText(guest.getFullName());
           tfPhoneNumber.setText(guest.getPhoneNumber());
           tfUsername.setText(guest.getUsername());
           tfPassword.setText(guest.getPassword());

           if (guest.getBooking() != null) 
           {
               lblBookingStatus.setText("Active Booking");
               lblRoom.setText(guest.getBooking().getRoom().getRoomType() + " - " + guest.getBooking().getNumberOfNights() + " nights");
           } 
           else 
           {
               lblBookingStatus.setText("No Active Booking");
               lblRoom.setText("N/A");
           }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPASSWORD = new javax.swing.JLabel();
        lblBOOKINGSTATUS = new javax.swing.JLabel();
        lblROOM = new javax.swing.JLabel();
        lblBookingStatus = new javax.swing.JLabel();
        lblRoom = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfFullName = new javax.swing.JTextField();
        tfPhoneNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        tfPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("FULL NAME:");

        jLabel2.setText("PHONE NUMBER:");

        jLabel3.setText("USERNAME:");

        lblPASSWORD.setText("PASSWORD:");

        lblBOOKINGSTATUS.setText("BOOKING STATUS:");

        lblROOM.setText("ROOM:");

        lblBookingStatus.setText("...");

        lblRoom.setText("...");

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBOOKINGSTATUS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblBookingStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPASSWORD)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfPassword))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblROOM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBOOKINGSTATUS)
                    .addComponent(lblBookingStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblROOM)
                    .addComponent(lblRoom))
                .addGap(71, 71, 71)
                .addComponent(btnSave)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new DashboardWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Guest guest = HotelData.getLoggedInGuest();

        String newName     = tfFullName.getText().trim();
        String newPhone    = tfPhoneNumber.getText().trim();
        String newUsername = tfUsername.getText().trim();
        String newPassword = tfPassword.getText().trim();

        if (newName.isEmpty() || newPhone.isEmpty() || 
            newUsername.isEmpty() || newPassword.isEmpty()) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Fields cannot be empty.");
            return;
        }

        try 
        {
            Long.parseLong(newPhone);
        } 
        catch (NumberFormatException e) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Phone number must be numbers only.");
            return;
        }

        guest.setName(newName);
        guest.setPhoneNumber(newPhone);
        String oldUsername = guest.getUsername();
        guest.setUsername(newUsername);
        guest.setPassword(newPassword);
        
        saveChangesToFile(newName, newPhone, newUsername, newPassword, oldUsername);

        javax.swing.JOptionPane.showMessageDialog(this, "Profile updated successfully!");
    }//GEN-LAST:event_btnSaveActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBOOKINGSTATUS;
    private javax.swing.JLabel lblBookingStatus;
    private javax.swing.JLabel lblPASSWORD;
    private javax.swing.JLabel lblROOM;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JTextField tfFullName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfPhoneNumber;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}

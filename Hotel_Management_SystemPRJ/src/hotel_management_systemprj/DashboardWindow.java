package hotel_management_systemprj;

public class DashboardWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DashboardWindow.class.getName());

    public DashboardWindow() {
        initComponents();
        
        lblWelcome.setText("Welcome, " + HotelData.getLoggedInGuest().getFullName() + "!");
        
        if (HotelData.getBooking() == null) 
        {
            btnViewBill.setEnabled(false);
            btnServices.setEnabled(false);
            btnFoodServices.setEnabled(false);
        }
        
        if (HotelData.getBooking() != null) 
        {
            btnRoom.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnFoodServices = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnViewBill = new javax.swing.JButton();
        btnRoom = new javax.swing.JButton();
        btnServices = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 237, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblWelcome.setText("Welcome, !");
        jPanel1.add(lblWelcome);
        lblWelcome.setBounds(10, 20, 250, 48);

        btnFoodServices.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFoodServices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/utensils.png"))); // NOI18N
        btnFoodServices.setText("<html><body style=\"font-family: Segoe UI; text-align: center;\"><div style=\"font-size: 12px; font-weight: bold;\">FOOD SERVICES</div><div style=\"font-size: 9px; color: #6B7280;\">Order meals and beverages</div></body></html>");
        btnFoodServices.setActionCommand("<html><center>BOOK A ROOM<br><font size=\"2\" color=\"#6B7280\">Browse and reserve your room</font  color=\"#6B7280\"></center></html>");
        btnFoodServices.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        btnFoodServices.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFoodServices.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFoodServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodServicesActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoodServices);
        btnFoodServices.setBounds(310, 230, 270, 130);

        btnLogout.setBackground(new java.awt.Color(102, 0, 255));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log-out.png"))); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout);
        btnLogout.setBounds(480, 30, 110, 30);

        btnViewBill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receipt.png"))); // NOI18N
        btnViewBill.setText("<html><body style=\"font-family: Segoe UI; text-align: center;\"><div style=\"font-size: 12px; font-weight: bold;\">VIEW MY BILL</div><div style=\"font-size: 9px; color: #6B7280;\">See charges and billing details</div></body></html> ");
        btnViewBill.setToolTipText("");
        btnViewBill.setActionCommand("<html><center>BOOK A ROOM<br><font size=\"2\" color=\"#6B7280\">Browse and reserve your room</font  color=\"#6B7280\"></center></html>");
        btnViewBill.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        btnViewBill.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewBill.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnViewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBillActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewBill);
        btnViewBill.setBounds(20, 230, 270, 130);

        btnRoom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book_room.png"))); // NOI18N
        btnRoom.setText("<html><body style=\"font-family: Segoe UI; text-align: center;\"><div style=\"font-size: 12px; font-weight: bold;\">BOOK A ROOM</div><div style=\"font-size: 9px; color: #6B7280;\">Browse and reserve your room</div></body></html>");
        btnRoom.setActionCommand("<html><center>BOOK A ROOM<br><font size=\"2\" color=\"#6B7280\">Browse and reserve your room</font  color=\"#6B7280\"></center></html>");
        btnRoom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        btnRoom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRoom.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomActionPerformed(evt);
            }
        });
        jPanel1.add(btnRoom);
        btnRoom.setBounds(20, 90, 270, 130);

        btnServices.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnServices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/concierge-bell.png"))); // NOI18N
        btnServices.setText("<html><body style=\"font-family: Segoe UI; text-align: center;\"><div style=\"font-size: 12px; font-weight: bold;\">REQUEST SERVICES</div><div style=\"font-size: 9px; color: #6B7280;\">Order housekeeping, room service & more</div></body></html>");
        btnServices.setActionCommand("<html><center>BOOK A ROOM<br><font size=\"2\" color=\"#6B7280\">Browse and reserve your room</font  color=\"#6B7280\"></center></html>");
        btnServices.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        btnServices.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnServices.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicesActionPerformed(evt);
            }
        });
        jPanel1.add(btnServices);
        btnServices.setBounds(310, 90, 270, 130);

        btnProfile.setText("PROFILE");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        jPanel1.add(btnProfile);
        btnProfile.setBounds(380, 30, 74, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        HotelData.logout();
        new WelcomeWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBillActionPerformed
        // TODO add your handling code here:
        new ViewBillWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewBillActionPerformed

    private void btnFoodServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodServicesActionPerformed
        // TODO add your handling code here:
        new FoodOrderWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFoodServicesActionPerformed

    private void btnRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomActionPerformed
        // TODO add your handling code here:
        new BrowseRoomsWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRoomActionPerformed

    private void btnServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicesActionPerformed
        // TODO add your handling code here:
        new RequestServicesWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnServicesActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        new GuestProfileWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProfileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoodServices;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnRoom;
    private javax.swing.JButton btnServices;
    private javax.swing.JButton btnViewBill;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}

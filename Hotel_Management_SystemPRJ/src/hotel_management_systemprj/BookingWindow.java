package hotel_management_systemprj;

public class BookingWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BookingWindow.class.getName());

    public BookingWindow() {
        initComponents();
        
        Room room = HotelData.getCurrentRoom();
        Guest guest = HotelData.getLoggedInGuest();

        lblSelectedRoom.setText(room.getRoomType());
        lblPrice.setText("$" + room.getPricePerNight() + "/night");
        lblGuestName.setText(guest.getFullName());
        lblAmenities.setText(room.getAmenities());
        
        btnConfirmBooking.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSelectedRoom = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblGuestName = new javax.swing.JLabel();
        lblNights = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        btnConfirmBooking = new javax.swing.JButton();
        btnCancelBooking = new javax.swing.JButton();
        tfNights = new javax.swing.JTextField();
        btnDone = new javax.swing.JButton();
        lblAmenities = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSelectedRoom.setText("SELECTED ROOM ");

        lblPrice.setText("PRICE");

        lblGuestName.setText("GUEST NAME");

        lblNights.setText("NUMBER OF NIGHTS");

        lblCost.setText("TOTAL ESTIMATED COST");

        btnConfirmBooking.setText("CONFIRM");
        btnConfirmBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmBookingActionPerformed(evt);
            }
        });

        btnCancelBooking.setText("CANCEL");
        btnCancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelBookingActionPerformed(evt);
            }
        });

        btnDone.setText("DONE");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        lblAmenities.setText("AMENITIES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrice)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblGuestName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblNights))
                    .addComponent(lblSelectedRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfNights, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAmenities)
                        .addGap(121, 121, 121))))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnConfirmBooking)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCost)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDone)
                            .addComponent(btnCancelBooking))
                        .addGap(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblSelectedRoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPrice)
                        .addGap(18, 18, 18)
                        .addComponent(lblGuestName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNights))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblAmenities)
                        .addGap(52, 52, 52)
                        .addComponent(tfNights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblCost)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnConfirmBooking))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnDone)))
                .addGap(18, 18, 18)
                .addComponent(btnCancelBooking)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelBookingActionPerformed
        // TODO add your handling code here:
        new BrowseRoomsWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelBookingActionPerformed

    private void btnConfirmBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmBookingActionPerformed
        // TODO add your handling code here:
        Guest guest = HotelData.getLoggedInGuest();
        Room room = HotelData.getCurrentRoom();
        int nights = Integer.parseInt(tfNights.getText());

        Booking newBooking = new Booking(guest, room, nights);
        HotelData.setBooking(newBooking);

        javax.swing.JOptionPane.showMessageDialog(this, "Booking confirmed!");
        new DashboardWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConfirmBookingActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        if (tfNights.getText().isEmpty()) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "PLEASE ENTER NUMBER OF NIGHTS.");
            return;
        }

        int nights = Integer.parseInt(tfNights.getText());
        double total = HotelData.getCurrentRoom().calculatePrice(nights);

        lblCost.setText("Total: $" + total);
        
        btnConfirmBooking.setEnabled(true);
    }//GEN-LAST:event_btnDoneActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelBooking;
    private javax.swing.JButton btnConfirmBooking;
    private javax.swing.JButton btnDone;
    private javax.swing.JLabel lblAmenities;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblGuestName;
    private javax.swing.JLabel lblNights;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSelectedRoom;
    private javax.swing.JTextField tfNights;
    // End of variables declaration//GEN-END:variables
}

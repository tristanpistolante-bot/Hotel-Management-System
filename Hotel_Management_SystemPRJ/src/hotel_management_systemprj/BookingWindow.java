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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAmenities)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNights)
                                .addGap(40, 40, 40)
                                .addComponent(tfNights, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(101, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGuestName)
                            .addComponent(lblSelectedRoom)
                            .addComponent(lblPrice)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblCost)))
                        .addContainerGap(139, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConfirmBooking)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelBooking)
                        .addGap(72, 72, 72))))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnDone)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(lblGuestName)
                .addGap(12, 12, 12)
                .addComponent(lblSelectedRoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAmenities)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNights)
                    .addComponent(tfNights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDone)
                .addGap(20, 20, 20)
                .addComponent(lblCost)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelBooking)
                    .addComponent(btnConfirmBooking))
                .addContainerGap(27, Short.MAX_VALUE))
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

        lblCost.setText("Total: $" + String.format("%.2f", total));
        
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

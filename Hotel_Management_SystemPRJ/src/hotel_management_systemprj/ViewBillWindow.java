package hotel_management_systemprj;

public class ViewBillWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ViewBillWindow.class.getName());

    public ViewBillWindow() {
        initComponents();
        
        Booking booking = HotelData.getBooking();
        Guest guest = HotelData.getLoggedInGuest();

        lblGuestName.setText("Guest: " + guest.getFullName());
        lblRoom.setText("Room: " + booking.getRoom().getRoomType());
        lblPricePerNight.setText("Price per Night: $" + booking.getRoom().getPricePerNight());
        lblNumberOfNights.setText("Number of Nights: " + booking.getNumberOfNights());

        double roomTotal = booking.getTotalCost();
        double servicesTotal = HotelData.getServicesCost();
        double grandTotal = roomTotal + servicesTotal;

        lblRoomTotal.setText("Room Total: $" + roomTotal);
        lblServicesTotal.setText("Services Total: $" + servicesTotal);
        lblTotal.setText("Grand Total: $" + grandTotal);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGuestName = new javax.swing.JLabel();
        lblRoom = new javax.swing.JLabel();
        lblPricePerNight = new javax.swing.JLabel();
        lblNumberOfNights = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnCheckOut = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblRoomTotal = new javax.swing.JLabel();
        lblServicesTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblGuestName.setText("GUEST NAME");

        lblRoom.setText("ROOM");

        lblPricePerNight.setText("PRICE PER NIGHT");

        lblNumberOfNights.setText("NUMBER OF NIGHTS");

        lblTotal.setText("TOTAL AMOUNT");

        btnCheckOut.setText("PROCEED TO CHECK OUT");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblRoomTotal.setText("ROOM TOTAL");

        lblServicesTotal.setText("SERVICES TOTAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnCheckOut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumberOfNights)
                            .addComponent(lblRoom)
                            .addComponent(lblGuestName))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPricePerNight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblServicesTotal)
                            .addComponent(lblRoomTotal))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal)
                .addGap(267, 267, 267))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblGuestName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblPricePerNight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumberOfNights)
                .addGap(34, 34, 34)
                .addComponent(lblRoomTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblServicesTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnCheckOut)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new DashboardWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
       new CheckOutWindow().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnCheckOutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JLabel lblGuestName;
    private javax.swing.JLabel lblNumberOfNights;
    private javax.swing.JLabel lblPricePerNight;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblRoomTotal;
    private javax.swing.JLabel lblServicesTotal;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}

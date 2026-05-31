package hotel_management_systemprj;

public class ViewBillWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ViewBillWindow.class.getName());

    public ViewBillWindow() {
        initComponents();
        
        Booking booking = HotelData.getBooking();
        Guest guest = HotelData.getLoggedInGuest();

        double foodCost = HotelData.getFoodCost();
        double roomTotal = booking.getRoom().calculatePrice(booking.getNumberOfNights(), foodCost);
        double servicesTotal = HotelData.getServicesCost();
        double grandTotal = roomTotal + servicesTotal;

        lblRoom.setText("ROOM: " + booking.getRoom().getRoomType());
        lblPricePerNight.setText("PRICE PER NIGHT: $" + booking.getRoom().getPricePerNight());
        lblNumberOfNights.setText("NUMBER OF NIGHTS: " + booking.getNumberOfNights());
        lblRoomTotal.setText("ROOM TOTAL: $" + roomTotal);
        lblServicesTotal.setText("ROOM SERVICES TOTAL: $" + servicesTotal);
        lblFoodCost.setText("FOOD SERVICES TOTAL: $" + foodCost);
        lblTotal.setText("GRAND TOTAL: $" + grandTotal);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblRoom = new javax.swing.JLabel();
        lblPricePerNight = new javax.swing.JLabel();
        lblNumberOfNights = new javax.swing.JLabel();
        lblRoomTotal = new javax.swing.JLabel();
        lblServicesTotal = new javax.swing.JLabel();
        lblFoodCost = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnCheckOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("View Bill");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 100, 30);

        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setText("Review your billing details");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 150, 16);

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
        btnBack.setBounds(340, 10, 60, 30);

        jLabel3.setForeground(new java.awt.Color(102, 0, 255));
        jLabel3.setText("_________________________________________________________________________________");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 50, 390, 16);

        lblRoom.setBackground(new java.awt.Color(255, 255, 255));
        lblRoom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRoom.setForeground(new java.awt.Color(102, 0, 255));
        lblRoom.setText("ROOM");
        lblRoom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 1, true));
        lblRoom.setOpaque(true);
        jPanel1.add(lblRoom);
        lblRoom.setBounds(10, 80, 390, 30);

        lblPricePerNight.setBackground(new java.awt.Color(255, 255, 255));
        lblPricePerNight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPricePerNight.setForeground(new java.awt.Color(102, 0, 255));
        lblPricePerNight.setText("PRICE PER NIGHT");
        lblPricePerNight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 1, true));
        lblPricePerNight.setOpaque(true);
        jPanel1.add(lblPricePerNight);
        lblPricePerNight.setBounds(10, 120, 390, 30);

        lblNumberOfNights.setBackground(new java.awt.Color(255, 255, 255));
        lblNumberOfNights.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNumberOfNights.setForeground(new java.awt.Color(102, 0, 255));
        lblNumberOfNights.setText("NUMBER OF NIGHTS");
        lblNumberOfNights.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 1, true));
        lblNumberOfNights.setOpaque(true);
        jPanel1.add(lblNumberOfNights);
        lblNumberOfNights.setBounds(10, 160, 390, 30);

        lblRoomTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblRoomTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRoomTotal.setForeground(new java.awt.Color(102, 0, 255));
        lblRoomTotal.setText("ROOM TOTAL");
        lblRoomTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 1, true));
        lblRoomTotal.setOpaque(true);
        jPanel1.add(lblRoomTotal);
        lblRoomTotal.setBounds(10, 200, 390, 30);

        lblServicesTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblServicesTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblServicesTotal.setForeground(new java.awt.Color(102, 0, 255));
        lblServicesTotal.setText("ROOM SERVICES TOTAL");
        lblServicesTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 1, true));
        lblServicesTotal.setOpaque(true);
        jPanel1.add(lblServicesTotal);
        lblServicesTotal.setBounds(10, 240, 390, 30);

        lblFoodCost.setBackground(new java.awt.Color(255, 255, 255));
        lblFoodCost.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFoodCost.setForeground(new java.awt.Color(102, 0, 255));
        lblFoodCost.setText("FOOD TOTAL");
        lblFoodCost.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 1, true));
        lblFoodCost.setOpaque(true);
        jPanel1.add(lblFoodCost);
        lblFoodCost.setBounds(10, 280, 390, 30);

        lblTotal.setBackground(new java.awt.Color(245, 245, 245));
        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(102, 0, 255));
        lblTotal.setText("TOTAL AMOUNT");
        lblTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(lblTotal);
        lblTotal.setBounds(10, 340, 390, 50);

        btnCheckOut.setBackground(new java.awt.Color(102, 0, 255));
        btnCheckOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOut.setText("PROCEED TO CHECK OUT");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnCheckOut);
        btnCheckOut.setBounds(100, 400, 190, 40);

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFoodCost;
    private javax.swing.JLabel lblNumberOfNights;
    private javax.swing.JLabel lblPricePerNight;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblRoomTotal;
    private javax.swing.JLabel lblServicesTotal;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}

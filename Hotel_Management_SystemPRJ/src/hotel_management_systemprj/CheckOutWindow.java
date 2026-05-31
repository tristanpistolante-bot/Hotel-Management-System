package hotel_management_systemprj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckOutWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CheckOutWindow.class.getName());


    public CheckOutWindow() {
        initComponents();

        btnCheckOut.setEnabled(false);

        javax.swing.ButtonGroup paymentGroup = new javax.swing.ButtonGroup();
        paymentGroup.add(rbCash);
        paymentGroup.add(rbCredit);
        paymentGroup.add(rbDebit);

        double foodCost = HotelData.getFoodCost();
        double roomTotal = HotelData.getBooking().getRoom().calculatePrice(HotelData.getBooking().getNumberOfNights(), foodCost);
        double servicesTotal = HotelData.getServicesCost();
        double grandTotal = roomTotal + servicesTotal;

        lblTotal.setText("Grand Total: $" + String.format("%.2f", grandTotal));
    }

    private void saveToCheckout(String checkout) {
        try {
            // for debug can remove if its working
            System.out.println("saveToCheckout called with: " + checkout);
            // Retrieve check-in time from HotelData
            String checkIn = HotelData.getCheckInTime();
            // Get current date and time as check-out time
            String checkOut = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));
            // Opens checkout.txt in append mode so existing entries are not overwritten
            BufferedWriter writer = new BufferedWriter(new FileWriter("src\\hotel_management_systemprj\\checkout.txt", true));
            // Writes check-in, check-out time and checkout details to checkout.txt
            writer.append(String.format("Check-in: %s - Check-out: %s - %s", checkIn, checkOut, checkout));
            writer.newLine();
            writer.close();
            System.out.println("Checkout save successful");
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                e.printStackTrace();
            }
    }
    
    private void Checkout() {
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to check out?", "Check Out", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            try {
                Guest guest = HotelData.getLoggedInGuest();
                Booking booking = HotelData.getBooking();
                double foodCost = HotelData.getFoodCost();
                double roomTotal = booking.getRoom().calculatePrice(booking.getNumberOfNights(), foodCost);
                double servicesTotal = HotelData.getServicesCost();
                double grandTotal = roomTotal + servicesTotal;
                String paymentMethod = rbCash.isSelected() ? "Cash" : rbCredit.isSelected() ? "Credit Card" : "Debit Card";

                saveToCheckout(String.format("%s - %s - %d nights - Room: $%.2f - Services: $%.2f - Grand Total: $%.2f - %s",
                    guest.getFullName(), booking.getRoom().getRoomType(), booking.getNumberOfNights(),
                    roomTotal, servicesTotal, grandTotal, paymentMethod));

                javax.swing.JOptionPane.showMessageDialog(this, "Thank You for choosing Sovereign Suites!\nPlease come again!");
                HotelData.setBooking(null);
                HotelData.resetServicesCost();
                HotelData.resetFoodCost();
                new LoginWindow().setVisible(true);
                this.dispose();
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTotal = new javax.swing.JLabel();
        rbCash = new javax.swing.JRadioButton();
        rbCredit = new javax.swing.JRadioButton();
        rbDebit = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTotal.setText("GRAND TOTAL");

        rbCash.setText("CASH");
        rbCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCashActionPerformed(evt);
            }
        });

        rbCredit.setText("CREDIT CARD");
        rbCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCreditActionPerformed(evt);
            }
        });

        rbDebit.setText("DEBIT CARD");
        rbDebit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDebitActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCheckOut.setText("CHECK OUT");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbCredit)
                                    .addComponent(rbCash)
                                    .addComponent(rbDebit)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnCheckOut))
                                    .addComponent(lblTotal))))
                        .addGap(0, 182, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(rbCash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCredit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbDebit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCheckOut)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCashActionPerformed
        // TODO add your handling code here:
        btnCheckOut.setEnabled(true);
    }//GEN-LAST:event_rbCashActionPerformed

    private void rbCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCreditActionPerformed
        // TODO add your handling code here:
        btnCheckOut.setEnabled(true);
    }//GEN-LAST:event_rbCreditActionPerformed

    private void rbDebitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDebitActionPerformed
        // TODO add your handling code here:
        btnCheckOut.setEnabled(true);
    }//GEN-LAST:event_rbDebitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new ViewBillWindow().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        Checkout();
    }//GEN-LAST:event_btnCheckOutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rbCash;
    private javax.swing.JRadioButton rbCredit;
    private javax.swing.JRadioButton rbDebit;
    // End of variables declaration//GEN-END:variables
}

package hotel_management_systemprj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
     private void saveToLogbook(String action) {
            try {
                //get the current time and current date and format it
                String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));
                //opens the logbook.txt, using append mode it will not overwrite the existing entries and it is using list
                BufferedWriter writer = new BufferedWriter(new FileWriter("src\\hotel_management_systemprj\\logbook.txt", true));
                //writes the currTime and currDate to logbook.txt
                writer.append(dateTime + " - " + action);
                writer.newLine();
                writer.close();
                System.out.println("Logbook save successful");
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblGuestName = new javax.swing.JLabel();
        lblSelectedRoom = new javax.swing.JLabel();
        lblAmenities = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblNights = new javax.swing.JLabel();
        tfNights = new javax.swing.JTextField();
        btnDone = new javax.swing.JButton();
        lblCost = new javax.swing.JLabel();
        btnConfirmBooking = new javax.swing.JButton();
        btnCancelBooking = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 237, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lblGuestName.setText("GUEST NAME");
        lblGuestName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(lblGuestName);
        lblGuestName.setBounds(10, 50, 320, 40);

        lblSelectedRoom.setText("SELECTED ROOM ");
        lblSelectedRoom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(lblSelectedRoom);
        lblSelectedRoom.setBounds(10, 130, 320, 40);

        lblAmenities.setText("AMENITIES");
        lblAmenities.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(lblAmenities);
        lblAmenities.setBounds(10, 210, 320, 40);

        lblPrice.setText("PRICE");
        lblPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(lblPrice);
        lblPrice.setBounds(10, 290, 320, 40);

        lblNights.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNights.setForeground(new java.awt.Color(102, 0, 255));
        lblNights.setText("NUMBER OF NIGHTS");
        jPanel1.add(lblNights);
        lblNights.setBounds(10, 350, 130, 16);

        tfNights.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        tfNights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNightsActionPerformed(evt);
            }
        });
        jPanel1.add(tfNights);
        tfNights.setBounds(10, 370, 320, 40);

        btnDone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDone.setForeground(new java.awt.Color(102, 0, 255));
        btnDone.setText("DONE");
        btnDone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        jPanel1.add(btnDone);
        btnDone.setBounds(120, 430, 80, 30);

        lblCost.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCost.setForeground(new java.awt.Color(102, 0, 255));
        lblCost.setText("TOTAL ESTIMATED COST");
        jPanel1.add(lblCost);
        lblCost.setBounds(100, 490, 150, 30);

        btnConfirmBooking.setBackground(new java.awt.Color(102, 0, 255));
        btnConfirmBooking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirmBooking.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmBooking.setText("CONFIRM");
        btnConfirmBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmBookingActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmBooking);
        btnConfirmBooking.setBounds(70, 550, 90, 30);

        btnCancelBooking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelBooking.setForeground(new java.awt.Color(102, 0, 255));
        btnCancelBooking.setText("CANCEL");
        btnCancelBooking.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        btnCancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelBookingActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelBooking);
        btnCancelBooking.setBounds(170, 550, 90, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("GUEST NAME");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 30, 80, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setText("SELECTED ROOM");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 110, 100, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 255));
        jLabel3.setText("AMENITIES");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 190, 90, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 255));
        jLabel4.setText("PRICE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 266, 90, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
        double total = room.calculatePrice(nights);

        Booking newBooking = new Booking(guest, room, nights);
        HotelData.setBooking(newBooking);

        saveToLogbook(String.format("%s - %s - %d nights - $%.2f", 
            guest.getFullName(), room.getRoomType(), nights, total));

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

    private void tfNightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNightsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNightsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelBooking;
    private javax.swing.JButton btnConfirmBooking;
    private javax.swing.JButton btnDone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAmenities;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblGuestName;
    private javax.swing.JLabel lblNights;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSelectedRoom;
    private javax.swing.JTextField tfNights;
    // End of variables declaration//GEN-END:variables
}

package hotel_management_systemprj;

public class CheckOutWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CheckOutWindow.class.getName());


    public CheckOutWindow() {
        initComponents();
        
        btnCheckOut.setEnabled(false);
        
        javax.swing.ButtonGroup paymentGroup = new javax.swing.ButtonGroup();
        paymentGroup.add(rbCash);
        paymentGroup.add(rbCredit);
        paymentGroup.add(rbDebit);
        
        double roomTotal = HotelData.getBooking().getTotalCost();
        double servicesTotal = HotelData.getServicesCost();
        double grandTotal = roomTotal + servicesTotal;

        lblTotal.setText("Grand Total: $" + grandTotal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        rbCredit = new javax.swing.JRadioButton();
        rbDebit = new javax.swing.JRadioButton();
        rbCash = new javax.swing.JRadioButton();
        lblTotal = new javax.swing.JLabel();
        btnCheckOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

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
        btnBack.setBounds(270, 20, 68, 31);

        rbCredit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbCredit.setText("CREDIT CARD");
        rbCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCreditActionPerformed(evt);
            }
        });
        jPanel1.add(rbCredit);
        rbCredit.setBounds(20, 310, 110, 21);

        rbDebit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbDebit.setText("DEBIT CARD");
        rbDebit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDebitActionPerformed(evt);
            }
        });
        jPanel1.add(rbDebit);
        rbDebit.setBounds(20, 340, 100, 21);

        rbCash.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbCash.setText("CASH");
        rbCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCashActionPerformed(evt);
            }
        });
        jPanel1.add(rbCash);
        rbCash.setBounds(20, 370, 54, 21);

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("GRAND TOTAL");
        lblTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(lblTotal);
        lblTotal.setBounds(10, 410, 330, 80);

        btnCheckOut.setBackground(new java.awt.Color(102, 0, 255));
        btnCheckOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOut.setText("CHECK OUT");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnCheckOut);
        btnCheckOut.setBounds(120, 500, 110, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("CHECK OUT");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 120, 27);

        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setText("Complete you checkout");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 150, 16);

        jLabel3.setForeground(new java.awt.Color(102, 0, 255));
        jLabel3.setText("____________________________________________________________________");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 50, 330, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 255));
        jLabel4.setText("PAYMENT METHOD");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 280, 120, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 255));
        jLabel6.setText("NIGHTS");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 90, 80, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 255));
        jLabel7.setText("CHECK-IN");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 150, 60, 16);

        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 110, 330, 30);

        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 170, 330, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 255));
        jLabel9.setText("CHECK-OUT");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 210, 70, 16);

        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 230, 330, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to check out?", "Check Out", javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) 
        {
            HotelData.setBooking(null);
            HotelData.resetServicesCost();
            javax.swing.JOptionPane.showMessageDialog(this, "Thank you for staying with us!");
            new LoginWindow().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCheckOutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rbCash;
    private javax.swing.JRadioButton rbCredit;
    private javax.swing.JRadioButton rbDebit;
    // End of variables declaration//GEN-END:variables
}

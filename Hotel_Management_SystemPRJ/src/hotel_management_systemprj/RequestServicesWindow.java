package hotel_management_systemprj;

public class RequestServicesWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RequestServicesWindow.class.getName());
    
    private double totalServicesCost = 0.0;

    public RequestServicesWindow() {
        initComponents();
        
        btnSubmit.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        cbHouseKeeping = new javax.swing.JCheckBox();
        cbRoomService = new javax.swing.JCheckBox();
        cbBeddingsTowels = new javax.swing.JCheckBox();
        cbLaundry = new javax.swing.JCheckBox();
        lblTotal = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 237, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        cbHouseKeeping.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbHouseKeeping.setText("HOUSE KEEPING");
        jPanel1.add(cbHouseKeeping);
        cbHouseKeeping.setBounds(10, 160, 130, 20);

        cbRoomService.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbRoomService.setText("ROOM SERVICE");
        jPanel1.add(cbRoomService);
        cbRoomService.setBounds(10, 210, 120, 20);

        cbBeddingsTowels.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbBeddingsTowels.setText("EXTRA BEDDINGS/TOWELS");
        cbBeddingsTowels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBeddingsTowelsActionPerformed(evt);
            }
        });
        jPanel1.add(cbBeddingsTowels);
        cbBeddingsTowels.setBounds(10, 110, 180, 20);

        cbLaundry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbLaundry.setText("LAUNDRY");
        jPanel1.add(cbLaundry);
        cbLaundry.setBounds(10, 260, 90, 20);

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotal.setText(" RUNNING TOTAL");
        lblTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 1, true));
        jPanel1.add(lblTotal);
        lblTotal.setBounds(10, 340, 340, 40);

        btnSubmit.setBackground(new java.awt.Color(102, 0, 255));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("SUBMIT REQUEST");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);
        btnSubmit.setBounds(10, 400, 140, 23);

        btnDone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDone.setForeground(new java.awt.Color(102, 0, 255));
        btnDone.setText("DONE");
        btnDone.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 255)));
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        jPanel1.add(btnDone);
        btnDone.setBounds(190, 400, 70, 23);

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 0, 255));
        btnBack.setText("BACK");
        btnBack.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 255)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(280, 400, 70, 23);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("REQUEST SERVICES");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 200, 40);

        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setText("Select the services you would like to request");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 320, 16);

        jLabel3.setForeground(new java.awt.Color(102, 0, 255));
        jLabel3.setText("_________________________________________________________________________");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 50, 365, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 255));
        jLabel4.setText("$20");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(320, 260, 30, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 255));
        jLabel5.setText("$15");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 110, 30, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 255));
        jLabel6.setText("$25");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 160, 30, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 255));
        jLabel7.setText("$35");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 210, 30, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        HotelData.addServiceCost(totalServicesCost);
        javax.swing.JOptionPane.showMessageDialog(this, "SERVICES REQUESTED SUCCESSFULLY!");
        new DashboardWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new DashboardWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        totalServicesCost = 0.0;

        if (cbHouseKeeping.isSelected()) 
        {
            totalServicesCost += 25.0;
        }
        if (cbRoomService.isSelected()) 
        {
            totalServicesCost += 35.0;
        }
        if (cbLaundry.isSelected()) 
        {
            totalServicesCost += 20.0;
        }
        if (cbBeddingsTowels.isSelected()) 
        {
            totalServicesCost += 15.0;
        }

        lblTotal.setText(" RUNNING TOTAL:                                           $" + totalServicesCost);
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_btnDoneActionPerformed

    private void cbBeddingsTowelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBeddingsTowelsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBeddingsTowelsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox cbBeddingsTowels;
    private javax.swing.JCheckBox cbHouseKeeping;
    private javax.swing.JCheckBox cbLaundry;
    private javax.swing.JCheckBox cbRoomService;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}

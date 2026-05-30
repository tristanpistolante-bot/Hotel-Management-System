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

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 237, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        cbHouseKeeping.setText("HOUSE KEEPING");
        jPanel1.add(cbHouseKeeping);
        cbHouseKeeping.setBounds(10, 180, 110, 20);

        cbRoomService.setText("ROOM SERVICE");
        jPanel1.add(cbRoomService);
        cbRoomService.setBounds(10, 210, 105, 20);

        cbBeddingsTowels.setText("EXTRA BEDDINGS/TOWELS");
        cbBeddingsTowels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBeddingsTowelsActionPerformed(evt);
            }
        });
        jPanel1.add(cbBeddingsTowels);
        cbBeddingsTowels.setBounds(10, 140, 180, 20);

        cbLaundry.setText("LAUNDRY");
        jPanel1.add(cbLaundry);
        cbLaundry.setBounds(10, 250, 76, 20);

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotal.setText("RUNNING TOTAL");
        jPanel1.add(lblTotal);
        lblTotal.setBounds(10, 340, 120, 20);

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

        btnDone.setText("DONE");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        jPanel1.add(btnDone);
        btnDone.setBounds(190, 400, 72, 23);

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(280, 400, 72, 23);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("Request Services");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 170, 40);

        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setText("Select the services you would like to request");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 240, 16);

        jLabel3.setForeground(new java.awt.Color(102, 0, 255));
        jLabel3.setText("_______________________________________________________________________");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 60, 350, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
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

        lblTotal.setText("RUNNING TOTAL: $" + totalServicesCost);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}

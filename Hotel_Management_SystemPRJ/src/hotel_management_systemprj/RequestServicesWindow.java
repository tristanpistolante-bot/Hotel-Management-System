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

        cbHouseKeeping = new javax.swing.JCheckBox();
        cbRoomService = new javax.swing.JCheckBox();
        cbBeddingsTowels = new javax.swing.JCheckBox();
        cbLaundry = new javax.swing.JCheckBox();
        lblTotal = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbHouseKeeping.setText("HOUSE KEEPING");

        cbRoomService.setText("ROOM SERVICE");

        cbBeddingsTowels.setText("EXTRA BEDDINGS/TOWELS");

        cbLaundry.setText("LAUNDRY");

        lblTotal.setText("RUNNING TOTAL");

        btnSubmit.setText("SUBMIT REQUEST");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDone.setText("DONE");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbLaundry)
                            .addComponent(cbBeddingsTowels)
                            .addComponent(cbRoomService)
                            .addComponent(cbHouseKeeping)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubmit)
                            .addComponent(lblTotal))))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDone)
                .addGap(29, 29, 29)
                .addComponent(btnBack)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cbHouseKeeping)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbRoomService)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBeddingsTowels)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbLaundry)
                .addGap(30, 30, 30)
                .addComponent(lblTotal)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDone)))
                .addGap(10, 10, 10)
                .addComponent(btnSubmit)
                .addContainerGap(43, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox cbBeddingsTowels;
    private javax.swing.JCheckBox cbHouseKeeping;
    private javax.swing.JCheckBox cbLaundry;
    private javax.swing.JCheckBox cbRoomService;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}

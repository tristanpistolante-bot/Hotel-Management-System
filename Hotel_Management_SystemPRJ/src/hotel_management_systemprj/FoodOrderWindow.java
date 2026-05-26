package hotel_management_systemprj;

public class FoodOrderWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FoodOrderWindow.class.getName());
    
    private double totalFoodCost = 0.0;
 
    public FoodOrderWindow() {
        initComponents();
        
        btnSubmit.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbBreakfast = new javax.swing.JCheckBox();
        cbLunch = new javax.swing.JCheckBox();
        cbDinner = new javax.swing.JCheckBox();
        cbSnacks = new javax.swing.JCheckBox();
        lblTotal = new javax.swing.JLabel();
        btnDone = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbBreakfast.setText("jCheckBox1");

        cbLunch.setText("jCheckBox2");

        cbDinner.setText("jCheckBox3");

        cbSnacks.setText("jCheckBox4");

        lblTotal.setText("TOTAL");

        btnDone.setText("DONE");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        btnSubmit.setText("SUBMIT ORDER");
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

        lblTitle.setText("FOOD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubmit)
                            .addComponent(cbLunch)
                            .addComponent(cbSnacks)
                            .addComponent(cbDinner))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(cbBreakfast))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblTitle)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnDone))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lblTotal)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle)
                        .addGap(11, 11, 11)
                        .addComponent(cbBreakfast))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbLunch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDinner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSnacks)
                .addGap(16, 16, 16)
                .addComponent(btnDone)
                .addGap(34, 34, 34)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        totalFoodCost = 0.0;

        if (cbBreakfast.isSelected()) 
        {
            totalFoodCost += 15.00;
        }
        if (cbLunch.isSelected()) 
        {
            totalFoodCost += 20.00;
        }
        if (cbDinner.isSelected()) 
        {
            totalFoodCost += 25.00;
        }
        if (cbSnacks.isSelected()) 
        {
            totalFoodCost += 10.00;
        }

        lblTotal.setText("Running Total: $" + totalFoodCost);
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        HotelData.addFoodCost(totalFoodCost);
        javax.swing.JOptionPane.showMessageDialog(this, "Food order submitted successfully!");
        new DashboardWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new DashboardWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox cbBreakfast;
    private javax.swing.JCheckBox cbDinner;
    private javax.swing.JCheckBox cbLunch;
    private javax.swing.JCheckBox cbSnacks;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}

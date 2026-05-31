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

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbBreakfast = new javax.swing.JCheckBox();
        cbLunch = new javax.swing.JCheckBox();
        cbDinner = new javax.swing.JCheckBox();
        cbSnacks = new javax.swing.JCheckBox();
        lblTotal = new javax.swing.JLabel();
        btnDone = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 0, 255));
        lblTitle.setText("FOOD");
        jPanel1.add(lblTitle);
        lblTitle.setBounds(10, 10, 70, 30);

        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("Order your meals");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 40, 91, 16);

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

        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setText("_________________________________________________________________________________");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 400, 16);

        cbBreakfast.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbBreakfast.setText("BREAKFAST");
        jPanel1.add(cbBreakfast);
        cbBreakfast.setBounds(20, 90, 100, 20);

        cbLunch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbLunch.setText("LUNCH");
        jPanel1.add(cbLunch);
        cbLunch.setBounds(20, 140, 70, 20);

        cbDinner.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbDinner.setText("DINNER");
        jPanel1.add(cbDinner);
        cbDinner.setBounds(20, 190, 80, 20);

        cbSnacks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbSnacks.setText("SNACKS");
        jPanel1.add(cbSnacks);
        cbSnacks.setBounds(20, 240, 69, 20);

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotal.setText("TOTAL");
        lblTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 3, true));
        jPanel1.add(lblTotal);
        lblTotal.setBounds(20, 340, 370, 40);

        btnDone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDone.setForeground(new java.awt.Color(102, 0, 255));
        btnDone.setText("DONE");
        btnDone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        jPanel1.add(btnDone);
        btnDone.setBounds(150, 290, 100, 30);

        btnSubmit.setBackground(new java.awt.Color(102, 0, 255));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("SUBMIT ORDER");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);
        btnSubmit.setBounds(130, 390, 140, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 255));
        jLabel3.setText("$15");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 90, 24, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 255));
        jLabel4.setText("$20");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(360, 140, 24, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 255));
        jLabel5.setText("$25");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(360, 190, 24, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 255));
        jLabel6.setText("$10");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 240, 24, 20);

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
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

    private void cbSnacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSnacksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSnacksActionPerformed

    private void cbBreakfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBreakfastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBreakfastActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox cbBreakfast;
    private javax.swing.JCheckBox cbDinner;
    private javax.swing.JCheckBox cbLunch;
    private javax.swing.JCheckBox cbSnacks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}

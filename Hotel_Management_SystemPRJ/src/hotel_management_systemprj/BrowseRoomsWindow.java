package hotel_management_systemprj;

public class BrowseRoomsWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BrowseRoomsWindow.class.getName());

    public BrowseRoomsWindow() {
        initComponents();
           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnChoose1 = new javax.swing.JButton();
        btnChoose2 = new javax.swing.JButton();
        btnChoose3 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnChoose1.setText("CHOOSE");
        btnChoose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoose1ActionPerformed(evt);
            }
        });

        btnChoose2.setText("CHOOSE");
        btnChoose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoose2ActionPerformed(evt);
            }
        });

        btnChoose3.setText("CHOOSE");
        btnChoose3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoose3ActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnChoose1)
                .addGap(35, 35, 35)
                .addComponent(btnChoose2)
                .addGap(31, 31, 31)
                .addComponent(btnChoose3)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChoose1)
                    .addComponent(btnChoose2)
                    .addComponent(btnChoose3))
                .addGap(109, 109, 109))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new DashboardWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnChoose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoose1ActionPerformed
        // TODO add your handling code here:
        HotelData.setCurrentRoom(new StandardRoom());
        new BookingWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnChoose1ActionPerformed

    private void btnChoose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoose2ActionPerformed
        // TODO add your handling code here:
        HotelData.setCurrentRoom(new DeluxeRoom());
        new BookingWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnChoose2ActionPerformed

    private void btnChoose3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoose3ActionPerformed
        // TODO add your handling code here:
        HotelData.setCurrentRoom(new Suite());
        new BookingWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnChoose3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChoose1;
    private javax.swing.JButton btnChoose2;
    private javax.swing.JButton btnChoose3;
    // End of variables declaration//GEN-END:variables
}

package hotel_management_systemprj;

public class WelcomeWindow extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(WelcomeWindow.class.getName());
    
    public WelcomeWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegisterOption = new javax.swing.JButton();
        btnLoginOption = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegisterOption.setText("REGISTER");
        btnRegisterOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterOptionActionPerformed(evt);
            }
        });

        btnLoginOption.setText("LOGIN");
        btnLoginOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginOptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btnRegisterOption)
                .addGap(43, 43, 43)
                .addComponent(btnLoginOption)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterOption)
                    .addComponent(btnLoginOption))
                .addGap(126, 126, 126))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterOptionActionPerformed
        // TODO add your handling code here:
        new RegisterWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterOptionActionPerformed

    private void btnLoginOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginOptionActionPerformed
        // TODO add your handling code here:
        new LoginWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginOptionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginOption;
    private javax.swing.JButton btnRegisterOption;
    // End of variables declaration//GEN-END:variables
}

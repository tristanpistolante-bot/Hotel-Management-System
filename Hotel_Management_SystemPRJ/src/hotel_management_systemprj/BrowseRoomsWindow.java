package hotel_management_systemprj;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class BrowseRoomsWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BrowseRoomsWindow.class.getName());

    public BrowseRoomsWindow() {
        initComponents();
        
        // Must be visible FIRST so label dimensions are calculated
        this.setVisible(true);
        loadAndScaleImages();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnChoose1 = new javax.swing.JButton();
        btnChoose2 = new javax.swing.JButton();
        btnChoose3 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        standardRoom = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        deluxeRoom = new javax.swing.JLabel();
        suitRoom = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 237, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnChoose1.setBackground(new java.awt.Color(102, 0, 255));
        btnChoose1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChoose1.setForeground(new java.awt.Color(255, 255, 255));
        btnChoose1.setText("CHOOSE");
        btnChoose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoose1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnChoose1);
        btnChoose1.setBounds(500, 380, 190, 30);

        btnChoose2.setBackground(new java.awt.Color(102, 0, 255));
        btnChoose2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChoose2.setForeground(new java.awt.Color(255, 255, 255));
        btnChoose2.setText("CHOOSE");
        btnChoose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoose2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnChoose2);
        btnChoose2.setBounds(260, 380, 190, 30);

        btnChoose3.setBackground(new java.awt.Color(102, 0, 255));
        btnChoose3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChoose3.setForeground(new java.awt.Color(255, 255, 255));
        btnChoose3.setText("CHOOSE");
        btnChoose3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoose3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnChoose3);
        btnChoose3.setBounds(20, 380, 190, 30);

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
        btnBack.setBounds(630, 30, 70, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("Choose a Room");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 150, 30);

        standardRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/standard images_1.png"))); // NOI18N
        standardRoom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(standardRoom);
        standardRoom.setBounds(10, 100, 210, 180);

        jLabel3.setForeground(new java.awt.Color(102, 0, 255));
        jLabel3.setText("Select your preffered room");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 50, 150, 16);

        jLabel4.setForeground(new java.awt.Color(102, 0, 255));
        jLabel4.setText("________________________________________________________________________________________________________________________________________________");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 50, 700, 40);

        deluxeRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deluxe room.jpg"))); // NOI18N
        deluxeRoom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(deluxeRoom);
        deluxeRoom.setBounds(250, 100, 210, 180);

        suitRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/suite room.jpg"))); // NOI18N
        suitRoom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(suitRoom);
        suitRoom.setBounds(490, 100, 210, 180);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html><body style=\"font-family: Segoe UI; text-align: center;\"><div style=\"font-size: 14px; font-weight: bold; color: #6600FF;\">Standard Room</div><div style=\"font-size: 10px; color: #6B7280;\">Cozy room with 1-2 beds, Mini Fridge</div><div style=\"font-size: 16px; font-weight: bold; color: #6600FF; margin-top: 8px;\">$99<span style=\"font-size: 10px; color: #6B7280;\">/night</span></div></body></html>");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 280, 210, 140);

        jLabel5.setText("<html><body style=\"font-family: Segoe UI; text-align: center;\"><div style=\"font-size: 14px; font-weight: bold; color: #6600FF;\">Deluxe Room</div><div style=\"font-size: 10px; color: #6B7280;\">King Size Bed, Smart TV, Mini Bar, City View</div><div style=\"font-size: 16px; font-weight: bold; color: #6600FF; margin-top: 8px;\">$149<span style=\"font-size: 10px; color: #6B7280;\">/night</span></div></body></html>");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 280, 210, 140);

        jLabel6.setText("<html><body style=\"font-family: Segoe UI; text-align: center;\"><div style=\"font-size: 14px; font-weight: bold; color: #6600FF;\">Suite</div><div style=\"font-size: 10px; color: #6B7280;\">King Bed, Separate Living Room, WiFi, Smart TV, Ocean View</div><div style=\"font-size: 16px; font-weight: bold; color: #6600FF; margin-top: 8px;\">$249<span style=\"font-size: 10px; color: #6B7280;\">/night</span></div></body></html>");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 255), 2, true));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(490, 280, 210, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
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

private void loadAndScaleImages() {
    Object[][] rooms = {
        {"/images/standard images_1.png", standardRoom},
        {"/images/deluxe room.jpg", deluxeRoom},
        {"/images/suite room.jpg", suitRoom}
    };

    for (Object[] room : rooms) {
        String path = (String) room[0];
        javax.swing.JLabel label = (javax.swing.JLabel) room[1];

        try {
            java.net.URL url = getClass().getResource(path);
            if (url == null) {
                logger.warning("Resource not found: " + path);
                continue;
            }

            java.awt.image.BufferedImage img = javax.imageio.ImageIO.read(url);

            // Same logic as your other project
            int w = label.getWidth() == 0 ? 210 : label.getWidth();
            int h = label.getHeight() == 0 ? 180 : label.getHeight();

            java.awt.Image dimg = img.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
            label.setIcon(new javax.swing.ImageIcon(dimg));

        } catch (java.io.IOException e) {
            logger.warning("Error loading image: " + path);
        }
    }
}
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChoose1;
    private javax.swing.JButton btnChoose2;
    private javax.swing.JButton btnChoose3;
    private javax.swing.JLabel deluxeRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel standardRoom;
    private javax.swing.JLabel suitRoom;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek;

/**
 *
 * @author LENOVO
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    public menu() {
        initComponents();
        //agar form ditengah layar
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        pilihan = new javax.swing.JPanel();
        myDemri = new javax.swing.JLabel();
        tulisanDiBawahMyDemri = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        isiNama = new javax.swing.JTextField();
        isiPass = new javax.swing.JPasswordField();
        tekanLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pilihan.setBackground(new java.awt.Color(36, 69, 90));

        myDemri.setFont(new java.awt.Font("Bebas Neue", 1, 40)); // NOI18N
        myDemri.setForeground(new java.awt.Color(255, 255, 255));
        myDemri.setText("My Demri");

        tulisanDiBawahMyDemri.setBackground(new java.awt.Color(255, 255, 255));
        tulisanDiBawahMyDemri.setFont(new java.awt.Font("Futura Bk BT", 1, 16)); // NOI18N
        tulisanDiBawahMyDemri.setForeground(new java.awt.Color(255, 255, 255));
        tulisanDiBawahMyDemri.setText("Program Pemesanan Tiket Bus Demri");

        javax.swing.GroupLayout pilihanLayout = new javax.swing.GroupLayout(pilihan);
        pilihan.setLayout(pilihanLayout);
        pilihanLayout.setHorizontalGroup(
            pilihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pilihanLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(pilihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pilihanLayout.createSequentialGroup()
                        .addComponent(myDemri)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pilihanLayout.createSequentialGroup()
                        .addComponent(tulisanDiBawahMyDemri)
                        .addGap(97, 97, 97))))
        );
        pilihanLayout.setVerticalGroup(
            pilihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pilihanLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(myDemri, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tulisanDiBawahMyDemri)
                .addGap(14, 14, 14))
        );

        panelLogin.add(pilihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 90));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        username.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        username.setText("Username   :");

        password.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        password.setText("Password    :");

        isiPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiPassActionPerformed(evt);
            }
        });

        tekanLogin.setBackground(new java.awt.Color(36, 69, 90));
        tekanLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tekanLogin.setForeground(new java.awt.Color(255, 255, 255));
        tekanLogin.setText("Login");
        tekanLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tekanLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tekanLogin)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isiNama, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isiPass, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isiNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isiPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(tekanLogin)
                .addGap(24, 24, 24))
        );

        panelLogin.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tekanLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tekanLoginActionPerformed
        String username = "dimasbagussaputra";
        String password = "H1051191020";
        if(username.equalsIgnoreCase(isiNama.getText()) && password.equalsIgnoreCase(isiPass.getText())) {
            this.setVisible(false);
            new menuUtama().setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Maaf Username dan Password yang Anda Masukkan Salah!!");
            isiNama.setText("");
            isiPass.setText("");
            isiNama.requestFocus();
        }
    }//GEN-LAST:event_tekanLoginActionPerformed

    private void isiPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiPassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField isiNama;
    private javax.swing.JPasswordField isiPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel myDemri;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JLabel password;
    private javax.swing.JPanel pilihan;
    private javax.swing.JButton tekanLogin;
    private javax.swing.JLabel tulisanDiBawahMyDemri;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}

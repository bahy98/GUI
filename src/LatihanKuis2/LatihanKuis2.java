/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanKuis2;

/**
 *
 * @author crowl
 */
public class LatihanKuis2 extends javax.swing.JFrame {

    /**
     * Creates new form LatihanKuis2
     */
    public LatihanKuis2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hb3 = new javax.swing.JTextField();
        hb1 = new javax.swing.JTextField();
        hb2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Hb4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Hbdiskon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        TA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(Hb3);
        Hb3.setBounds(190, 80, 120, 20);
        getContentPane().add(hb1);
        hb1.setBounds(190, 20, 120, 20);
        getContentPane().add(hb2);
        hb2.setBounds(190, 50, 120, 20);

        jLabel4.setText("Harga barang 1");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 20, 75, 14);
        getContentPane().add(Hb4);
        Hb4.setBounds(190, 110, 120, 20);

        jLabel5.setText("Diskon");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 40, 14);
        getContentPane().add(Hbdiskon);
        Hbdiskon.setBounds(190, 140, 120, 20);

        jLabel6.setText("Harga barang 4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 110, 75, 14);

        jLabel7.setText("Harga barang 3");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 80, 75, 14);

        jLabel8.setText("Harga barang 2");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 50, 75, 14);

        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 190, 63, 23);

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 190, 65, 23);

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(130, 190, 63, 23);
        getContentPane().add(TA);
        TA.setBounds(30, 240, 280, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String harga_barang_1 = hb1.getText();
        String harga_barang_2 = hb2.getText();
        String harga_barang_3 = Hb3.getText();
        String harga_barang_4 = Hb4.getText();
        String diskon = Hbdiskon.getText();

        TA.setText("Harga Barang 1 : " +harga_barang_1+
            "\nHarga Barang 2  : "+harga_barang_2+
            "\nHarga Barang 3 : "+harga_barang_3+
            "\nHarga Barang 4 : "+harga_barang_4+
            "\nDiskon : "+diskon);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TA.setText("");
        hb1.setText("");
        hb2.setText("");
        Hb3.setText("");
        Hb4.setText("");
        Hbdiskon.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(LatihanKuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LatihanKuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LatihanKuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LatihanKuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LatihanKuis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hb3;
    private javax.swing.JTextField Hb4;
    private javax.swing.JTextField Hbdiskon;
    private javax.swing.JTextField TA;
    private javax.swing.JTextField hb1;
    private javax.swing.JTextField hb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}

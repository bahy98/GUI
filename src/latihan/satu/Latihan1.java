/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.satu;

/**
 *
 * @author crowl
 */
public class Latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan1
     */
    public Latihan1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Kelas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Alamat2 = new javax.swing.JTextField();
        Nama1 = new javax.swing.JTextField();
        Kelas1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Alamat");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 80, 33, 14);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 27, 14);

        jLabel3.setText("Kelas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 50, 25, 14);
        getContentPane().add(Alamat);
        Alamat.setBounds(120, 80, 220, 20);
        getContentPane().add(Nama);
        Nama.setBounds(120, 20, 220, 20);
        getContentPane().add(Kelas);
        Kelas.setBounds(120, 50, 220, 20);

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 120, 65, 23);

        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 220, 33, 14);

        jLabel5.setText("Nama");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 160, 27, 14);

        jLabel6.setText("Kelas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 190, 25, 14);
        getContentPane().add(Alamat2);
        Alamat2.setBounds(120, 220, 220, 20);
        getContentPane().add(Nama1);
        Nama1.setBounds(120, 160, 220, 20);
        getContentPane().add(Kelas1);
        Kelas1.setBounds(120, 190, 220, 20);

        setBounds(0, 0, 392, 354);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nama = Nama.getText();
        Nama1.setText(nama);
        String kelas = Kelas.getText();
        Kelas1.setText(kelas);
        String alamat = Alamat.getText();
        Alamat2.setText(alamat);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Alamat2;
    private javax.swing.JTextField Kelas;
    private javax.swing.JTextField Kelas1;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nama1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1Biodata;

/**
 *
 * @author crowl
 */
public class Latihan1Biodata extends javax.swing.JFrame {

    /**
     * Creates new form Latihan1Biodata
     */
    public Latihan1Biodata() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Absen = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox<>();
        rdb2 = new javax.swing.JRadioButton();
        rdb1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Jurusan");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 170, 50, 14);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 40, 27, 14);
        getContentPane().add(Absen);
        Absen.setBounds(140, 80, 170, 20);
        getContentPane().add(Nama);
        Nama.setBounds(140, 40, 170, 20);

        jLabel3.setText("Absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 30, 14);

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XI RPL 1", "XI RPL 2", "XI PRL 3", "XI PRL 4", "XI RPL 5", "XI RPL 6", "XI TKJ 1", "XI TKJ 2", "XI TKJ 3", "XI TKJ 4", "XI TKJ 5", "XI TKJ 6" }));
        getContentPane().add(ComboBox);
        ComboBox.setBounds(140, 130, 65, 20);

        rdb2.setText("TKJ");
        getContentPane().add(rdb2);
        rdb2.setBounds(210, 170, 50, 23);

        rdb1.setText("RPL");
        getContentPane().add(rdb1);
        rdb1.setBounds(140, 170, 50, 23);

        jLabel4.setText("Kelas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 130, 34, 14);
        getContentPane().add(Alamat);
        Alamat.setBounds(140, 210, 170, 20);

        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 210, 40, 14);

        jButton1.setText("SEND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 260, 60, 23);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 260, 55, 23);

        setBounds(0, 0, 416, 407);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        String absen = Absen.getText();
        String kelas = ComboBox.getSelectedItem().toString();
        String jurusan = "";
        String alamat = Alamat.getText();
        
        if(rdb1.isSelected())
            jurusan ="RPL";
        else if(rdb2.isSelected())
            jurusan ="TKJ";
        else
            
        if (ComboBox.getSelectedItem()== "XI RPL 1"){}
        if (ComboBox.getSelectedItem()== "XI RPL 2"){}
        if (ComboBox.getSelectedItem()== "XI RPL 3"){}
        if (ComboBox.getSelectedItem()== "XI RPL 4"){}
        if (ComboBox.getSelectedItem()== "XI RPL 5"){}
        if (ComboBox.getSelectedItem()== "XI RPL 6"){}
        if (ComboBox.getSelectedItem()== "XI TKJ 1"){}
        if (ComboBox.getSelectedItem()== "XI TKJ 2"){}
        if (ComboBox.getSelectedItem()== "XI TKJ 3"){}
        if (ComboBox.getSelectedItem()== "XI TKJ 4"){}
        if (ComboBox.getSelectedItem()== "XI TKJ 5"){}
        if (ComboBox.getSelectedItem()== "XI TKJ 6"){}
        
        new frame1(nama, absen, kelas, jurusan, alamat);
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
            java.util.logging.Logger.getLogger(Latihan1Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan1Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan1Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan1Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan1Biodata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextField Alamat;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTextField Nama;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    // End of variables declaration//GEN-END:variables

    private static class frame1 {

        public frame1(String nama, String absen, String kelas, String jurusan, String alamat) {
            System.out.print("");
        }
    }
}

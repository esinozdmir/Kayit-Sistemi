/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author 90507
 */
public class kullanici_secim_ekrani extends javax.swing.JFrame {

    /**
     * Creates new form kullanici_secim_ekrani
     */
    public kullanici_secim_ekrani() {
        initComponents();
        this.setLocationRelativeTo(null);
        kullanici_secim_ekrani_panel.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kullanici_secim_ekrani_panel = new javax.swing.JPanel();
        kullanici_secim_ekrani_label = new javax.swing.JLabel();
        yonetici_giris_buton = new javax.swing.JButton();
        ogretmen_giris_buton = new javax.swing.JButton();
        ogrenci_giris_buton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kullanici_secim_ekrani_panel.setBackground(new java.awt.Color(255, 255, 204));
        kullanici_secim_ekrani_panel.setForeground(new java.awt.Color(255, 255, 255));
        kullanici_secim_ekrani_panel.setToolTipText("");

        kullanici_secim_ekrani_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kullanici_secim_ekrani_label.setText("Kullanici Secim Ekrani");

        yonetici_giris_buton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yonetici_giris_buton.setText("Yonetici Giris");
        yonetici_giris_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yonetici_giris_butonActionPerformed(evt);
            }
        });

        ogretmen_giris_buton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ogretmen_giris_buton.setText("Ogretmen Giris");
        ogretmen_giris_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogretmen_giris_butonActionPerformed(evt);
            }
        });

        ogrenci_giris_buton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ogrenci_giris_buton.setText("Ogrenci Giris");
        ogrenci_giris_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenci_giris_butonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kullanici_secim_ekrani_panelLayout = new javax.swing.GroupLayout(kullanici_secim_ekrani_panel);
        kullanici_secim_ekrani_panel.setLayout(kullanici_secim_ekrani_panelLayout);
        kullanici_secim_ekrani_panelLayout.setHorizontalGroup(
            kullanici_secim_ekrani_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kullanici_secim_ekrani_panelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(yonetici_giris_buton)
                .addGap(29, 29, 29)
                .addComponent(ogretmen_giris_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(ogrenci_giris_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kullanici_secim_ekrani_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kullanici_secim_ekrani_label, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        kullanici_secim_ekrani_panelLayout.setVerticalGroup(
            kullanici_secim_ekrani_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kullanici_secim_ekrani_panelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(kullanici_secim_ekrani_label, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(kullanici_secim_ekrani_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yonetici_giris_buton, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(ogretmen_giris_buton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ogrenci_giris_buton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kullanici_secim_ekrani_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kullanici_secim_ekrani_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yonetici_giris_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yonetici_giris_butonActionPerformed
        this.setVisible(false);
        new yonetici_giris_ekrani().setVisible(true);


    }//GEN-LAST:event_yonetici_giris_butonActionPerformed

    private void ogretmen_giris_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogretmen_giris_butonActionPerformed
        this.setVisible(false);
        new ogretmen_giris_ekrani().setVisible(true);
    }//GEN-LAST:event_ogretmen_giris_butonActionPerformed

    private void ogrenci_giris_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenci_giris_butonActionPerformed

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // JDBC sürücüsünü yükleme
            Class.forName("org.postgresql.Driver");

            // Veritabanına bağlanma
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/esin", "postgres", "12345");

            String sql = "SELECT sisteme_bas_tarih, sisteme_bit_tarih FROM yonetici";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();          
            if (resultSet.next()) {
                
                Timestamp sistemeBasTarih = resultSet.getTimestamp("sisteme_bas_tarih");
                Timestamp sistemeBitTarih = resultSet.getTimestamp("sisteme_bit_tarih");
 System.out.println(sistemeBasTarih);
                // Şu anki tarih/saat bilgisini al
                Timestamp now = new Timestamp(System.currentTimeMillis());

                // Tarih/saat karşılaştırması yap
                if (sistemeBasTarih.after(now)) {
                    System.out.println("Sisteme başlama tarihi ileride bir zamanı gösteriyor.");
                } else if (sistemeBitTarih.before(now)) {
                    System.out.println("Sisteme bitiş tarihi geçmiş bir zamanı gösteriyor.");
                } else {
                    System.out.println("Sistem şu an aktif durumda.");
                }
            } else {
                System.out.println("Belirtilen şartlara uyan kayıt bulunamadı.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Kullanılan kaynakları kapat
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        this.setVisible(false);
        new ogrenci_giris_ekrani().setVisible(true);
    }//GEN-LAST:event_ogrenci_giris_butonActionPerformed

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
            java.util.logging.Logger.getLogger(kullanici_secim_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kullanici_secim_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kullanici_secim_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kullanici_secim_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanici_secim_ekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel kullanici_secim_ekrani_label;
    private javax.swing.JPanel kullanici_secim_ekrani_panel;
    private javax.swing.JButton ogrenci_giris_buton;
    private javax.swing.JButton ogretmen_giris_buton;
    private javax.swing.JButton yonetici_giris_buton;
    // End of variables declaration//GEN-END:variables
}

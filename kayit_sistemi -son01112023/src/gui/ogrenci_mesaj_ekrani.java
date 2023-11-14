/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 90507
 */
public class ogrenci_mesaj_ekrani extends javax.swing.JFrame {
    
    private static String kullaniciSicili;
    private static int yonetici_ogrenci_talep_sayisi;
    
    public ogrenci_mesaj_ekrani(String kullaniciSicili, int yonetici_ogrenci_talep_sayisi) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setKullaniciSicili(kullaniciSicili);
        this.setYonetici_talep(yonetici_ogrenci_talep_sayisi);
    }
    
    public static void setKullaniciSicili(String newData) {
        kullaniciSicili = newData;
    }
    
    public static void setYonetici_talep(int newData) {
        yonetici_ogrenci_talep_sayisi = newData;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ogrenci_mesaj_kutumu_yenile_buton = new javax.swing.JButton();
        ogrenci_gelen_kutusu_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ogrenci_giden_kutusu_table = new javax.swing.JTable();
        ogrenci_giden_kutusu_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ogrenci_mesaj_TextArea = new javax.swing.JTextArea();
        ogrenci_mesaj_gonder_buton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ogrenci_gelen_kutusu_table = new javax.swing.JTable();
        ogretmen_id_getir_combobox = new javax.swing.JComboBox<>();
        alici_secme_buton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ogretmen_listesi_table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        gonderilicek_ogretmen_sicili_label = new javax.swing.JLabel();
        ana_sayfa = new javax.swing.JButton();
        bir_onceki_sayfa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        ogrenci_mesaj_kutumu_yenile_buton.setText("Mesaj Kutumu Yenile");
        ogrenci_mesaj_kutumu_yenile_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenci_mesaj_kutumu_yenile_butonActionPerformed(evt);
            }
        });

        ogrenci_gelen_kutusu_label.setText("Gelen Kutusu");

        ogrenci_giden_kutusu_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Gonderen Id", "Alıcı Id", "Mesaj", "Tarih"
            }
        ));
        jScrollPane2.setViewportView(ogrenci_giden_kutusu_table);

        ogrenci_giden_kutusu_label.setText("Giden Kutusu");

        jLabel4.setText("Mesaj :");

        ogrenci_mesaj_TextArea.setColumns(20);
        ogrenci_mesaj_TextArea.setRows(5);
        jScrollPane3.setViewportView(ogrenci_mesaj_TextArea);

        ogrenci_mesaj_gonder_buton.setText("Mesajı Gonder");
        ogrenci_mesaj_gonder_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenci_mesaj_gonder_butonActionPerformed(evt);
            }
        });

        ogrenci_gelen_kutusu_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Gonderen Id", "Alıcı Id", "Mesaj", "Tarih"
            }
        ));
        jScrollPane4.setViewportView(ogrenci_gelen_kutusu_table);

        ogretmen_id_getir_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogretmen_id_getir_comboboxActionPerformed(evt);
            }
        });

        alici_secme_buton.setText("Ögretmen Listesini Getir");
        alici_secme_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alici_secme_butonActionPerformed(evt);
            }
        });

        ogretmen_listesi_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ögretmen sicil numarası", "Ögretmen adı", "Ögretmen soyadı"
            }
        ));
        jScrollPane1.setViewportView(ogretmen_listesi_table);

        jLabel3.setText("Öğretmen Listesi");

        gonderilicek_ogretmen_sicili_label.setText("Gönderilecek Ögretmen Sicili");
        gonderilicek_ogretmen_sicili_label.setToolTipText("");

        ana_sayfa.setText("Ana Sayfa");
        ana_sayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ana_sayfaActionPerformed(evt);
            }
        });

        bir_onceki_sayfa.setText("Bir Önceki sayfa");
        bir_onceki_sayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bir_onceki_sayfaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ogrenci_gelen_kutusu_label, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(325, 325, 325)
                        .addComponent(ogrenci_giden_kutusu_label, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(ogrenci_mesaj_gonder_buton))
                                    .addComponent(alici_secme_buton)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(gonderilicek_ogretmen_sicili_label, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ogretmen_id_getir_combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ana_sayfa)
                                .addGap(18, 18, 18)
                                .addComponent(bir_onceki_sayfa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ogrenci_mesaj_kutumu_yenile_buton)))
                        .addGap(68, 68, 68))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrenci_mesaj_kutumu_yenile_buton)
                    .addComponent(ana_sayfa)
                    .addComponent(bir_onceki_sayfa))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrenci_gelen_kutusu_label)
                    .addComponent(ogrenci_giden_kutusu_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alici_secme_buton)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gonderilicek_ogretmen_sicili_label)
                            .addComponent(ogretmen_id_getir_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(ogrenci_mesaj_gonder_buton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ogrenci_mesaj_kutumu_yenile_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenci_mesaj_kutumu_yenile_butonActionPerformed
        
        try {

            // JDBC sürücüsünü yükleme
            Class.forName("org.postgresql.Driver");

            // Veritabanına bağlanma
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/esin", "postgres", "12345");

            // SQL sorgusu
            String sqlAldıgıMesajlar = " SELECT DISTINCT mesaj.gonderen_id, mesaj.alıcı_id, mesaj.mesaj_icerigi, mesaj.mesaj_tarihi FROM ogrenci INNER JOIN mesaj ON ogrenci.ogrenci_sicil_num = mesaj.alıcı_id WHERE ogrenci.ogrenci_sicil_num = ?";

            // PreparedStatement oluşturma
            PreparedStatement preparedStatement = connection.prepareStatement(sqlAldıgıMesajlar);
            preparedStatement.setInt(1, Integer.parseInt(kullaniciSicili));

            // Sorguyu çalıştırma ve sonucu alma
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData rowdata = (ResultSetMetaData) resultSet.getMetaData();
            int j = 0;
            int i = 0;
            int say = 1;
            int col = rowdata.getColumnCount();
            int k = rowdata.getColumnCount();
            String[] kolon = new String[k];
            for (j = 0; j < k; j++) {
                kolon[j] = rowdata.getColumnName(j + 1);
            }
            ogrenci_gelen_kutusu_table.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{}));
            DefaultTableModel model = (DefaultTableModel) ogrenci_gelen_kutusu_table.getModel();
            model.setColumnIdentifiers(kolon);

            // Sonuçları kontrol etme
            while (resultSet.next()) {
                Object[] o1 = new Object[k];
                for (j = 0; j < k; j++) {
                    o1[j] = resultSet.getObject(j + 1);
                }
                model.addRow(o1);
                ogrenci_gelen_kutusu_table.setModel(model);
                System.out.println("Mesajlar geldi");

                //gretmen_giris_ekrani.setData(sql);
                //this.setVisible(false);
                //new ogretmen_panel(kullaniciSicili).setVisible(true);
            }
            
            String sqlGonderdigiMesajlar = " SELECT DISTINCT mesaj.gonderen_id, mesaj.alıcı_id, mesaj.mesaj_icerigi , mesaj.mesaj_tarihi FROM ogrenci INNER JOIN mesaj ON ogrenci.ogrenci_sicil_num = mesaj.gonderen_id WHERE ogrenci.ogrenci_sicil_num = ? ";

            // PreparedStatement oluşturma
            PreparedStatement preparedStatement2 = connection.prepareStatement(sqlGonderdigiMesajlar);
            preparedStatement2.setInt(1, Integer.parseInt(kullaniciSicili));

            // Sorguyu çalıştırma ve sonucu alma
            ResultSet resultSet2 = preparedStatement2.executeQuery();
            ResultSetMetaData rowdata1 = (ResultSetMetaData) resultSet2.getMetaData();
            int j1 = 0;
            int i1 = 0;
            int say1 = 1;
            int col1 = rowdata1.getColumnCount();
            int k1 = rowdata1.getColumnCount();
            String[] kolon1 = new String[k1];
            for (j1 = 0; j1 < k1; j1++) {
                kolon1[j1] = rowdata1.getColumnName(j1 + 1);
            }
            ogrenci_giden_kutusu_table.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{}));
            DefaultTableModel model1 = (DefaultTableModel) ogrenci_giden_kutusu_table.getModel();
            model1.setColumnIdentifiers(kolon1);

            // Sonuçları kontrol etme
            while (resultSet2.next()) {
                Object[] o1 = new Object[k1];
                for (j = 0; j < k1; j++) {
                    o1[j] = resultSet2.getObject(j + 1);
                }
                model1.addRow(o1);
                ogrenci_giden_kutusu_table.setModel(model1);
                System.out.println("Mesajlar geldi");

                //gretmen_giris_ekrani.setData(sql);
                //this.setVisible(false);
                //new ogretmen_panel(kullaniciSicili).setVisible(true);
            }
            
            JOptionPane.showMessageDialog(null, "Mesajlar yenilendi", "Bilgi Mesajı", JOptionPane.INFORMATION_MESSAGE);

            // Bağlantıyı kapatma
            connection.close();
        } catch (NumberFormatException e) {
            System.out.println("Geçersiz şifre formatı: " + e.getMessage());
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Veritabanı hatası: " + e.getMessage());
        }

    }//GEN-LAST:event_ogrenci_mesaj_kutumu_yenile_butonActionPerformed

    private void ogrenci_mesaj_gonder_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenci_mesaj_gonder_butonActionPerformed
        
        try {
            // Şifreyi integer olarak parse etme

            // JDBC sürücüsünü yükleme
            Class.forName("org.postgresql.Driver");

            // Veritabanına bağlanma
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/esin", "postgres", "12345");
            
            String mesaj = ogrenci_mesaj_TextArea.getText();
            String secilenID = (String) ogretmen_id_getir_combobox.getSelectedItem(); // Örnek olarak JComboBox'tan seçili öğrenci ID'sini alıyoruz
            String gonderenID = kullaniciSicili;

            //System.out.println("mesaj****   " + mesaj);
            //System.out.println("secilenID***  " + secilenID);
            //System.out.println("gonderenID ***" + gonderenID);
            int secilenInt = Integer.parseInt(secilenID);
            int gonderenInt = Integer.parseInt(gonderenID);
            
            String sqlmesaj_size = " SELECT yonetici_mesaj_size FROM yonetici";
            PreparedStatement preparedStatement11 = connection.prepareStatement(sqlmesaj_size);
            ResultSet resultSet = preparedStatement11.executeQuery();
            int mesajSize = 0;
            if (resultSet.next()) {
                mesajSize = resultSet.getInt("yonetici_mesaj_size");
                
            } else {
                System.out.println("Veri bulunamadı.");
            }
            
            if (mesaj.length() > mesajSize) {
                JOptionPane.showMessageDialog(null, " Yöneticinin belirlediği mesaj karakteri aştınız . Mesaj karakteri " + mesajSize + " olmalıdır. ", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Date sistemTarihi = new Date();
                java.sql.Date sqlTarih = new java.sql.Date(sistemTarihi.getTime());
                // Veritabanına ekleme işlemi
                String sql = "INSERT INTO mesaj (alıcı_id, mesaj_icerigi,gonderen_id, mesaj_tarihi) VALUES (?, ?, ? ,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, secilenInt);
                preparedStatement.setString(2, mesaj);
                preparedStatement.setInt(3, gonderenInt);
                preparedStatement.setDate(4, sqlTarih);
                preparedStatement.executeUpdate();
                ogrenci_mesaj_TextArea.setText("");
                 ogretmen_id_getir_combobox.removeAllItems();
                // Kullanıcıya başarılı mesaj gösterme
                JOptionPane.showMessageDialog(null, "Mesaj gönderildi!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
            }
            // Bağlantıyı kapatma
            connection.close();
            
        } catch (NumberFormatException e) {
            System.out.println("Geçersiz şifre formatı: " + e.getMessage());
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Veritabanı hatası: " + e.getMessage());
        }
        
        ogrenci_mesaj_kutumu_yenile_butonActionPerformed(evt);
    }//GEN-LAST:event_ogrenci_mesaj_gonder_butonActionPerformed

    private void ogretmen_id_getir_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogretmen_id_getir_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ogretmen_id_getir_comboboxActionPerformed

    private void alici_secme_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alici_secme_butonActionPerformed
        // TODO add your handling code here:
        ogretmen_listesi_table.setVisible(true);
        try {
            // Şifreyi integer olarak parse etme

            // JDBC sürücüsünü yükleme
            Class.forName("org.postgresql.Driver");

            // Veritabanına bağlanma
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/esin", "postgres", "12345");

            // SQL sorgusu
            try {
                String ogretmen_id_getir = "SELECT DISTINCT ogretmen_sicil_no FROM ogretmen";
                PreparedStatement preparedStatement = connection.prepareStatement(ogretmen_id_getir);
                ResultSet resultSet = preparedStatement.executeQuery();

                // JComboBox'ı temizle
                ogretmen_id_getir_combobox.removeAllItems();

                // ResultSet'tan verileri çekip JComboBox'a ekleyin
                while (resultSet.next()) {
                    ogretmen_id_getir_combobox.addItem(resultSet.getString("ogretmen_sicil_no"));
                }

                // ResultSet ve preparedStatement'ı kapatmayı unutmayın
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
                
            }
            try {
                String sqlAldıgıOgrenciListesi = " SELECT DISTINCT ogretmen_sicil_no, ogretmen_adi, ogretmen_soyadi FROM ogretmen order by ogretmen_sicil_no asc";
                PreparedStatement preparedStatement = connection.prepareStatement(sqlAldıgıOgrenciListesi);

                // Sorguyu çalıştırma ve sonucu alma
                ResultSet resultSet = preparedStatement.executeQuery();
                
                ResultSetMetaData rowdata = (ResultSetMetaData) resultSet.getMetaData();
                int j = 0;
                int i = 0;
                int say = 1;
                int col = rowdata.getColumnCount();
                int k = rowdata.getColumnCount();
                String[] kolon = new String[k];
                for (j = 0; j < k; j++) {
                    kolon[j] = rowdata.getColumnName(j + 1);
                }
                ogretmen_listesi_table.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{}));
                DefaultTableModel model = (DefaultTableModel) ogretmen_listesi_table.getModel();
                model.setColumnIdentifiers(kolon);

                // Sonuçları kontrol etme
                while (resultSet.next()) {
                    Object[] o = new Object[k];
                    for (j = 0; j < k; j++) {
                        o[j] = resultSet.getObject(j + 1);
                    }
                    model.addRow(o);
                    ogretmen_listesi_table.setModel(model);
                }
            } catch (SQLException e) {
                
            }
            // PreparedStatement oluşturma

            // Bağlantıyı kapatma
            connection.close();
        } catch (NumberFormatException e) {
            System.out.println("Geçersiz şifre formatı: " + e.getMessage());
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Veritabanı hatası: " + e.getMessage());
        }
    }//GEN-LAST:event_alici_secme_butonActionPerformed

    private void ana_sayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ana_sayfaActionPerformed
        String message = "Ana sayfaya yonlendiriliyorsunuz.";
        JOptionPane.showMessageDialog(null, message, "Bilgi Mesajı", JOptionPane.INFORMATION_MESSAGE);
        
        this.setVisible(false);
        new kullanici_secim_ekrani().setVisible(true);
    }//GEN-LAST:event_ana_sayfaActionPerformed

    private void bir_onceki_sayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bir_onceki_sayfaActionPerformed
        String message = "Bir önceki sayfaya yonlendiriliyorsunuz.";
        JOptionPane.showMessageDialog(null, message, "Bilgi Mesajı", JOptionPane.INFORMATION_MESSAGE);
        
        this.setVisible(false);
        new ogrenci_panel(kullaniciSicili, yonetici_ogrenci_talep_sayisi).setVisible(true);
    }//GEN-LAST:event_bir_onceki_sayfaActionPerformed

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
            java.util.logging.Logger.getLogger(ogrenci_mesaj_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ogrenci_mesaj_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ogrenci_mesaj_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ogrenci_mesaj_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alici_secme_buton;
    private javax.swing.JButton ana_sayfa;
    private javax.swing.JButton bir_onceki_sayfa;
    private javax.swing.JLabel gonderilicek_ogretmen_sicili_label;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel ogrenci_gelen_kutusu_label;
    private javax.swing.JTable ogrenci_gelen_kutusu_table;
    private javax.swing.JLabel ogrenci_giden_kutusu_label;
    private javax.swing.JTable ogrenci_giden_kutusu_table;
    private javax.swing.JTextArea ogrenci_mesaj_TextArea;
    private javax.swing.JButton ogrenci_mesaj_gonder_buton;
    private javax.swing.JButton ogrenci_mesaj_kutumu_yenile_buton;
    private javax.swing.JComboBox<String> ogretmen_id_getir_combobox;
    private javax.swing.JTable ogretmen_listesi_table;
    // End of variables declaration//GEN-END:variables
}

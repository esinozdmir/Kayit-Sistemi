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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 90507
 */
public class yonetici_ogrenci_atama_ekrani extends javax.swing.JFrame {

    /**
     * Creates new form yonetici_ogrenci_atama_ekranı
     */
    public yonetici_ogrenci_atama_ekrani() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        not_ort_gore_ata_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        agno_gore_ogr_table = new javax.swing.JTable();
        agno_gore_ogr_listesi_buton = new javax.swing.JButton();
        atanacakOgretmenGetir_buton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ogretmen_table = new javax.swing.JTable();
        belirli_derslere_gore_ata = new javax.swing.JButton();
        ana_sayfa3 = new javax.swing.JButton();
        bir_onceki_sayfa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setText("Atanmamış derslere rastgele ögretmen ata");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        not_ort_gore_ata_Button.setText("Seçili ögretmene atama yap");
        not_ort_gore_ata_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                not_ort_gore_ata_ButtonActionPerformed(evt);
            }
        });

        agno_gore_ogr_table.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
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
                "Ögrenci sicili", "Ögrenci ders Kodu", "Agno"
            }
        ));
        jScrollPane1.setViewportView(agno_gore_ogr_table);

        agno_gore_ogr_listesi_buton.setText("Agno ya göre ögrenci atamak için ögrencileri getir");
        agno_gore_ogr_listesi_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agno_gore_ogr_listesi_butonActionPerformed(evt);
            }
        });

        atanacakOgretmenGetir_buton.setText("Seçili olan ögrenciye atanabiliecek ögretmenleri getir");
        atanacakOgretmenGetir_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atanacakOgretmenGetir_butonActionPerformed(evt);
            }
        });

        ogretmen_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ogretmen Adı", "Ogretmen Soyadı", "Ogretmen Sicili", "Ogretmen Ders Kodu", "Ögretmen Kontenjan"
            }
        ));
        jScrollPane2.setViewportView(ogretmen_table);

        belirli_derslere_gore_ata.setText("Belirli Derslere gore ata");
        belirli_derslere_gore_ata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                belirli_derslere_gore_ataActionPerformed(evt);
            }
        });

        ana_sayfa3.setText("Ana Sayfa");
        ana_sayfa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ana_sayfa3ActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atanacakOgretmenGetir_buton)
                    .addComponent(not_ort_gore_ata_Button)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(agno_gore_ogr_listesi_buton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(belirli_derslere_gore_ata))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ana_sayfa3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(bir_onceki_sayfa)))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ana_sayfa3)
                    .addComponent(bir_onceki_sayfa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agno_gore_ogr_listesi_buton)
                    .addComponent(jButton1)
                    .addComponent(belirli_derslere_gore_ata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(atanacakOgretmenGetir_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(not_ort_gore_ata_Button)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {
            // Şifreyi integer olarak parse etme

            // JDBC sürücüsünü yükleme
            Class.forName("org.postgresql.Driver");

            // Veritabanına bağlanma
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/esin", "postgres", "12345");

            String ogrenci_ders_kodu = "", ogretmen_sicil_no = "", ogrenci_sicil_num = "", ogretmen_kontenjan_bilgisi = "";
            int ogretmen_kontenjan_bilgisiI = 0;
            // Veritabanına ekleme işlemi
            String sql = "select ogrenci_sicil_num ,ogrenci_ders_kodu from ogrenci where ogrenci_ogretmen_sicil_num is null or ogrenci_anlasma_durumu != 'B' ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ArrayList<String> stringList = new ArrayList<>();
                ogrenci_ders_kodu = resultSet.getString("ogrenci_ders_kodu");
                ogrenci_sicil_num = resultSet.getString("ogrenci_sicil_num");
                //atanmamıs ders hangı hpca veriyor
                String sql2 = "select ogretmen_sicil_no , ogretmen_kontenjan_bilgisi from ogretmen where ogretmen_ders_kodu = ?  and ogretmen_kontenjan_bilgisi > 0 ";
                PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
                preparedStatement2.setString(1, ogrenci_ders_kodu);
                ResultSet resultSet2 = preparedStatement2.executeQuery();
                while (resultSet2.next()) {
                    //atanmamıs dersi verebilen hocaları bir listeye alıyor
                    ogretmen_sicil_no = resultSet2.getString("ogretmen_sicil_no");
                    ogretmen_kontenjan_bilgisi = resultSet2.getString("ogretmen_kontenjan_bilgisi");
                    if (ogretmen_kontenjan_bilgisi == null || ogretmen_kontenjan_bilgisi.isEmpty()) {
                        ogretmen_kontenjan_bilgisiI = 0;
                    } else {
                        ogretmen_kontenjan_bilgisiI = Integer.parseInt(ogretmen_kontenjan_bilgisi);
                        ogretmen_kontenjan_bilgisiI = ogretmen_kontenjan_bilgisiI - 1;
                    }
                    System.out.println("ogretmen_sicil_no:" + ogretmen_sicil_no);
                    stringList.add(ogretmen_sicil_no);
                }

                int randonsayı = 0;
                if (stringList.size() > 0) {
                    Random rnd = new Random();
                    randonsayı = rnd.nextInt(stringList.size());
                    System.out.println("random " + stringList.get(randonsayı));
                    System.out.println("ogr" + ogretmen_sicil_no);
                    String sql3 = "UPDATE ogrenci SET ogrenci_ogretmen_sicil_num = ? , ogrenci_anlasma_durumu = 'B' WHERE ogrenci_sicil_num = ? and ogrenci_ders_kodu =? and ogrenci_ogretmen_sicil_num is null ";
                    PreparedStatement preparedStatement7 = connection.prepareStatement(sql3);
                    preparedStatement7.setInt(1, Integer.parseInt(stringList.get(randonsayı)));
                    preparedStatement7.setInt(2, Integer.parseInt(ogrenci_sicil_num));
                    preparedStatement7.setString(3, ogrenci_ders_kodu);
                    preparedStatement7.executeUpdate();

                    String sql4 = " UPDATE ogretmen SET  ogretmen_kontenjan_bilgisi=? WHERE ogretmen_sicil_no=?  and ogretmen_ders_kodu=? ";
                    PreparedStatement preparedStatement44 = connection.prepareStatement(sql4);
                    preparedStatement44.setInt(1, ogretmen_kontenjan_bilgisiI);
                    preparedStatement44.setInt(2, Integer.parseInt(ogretmen_sicil_no));
                    preparedStatement44.setString(3, ogrenci_ders_kodu);
                    preparedStatement44.executeUpdate();

                } else {
                    Random rnd = new Random();
                    List<String> ilgialanıList = List.of("Robotik", "Yapay zeka", "Blgisayar ağları", "Akıllı sistemler");
                    int yeri6 = rnd.nextInt(ilgialanıList.size());
                    String ilgialanı = ilgialanıList.get(yeri6);
                    List<String> adListesi = List.of("Ali", "Veli", "Aslı", "Kerem", "Hatice", "Selin", "Vatan");
                    String ad = adListesi.get(rnd.nextInt(adListesi.size()));
                    List<String> soyadıListesi = List.of("Yılmaz", "Ersoy", "Aydın", "Demir", "Yasarlar", "Keskin", "Kose");
                    String soyad = soyadıListesi.get(rnd.nextInt(soyadıListesi.size()));
                    int sifre = rnd.nextInt(9000) + 1000;
                    int kontenjan_bilgisi = rnd.nextInt(10) + 1;
                    int sicil_num = rnd.nextInt(9000) + 1000;
                    String sql11 = "INSERT INTO ogretmen(ogretmen_adi, ogretmen_soyadi, ogretmen_ilgi_alanlari, ogretmen_sicil_no, ogretmen_sifresi, ogretmen_kontenjan_bilgisi, ogretmen_ders_kodu)VALUES (?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement11 = connection.prepareStatement(sql11);
                    preparedStatement11.setString(1, ad);
                    preparedStatement11.setString(2, soyad);
                    preparedStatement11.setString(3, ilgialanı);
                    preparedStatement11.setInt(4, sicil_num);
                    preparedStatement11.setInt(5, sifre);
                    preparedStatement11.setInt(6, kontenjan_bilgisi);
                    preparedStatement11.setString(7, ogrenci_ders_kodu);
                    preparedStatement11.executeUpdate();

                    String sql3 = "UPDATE ogrenci SET ogrenci_ogretmen_sicil_num = ? , ogrenci_anlasma_durumu = 'B' WHERE ogrenci_sicil_num = ? ";
                    PreparedStatement preparedStatement7 = connection.prepareStatement(sql3);
                    preparedStatement7.setInt(1, sicil_num);
                    preparedStatement7.setInt(2, Integer.parseInt(ogrenci_sicil_num));
                    preparedStatement7.executeUpdate();
                }

            }

            // Kullanıcıya başarılı mesaj gösterme
            JOptionPane.showMessageDialog(null, "Atamalar yapıldı!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);

            // Bağlantıyı kapatma
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Veritabanı hatası: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void not_ort_gore_ata_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_not_ort_gore_ata_ButtonActionPerformed
        // TODO add your handling code here:
        String ogrenciSiciliS = "", ogrenciDersKoduS = "", ögretmenSiciliS = "", ögretmenKontenjanS = "";

        int selectedRow = agno_gore_ogr_table.getSelectedRow();
        int selectedRow2 = ogretmen_table.getSelectedRow();

        if (selectedRow != -1 || selectedRow2 != -1) {
            // Seçilen satırdan öğrenci sicil numarasını al
            Object ogrenciObject = agno_gore_ogr_table.getValueAt(selectedRow, 0);
            ogrenciSiciliS = ogrenciObject != null ? ogrenciObject.toString() : "";
            int ogrenciSicili = Integer.parseInt(ogrenciSiciliS.toString());
            Object ogrenciDersObject = agno_gore_ogr_table.getValueAt(selectedRow, 1);
            ogrenciDersKoduS = ogrenciDersObject != null ? ogrenciDersObject.toString() : "";
            

            Object ögretmenSiciliObject = ogretmen_table.getValueAt(selectedRow2, 2);
            ögretmenSiciliS = ögretmenSiciliObject != null ? ögretmenSiciliObject.toString() : "";
            int ögretmenSicili = Integer.parseInt(ögretmenSiciliS.toString());

            Object ögretmenKontenjanObject = ogretmen_table.getValueAt(selectedRow2, 4);
            ögretmenKontenjanS = ögretmenKontenjanObject != null ? ögretmenKontenjanObject.toString() : "";
            int ögretmenKontenjan = Integer.parseInt(ögretmenKontenjanS.toString());

            System.out.println("ogrenciSicili:" + ogrenciSicili);
            System.out.println("ögretmenSiciliS:" + ögretmenSiciliS);
            System.out.println("ögretmenKontenjan:" + ögretmenKontenjan);
            System.out.println("ogrenciDersKoduS:" + ogrenciDersKoduS);

            try {
                Class.forName("org.postgresql.Driver");

                // Veritabanına bağlanma
                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/esin", "postgres", "12345");
                ögretmenKontenjan = ögretmenKontenjan - 1;
                // Veritabanına ekleme işlemi
                String sql2 = "UPDATE ogrenci SET   ogrenci_anlasma_durumu= 'B' , ogrenci_ogretmen_sicil_num=?  WHERE ogrenci_sicil_num = ? AND ogrenci_ders_kodu = ? and ogrenci_ogretmen_sicil_num is null ";
                PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
                preparedStatement2.setInt(1, ögretmenSicili);
                preparedStatement2.setInt(2, ogrenciSicili);
                preparedStatement2.setString(3, ogrenciDersKoduS);
                preparedStatement2.executeUpdate();

                String sql = " UPDATE ogretmen SET  ogretmen_kontenjan_bilgisi=? WHERE ogretmen_sicil_no=?  and ogretmen_ders_kodu=? ";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, ögretmenKontenjan);
                preparedStatement.setInt(2, ögretmenSicili);
                preparedStatement.setString(3, ogrenciDersKoduS);
                preparedStatement.executeUpdate();
                connection.close();
                JOptionPane.showMessageDialog(this, "Ders atanmıştır", "Bilgi", JOptionPane.INFORMATION_MESSAGE);

                 System.out.println("ögretmenKontenjan:" + ögretmenKontenjan);
                
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Veritabanı hatası: " + e.getMessage());
                JOptionPane.showMessageDialog(this, "Ders atanmada sorun oldu", "Hata", JOptionPane.ERROR_MESSAGE);

            }

        } else {
            JOptionPane.showMessageDialog(this, "Lütfen bir öğrenci seçin ve bir hoca seçin.", "Hata", JOptionPane.ERROR_MESSAGE);
        }
        this.setVisible(false);
        new yonetici_panel().setVisible(true);

    }//GEN-LAST:event_not_ort_gore_ata_ButtonActionPerformed

    private void agno_gore_ogr_listesi_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agno_gore_ogr_listesi_butonActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("org.postgresql.Driver");

            // Veritabanına bağlanma
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/esin", "postgres", "12345");

            // Veritabanına ekleme işlemi
            String sql = " select ogrenci_sicil_num ,ogrenci_ders_kodu,ogrenci_agno from ogrenci where (ogrenci_ogretmen_sicil_num is null or ogrenci_anlasma_durumu != 'B' ) and ogrenci_sicil_num  is not null and ogrenci_ders_kodu is not null and ogrenci_agno is not null  order by ogrenci_agno desc ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //preparedStatement.setInt(1, Integer.parseInt(kullaniciSicili));
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
            agno_gore_ogr_table.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{}));
            DefaultTableModel model = (DefaultTableModel) agno_gore_ogr_table.getModel();
            model.setColumnIdentifiers(kolon);
            while (resultSet.next()) {
                Object[] o = new Object[k];
                for (j = 0; j < k; j++) {
                    o[j] = resultSet.getObject(j + 1);
                }
                model.addRow(o);
                agno_gore_ogr_table.setModel(model);
            }
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Veritabanı hatası: " + e.getMessage());
        }

    }

    private void ogretmen_bilgilerini_getir_butonActionPerformed(java.awt.event.ActionEvent evt) {

    }//GEN-LAST:event_agno_gore_ogr_listesi_butonActionPerformed

    private void atanacakOgretmenGetir_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atanacakOgretmenGetir_butonActionPerformed
        // TODO add your handling code here:
        int selectedRow = agno_gore_ogr_table.getSelectedRow();
        String ogrenciSiciliS = "", ogrenciDersKoduS = "";

        if (selectedRow != -1) {
            // Seçilen satırdan öğrenci sicil numarasını al
            //Object ogrenciObject = agno_gore_ogr_table.getValueAt(selectedRow, 0);
            //ogrenciSiciliS = ogrenciObject != null ? ogrenciObject.toString() : "";
            //int ogrenciSicili = Integer.parseInt(ogrenciSiciliS.toString());
            Object ogrenciDersObject = agno_gore_ogr_table.getValueAt(selectedRow, 1);
            ogrenciDersKoduS = ogrenciDersObject != null ? ogrenciDersObject.toString() : "";

            System.out.println("seçili olan ogrenci ders kodu:" + ogrenciDersKoduS);

            try {
                Class.forName("org.postgresql.Driver");

                // Veritabanına bağlanma
                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/esin", "postgres", "12345");

                // Veritabanına ekleme işlemi
                String sql = "SELECT ogretmen_adi, ogretmen_soyadi, ogretmen_sicil_no, ogretmen_ders_kodu, ogretmen_kontenjan_bilgisi FROM ogretmen where ogretmen_ders_kodu= ?  and ogretmen_kontenjan_bilgisi > 0 ";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, ogrenciDersKoduS);
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
                ogretmen_table.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{}));
                DefaultTableModel model = (DefaultTableModel) ogretmen_table.getModel();
                model.setColumnIdentifiers(kolon);
                while (resultSet.next()) {
                    Object[] o = new Object[k];
                    for (j = 0; j < k; j++) {
                        o[j] = resultSet.getObject(j + 1);
                    }
                    model.addRow(o);
                    ogretmen_table.setModel(model);
                }
                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Veritabanı hatası: " + e.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(this, "Lütfen bir öğrenci seçin.", "Hata", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_atanacakOgretmenGetir_butonActionPerformed

    private void belirli_derslere_gore_ataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_belirli_derslere_gore_ataActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new yonetici_belirli_derslere_gore_ata_ekrani().setVisible(true);
    }//GEN-LAST:event_belirli_derslere_gore_ataActionPerformed

    private void ana_sayfa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ana_sayfa3ActionPerformed
        String message = "Ana sayfaya yonlendiriliyorsunuz.";
        JOptionPane.showMessageDialog(null, message, "Bilgi Mesajı", JOptionPane.INFORMATION_MESSAGE);

        this.setVisible(false);
        new kullanici_secim_ekrani().setVisible(true);
    }//GEN-LAST:event_ana_sayfa3ActionPerformed

    private void bir_onceki_sayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bir_onceki_sayfaActionPerformed
        String message = "Bir önceki sayfaya yonlendiriliyorsunuz.";
        JOptionPane.showMessageDialog(null, message, "Bilgi Mesajı", JOptionPane.INFORMATION_MESSAGE);

        this.setVisible(false);
        new yonetici_panel();
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
            java.util.logging.Logger.getLogger(yonetici_ogrenci_atama_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yonetici_ogrenci_atama_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yonetici_ogrenci_atama_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yonetici_ogrenci_atama_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yonetici_ogrenci_atama_ekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agno_gore_ogr_listesi_buton;
    private javax.swing.JTable agno_gore_ogr_table;
    private javax.swing.JButton ana_sayfa3;
    private javax.swing.JButton atanacakOgretmenGetir_buton;
    private javax.swing.JButton belirli_derslere_gore_ata;
    private javax.swing.JButton bir_onceki_sayfa;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton not_ort_gore_ata_Button;
    private javax.swing.JTable ogretmen_table;
    // End of variables declaration//GEN-END:variables

}

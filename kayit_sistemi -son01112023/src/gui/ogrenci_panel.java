/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import org.apache.pdfbox.pdmodel.PDDocument;

import org.apache.pdfbox.text.PDFTextStripper;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.Loader;

public class ogrenci_panel extends javax.swing.JFrame {

    private static String kullaniciSicili;
    private static int yonetici_ogrenci_talep_sayisi;

    public ogrenci_panel(String kullaniciSicili, int yonetici_ogrenci_talep_sayisi) {
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
        ocr_okuma_buton = new javax.swing.JButton();
        ana_sayfa = new javax.swing.JButton();
        ogrenci_mesaj_gonder = new javax.swing.JButton();
        derslerimi_getir_buton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        derslerimi_goruntule_table = new javax.swing.JTable();
        hoca_ilgi_alani_buton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ogretmen_ilgi_alanı_table = new javax.swing.JTable();
        talep_onayı_buton = new javax.swing.JButton();
        ogrenci_ders_talebi_olustur_ekran_buton = new javax.swing.JButton();
        hosgeldin_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(627, 435));

        ocr_okuma_buton.setText("PDF OKU");
        ocr_okuma_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocr_okuma_butonActionPerformed(evt);
            }
        });

        ana_sayfa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ana_sayfa.setText("Ana Sayfa");
        ana_sayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ana_sayfaActionPerformed(evt);
            }
        });

        ogrenci_mesaj_gonder.setText("Mesaj Gonder");
        ogrenci_mesaj_gonder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenci_mesaj_gonderActionPerformed(evt);
            }
        });

        derslerimi_getir_buton.setText("Onaylanmış Derslerimi Görüntüle");
        derslerimi_getir_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derslerimi_getir_butonActionPerformed(evt);
            }
        });

        derslerimi_goruntule_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ders Kodu", "Ders Adı", "Başarı Notu", "Başarı Durumu", "Ögretmen Adı", "Ögretmen Sicil Numarası"
            }
        ));
        jScrollPane1.setViewportView(derslerimi_goruntule_table);

        hoca_ilgi_alani_buton.setText("Ögretmenlerin İlgi Alanları");
        hoca_ilgi_alani_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoca_ilgi_alani_butonActionPerformed(evt);
            }
        });

        ogretmen_ilgi_alanı_table.setModel(new javax.swing.table.DefaultTableModel(
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
                "Ögretmen İlgi Alanı", "Ögretmen Adı", "Ögretmen Soyadı", "Ögretmen Sicil Num"
            }
        ));
        jScrollPane2.setViewportView(ogretmen_ilgi_alanı_table);

        talep_onayı_buton.setText("Hoca tarafından talep edilen ders onayı sayfasına git");
        talep_onayı_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talep_onayı_butonActionPerformed(evt);
            }
        });

        ogrenci_ders_talebi_olustur_ekran_buton.setText("Ders talebi oluştur yada iptal et sayfasına git");
        ogrenci_ders_talebi_olustur_ekran_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenci_ders_talebi_olustur_ekran_butonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hoca_ilgi_alani_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(ana_sayfa)
                                        .addGap(18, 18, 18)
                                        .addComponent(ogrenci_mesaj_gonder, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(derslerimi_getir_buton)
                                        .addGap(32, 32, 32)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ocr_okuma_buton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(talep_onayı_buton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ogrenci_ders_talebi_olustur_ekran_buton))
                                    .addComponent(hosgeldin_label, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(ana_sayfa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ogrenci_mesaj_gonder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ocr_okuma_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(talep_onayı_buton)
                    .addComponent(ogrenci_ders_talebi_olustur_ekran_buton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(derslerimi_getir_buton, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(hosgeldin_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hoca_ilgi_alani_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ocr_okuma_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocr_okuma_butonActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("PDF Dosyasını Seç");
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try ( PDDocument document = Loader.loadPDF(selectedFile)) {
                PDFTextStripper pdfStripper = new PDFTextStripper();
                String pdfText = pdfStripper.getText(document);
                // System.out.println(pdfText);

                String dersKoduRegex = "\\b[A-Z]{3}\\d{3}\\b";
                String dersAdiRegex = "\\b(.+?)\\s*\\(.*?\\)";
                String dersNotuRegex = "\\b(\\d{1,2}(?:\\.\\d+)?)([A-Z]+)\\s+G\\b";
                String aktsRegex = "\\bTr\\s+\\d+\\s+\\d+\\s+\\d+\\s+(\\d+)\\b";

                String sicilNumarasiRegex = "\\b([0-9]{9})\\b";
                String adiRegex = "\\b\\d{11}\\s+([A-ZÇĞİÖŞÜa-zçğıöşü]+)\\s+\\d{2}/\\d{2}/\\d{4}\\b";
                //String soyadiRegex = "Soyadı\\s*\\s*([A-ZÇĞİÖŞÜa-zçğıöşü\\s]+)\\s*";
                String soyadiRegex = "Soyadı\\s*\\s*([A-ZÇĞİÖŞÜa-zçğıöşü\\s]+)\\s*KO";

                String agnoRegex = "\\(Grading System\\) \\(4\\.0 Scale\\)\\s*([0-9]+\\.[0-9]{2}+)";

                String dersRegex = "[A-Z]$";
                Pattern dersPattern = Pattern.compile(dersRegex);

                String sonHarf = "";

                Pattern dersKoduPattern = Pattern.compile(dersKoduRegex);
                Pattern dersAdiPattern = Pattern.compile(dersAdiRegex, Pattern.DOTALL);
                Pattern dersNotuPattern = Pattern.compile(dersNotuRegex);
                Pattern aktsPattern = Pattern.compile(aktsRegex);

                Pattern sicilNumarasiPattern = Pattern.compile(sicilNumarasiRegex);
                Pattern adiPattern = Pattern.compile(adiRegex);
                Pattern soyadiPattern = Pattern.compile(soyadiRegex);
                Pattern agnoPattern = Pattern.compile(agnoRegex);

                Matcher sicilNumarasiMatcher = sicilNumarasiPattern.matcher(pdfText);
                Matcher adiMatcher = adiPattern.matcher(pdfText);
                Matcher soyadiMatcher = soyadiPattern.matcher(pdfText);
                Matcher agnoMatcher = agnoPattern.matcher(pdfText);

                String sicilNumarasi = "";
                String adi = "";
                String soyadi = "";
                String agno = "";

                if (sicilNumarasiMatcher.find()) {
                    sicilNumarasi = sicilNumarasiMatcher.group(1);
                }

                if (adiMatcher.find()) {
                    adi = adiMatcher.group(1).trim();
                }
                if (soyadiMatcher.find()) {
                    soyadi = soyadiMatcher.group(1).trim();
//                    String[] words = soyadi.split(" "); // Bu, metni boşluk karakterlerine göre böler
//                    for (int i = 0; i < words.length; i++) {
//                        String word = words[i];
//                        System.out.println("-----"+word);
//                    }
//                    soyadi = words[0];
                }
                if (agnoMatcher.find()) {
                    agno = agnoMatcher.group(1).trim();

                }
                System.out.println("Kullanıcı Sicil Numarası: " + sicilNumarasi);
                System.out.println("Adı: " + adi);
                System.out.println("Soyadı: " + soyadi);
                System.out.println("Agno: " + agno);
                Matcher dersKoduMatcher = dersKoduPattern.matcher(pdfText);
                String harfNotu = "", not = "";
                String aktsDegeri = "";
                String dersAdi = "";
                while (dersKoduMatcher.find()) {
                    String dersKodu = dersKoduMatcher.group();
                    String remainingText = pdfText.substring(dersKoduMatcher.end());
                    Matcher dersAdiMatcher = dersAdiPattern.matcher(remainingText);

                    if (dersAdiMatcher.find()) {
                        dersAdi = dersAdiMatcher.group(1).trim();

                        Matcher dersNotuMatcher = dersNotuPattern.matcher(remainingText);
                        if (dersNotuMatcher.find()) {
                            not = dersNotuMatcher.group(1);
                            harfNotu = dersNotuMatcher.group(2);

                            Matcher aktsMatcher = aktsPattern.matcher(remainingText);
                            if (aktsMatcher.find()) {
                                aktsDegeri = aktsMatcher.group(1).trim();

                                if (remainingText.indexOf(harfNotu) > -1) {
                                    int yeri = remainingText.indexOf(harfNotu);
                                    System.out.println("yeri" + yeri);
                                    sonHarf = remainingText.substring(yeri + 4, yeri + 5);
                                }

                                System.out.println("Ders Kodu: " + dersKodu);
                                System.out.println("Ders Adı: " + dersAdi);
                                System.out.println("Not: " + not);
                                System.out.println("Harf Notu: " + harfNotu);
                                System.out.println("AKTS: " + aktsDegeri);
                                System.out.println("Son Harf: " + sonHarf.trim());
                                System.out.println("------");

                            }

                        }
                    }

                    String jdbcUrl = "jdbc:postgresql://localhost:5433/esin";
                    String kullaniciAdi = "postgres";
                    String parola = "12345";

                    // Veritabanı bağlantısını aç
                    try ( Connection connection = DriverManager.getConnection(jdbcUrl, kullaniciAdi, parola)) {
                        String deleteSQL2 = "DELETE FROM ogrenci WHERE ogrenci_ders_kodu = ? AND ogrenci_sicil_num = ?";

                        try ( PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL2)) {
                            preparedStatement.setString(1, dersKodu);
                            preparedStatement.setInt(2, Integer.parseInt(sicilNumarasi));
                            int affectedRows = preparedStatement.executeUpdate();
                            if (affectedRows > 0) {
                                System.out.println("Veri silindi.");
                            } else {
                                System.out.println("Silinecek veri bulunamadı.");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                            System.out.println("Veritabanı hatası: " + e.getMessage());
                        }

                        String query3 = "SELECT ogretmen_sicil_no FROM ogretmen WHERE ogretmen_ders_kodu = ? ";
                        PreparedStatement preparedStatement3 = connection.prepareStatement(query3);
                        preparedStatement3.setString(1, dersKodu);
                        ResultSet resultSet3 = preparedStatement3.executeQuery();
                        int ogretmen_sicil = 0;
                        while (resultSet3.next()) {

                            ogretmen_sicil = resultSet3.getInt("ogretmen_sicil_no");

                        }
                        System.out.println("hello.ogretmen_sicil:" + ogretmen_sicil);

                        String query2 = "INSERT INTO ogrenci (ogrenci_adi,ogrenci_soyadi,ogrenci_sicil_num,ogrenci_ders_kodu,ogrenci_ders_basari_notu,ogrenci_ders_basari_durumu,ogrenci_agno,ogrenci_sifresi,ogrenci_anlasma_durumu,ogrenci_anlasma_talep_sayisi,ogrenci_ogretmen_sicil_num) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,? )";
                        String ogrenci_ders_basari_durumu = "";
                        try ( PreparedStatement preparedStatement = connection.prepareStatement(query2)) {

                            if (sonHarf.trim().equalsIgnoreCase("G") || harfNotu.equalsIgnoreCase("G")) {
                                ogrenci_ders_basari_durumu = "Başarılı";
                            } else {
                                ogrenci_ders_basari_durumu = "Başarısız";
                            }
                            // Parametre değerlerini ayarla
                            preparedStatement.setString(1, adi);
                            preparedStatement.setString(2, soyadi);
                            preparedStatement.setInt(3, Integer.parseInt(sicilNumarasi));
                            preparedStatement.setString(4, dersKodu);
                            preparedStatement.setString(5, harfNotu);
                            preparedStatement.setString(6, ogrenci_ders_basari_durumu);
                            preparedStatement.setDouble(7, Double.parseDouble(agno));
                            preparedStatement.setInt(8, Integer.parseInt("1234"));
                            preparedStatement.setString(9, "B");
                            preparedStatement.setInt(10, Integer.parseInt("0"));
                            preparedStatement.setInt(11, ogretmen_sicil);
                            // Sorguyu çalıştır
                            int affectedRows = preparedStatement.executeUpdate();

                            if (affectedRows > 0) {
                                System.out.println("Veri eklendi.");
                            } else {
                                System.out.println("Veri eklenemedi.");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                            System.out.println("Veritabanı hatası: " + e.getMessage());
                        }

                        String deleteSQL = "DELETE FROM ders WHERE ders_kodu = ?";
                        try ( PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
                            preparedStatement.setString(1, dersKodu);
                            int affectedRows = preparedStatement.executeUpdate();
                            if (affectedRows > 0) {
                                System.out.println("Veri silindi.");
                            } else {
                                System.out.println("Silinecek veri bulunamadı.");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                            System.out.println("Veritabanı hatası: " + e.getMessage());
                        }

                        String query = "INSERT INTO ders ( ders_adi, ders_kredi, ders_kodu) VALUES ( ?, ?, ?)";

                        // PreparedStatement oluştur
                        try ( PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                            // Parametre değerlerini ayarla
                            preparedStatement.setString(1, dersAdi);
                            preparedStatement.setInt(2, Integer.parseInt(aktsDegeri));
                            preparedStatement.setString(3, dersKodu);

                            // Sorguyu çalıştır
                            int affectedRows = preparedStatement.executeUpdate();

                            if (affectedRows > 0) {
                                System.out.println("Veri eklendi.");
                            } else {
                                System.out.println("Veri eklenemedi.");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                            System.out.println("Veritabanı hatası: " + e.getMessage());
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Veritabanı hatası: " + e.getMessage());
                    }
                    
                }
                JOptionPane.showMessageDialog(null, "Pdf okundu", "Bilgi Mesajı", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException ex) {
                ex.printStackTrace();
                System.out.println("PDF Okuma Hatası: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_ocr_okuma_butonActionPerformed

    private void ana_sayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ana_sayfaActionPerformed
        String message = "Ana sayfaya yonlendiriliyorsunuz.";
        JOptionPane.showMessageDialog(null, message, "Bilgi Mesajı", JOptionPane.INFORMATION_MESSAGE);

        this.setVisible(false);
        new kullanici_secim_ekrani().setVisible(true);
    }//GEN-LAST:event_ana_sayfaActionPerformed

    private void ogrenci_mesaj_gonderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenci_mesaj_gonderActionPerformed
        this.setVisible(false);
        new ogrenci_mesaj_ekrani(kullaniciSicili, yonetici_ogrenci_talep_sayisi).setVisible(true);
    }//GEN-LAST:event_ogrenci_mesaj_gonderActionPerformed

    private void derslerimi_getir_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derslerimi_getir_butonActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("org.postgresql.Driver");

            System.out.println("kullaniciAdi" + kullaniciSicili);

            // Veritabanına bağlanma
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/esin", "postgres", "12345");

            // Veritabanına ekleme işlemi
            String sql = " SELECT DISTINCT ogrenci.ogrenci_ders_kodu as DersKodu, ders.ders_adi as DersAdi, ogrenci.ogrenci_ders_basari_notu as BasarıNotu, ogrenci.ogrenci_ders_basari_durumu as BasarıDrm , ogretmen_adi as Ogretmen_adı , ogretmen_soyadi as Ogretmen_soyadı FROM ogrenci INNER JOIN ders ON ders.ders_kodu = ogrenci.ogrenci_ders_kodu INNER JOIN ogretmen ON ogretmen.ogretmen_ders_kodu = ogrenci.ogrenci_ders_kodu WHERE ogrenci.ogrenci_sicil_num = ? and ogrenci.ogrenci_ogretmen_sicil_num=ogretmen.ogretmen_sicil_no  and ogrenci_anlasma_durumu = 'B' ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, Integer.parseInt(kullaniciSicili));
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
            derslerimi_goruntule_table.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{}));
            DefaultTableModel model = (DefaultTableModel) derslerimi_goruntule_table.getModel();
            model.setColumnIdentifiers(kolon);
            while (resultSet.next()) {
                Object[] o = new Object[k];
                for (j = 0; j < k; j++) {
                    o[j] = resultSet.getObject(j + 1);
                }
                model.addRow(o);
                derslerimi_goruntule_table.setModel(model);
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Veritabanı hatası: " + e.getMessage());
        }
    }//GEN-LAST:event_derslerimi_getir_butonActionPerformed

    private void hoca_ilgi_alani_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoca_ilgi_alani_butonActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("org.postgresql.Driver");

            // Veritabanına bağlanma
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/esin", "postgres", "12345");

            // Veritabanına ekleme işlemi
            String sql = "SELECT DISTINCT ogretmen_ilgi_alanlari as OgretmenİlgiAlani, ogretmen_sicil_no as OgretmenSicilNo, ogretmen_adi as OgretmenAdi, ogretmen_soyadi as OgretmenSoyadi FROM ogretmen order by ogretmen_sicil_no desc ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
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
            ogretmen_ilgi_alanı_table.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{}));
            DefaultTableModel model = (DefaultTableModel) ogretmen_ilgi_alanı_table.getModel();
            model.setColumnIdentifiers(kolon);
            while (resultSet.next()) {
                Object[] o = new Object[k];
                for (j = 0; j < k; j++) {
                    o[j] = resultSet.getObject(j + 1);
                }
                model.addRow(o);
                ogretmen_ilgi_alanı_table.setModel(model);
            }
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Veritabanı hatası: " + e.getMessage());
        }
    }//GEN-LAST:event_hoca_ilgi_alani_butonActionPerformed

    private void talep_onayı_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talep_onayı_butonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ogrenci_ders_talep_onay_ekrani(kullaniciSicili, yonetici_ogrenci_talep_sayisi).setVisible(true);
    }//GEN-LAST:event_talep_onayı_butonActionPerformed

    private void ogrenci_ders_talebi_olustur_ekran_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenci_ders_talebi_olustur_ekran_butonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ogrenci_ders_talep_olustur_ekrani(kullaniciSicili, yonetici_ogrenci_talep_sayisi).setVisible(true);
    }//GEN-LAST:event_ogrenci_ders_talebi_olustur_ekran_butonActionPerformed

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
            java.util.logging.Logger.getLogger(ogrenci_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ogrenci_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ogrenci_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ogrenci_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ogrenci_panel(kullaniciSicili, yonetici_ogrenci_talep_sayisi).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ana_sayfa;
    private javax.swing.JButton derslerimi_getir_buton;
    private javax.swing.JTable derslerimi_goruntule_table;
    private javax.swing.JButton hoca_ilgi_alani_buton;
    private javax.swing.JLabel hosgeldin_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton ocr_okuma_buton;
    private javax.swing.JButton ogrenci_ders_talebi_olustur_ekran_buton;
    private javax.swing.JButton ogrenci_mesaj_gonder;
    private javax.swing.JTable ogretmen_ilgi_alanı_table;
    private javax.swing.JButton talep_onayı_buton;
    // End of variables declaration//GEN-END:variables
}

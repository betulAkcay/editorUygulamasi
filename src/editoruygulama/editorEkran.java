/**
 *
 * @author Betül Akçay
 */

package editoruygulama;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

public class editorEkran extends javax.swing.JFrame {

    DefaultListModel<String> ls = new DefaultListModel<>();
    ArrayList<String> lst = new ArrayList<>();

    public editorEkran() {
        initComponents();
        Listele();
    }

    public void Listele() {
        int i = 0;
        SQLiteClass db = new SQLiteClass();
        try {
            ResultSet rs = db.dataGetir();
            lst.removeAll(lst);
            while (rs.next()) {
                ls.addElement(rs.getString(2) + " " + rs.getString(3));
                lst.add(rs.getString("id"));

            }
            jList1.setModel(ls);
            rs.close();
           db.kapat();
        } catch (SQLException ex) {
            Logger.getLogger(editorEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        txtBaslik = new javax.swing.JTextField();
        btnKaydet = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnAktar = new javax.swing.JButton();
        txtAranan = new javax.swing.JTextField();
        txtDegistir = new javax.swing.JTextField();
        btnDgstr = new javax.swing.JButton();
        btnTumDgstr = new javax.swing.JButton();
        btnBul = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAciklama = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Notlar"));

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Düzenleme"));

        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnAktar.setText("Dışa Aktar");
        btnAktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAktarActionPerformed(evt);
            }
        });

        txtAranan.setText("Aranacak kelime");

        txtDegistir.setText("Değiştirilecek kelime");

        btnDgstr.setText("Değiştir");
        btnDgstr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDgstrActionPerformed(evt);
            }
        });

        btnTumDgstr.setText("Tümünü Değiştir");
        btnTumDgstr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTumDgstrActionPerformed(evt);
            }
        });

        btnBul.setText("Bul");
        btnBul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDegistir, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(txtAranan)
                    .addComponent(txtBaslik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnKaydet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAktar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDgstr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTumDgstr)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKaydet)
                    .addComponent(btnSil)
                    .addComponent(btnAktar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAranan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDgstr)
                    .addComponent(btnTumDgstr)
                    .addComponent(btnBul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDegistir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Not Ayrıntı"));

        txtAciklama.setColumns(20);
        txtAciklama.setRows(5);
        txtAciklama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAciklamaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtAciklama);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
         SQLiteClass db = new SQLiteClass();
        try {
         
            String baslik = txtBaslik.getText();
            String aciklama = txtAciklama.getText();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            String d = dateFormat.format(date);

            int result = db.dataEkle(baslik, aciklama, d);

            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Kayıt Başarılı");
                jList1.clearSelection();
                txtAciklama.setText("");
                    txtBaslik.requestFocus();
                ls.clear();
                Listele();
            } else {
                JOptionPane.showMessageDialog(this, "Başarısız");
            }

            db.kapat();
        } catch (Exception e) {
            System.err.println("Kayıt Ekleme Hatası : " + e.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        SQLiteClass db = new SQLiteClass();
        int result  =0;
        try {
            int cvp = JOptionPane.showConfirmDialog(this, "Silmek istediğinize emin misiniz?", "Not Sil", JOptionPane.YES_NO_OPTION);
            if (cvp == JOptionPane.YES_OPTION) {
                int i = jList1.getSelectedIndex();
                secilenID = Integer.valueOf(lst.get(i));
                result = db.dataSil(secilenID);
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Silme Başarılı");
                    txtAciklama.setText("");
                    txtBaslik.requestFocus();
                    ls.clear();
                    Listele();
                } else {
                    JOptionPane.showMessageDialog(this, "Başarısız");
                }
            }
            db.kapat();
        } catch (Exception e) {
            System.err.println("Silme Hatası : " + e.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_btnSilActionPerformed

    int secilenID;
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

        SQLiteClass db = new SQLiteClass();
        ResultSet rs;
        try {
            int i = jList1.getSelectedIndex();
            secilenID = Integer.valueOf(lst.get(i));
            rs = db.dataYaz(secilenID);
            txtAciklama.setText(rs.getString("notAciklama"));
            //rs.close();
            db.kapat();
        } catch (SQLException ex) {
            System.err.println("Seçme Hatası : " + ex.getLocalizedMessage());
        }

    }//GEN-LAST:event_jList1MouseClicked

    private void txtAciklamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAciklamaKeyPressed
        SQLiteClass db = new SQLiteClass();
        try {
            
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                int i = jList1.getSelectedIndex();
                secilenID = Integer.valueOf(lst.get(i));
                String aciklama = txtAciklama.getText();
                int result = db.dataGuncelle(aciklama, secilenID);

                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Açıklama Eklendi");

                } else {
                    JOptionPane.showMessageDialog(this, "Başarısız");
                }
            }
            db.kapat();
            
        } catch (Exception e) {
            
            System.err.println("Açıklama Ekleme Hatası : " + e.getLocalizedMessage());

        }
        
    }//GEN-LAST:event_txtAciklamaKeyPressed

    private void btnAktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAktarActionPerformed
        SQLiteClass db = new SQLiteClass();
        ResultSet rs;
        String fileName;
        try {
            int i = jList1.getSelectedIndex();
            secilenID = Integer.valueOf(lst.get(i));
            rs = db.dataYaz(secilenID);
            fileName = rs.getString("notAdi") + ".txt";
            File dosya = new File(fileName);
            if (!dosya.exists()) {
                dosya.createNewFile();
            }
            FileWriter yaz = new FileWriter(fileName, true);
            yaz.append("Not Açıklaması :" + rs.getString("notAciklama") + " -  Not Tarihi :" + rs.getString("notTarih") + " \r\n");
            yaz.close();
            JOptionPane.showMessageDialog(this, "Dosya Aktarımı Başarılı");
            db.kapat();
        } catch (Exception ex) {
            
            System.err.println("Dışa Aktarma Hatası : " + ex.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_btnAktarActionPerformed

    private void btnBulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBulActionPerformed

        boolean durum = false;
        String gelen = null;
        String kelime = null;
        try {
            gelen = txtAciklama.getText();
            kelime = txtAranan.getText();
            int bas = gelen.indexOf(kelime);
            if (gelen.contains(kelime))  {
            while (bas < gelen.length()) {
                 
                    Highlighter highlighter = txtAciklama.getHighlighter();
                    Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
                    highlighter.addHighlight(bas, (bas + kelime.length()), painter);
                    bas = gelen.indexOf(kelime, bas + kelime.length());
                    durum = true;
                }
            }
            if(!durum) {
                JOptionPane.showMessageDialog(this, "Böyle bir kelime yok");
            }
        } catch (Exception e) {
           System.err.println("Arama Hatası : " + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnBulActionPerformed

    private void btnDgstrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDgstrActionPerformed

        SQLiteClass db = new SQLiteClass();
        ResultSet rs;
        try {
            int i = jList1.getSelectedIndex();
            secilenID = Integer.valueOf(lst.get(i));
            rs = db.dataYaz(secilenID);
            String gelen = rs.getString("notAciklama");

            gelen = gelen.replaceFirst(txtAranan.getText(), txtDegistir.getText());
            txtAciklama.setText(gelen);

            int result = db.dataGuncelle(gelen, secilenID);

            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Açıklama Eklendi");

            } else {
                JOptionPane.showMessageDialog(this, "Başarısız");
            }

            db.kapat();
        } catch (Exception e) {
            System.err.println("Değiştirme Hatası : " + e.getLocalizedMessage());

        }
        
    }//GEN-LAST:event_btnDgstrActionPerformed

    private void btnTumDgstrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTumDgstrActionPerformed

        SQLiteClass db = new SQLiteClass();
        ResultSet rs;
        try {
            int i = jList1.getSelectedIndex();
            secilenID = Integer.valueOf(lst.get(i));
            rs = db.dataYaz(secilenID);
            String gelen = rs.getString("notAciklama");

            gelen = gelen.replace(txtAranan.getText(), txtDegistir.getText());
            txtAciklama.setText(gelen);

            int result = db.dataGuncelle(gelen, secilenID);

            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Açıklama Eklendi");

            } else {
                JOptionPane.showMessageDialog(this, "Başarısız");
            }

            db.kapat();
        } catch (Exception e) {  
            System.err.println("Tümü Değiştir Hatası : " + e.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_btnTumDgstrActionPerformed

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
            java.util.logging.Logger.getLogger(editorEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editorEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editorEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editorEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editorEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAktar;
    private javax.swing.JButton btnBul;
    private javax.swing.JButton btnDgstr;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTumDgstr;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAciklama;
    private javax.swing.JTextField txtAranan;
    private javax.swing.JTextField txtBaslik;
    private javax.swing.JTextField txtDegistir;
    // End of variables declaration//GEN-END:variables

    private void appendToPane(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void appendToPane(JTextArea txtAciklama, String kelime, Color RED) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

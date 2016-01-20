package editoruygulama;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLiteClass {
    
    Connection conn;
    Statement st;
    ResultSet rs;
    String driver = "org.sqlite.JDBC";
    String DBName = "db/editor.db";
    
    public SQLiteClass() {
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection("jdbc:sqlite:" + DBName);
            st = conn.createStatement();
        } catch (Exception e) {
            System.out.println("Bağlantı hatası " + e.getLocalizedMessage());
        }
        
    }
    public ResultSet dataGetir(){
        
        try {
            rs = st.executeQuery("Select * from Notlar");
            
        } catch (Exception e) {
            System.out.println("Veri alma Hatası :"+ e.getLocalizedMessage());
        }
        return rs;
    }
    
    public int dataEkle(String notAd, String notAciklama, String notTarih) {
        
        int sonuc = -1;
        try {
            sonuc = st.executeUpdate("Insert into Notlar Values(null,'"+notAd+"','"+notTarih+"','"+notAciklama+"')");
        } catch (Exception e) {
            System.out.println("Ekleme Hatası :" + e.getLocalizedMessage());
        }
        return sonuc;
    }
    public int dataSil(int id) {
        int sonuc = -1;
        
        try {
            sonuc = st.executeUpdate("Delete from Notlar where id = "+id+"");
        } catch (Exception e) {
            System.out.println("Silme Hatası :" + e.getLocalizedMessage());
        }
        return sonuc;
    }
    public ResultSet dataYaz(int id) {
         try {
            rs = st.executeQuery("Select * from Notlar where  id = "+id+"");
           
        } catch (Exception e) {
            System.out.println("Veri alma Hatası :"+ e.getLocalizedMessage());
        }
        return rs;
    }
    public void kapat() {
        try {
        if(!conn.isClosed()) {
            conn.close();
            st.close();
        }
        }
        catch (Exception e){
            
        }
    }
    
    public int dataGuncelle(String aciklama,int id){
        int sonuc = -1;
          try {
          sonuc = st.executeUpdate("Update Notlar set notAciklama = '" + aciklama + "' where id = "+ id);
          
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return sonuc;
           
    }
}

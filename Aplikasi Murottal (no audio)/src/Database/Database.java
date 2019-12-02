/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import Model.Surat;
import Model.SuratMakiyyah;
import Model.SuratMadaniyyah;
import javax.swing.DefaultListModel;
/**
 *
 * @author zainuri
 */
public class Database {
    public static Connection con;
    public static Statement stm;
    
    public void connect() {
        try {
            String url="jdbc:mysql://localhost/db_murottal";
            String username= "root";     
            String password= "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            stm = con.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal "+e.getMessage());
        }
    }
    
    public DefaultListModel loadallSurat() {
        try {
            DefaultListModel DLM = new DefaultListModel();
            Statement stmt = con.createStatement();
            String query = "select * from tb_surat";
            ResultSet rs = stmt.executeQuery(query);
            Surat s = null;
            while (rs.next()) {
                String idSurat = rs.getString(1);
                String namaSurat = rs.getString(2);
                String artiNamaSurat = rs.getString(3);
                int jumlahAyat = Integer.parseInt(rs.getString(4));
                s = new Surat(idSurat, namaSurat, artiNamaSurat, jumlahAyat);
                DLM.addElement(s);
            }
            return DLM;
        } catch (Exception e) {
            System.out.println("error loading list of Surat");
            return null;
        }
    }
    
    public Surat loadSuratByNama(String namaSurat) {
        try {
            Statement stmt = con.createStatement();
            String query = "select * from tb_surat where nama_surat = '" + namaSurat + "'";
            ResultSet rs = stmt.executeQuery(query);
            Surat s = null;
            while (rs.next()) {
                String id = rs.getString(1);
                String nama_surat = rs.getString(2);
                String artiNamaSurat = rs.getString(3);
                int jumlahAyat = Integer.parseInt(rs.getString(4));
                s = new Surat(id, nama_surat, artiNamaSurat, jumlahAyat);
            }
            return s;
        } catch (Exception e) {
            System.out.println("Error Loading a Surat");
            return null;
        }

    }
    
    public DefaultListModel searchSurat(String namaSurat) {
        try {
            DefaultListModel DLM = new DefaultListModel();
            Statement stmt = con.createStatement();
            String query = "select * from tb_surat where nama_surat LIKE '%" + namaSurat + "%'";
            ResultSet rs = stmt.executeQuery(query);
            Surat s = null;
            while (rs.next()) {
                String id = rs.getString(1);
                String nama_surat = rs.getString(2);
                String artiNamaSurat = rs.getString(3);
                int jumlahAyat = Integer.parseInt(rs.getString(4));
                s = new Surat(id, nama_surat, artiNamaSurat, jumlahAyat);
                DLM.addElement(s);
            }
            return DLM;
        } catch (Exception e) {
            System.out.println("Error Loading a Surat");
            JOptionPane.showMessageDialog(null, "Maaf, Surat yang anda cari tidak ada");
            return null;
        }
    }
    
    public DefaultListModel loadallSuratMakiyyah() {
        try {
            DefaultListModel DLM = new DefaultListModel();
            Statement stmt = con.createStatement();
            String query = "select * from tb_makiyyah";
            ResultSet rs = stmt.executeQuery(query);
            SuratMakiyyah s = null;
            while (rs.next()) {
                String idSurat = rs.getString(1);
                String namaSurat = rs.getString(2);
                String artiNamaSurat = rs.getString(3);
                int jumlahAyat = Integer.parseInt(rs.getString(4));
                s = new SuratMakiyyah(idSurat, namaSurat, artiNamaSurat, jumlahAyat);
                DLM.addElement(s);
            }
            return DLM;
        } catch (Exception e) {
            System.out.println("error loading list of Surat Makiyyah");
            return null;
        }
    }
    
    public DefaultListModel loadallSuratMadaniyyah() {
        try {
            DefaultListModel DLM = new DefaultListModel();
            Statement stmt = con.createStatement();
            String query = "select * from tb_madaniyyah";
            ResultSet rs = stmt.executeQuery(query);
            SuratMadaniyyah s = null;
            while (rs.next()) {
                String idSurat = rs.getString(1);
                String namaSurat = rs.getString(2);
                String artiNamaSurat = rs.getString(3);
                int jumlahAyat = Integer.parseInt(rs.getString(4));
                s = new SuratMadaniyyah(idSurat, namaSurat, artiNamaSurat, jumlahAyat);
                DLM.addElement(s);
            }
//            return listSuratMadaniyyah;  
            return DLM;
        } catch (Exception e) {
            System.out.println("error loading list of Surat Madaniyyah");
            return null;
        }
    }

}
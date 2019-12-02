/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import Database.Database;
import javax.swing.DefaultListModel;

/**
 *
 * @author MY PC
 */
public class Application {
    private DefaultListModel semuaSuratList;
    private DefaultListModel suratMadaniyyahList;
    private DefaultListModel suratMakiyyahList;
    private Database db;

    public Application() {
        semuaSuratList = new DefaultListModel();
        suratMadaniyyahList = new DefaultListModel();
        suratMakiyyahList = new DefaultListModel();
        db = new Database();
        db.connect();
    }
    
    public void loadSuratList() {
        semuaSuratList = db.loadallSurat();
    }
    
    public void loadSuratMakiyyahList() {
        suratMakiyyahList = db.loadallSuratMakiyyah();
    }
    
    public void loadSuratMadaniyyahList() {
        suratMadaniyyahList = db.loadallSuratMadaniyyah();
    }
    
    public void searchSurat(String namaSurat) {
        semuaSuratList = db.searchSurat(namaSurat);
    }
    
    public DefaultListModel getDLMSuratMakiyyahList() {
        return suratMakiyyahList;
    }
    
    public DefaultListModel getDLMSuratMadaniyyahList() {
        return suratMadaniyyahList;
    }
    
    public DefaultListModel getDLMSemuaSuratList() {
        return semuaSuratList;
    }
    
}

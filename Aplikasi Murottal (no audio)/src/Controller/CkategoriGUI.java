/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import View.*;
import java.awt.event.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author MY PC
 */
public class CkategoriGUI extends MouseAdapter implements ActionListener {
    private KategoriGUI view;
    private Application model;
    private ChomeGUI CH;
    private CsemuaSuratGUI CSS;
    private CsuratMakiyyahGUI CMK;
    private CsuratMadaniyyahGUI CMD;
    private CcariSuratGUI CCS;
    
    public CkategoriGUI(Application model) {
        this.model = model;
        view = new KategoriGUI();
        view.setVisible(true);
        view.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();

        if (source.equals(view.getBtnAllSurat())) {
            view.dispose();
            Application a = new Application();
            CSS = new CsemuaSuratGUI(a);
            CSS.actionPerformed(ae);
        } 
        if (source.equals(view.getBtnMakiyyah())) {
            view.dispose();
            Application a = new Application();
            CMK = new CsuratMakiyyahGUI(a);
            CMK.actionPerformed(ae);
        }
        if (source.equals(view.getBtnMadaniyyah())) {
            view.dispose();
            Application a = new Application();
            CMD = new CsuratMadaniyyahGUI(a);
            CMD.actionPerformed(ae);
        }
        if (source.equals(view.getBtnBack())) {
            view.dispose();
            Application a = new Application();
            CH = new ChomeGUI(a);
            CH.actionPerformed(ae);
        }
        if (source.equals(view.getBtnCariSurat())) {
            view.dispose();
            model = new Application();
            CCS = new CcariSuratGUI(model);
            CCS.actionPerformed(ae);
        }
    }
    
}

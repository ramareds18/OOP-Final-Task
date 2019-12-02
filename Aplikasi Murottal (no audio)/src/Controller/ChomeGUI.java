/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import Model.*;
import View.*;
import java.awt.event.*;
/**
 *
 * @author MY PC
 */
public class ChomeGUI implements ActionListener {
    private HomeGUI view;
    private Application model;
    private CaboutGUI CA;
    private CbantuanGUI CB;
    private CfaqGUI CF;
    private CkategoriGUI CK;
    
    public ChomeGUI(Application model) {
        this.model = model;
        view = new HomeGUI();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        if (source.equals(view.getBtnKategori())) {
            view.dispose();
            Application a = new Application();
            CK = new CkategoriGUI(a);
            CK.actionPerformed(ae);
        }
        else if (source.equals(view.getBtnAbout())) {
            view.dispose();
            Application a = new Application();
            CA = new CaboutGUI(a);
            CA.actionPerformed(ae);
        }
        else if (source.equals(view.getBtnFaq())) {
            view.dispose();
            Application a = new Application();
            CF = new CfaqGUI(a);
            CF.actionPerformed(ae);
        }
        else if (source.equals(view.getBtnHelp())) {
            view.dispose();
            Application a = new Application();
            CB = new CbantuanGUI(a);
            CB.actionPerformed(ae);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import View.FaqGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author MY PC
 */
public class CfaqGUI implements ActionListener {
    
    private Application model;
    private FaqGUI view;
    private ChomeGUI CH;
    
    public CfaqGUI(Application model) {
        this.model = model;
        view = new FaqGUI();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();

        if (source.equals(view.getBtnBack())) {
            view.dispose();
            model = new Application();
            CH = new ChomeGUI(model);
            CH.actionPerformed(ae);
        }
    }

}

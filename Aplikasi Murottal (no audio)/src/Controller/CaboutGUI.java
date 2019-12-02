/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import View.AboutGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author MY PC
 */
public class CaboutGUI implements ActionListener {
    private Application model;
    private AboutGUI view;
    private ChomeGUI CH;

    public CaboutGUI(Application model) {
        this.model = model;
        view = new AboutGUI();
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

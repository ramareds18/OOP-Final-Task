/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import View.SemuaSuratGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.media.Player;
import javax.swing.JOptionPane;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.embed.swing.JFXPanel;

/**
 *
 * @author MY PC
 */
public class CsemuaSuratGUI extends MouseAdapter implements ActionListener {

    public Player mp3;
    private SemuaSuratGUI view;
    private Application model;
    private CkategoriGUI CK;
    private final JFXPanel fxPanel = new JFXPanel();
    private boolean playing = false;

    public CsemuaSuratGUI(Application model) {
        this.model = model;
        view = new SemuaSuratGUI();
        view.setVisible(true);
        view.addActionListener(this);
        view.addMouseAdapter(this);
        model.loadSuratList();
        view.setSuratList(model.getDLMSemuaSuratList());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnBack())) {
            view.dispose();
            model = new Application();
            CK = new CkategoriGUI(model);
            CK.actionPerformed(ae);
        }
        if (source.equals(view.getBtnPlay())) {
            try {
                String bip = "";
                int index = view.getIndexListTerpilih();
                System.out.println("Index terpilih = "+ index);
                if (index == 0) {
                    bip = "src/Sound/Al-Fatihah.mp3";
                } else if (index == 5) {
                    bip = "src/Sound/Al-Anam.mp3";
                } else if (index == 35) {
                    bip = "src/Sound/Yaasin.mp3";
                }
                if (playing == false) {
                    Media hit = new Media(new File(bip).toURI().toString());
                    MediaPlayer mediaPlayer = new MediaPlayer(hit);
                    mediaPlayer.play();
                    playing = true;
                } else {
                    Media hit = new Media(new File(bip).toURI().toString());
                    MediaPlayer mediaPlayer = new MediaPlayer(hit);
                    mediaPlayer.stop();
                    JOptionPane.showMessageDialog(null, "Audio dihentikan, silakan pilih kembali surat yang ingin anda putar");
                    playing = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Audio untuk surat ini belum tersedia");
            }
        }


    }
    
    @Override
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if(source.equals(view.getList())){
            int i = view.getIndexListTerpilih();
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

/**
 *
 * @author MY PC
 */
public class MakiyyahGUI extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public MakiyyahGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnPlay = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        spJuz = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jListSuratMakiyyah = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelJudul = new javax.swing.JLabel();
        labelKategori = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 620, 20));

        btnPlay.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(51, 51, 255));
        btnPlay.setText("Play");
        jPanel2.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 100, 40));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(80, 148, 101));
        btnBack.setText("Kembali");
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListSuratMakiyyah.setOpaque(false);
        jPanel1.add(jListSuratMakiyyah, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 1590));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 880, 410, 710));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 410, 710));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 620));

        spJuz.setViewportView(jPanel1);

        jPanel2.add(spJuz, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 410, 310));

        labelJudul.setBackground(new java.awt.Color(255, 255, 255));
        labelJudul.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        labelJudul.setForeground(new java.awt.Color(80, 148, 101));
        labelJudul.setText("Murottal 30 Juz");
        jPanel2.add(labelJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 130, 50));

        labelKategori.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        labelKategori.setText("Makiyyah");
        jPanel2.add(labelKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 260, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/1.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-176, 0, 830, 460));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 650, 455));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setSuratMakiyyahList(DefaultListModel model) {
        jListSuratMakiyyah.setModel(model);
    }
    
    public JButton getBtnBack() {
        return btnBack;
    }

    public JButton getBtnPlay() {
        return btnPlay;
    }
    
    public JList getList() {
        return jListSuratMakiyyah;
    }

    public int getIndexListTerpilih() {
        return jListSuratMakiyyah.getSelectedIndex();
    }
    
    public void addActionListener(ActionListener e) {
        btnBack.addActionListener(e);
        btnPlay.addActionListener(e);
    }
    
    public void addMouseAdapter(MouseAdapter e) {
        jListSuratMakiyyah.addMouseListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListSuratMakiyyah;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelKategori;
    private javax.swing.JScrollPane spJuz;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author MY PC
 */
public class FaqGUI extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public FaqGUI() {
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
        jTextArea1 = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        labelJudul = new javax.swing.JLabel();
        labelKategori = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 620, 20));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tw Cen MT", 1, 17)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(80, 148, 101));
        jTextArea1.setRows(5);
        jTextArea1.setText("1. Q : Apa itu Aplikasi Murrotal Al-Qur'an? \n    A : Aplikasi Murrotal Al-Qur'an adalah suatu aplikasi yang berisikan kumpulan \n         audio/rekaman suara yang membacakan kumpulan surat-surat\n         di dalam Al-Qur'an.\n\n2. Q : Apa saja isi yang terkandung di dalam Aplikasi Murrotal Al-Qur'an? \n    A : Di dalam aplikasi tersebut terdapat kumpulan audio/rekaman suara yang \n         membacakan ayat suci Al-Qur'an berdasarkan kategori seperti jenis suratnya\n         (Surat Makkiyah dan Surat Madaniyyah)\n\n3. Q : Untuk apa aplikasi ini dibuat? \n    A : Memudahkan para pengguna untuk mendengarkan audio/rekaman suara \n         sesuai jenis suratnya, disediakan pula fitur mencari surat sehingga pengguna\n         dapat mencari surat tertentu yang diinginkan.");
        jTextArea1.setOpaque(false);
        jPanel2.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 610, 300));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(80, 148, 101));
        btnBack.setText("Kembali");
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, 40));

        labelJudul.setBackground(new java.awt.Color(255, 255, 255));
        labelJudul.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        labelJudul.setForeground(new java.awt.Color(80, 148, 101));
        labelJudul.setText("Murottal 30 Juz");
        jPanel2.add(labelJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 130, 50));

        labelKategori.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        labelKategori.setText("FAQ");
        jPanel2.add(labelKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 260, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/1.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-176, 0, 830, 460));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 650, 455));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnBack() {
        return btnBack;
    }
    
    public void addActionListener(ActionListener e) {
        btnBack.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelKategori;
    // End of variables declaration//GEN-END:variables
}

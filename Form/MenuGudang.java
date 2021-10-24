/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Class.Motor;
import Class.Sparepart;
import Class.TransaksiMotor;
import Class.TransaksiSparepart;
import Class.dataKaryawan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class MenuGudang extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MenuGudang(ArrayList<Sparepart> spareparts, ArrayList<Motor> motors, ArrayList<TransaksiSparepart> tspareparts, ArrayList<TransaksiMotor> tmotors, ArrayList<dataKaryawan> datak) {
        //Memanggil Method untuk memuat semua komponen JFrame
        initComponents();
        
        //listener button gudangmotor
        //untuk masuk ke menu gudang motor
        gudangmotor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //passing arraylist ke GudangMotor
                new GudangMotor(spareparts,motors,tspareparts,tmotors,datak).setVisible(true);
                //method untuk menutup form sebelumnya
                dispose();
            }
        });
        //listener button gudangsparepart
        //untuk masuk ke menu gudang sparepart
        gudangsparepart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //passing arraylist ke GudangSparepart
                new GudangSparepart(spareparts,motors,tspareparts,tmotors,datak).setVisible(true);
                //method untuk menutup form sebelumnya
                dispose();
            }
        });
        //listener button logout
        //untuk masuk ke menu utama dealer
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //passing arraylist ke MenuUtamaDealer
                new MenuUtamaDealer(spareparts, motors, tspareparts, tmotors, datak).setVisible(true);
                //method untuk menutup form sebelumnya
                dispose();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        gudangmotor = new javax.swing.JButton();
        gudangsparepart = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selamat Datang");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Menu Gudang");

        gudangmotor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealermotor/Icon/4047346-front-motor-motorcycle-scoot-scooter-view_113537.png"))); // NOI18N

        gudangsparepart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealermotor/Icon/tires_icon_153964.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Gudang Motor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Gudang Sparepart");

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealermotor/Icon/4115235-exit-logout-sign-out_114030.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(gudangmotor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel2)))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addComponent(gudangsparepart, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gudangsparepart, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gudangmotor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gudangmotor;
    private javax.swing.JButton gudangsparepart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}

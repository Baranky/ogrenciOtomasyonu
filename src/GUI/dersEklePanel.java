/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DAO.dersDAO;
import GUİ_Action.dersEkleAction;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import ogrenciOtomasyonu.dersler;

public class dersEklePanel implements CustomPanel {

    private JPanel panel;
    private JButton dersEkle;
    private JTextField textHoca, textDersId, textDersAdi;
    private JLabel lHoca, lDersId, lDersAdi;
    private JTable table;
    private JScrollPane jsc;
    dersler ders;
    dersDAO dersD;
    String data[][];
    String baslik[]={"ID", "DERS ADİ", "DERS HOCA"};
    public JButton getDersEkle() {
        if (this.dersEkle == null) {
            this.dersEkle = new JButton("EKLE");
            this.dersEkle.setBounds(120, 200, 150, 40);
            this.dersEkle.setBackground(Color.green.darker());
            this.dersEkle.addActionListener(new dersEkleAction(this));
        }
        return dersEkle;
    }

    public void setDersEkle(JButton dersEkle) {
        this.dersEkle = dersEkle;
    }

    public JTextField getTextHoca() {
        if (this.textHoca == null) {
            this.textHoca = new JTextField();
            this.textHoca.setBounds(120, 130, 150, 40);
        }
        return textHoca;
    }

    public void setTextHoca(JTextField textHoca) {
        this.textHoca = textHoca;
    }

    public JTextField getTextDersId() {
        if (this.textDersId == null) {
            this.textDersId = new JTextField();
            this.textDersId.setBounds(120, 10, 150, 35);

        }
        return textDersId;
    }

    public void setTextDersId(JTextField textDersId) {
        this.textDersId = textDersId;
    }

    public JTextField getTextDersAdi() {
        if (this.textDersAdi == null) {
            this.textDersAdi = new JTextField();
            this.textDersAdi.setBounds(120, 70, 150, 35);
        }
        return textDersAdi;
    }

    public void setTextDersAdi(JTextField textDersAdi) {
        this.textDersAdi = textDersAdi;
    }

    public JLabel getlHoca() {
        if (this.lHoca == null) {
            this.lHoca = new JLabel("HOCA ADI");
            this.lHoca.setBounds(60, 130, 100, 35);
        }
        return lHoca;
    }

    public void setlHoca(JLabel lHoca) {
        this.lHoca = lHoca;
    }

    public JLabel getlDersId() {
        if (this.lDersId == null) {
            this.lDersId = new JLabel("DERS ID");
            this.lDersId.setBounds(60, 10, 100, 35);
        }
        return lDersId;
    }

    public void setlDersId(JLabel lDersId) {
        this.lDersId = lDersId;
    }

    public JLabel getlDersAdi() {
        if (this.lDersAdi == null) {
            this.lDersAdi = new JLabel("DERS ADI");
            this.lDersAdi.setBounds(60, 70, 100, 35);
        }
        return lDersAdi;
    }

    public void setlDersAdi(JLabel lDersAdi) {
        this.lDersAdi = lDersAdi;
    }

    public JTable getTable() {
        if(this.table==null){
            ders=new dersler();
            dersD=new  dersDAO();
            try {
                data =dersD.listele(ders.getClass()+".txt");
            } catch (IOException ex) {
                Logger.getLogger(dersEklePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.table=new JTable(data,baslik);
            this.table.setBounds(10, 50, 250, 300);
        }
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JScrollPane getJsc() {
        if(this.jsc==null){
            this.jsc=new JScrollPane(getTable());
            this.jsc.setBounds(0, 300, 400, 300);
            this.jsc.setVisible(true);
        }
        return jsc;
    }

    public void setJsc(JScrollPane jsc) {
        this.jsc = jsc;
    }

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(400, 600);
            this.panel.setBounds(0, 0, 400, 600);
            this.panel.setLayout(null);
            this.panel.add(getlDersAdi());
            this.panel.add(getlDersId());
            this.panel.add(getlHoca());
            this.panel.add(getTextHoca());
            this.panel.add(getJsc());
            this.panel.add(getTextDersId());
            this.panel.add(getTextDersAdi());
             this.panel.add(getDersEkle());
            this.panel.setBackground(Color.ORANGE);
            this.panel.setVisible(true);
        }
        return panel;
    }
}

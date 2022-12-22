/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author baran
 */
public class idariPanel implements CustomPanel {

    private JPanel Panel;
    private JButton ogrSil, ogrEkle, ogrGuncelle, akademiEkle, akademiGuncelle, akademiSil;

    public JButton getOgrSil() {
        if (this.ogrSil == null) {
            this.ogrSil = new JButton("OGRENCİ SİL");
            this.ogrSil.setBounds(10, 10, 70, 50);
        }
        return ogrSil;
    }

    public void setOgrSil(JButton ogrSil) {
        this.ogrSil = ogrSil;
    }

    public JButton getOgrEkle() {
        if (this.ogrEkle == null) {
            this.ogrEkle = new JButton("OGRENCİ EKLE");
            this.ogrEkle.setBounds(10, 100, 70, 50);
        }
        return ogrEkle;
    }

    public void setOgrEkle(JButton ogrEkle) {
        this.ogrEkle = ogrEkle;
    }

    public JButton getOgrGuncelle() {
        if (this.ogrGuncelle == null) {
            this.ogrGuncelle = new JButton("OGRENCİ GUNCELLE");
            this.ogrGuncelle.setBounds(10, 200, 70, 50);
        }
        return ogrGuncelle;
    }

    public void setOgrGuncelle(JButton ogrGuncelle) {
        this.ogrGuncelle = ogrGuncelle;
    }

    public JButton getAkademiEkle() {
        if (this.akademiEkle == null) {
            this.akademiEkle = new JButton("AKADEMİ EKLE");
            this.akademiEkle.setBounds(10, 300, 70, 50);
        }
        return akademiEkle;
    }

    public void setAkademiEkle(JButton akademiEkle) {
        this.akademiEkle = akademiEkle;
    }

    public JButton getAkademiGuncelle() {
        if (this.akademiGuncelle == null) {
            this.akademiGuncelle = new JButton("AKADEMİ GUNCELLE");
            this.akademiGuncelle.setBounds(10, 400, 70, 50);
        }
        return akademiGuncelle;
    }

    public void setAkademiGuncelle(JButton akademiGuncelle) {
        this.akademiGuncelle = akademiGuncelle;
    }

    public JButton getAkademiSil() {
        if (this.akademiSil == null) {
            this.akademiSil = new JButton("AKADEMİ SİL");
            this.akademiSil.setBounds(10, 500, 70, 50);
        }
        return akademiSil;
    }

    public void setAkademiSil(JButton akademiSil) {
        this.akademiSil = akademiSil;
    }

    @Override
    public JPanel getPanel() {
        if (this.Panel == null) {
            this.Panel = new JPanel();
            this.Panel.add(this.getAkademiEkle());
            this.Panel.add(this.getAkademiSil());
            this.Panel.add(this.getAkademiGuncelle());
            this.Panel.add(this.getOgrSil());
            this.Panel.add(this.getOgrGuncelle());
            this.Panel.add(this.getOgrEkle());
            this.Panel.setLayout(null);
            this.Panel.setVisible(true);
            this.Panel.setSize(600, 600);
        }
        return Panel;

    }
}

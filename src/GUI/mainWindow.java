/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import GUİ_Action.mainWindowAction;
import java.awt.Color;
import java.awt.PopupMenu;
import javax.swing.*;

/**
 *
 * @author baran
 */
public class mainWindow {

    private JFrame window;
    private JPanel panel;
    private JButton yonetici;
    private JButton akademi;
    private JButton ogrenci;
    private JButton personel;
    public void build() {
        this.getWindow();
        
        this.getPanel().add(this.getYonetici());
        this.getPanel().add(this.getAkademi());
        this.getPanel().add(this.getOgrenci());
        this.getPanel().add(this.getPersonel());
    }

    public JFrame getWindow() {
        if (this.window == null) {
            this.window = new JFrame("ogrenci otomasyon sistemi");
            this.window.setContentPane(this.getPanel());
            this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.window.setLayout(null);
            this.window.setVisible(true);
            this.window.setSize(600, 600);

        }
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.getPanel().setSize(600, 600);
            this.panel.setLayout(null);
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getYonetici() {
        if (this.yonetici == null) {
            this.yonetici = new JButton("YONETİCİ");
            this.yonetici.setBounds(150, 250, 100, 40);
            this.yonetici.addActionListener(new mainWindowAction(this));
        }
        return yonetici;
    }

    public void setYonetici(JButton yonetici) {
        this.yonetici = yonetici;
    }

    public JButton getAkademi() {
        if (this.akademi == null) {
            this.akademi = new JButton("AKADEMİK");
            this.akademi.setBounds(300, 250, 100, 40);
             this.akademi.addActionListener(new mainWindowAction(this));
        }
        return akademi;
    }

    public void setAkademi(JButton akademi) {
        this.akademi = akademi;
    }

    public JButton getOgrenci() {
        if (this.ogrenci == null) {
            this.ogrenci = new JButton("OGRENCİ");
            this.ogrenci.setBounds(150, 350, 100, 40);
              this.ogrenci.addActionListener(new mainWindowAction(this));
        }
        return ogrenci;
    }

    public void setOgrenci(JButton ogrenci) {
        this.ogrenci = ogrenci;
    }

    public JButton getPersonel() {
        if (this.personel == null) {
            this.personel = new JButton("PERSONEL");
            this.personel.setBounds(300, 350, 100, 40);
        }
        return personel;
    }
    public void setPersonel(JButton personel) {
        this.personel = personel;
    }
}

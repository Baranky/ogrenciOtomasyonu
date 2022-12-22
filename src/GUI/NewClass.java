/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class NewClass {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


    private JFrame window;
    private JPanel panel1;
    private JPanel panel2;
    private JButton yonetici;
    private JButton akademi;
    private JButton ogrenci;
    private JButton personel;

    public void build() {
        this.getWindow();
       this.getPanel1().setSize(200, 800);
         this.getPanel2().setSize(700, 800);
     //this.getPanel().setBounds(0, 0, 300, 300);
        this.getPanel1().add(this.getYonetici());
        this.getPanel1().add(this.getAkademi());
        this.getPanel1().add(this.getOgrenci());
        this.getPanel1().add(this.getPersonel());
    }

    public JFrame getWindow() {
        if (this.window == null) {
            this.window = new JFrame("ogrenci otomasyon sistemi");
            this.window.add(this.getPanel1());
            this.window.add(this.getPanel2());
            //this.window.setContentPane(this.getPanel1());
            //this.window.setContentPane(this.getPanel());
            this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.window.setLayout(null);
            this.window.setVisible(true);
            this.window.setSize(800, 800);

        }
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JPanel getPanel1() {
        if (this.panel1 == null) {
            this.panel1= new JPanel();
            this.panel1.setLayout(null);
              this.panel1.setBounds(0, 0, 100, 400);
              this.panel1.setBackground(Color.blue);
        }
        return panel1;
    }

    public void setPanel(JPanel panel) {
        this.panel1 = panel;
    }
    public JPanel getPanel2() {
            if (this.panel2 == null) {
            this.panel2 = new JPanel();
            this.panel2.setLayout(null);
            this.panel2.setBounds(100, 0, 700, 800);
            this.panel2.setBackground(Color.red);
        }
        return panel2;
    }

    public void setPanel2(JPanel panel1) {
        this.panel2 = panel1;
    }


    public JButton getYonetici() {
        if (this.yonetici == null) {
            this.yonetici = new JButton("YONETİCİ");
            this.yonetici.setBounds(15, 10, 100, 50);
        }
        return yonetici;
    }

    public void setYonetici(JButton yonetici) {
        this.yonetici = yonetici;
    }

    public JButton getAkademi() {
        if (this.akademi == null) {
            this.akademi = new JButton("AKADEMİK");
            this.akademi.setBounds(15, 100, 100, 50);
        }
        return akademi;
    }

    public void setAkademi(JButton akademi) {
        this.akademi = akademi;
    }

    public JButton getOgrenci() {
        if (this.ogrenci == null) {
            this.ogrenci = new JButton("OGRENCİ");
            this.ogrenci.setBounds(15, 200, 100, 50);
        }
        return ogrenci;
    }

    public void setOgrenci(JButton ogrenci) {
        this.ogrenci = ogrenci;
    }

    public JButton getPersonel() {
        if (this.personel == null) {
            this.personel = new JButton("PERSONEL");
            this.personel.setBounds(15, 300, 100, 50);
        }
        return personel;
    }

    public void setPersonel(JButton personel) {
        this.personel = personel;
    }

}



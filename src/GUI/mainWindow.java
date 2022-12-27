/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import GUİ_Action.mainWindowAction;
import java.awt.Color;
import java.awt.Image;
import java.awt.PopupMenu;
import javax.swing.*;

/**
 *
 * @author baran
 */
public class mainWindow {

    private JFrame window;
    private JPanel panel;
    private JButton akademi;
    private JButton ogrenci;
    private JLabel logrenci,lakademi,linonu;
      Image mg = new ImageIcon(mainWindow.class.getResource("/inonu.png")).getImage();
    public void build() {
        this.getWindow();
    }

    public JFrame getWindow() {
        if (this.window == null) {
            this.window = new JFrame("ogrenci otomasyon sistemi");
            this.window.setContentPane(this.getPanel());
            this.getPanel().add(this.getAkademi());
            this.getPanel().add(this.getOgrenci());
            this.getPanel().add(getLinonu());
            this.getPanel().add(getLogrenci());
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
            this.ogrenci.setBounds(150, 250, 100, 40);
            this.ogrenci.addActionListener(new mainWindowAction(this));
        }
        return ogrenci;
    }

    public void setOgrenci(JButton ogrenci) {
        this.ogrenci = ogrenci;
    }

    public JLabel getLogrenci() {
        if(this.logrenci==null){
            this.logrenci=new JLabel();
            this.logrenci.setBounds(100, 150, 200, 50);
        }
        return logrenci;
    }

    public void setLogrenci(JLabel logrenci) {
        this.logrenci = logrenci;
    }

    public JLabel getLakademi() {
        if(this.lakademi==null){
            this.lakademi=new JLabel();
            this.lakademi.setBounds(250, 150, 150, 100);
        }
        return lakademi;
    }

    public void setLakademi(JLabel lakademi) {
        this.lakademi = lakademi;
    }

    public JLabel getLinonu() {
        if(this.linonu==null){
            this.linonu=new JLabel(new ImageIcon(mg));
            this.linonu.setBounds(170, 10, 200, 200);
        }
        return linonu;
    }

    public void setLinonu(JLabel linonu) {
        this.linonu = linonu;
    }

}

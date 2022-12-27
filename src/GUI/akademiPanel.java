/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import GUİ_Action.akademiAction;
import GUİ_Action.ogrenciAction;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author baran
 */
public class akademiPanel implements CustomPanel {

    private JPanel panel1, panel2, panel3;
    private JButton dersEkle, dersSil, ogrSil, ogrEkle;

    public JButton getdersEkle() {
        if (this.dersEkle == null) {
            this.dersEkle = new JButton("DERS EKLE");
            this.dersEkle.setBounds(10, 10, 150, 40);
            this.dersEkle.addActionListener(new akademiAction(this));
        }
        return dersEkle;
    }

    public void setDersEkle(JButton dersEkle) {
        this.dersEkle = dersEkle;
    }

    public JButton getdersSil() {
        if (this.dersSil == null) {
            this.dersSil = new JButton("DERS SİL");
            this.dersSil.setBounds(10, 100, 150, 40);
            this.dersSil.addActionListener(new akademiAction(this));
        }
        return dersSil;
    }

    public void setDersSil(JButton dersSil) {
        this.dersSil = dersSil;
    }

    public JButton getOgrSil() {
        if (this.ogrSil == null) {
            this.ogrSil = new JButton("OGRENCİ SİL");
            this.ogrSil.setBounds(10, 300, 150, 40);
            this.ogrSil.addActionListener(new akademiAction(this));
        }
        return ogrSil;
    }

    public void setOgrSil(JButton ogrSil) {
        this.ogrSil = ogrSil;
    }

    public JButton getOgrEkle() {
        if (this.ogrEkle == null) {
            this.ogrEkle = new JButton("OGRENCİ EKLE");
            this.ogrEkle.setBounds(10, 200, 150, 40);
            this.ogrEkle.addActionListener(new akademiAction(this));
        }
        return ogrEkle;
    }

    public void setOgrEkle(JButton ogrEkle) {
        this.ogrEkle = ogrEkle;
    }

    public JPanel getPanel1() {
        if (this.panel1 == null) {
            this.panel1 = new JPanel();
            this.panel1.setBounds(0, 0, 200, 600);
            this.panel1.setLayout(null);
            this.panel1.add(getdersEkle());
              this.panel1.add(getdersSil()); 
            this.panel1.add(getOgrEkle());
            this.panel1.add(getOgrSil());
            this.panel1.setBackground(Color.red);
        }
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        if (this.panel2 == null) {
            this.panel2 = new JPanel();
            this.panel2.setBounds(200, 0, 400, 600);
            this.panel2.setBackground(Color.blue);
            this.panel2.setLayout(null);
        }
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    @Override
    public JPanel getPanel() {
        if (this.panel3 == null) {
            this.panel3 = new JPanel();
            this.panel3.add(getPanel1());
            this.panel3.add(getPanel2());
            this.panel3.setSize(600, 600);
            this.panel3.setLayout(null);
            this.panel3.setVisible(true);
        }

        return panel3;

    }

}

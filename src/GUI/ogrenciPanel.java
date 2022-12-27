/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import GUİ_Action.akademiGirisAction;
import GUİ_Action.ogrenciAction;
import java.awt.Color;
import javax.management.NotificationListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author baran
 */
public class ogrenciPanel implements CustomPanel {

    private JPanel panel1, panel2, panel3;
    private JButton notList, sinavTarih, dersSecme, dersProgram;
    
    public JButton getNotList() {
        if (this.notList == null) {
            this.notList = new JButton("NOT LİSTESİ");
            this.notList.setBounds(10, 10, 150, 40);
            this.notList.addActionListener(new ogrenciAction(this));
        }
        return notList;
    }

    public void setNotList(JButton notList) {
        this.notList = notList;
    }

    public JButton getSinavTarih() {
        if (this.sinavTarih == null) {
            this.sinavTarih = new JButton("SİNAV TARİHLERİ");
            this.sinavTarih.setBounds(10, 100, 150, 40);
            this.sinavTarih.addActionListener(new ogrenciAction(this));
        }
        return sinavTarih;
    }

    public void setSinavTarih(JButton sinavTarih) {
        this.sinavTarih = sinavTarih;
    }

    public JButton getDersSecme() {
        if (this.dersSecme == null) {
            this.dersSecme = new JButton("DERS SEC");
            this.dersSecme.setBounds(10, 200, 150, 40);
            this.dersSecme.addActionListener(new ogrenciAction(this));
        }
        return dersSecme;
    }

    public void setDersSecme(JButton dersSecme) {
        this.dersSecme = dersSecme;
    }

    public JButton getDersProgram() {
        if (this.dersProgram == null) {
            this.dersProgram = new JButton("DERS PROGRAMİ");
            this.dersProgram.setBounds(10, 300, 150, 40);
            this.dersProgram.addActionListener(new ogrenciAction(this));
        }
        return dersProgram;
    }

    public void setDersProgram(JButton dersProgram) {
        this.dersProgram = dersProgram;
    }
    public JPanel getPanel1() {
        if (this.panel1 == null) {
            this.panel1 = new JPanel();
            this.panel1.setBounds(0, 0, 200, 600);
            this.panel1.setLayout(null);
            this.panel1.add(getDersProgram());
            this.panel1.add(getDersSecme());
            this.panel1.add(getSinavTarih());
            this.panel1.add(getNotList());
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
            this.panel3.setSize(600, 600);
            this.panel3.add(getPanel1());
            this.panel3.add(getPanel2());
            this.panel3.setLayout(null);
            this.panel3.setVisible(true);
        }
        return panel3;
    }

}

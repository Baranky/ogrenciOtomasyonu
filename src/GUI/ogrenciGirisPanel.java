/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import GUİ_Action.mainWindowAction;
import GUİ_Action.ogrenciGirisAction;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.*;

/**
 *
 * @author baran
 */
public class ogrenciGirisPanel implements CustomPanel {

    private JPanel Panel;
    private JButton giris;
    private JTextField ogrenciNo;
    private JLabel userName, password;
    private JPasswordField sifre;
   
    
    @Override
    public JPanel getPanel() {
        if (this.Panel == null) {
            this.Panel = new JPanel();
            this.Panel.setSize(600, 600);
            this.Panel.add(this.getOgrenciNo());
            this.Panel.add(this.getSifre());
            this.Panel.add(this.getUserName());
            this.Panel.add(this.getPassword());
            this.Panel.add(this.getGiris());
            this.Panel.setLayout(null);
            this.Panel.setVisible(true);

        }
        return Panel;
    }

    public JButton getGiris() {
        if (this.giris == null) {
            this.giris = new JButton("Giriş Yap");
            this.giris.setBackground(Color.GREEN.darker());
            this.giris.setBounds(250, 300, 120, 40);
            this.giris.addActionListener(new ogrenciGirisAction(this));
        }
        return giris;
    }

    public void setGiris(JButton giris) {
        this.giris = giris;
    }

    public JTextField getOgrenciNo() {
        if (this.ogrenciNo == null) {
            this.ogrenciNo = new JTextField();
            this.ogrenciNo.setBounds(250, 150, 150, 40);
        }
        return ogrenciNo;
    }

    public void setOgrenciNo(JTextField ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public JPasswordField getSifre() {
        if (this.sifre == null) {
            this.sifre = new JPasswordField();
            this.sifre.setBounds(250, 200, 150, 40);
        }
        return sifre;
    }

    public void setSifre(JPasswordField sifre) {
        this.sifre = sifre;
    }

    public JLabel getUserName() {
        if (this.userName == null) {
            this.userName = new JLabel("OGRENCİ NO:");
            this.userName.setBounds(150, 150, 150, 40);
        }
        return userName;
    }

    public void setUserName(JLabel userName) {
        this.userName = userName;
    }

    public JLabel getPassword() {
        if (this.password == null) {
            this.password = new JLabel(" SİFRE:");
            this.password.setBounds(150, 200, 150, 40);
        }
        return password;
    }

    public void setPassword(JLabel password) {
        this.password = password;
    }

   

}

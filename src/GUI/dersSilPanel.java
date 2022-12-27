/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DAO.dersDAO;
import GUİ_Action.dersSilAction;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import ogrenciOtomasyonu.dersler;

/**
 *
 * @author baran
 */
public class dersSilPanel implements CustomPanel {

    private JPanel panel;
    private JLabel dersId;
    private JTextField textSil;
    private JButton dersSil;
    private JTable table;
    private JScrollPane jsc;
    dersDAO dersDao;
    dersler ders;
    String data[][];
    String column[] = {"ID", "DERS ADİ", "DERS HOCA"};

    public JTextField getTextSil() {
        if (this.textSil == null) {
            this.textSil = new JTextField();
            this.textSil.setBounds(110, 20, 130, 35);
        }
        return textSil;
    }

    public void setTextSil(JTextField textSil) {
        this.textSil = textSil;
    }

    public JButton getDersSil() {
        if (this.dersSil == null) {
            this.dersSil = new JButton("DERS SİL");
            this.dersSil.setBackground(Color.red.darker());
            this.dersSil.setBounds(110, 80, 130, 35);
            this.dersSil.addActionListener(new dersSilAction(this));
        }
        return dersSil;
    }

    public void setDersSil(JButton dersSil) {
        this.dersSil = dersSil;
    }

    public JLabel getDersId() {
        if (this.dersId == null) {
            this.dersId = new JLabel("DERS ID:");
            this.dersId.setBounds(30, 20, 100, 35);
        }
        return dersId;
    }

    public void setDersId(JLabel dersId) {
        this.dersId = dersId;
    }

    public JTable getTable() {
        if (this.table == null) {
              ders=new dersler();
                dersDao=new dersDAO();
            try {
                data=dersDao.listele(ders.getClass()+".txt");
            } catch (IOException ex) {
                Logger.getLogger(dersSilPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.table = new JTable(data, column);
            this.table.setBounds(10, 200, 500, 400);

        }
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JScrollPane getJsc() {
        if (this.jsc == null) {
            this.jsc = new JScrollPane(getTable());
             this.jsc.setBounds(0, 200, 400, 400);
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
            this.panel.add(getDersSil());
            this.panel.add(getTextSil());
            this.panel.add(getDersId());
            this.panel.add(getJsc());
            this.panel.setLayout(null);
            this.panel.setBackground(Color.ORANGE);
            this.panel.setVisible(true);
        }
        return panel;
    }
}

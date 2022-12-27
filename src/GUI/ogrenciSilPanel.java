/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DAO.ogrenciDAO;
import GUİ_Action.*;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import ogrenciOtomasyonu.ogrenci;

/**
 *
 * @author baran
 */
public class ogrenciSilPanel implements CustomPanel {

    private JPanel panel;
    private JLabel lOgrId;
    private JButton ogrSil;
    private JTextField textOgrId;
    private JTable table;
    private JScrollPane jsc;
    ogrenciDAO ogrDao;
    ogrenci ogr;
    String data[][];
    String baslik[] = {"ID", "AD SOYAD", "SİNİF"};

    public JLabel getlOgrId() {
        if (this.lOgrId == null) {
            this.lOgrId = new JLabel("OGRENCİ ID");
            this.lOgrId.setBounds(30, 20, 100, 35);
        }
        return lOgrId;
    }

    public void setlOgrId(JLabel lOgrId) {
        this.lOgrId = lOgrId;
    }

    public JButton getOgrSil() {
        if (this.ogrSil == null) {
            this.ogrSil = new JButton("OGRENCİ SİL");
            this.ogrSil.setBounds(110, 80, 130, 35);
            this.ogrSil.setBackground(Color.red.darker());
            this.ogrSil.addActionListener(new ogrenciSilAction(this));
        }
        return ogrSil;
    }

    public void setOgrSil(JButton ogrSil) {
        this.ogrSil = ogrSil;
    }

    public JTextField getTextOgrId() {
        if (this.textOgrId == null) {
            this.textOgrId = new JTextField();
            this.textOgrId.setBounds(110, 20, 130, 35);
        }
        return textOgrId;
    }

    public void setTextOgrId(JTextField textOgrId) {
        this.textOgrId = textOgrId;
    }

    public JTable getTable() {
        if (this.table == null) {
            ogr = new ogrenci();
            ogrDao = new ogrenciDAO();
            try {
                data = ogrDao.listele(ogr.getClass() + ".txt");
            } catch (IOException ex) {
                Logger.getLogger(ogrenciSilPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.table = new JTable(data, baslik);
          // this.table=new JTable();
            this.table.setBounds(10, 200, 500, 400);
        }
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JScrollPane getjsc() {
        if (this.jsc == null) {
            this.jsc = new JScrollPane(getTable());
            this.jsc.setBounds(0, 200, 400, 400);
            this.jsc.setVisible(true);

        }
        return jsc;
    }

    public void setjsc(JScrollPane jsc) {
        this.jsc = jsc;
    }

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(400, 600);
            this.panel.setBounds(0, 0, 400, 600);
            this.panel.add(getjsc());
            this.panel.add(getOgrSil());
            this.panel.add(getlOgrId());
            this.panel.add(getTextOgrId());
            this.panel.setBackground(Color.orange);
            this.panel.setLayout(null);
            this.panel.setVisible(true);
        }
        return panel;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ_Action;

import DAO.ogrenciDAO;
import GUI.CustomPanel;
import GUI.ogrenciEklePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import ogrenciOtomasyonu.ogrenci;

/**
 *
 * @author baran
 */
public class ogrenciEkleAction implements ActionListener {

    private CustomPanel Panel;
    private ogrenciEklePanel ogrP;
    ogrenciDAO ogrDao;

    public ogrenciEkleAction(ogrenciEklePanel ogrP) {
        this.ogrP = ogrP;
    }
    ogrenci ogr;
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ogrP.getOgrEkle()) {
            ogr = new ogrenci(ogrP.getTextOgrAdSoyad().getText(),
                    Integer.parseInt(ogrP.getTextOgrId().getText()),
                    Integer.parseInt(ogrP.getTextSinif().getText()));
            ogrDao = new ogrenciDAO();
            try {
                Panel=new ogrenciEklePanel();
                ogrDao.ekle(ogr);
                 ogrP.getPanel().setVisible(false);
                ogrP.getPanel().removeAll();
                ogrP.getPanel().setVisible(true);
                ogrP.getPanel().add(Panel.getPanel());
                ogrP.getPanel().repaint();
            } catch (IOException ex) {
                Logger.getLogger(ogrenciEkleAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

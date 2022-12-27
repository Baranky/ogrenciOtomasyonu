/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ_Action;

import DAO.ogrenciDAO;
import GUI.*;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author baran
 */
public class ogrenciGirisAction implements ActionListener {

    private CustomPanel Panel;
    private ogrenciGirisPanel ogr;
    ogrenciDAO ogrd;
    String ogrenci = "ogrenciGiris.txt";
    boolean giris;
    String hataMsj="kulanici adi veya şifre yanliş";

    // mainWindow mw;
    public ogrenciGirisAction(ogrenciGirisPanel ogr) {
        this.ogr = ogr;
        //mw=new mainWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ogr.getGiris()) {
            Panel = new ogrenciPanel();
            String sifre = ogr.getSifre().getText();
            String user = ogr.getOgrenciNo().getText();
            ogrd = new ogrenciDAO();
            try {
                giris = ogrd.dogrulama(ogrenci, user, sifre);
                if (giris == true) {
                    ogr.getPanel().setVisible(false);
                    ogr.getPanel().removeAll();
                    ogr.getPanel().add(Panel.getPanel());
                    ogr.getPanel().setVisible(true);
                    ogr.getPanel().repaint();
                } else {
                    JOptionPane.showMessageDialog(ogr.getPanel(), hataMsj, "hata", 0);
                }
            } catch (IOException ex) {
                Logger.getLogger(ogrenciGirisAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

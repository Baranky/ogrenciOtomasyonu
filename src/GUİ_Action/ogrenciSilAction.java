/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ_Action;

import DAO.ogrenciDAO;
import GUI.CustomPanel;
import GUI.ogrenciEklePanel;
import GUI.ogrenciSilPanel;
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
public class ogrenciSilAction implements ActionListener {

    private CustomPanel Panel;
    private ogrenciSilPanel ogrp;
   
    ogrenciDAO ogrDao;

    public ogrenciSilAction(ogrenciSilPanel ogrp) {
        this.ogrp = ogrp;

    }
    ogrenci ogr;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ogrp.getOgrSil()) {
          //  System.out.println("GUİ_Action.ogrenciSilAction.actionPerformed()");
            ogr = new ogrenci();
            ogrDao=new ogrenciDAO();
            String str   = ogrp.getTextOgrId().getText();
            try {
              
                Panel=new ogrenciSilPanel();
               //ogrDao.listele(String.valueOf(ogr.getClass()));
                ogrDao.sil(ogr.getClass()+".txt",str);
                ogrp.getPanel().setVisible(false);
                ogrp.getPanel().removeAll();
                ogrp.getPanel().setVisible(true);
                ogrp.getPanel().add(Panel.getPanel());
                ogrp.getPanel().repaint();
            } catch (IOException ex) {
                Logger.getLogger(ogrenciSilAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

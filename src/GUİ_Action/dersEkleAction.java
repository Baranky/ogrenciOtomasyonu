/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ_Action;

import DAO.dersDAO;
import GUI.CustomPanel;
import GUI.dersEklePanel;
import GUI.ogrenciEklePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ogrenciOtomasyonu.dersler;

/**
 *
 * @author baran
 */
public class dersEkleAction implements ActionListener{
    private  CustomPanel Panel;
    private dersEklePanel dersP;
   dersler ders;
     dersDAO dersDao ;
     public dersEkleAction(dersEklePanel dersP){
        this.dersP=dersP;
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dersP.getDersEkle()) {
             ders=new dersler(Integer.parseInt(dersP.getTextDersId().getText()),
                     dersP.getTextDersAdi().getText(),
                   dersP.getTextHoca().getText());
             dersDao=new dersDAO();
            try {
                Panel=new dersEklePanel();
                dersDao.ekle(ders);
                dersP.getPanel().setVisible(false);
                dersP.getPanel().removeAll();
                dersP.getPanel().setVisible(true);
                dersP.getPanel().add(Panel.getPanel());
                dersP.getPanel().repaint();
            } catch (IOException ex) {
                Logger.getLogger(dersEkleAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ_Action;

import GUI.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author baran
 */
public class ogrenciAction implements ActionListener {

    private CustomPanel panel;
    private ogrenciPanel ogr;

    public ogrenciAction(ogrenciPanel ogr) {
        this.ogr = ogr;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ogr.getNotList()) {

            panel = new notListPanel();
            ogr.getPanel2().setVisible(false);
            ogr.getPanel2().removeAll();
            ogr.getPanel2().setVisible(true);
            ogr.getPanel2().repaint();
            ogr.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            ogr.getPanel2().repaint();
        }
        if (e.getSource() == ogr.getSinavTarih()) {
            panel = new sinavTarihleriPanel();
            
            ogr.getPanel2().setVisible(false);
            ogr.getPanel2().removeAll();
            ogr.getPanel2().setVisible(true);
            ogr.getPanel2().repaint();
            ogr.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
           
        }
        if (e.getSource() == ogr.getDersProgram()) {
            panel = new dersProgramiPanel();
            ogr.getPanel2().setVisible(false);
            ogr.getPanel2().removeAll();
            ogr.getPanel2().setVisible(true);
            ogr.getPanel2().repaint();
            ogr.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
         
        }

    }
}

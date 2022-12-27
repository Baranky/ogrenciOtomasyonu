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
public class akademiAction implements ActionListener {

    private CustomPanel panel;
    private akademiPanel ogr;

    public akademiAction(akademiPanel ogr) {
        this.ogr = ogr;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ogr.getOgrEkle()) {
            panel = new ogrenciEklePanel();
            ogr.getPanel2().setVisible(false);
            ogr.getPanel2().removeAll();
            ogr.getPanel2().setVisible(true);
            ogr.getPanel2().repaint();
            ogr.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            ogr.getPanel2().repaint();
        }
         if (e.getSource() == ogr.getOgrSil()) {

            panel = new ogrenciSilPanel();
            ogr.getPanel2().setVisible(false);
            ogr.getPanel2().removeAll();
            ogr.getPanel2().setVisible(true);
            ogr.getPanel2().repaint();
            ogr.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            ogr.getPanel2().repaint();
        }
         if (e.getSource() == ogr.getdersEkle()) {

            panel = new dersEklePanel();
            ogr.getPanel2().setVisible(false);
            ogr.getPanel2().removeAll();
            ogr.getPanel2().setVisible(true);
            ogr.getPanel2().repaint();
            ogr.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            ogr.getPanel2().repaint();
        }
         if (e.getSource() == ogr.getdersSil()) {

            panel = new dersSilPanel();
            ogr.getPanel2().setVisible(false);
            ogr.getPanel2().removeAll();
            ogr.getPanel2().setVisible(true);
            ogr.getPanel2().repaint();
            ogr.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            ogr.getPanel2().repaint();
        }
    }
}

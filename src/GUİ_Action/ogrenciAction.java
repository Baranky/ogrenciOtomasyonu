/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ_Action;

import GUI.CustomPanel;
import GUI.dersProgramiPanel;
import GUI.dersSecmePanel;
import GUI.mainWindow;
import GUI.notListPanel;
import GUI.ogrenciPanel;
import GUI.sinavTarihleriPanel;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

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

            ogr.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            ogr.getPanel2().repaint();
        }
        if (e.getSource() == ogr.getSinavTarih()) {
            panel = new sinavTarihleriPanel();
            ogr.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            ogr.getPanel2().repaint();
        }
        if (e.getSource() == ogr.getDersProgram()) {
            panel = new dersProgramiPanel();
            ogr.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            ogr.getPanel2().repaint();
        }
        if (e.getSource() == ogr.getDersSecme()) {
            panel = new dersSecmePanel();
            ogr.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            ogr.getPanel2().repaint();
        }

    }
}

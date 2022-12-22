/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ_Action;

import GUI.CustomPanel;
import GUI.mainWindow;
import GUI.notList;
import GUI.ogrenciPanel;
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
           
           panel = new notList();
           ogr.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            //mw.getPanel2().add(panel.getPanel());
            ogr.getPanel2().repaint();
        }
    }
}

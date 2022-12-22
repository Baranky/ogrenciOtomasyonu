/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ_Action;

import GUI.CustomPanel;
import GUI.akademiGirisPanel;
import GUI.akademiPanel;
import GUI.mainWindow;
import GUI.ogrenciGirisPanel;
import GUI.ogrenciPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author baran
 */
public class akademiGirisAction implements ActionListener {

    private CustomPanel Panel;
    private akademiGirisPanel akd;
    mainWindow mw;

    public akademiGirisAction(akademiGirisPanel akd) {
        this.akd = akd;
        mw = new mainWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == akd.getGiris()) {
            Panel = new akademiPanel();
            mw.getWindow().setContentPane(Panel.getPanel());
            mw.getWindow().repaint();
            
        }
    }
}

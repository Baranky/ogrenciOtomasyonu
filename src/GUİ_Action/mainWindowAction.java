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
public class mainWindowAction implements ActionListener {

    private mainWindow mw;
    private CustomPanel panel;

    public mainWindowAction(mainWindow mw) {
        this.mw = mw;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mw.getOgrenci()) {
           panel = new ogrenciGirisPanel();
            mw.getWindow().setContentPane(panel.getPanel());
            mw.getWindow().repaint();
        }

        if (e.getSource() == mw.getAkademi()) {
            panel = new akademiGirisPanel();
            mw.getWindow().setContentPane(panel.getPanel());
            mw.getWindow().repaint();
        }
        if (e.getSource() == mw.getYonetici()) {
           
        }

        if (e.getSource() == mw.getPersonel()) {
            panel = new personelPanel();
           
        }

    }
}

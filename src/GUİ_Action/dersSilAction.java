/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ_Action;

import DAO.dersDAO;
import GUI.CustomPanel;
import GUI.dersSilPanel;
import GUI.ogrenciSilPanel;
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
public class dersSilAction implements ActionListener {

    private CustomPanel panel;
    private dersSilPanel dersp;
    dersler ders;
    dersDAO dersDao;
    String dizi[][];

    public dersSilAction(dersSilPanel dersp) {
        this.dersp = dersp;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dersp.getDersSil()) {
            ders = new dersler();
            dersDao = new dersDAO();
            String str = dersp.getTextSil().getText();
            try {
                panel = new dersSilPanel();
                dersDao.sil(ders.getClass() + ".txt", str);
                dersp.getPanel().setVisible(false);
                dersp.getPanel().removeAll();
                dersp.getPanel().setVisible(true);
                dersp.getPanel().add(panel.getPanel());
                dersp.getPanel().repaint();
            } catch (IOException ex) {
                Logger.getLogger(dersSilAction.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}

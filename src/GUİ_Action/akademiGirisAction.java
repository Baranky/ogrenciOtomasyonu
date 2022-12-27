/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ_Action;

import DAO.akademiDAO;
import DAO.ogrenciDAO;
import GUI.CustomPanel;
import GUI.akademiGirisPanel;
import GUI.akademiPanel;
import GUI.mainWindow;
import GUI.ogrenciGirisPanel;
import GUI.ogrenciPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ogrenciOtomasyonu.akademi;

/**
 *
 * @author baran
 */
public class akademiGirisAction implements ActionListener {

    private CustomPanel Panel;
    private akademiGirisPanel akd;
    akademiDAO akademiD;
    String akademi="akademiGiris.txt";
    boolean giris;
    String hataMsj="kulanici adi veya şifre yanliş";
    
    public akademiGirisAction(akademiGirisPanel akd) {
        this.akd = akd;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == akd.getGiris()) {
            Panel = new akademiPanel();
           String sifre=akd.getSifre().getText();
           String user=akd.getKulaniciAdi().getText();
           akademiD=new akademiDAO();
            try {
                giris=akademiD.dogrulama(akademi, user, sifre);
                if(giris==true){
                    akd.getPanel().setVisible(false);
                    akd.getPanel().removeAll();
                    akd.getPanel().add(Panel.getPanel());
                    akd.getPanel().setVisible(true);
                    akd.getPanel().repaint();
                }
                else {
                    JOptionPane.showMessageDialog(akd.getPanel(), hataMsj, "hata", 0);
                }
            } catch (IOException ex) {
                Logger.getLogger(akademiGirisAction.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}

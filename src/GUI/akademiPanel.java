/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author baran
 */
public class akademiPanel implements CustomPanel {

    private JPanel Panel;
    private JButton notEkle, notDuzenle;

    public JButton getNotEkle() {
        if (this.notEkle == null) {
            this.notEkle = new JButton("NOT EKLE");
            this.notEkle.setBounds(10, 10, 70, 50);
        }

        return notEkle;
    }

    public void setNotEkle(JButton notEkle) {
        this.notEkle = notEkle;
    }

    public JButton getNotDuzenle() {
        if (this.notDuzenle == null) {
            this.notDuzenle = new JButton("NOT DUZENLE");
            this.notDuzenle.setBounds(10, 100, 70, 50);
        }
        return notDuzenle;
    }

    public void setNotDuzenle(JButton notDuzenle) {
        this.notDuzenle = notDuzenle;
    }

    @Override
    public JPanel getPanel() {
        if (this.Panel == null) {
            this.Panel = new JPanel();
            this.Panel.add(getNotDuzenle());
            this.Panel.add(getNotEkle());
            this.Panel.setSize(600, 600);
            this.Panel.setLayout(null);
            this.Panel.setVisible(true);
        }

        return Panel;

    }

}

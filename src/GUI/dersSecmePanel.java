/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author baran
 */
public class dersSecmePanel implements CustomPanel {

    private JPanel panel;

    @Override
    public JPanel getPanel() {
        this.panel = new JPanel();

        this.panel.setSize(400, 600);
        this.panel.setBounds(0, 0, 400, 600);
        this.panel.setLayout(null);
        this.panel.setBackground(Color.gray);
        this.panel.setVisible(true);

        return panel;

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author baran
 */
public class notListPanel  implements CustomPanel{
    private  JLabel label;
    private JPanel panel;

    public JLabel getLabel() {
        if(this.label==null){
           this.label=new JLabel("baran");
            this.label.setBounds(14, 23, 100, 30);
        }
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
    
    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel=new JPanel();
            this.panel.add(getLabel());
            this.panel.setSize(400, 600);
            this.panel.setBounds(0, 0, 400, 600);
            this.panel.setLayout(null);
            this.panel.setBackground(Color.green);
            this.panel.setVisible(true);
        }
        return panel ;
   
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DAO.notDAO;
import ogrenciOtomasyonu.not;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class notListPanel  implements CustomPanel{
    private JPanel panel;
    private JTable table;
    private JScrollPane Jsc;
    notDAO notd;
    not not;
    String [][] data;
      String baslik[]={"DERS AD", "VİZE(%40) ", "FİNAL(%60)","ORT.","HARF NOTU"};
    public JTable getTable() {
        if(this.table==null){
            not=new not();
            notd=new notDAO();
            try {
                data=notd.listele(not.getClass()+".txt");
            } catch (IOException ex) {
                Logger.getLogger(notListPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.table=new JTable(data,baslik);
            this.table.setBounds(0, 100, 400, 400);
           
        }
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JScrollPane getJsc() {
        if(this.Jsc==null){
            this.Jsc=new JScrollPane(getTable());
            this.Jsc.setBounds(0, 100, 380, 300);
             this.Jsc.setVisible(true);
        }
        return Jsc;
    }

    public void setJsc(JScrollPane Jsc) {
        this.Jsc = Jsc;
    }
    
    
    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel=new JPanel();
            this.panel.setSize(400, 600);
            this.panel.setBounds(0, 0, 400, 600);
            this.panel.add(getJsc());
            this.panel.setLayout(null);
            this.panel.setBackground(Color.orange);
            this.panel.setVisible(true);
        }
        return panel ;
   
    }
    
    
}

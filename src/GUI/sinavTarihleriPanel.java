/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DAO.dersProgramiDAO;
import DAO.sinavTarihleriDAO;
import java.awt.Color;
import java.awt.Panel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import ogrenciOtomasyonu.dersProgrami;
import ogrenciOtomasyonu.sinavTarihleri;

/**
 *
 * @author baran
 */
public class sinavTarihleriPanel implements CustomPanel {

    private JPanel panel;
     private  JTable Table;
     private JScrollPane jsc;
     String baslik[]={"GÜNLER","SİNAV","SAATİ"};
     String data[][];
    sinavTarihleri sinavt;
     sinavTarihleriDAO sinavD;
     
      public JTable getTable()  {
        if(this.Table==null){
            sinavD=new sinavTarihleriDAO();
            sinavt=new sinavTarihleri();
            try {
                data=sinavD.listele(sinavt.getClass()+".txt");
            } catch (IOException ex) {
                Logger.getLogger(dersProgramiPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.Table=new JTable(data,baslik);
            this.Table.setBounds(100, 100, 200, 300);
        }
        return Table;
    }

    public void setTable(JTable Table) {
        this.Table = Table;
    }
     
        public JScrollPane getJsc() {
        if (this.jsc == null) {
            this.jsc = new JScrollPane(getTable());
             this.jsc.setBounds(10, 100, 350, 400);
            this.jsc.setVisible(true);
        }
        return jsc;
    }

    public void setJsc(JScrollPane jsc) {
        this.jsc = jsc;
    }
     
    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(400, 600);
            this.panel.setBounds(0, 0, 400, 600);
            this.panel.add(getJsc());
            this.panel.setLayout(null);
           this.panel.setBackground(Color.orange);
            this.panel.setVisible(true);
        }
        return panel;

    }

}

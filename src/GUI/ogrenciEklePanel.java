/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DAO.ogrenciDAO;
import GUİ_Action.ogrenciEkleAction;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import ogrenciOtomasyonu.ogrenci;

public class ogrenciEklePanel implements CustomPanel{
    private JPanel panel;
    private JButton ogrEkle;
    private JLabel lOgrAdSoyad,lOgrId,lOgrSinif;
    private JTextField textOgrAdSoyad,textOgrId,textSinif;
    private JTable table;
    private JScrollPane jsc;
    ogrenci ogr;
    ogrenciDAO ogrD;
    String data[][];
    String baslik[] = {"ID", "AD SOYAD", "SİNİF"};
    // ogrenciDAO ogrencidao=new ogrenciDAO();
    public JButton getOgrEkle()  {
         if(this.ogrEkle==null){
            this.ogrEkle=new JButton("EKLE");
            this.ogrEkle.setBounds(150, 220, 120, 35);
            this.ogrEkle.setBackground(Color.green.darker());
            this.ogrEkle.addActionListener(new ogrenciEkleAction(this));
          //  value=getTextOgrAdSoyad()+" "+getTextOgrId().getText()+" "+getTextSinif();
          //   ogrenciDAO ogrencidao=new ogrenciDAO();
           //  ogrencidao.ekle(value);
          // ogrencidao.ekle(ogreklecontrol);
          
        }
        return ogrEkle;
    }

    public void setOgrEkle(JButton ogrEkle) {
        this.ogrEkle = ogrEkle;
    }

    public JLabel getlOgrAdSoyad() {
        if(this.lOgrAdSoyad==null){
            this.lOgrAdSoyad=new JLabel("AD SOYAD");
            this.lOgrAdSoyad.setBounds(40, 10, 150, 35);
        }
        return lOgrAdSoyad;
    }

    public void setlOgrAdSoyad(JLabel lOgrAdSoyad) {
        this.lOgrAdSoyad = lOgrAdSoyad;
    }

    public JLabel getlOgrId() {
        if(this.lOgrId==null){
            this.lOgrId=new JLabel("  ID");
            this.lOgrId.setBounds(40, 80, 70, 35);
        }
        return lOgrId;
    }

    public void setlOgrId(JLabel lOgrId) {
        this.lOgrId = lOgrId;
    }

    public JLabel getlOgrSinif() {
         if(this.lOgrSinif==null){
            this.lOgrSinif=new JLabel("SINIF:");
            this.lOgrSinif.setBounds(40, 160, 100, 35);
        }
        return lOgrSinif;
    }

    public void setlOgrSinif(JLabel lOgrSinif) {
        this.lOgrSinif = lOgrSinif;
    }
    public JTextField getTextOgrAdSoyad() {
         if(this.textOgrAdSoyad==null){
            this.textOgrAdSoyad=new JTextField();
            this.textOgrAdSoyad.setBounds(130, 10, 150, 35);
        }
        return textOgrAdSoyad;
    }

    public void setTextOgrAdSoyad(JTextField textOgrAdSoyad) {
        this.textOgrAdSoyad = textOgrAdSoyad;
    }

    public JTextField getTextOgrId() {
        if(this.textOgrId==null){
            this.textOgrId=new JTextField();
            this.textOgrId.setBounds(130, 80, 150, 35);
        }
        return textOgrId;
    }

    public void setTextOgrId(JTextField textOgrId) {
        this.textOgrId = textOgrId;
    }

    public JTextField getTextSinif() {
         if(this.textSinif==null){
            this.textSinif=new JTextField();
            this.textSinif.setBounds(130, 160, 150, 35);
        }
        return textSinif;
    }

    public void setTextSini(JTextField textSinif) {
        this.textSinif = textSinif;
    }

    public JTable getTable() {
        if(this.table==null){
            ogr=new ogrenci();
            ogrD=new ogrenciDAO();
            try {
                data=ogrD.listele(ogr.getClass()+".txt");
            } catch (IOException ex) {
                Logger.getLogger(ogrenciEklePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.table=new JTable(data,baslik);
            this.table.setBounds(40, 200, 300, 200);
        }
        
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JScrollPane getJsc() {
        if(this.jsc==null){
            this.jsc=new JScrollPane(getTable());
            this.jsc.setBounds(0, 300, 400, 300);
            this.jsc.setVisible(true);
        }
        return jsc;
    }

    public void setJsc(JScrollPane jsc) {
        this.jsc = jsc;
    }
    
    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel=new JPanel();
            this.panel.setSize(400, 600);
            this.panel.setBounds(0, 0, 400, 600);
            this.panel.add(getlOgrAdSoyad());
            this.panel.add(getlOgrId());
            this.panel.add(getlOgrSinif());
            this.panel.add(getTextOgrId());
            this.panel.add(getJsc());
            this.panel.add(getTextOgrAdSoyad());
            this.panel.add(getTextSinif());
            this.panel.add(getOgrEkle());
            this.panel.setBackground(Color.orange);
            this.panel.setLayout(null);
          
            this.panel.setVisible(true);
        }
        return panel;
    }
    
}

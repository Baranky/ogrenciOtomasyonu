/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ_Action;

import GUI.*;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author baran
 */
public class ogrenciGirisAction implements  ActionListener{
    private  CustomPanel Panel;
    private  ogrenciGirisPanel ogr;
   mainWindow mw;
            public ogrenciGirisAction(ogrenciGirisPanel ogr){
                this.ogr=ogr;
                mw=new mainWindow();
            }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ogr.getGiris()){
            System.out.println("GUİ_Action.ogrenciGirisAction.actionPerformed()");
            Panel=new ogrenciPanel();
            
           mw.getWindow().setContentPane(Panel.getPanel());
            mw.getWindow().repaint();
       
            
        }
    }
    
}

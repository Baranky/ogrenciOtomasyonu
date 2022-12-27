/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.IOException;
import ogrenciOtomasyonu.dersler;
import ogrenciOtomasyonu.ogrenci;


public class dersDAO extends DAO{
   public void ekle(dersler ders) throws IOException {
        super.ekle(ders); 
    }
      @Override
    public String [] sil(String dosya,String str) throws IOException{
        String [] liste=super.sil(dosya, str);
        return liste;
        
    }

   public String[] []listele(String dosya) throws IOException {
       String[][] liste = super.listele(dosya);
        return liste;
       
    }
  
}

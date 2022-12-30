/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.IOException;
public class akademiDAO extends DAO{
    @Override
     public boolean dogrulama(String dosya, String username, String sifre) throws IOException {
         boolean giris=super.dogrulama(dosya, username, sifre);
        return giris;
     
     }
    
}

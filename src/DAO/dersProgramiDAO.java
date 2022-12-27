/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.IOException;

public class dersProgramiDAO  extends DAO{
    public String[] []listele(String dosya) throws IOException {
       String[][] liste = super.listele(dosya);
        return liste;
       
    }

}

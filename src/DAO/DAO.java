/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author baran
 */
public abstract class DAO {

    public void ekle(Object nesne) throws IOException {
        String dosya = String.valueOf(nesne.getClass());
        dosya = dosya + ".txt";
        File f = new File(dosya);
        if (!f.exists()) {
            f.createNewFile();
        }
        FileWriter fw = new FileWriter(f, true);
        try ( BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(nesne.toString());
            bw.newLine();
            bw.close();
        }

    }

    public String[] sil(String dosya, String str) throws IOException {
        ArrayList list = new ArrayList();
        File file = new File(dosya);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileR = new FileReader(file);
        BufferedReader bfr = new BufferedReader(fileR);

        FileWriter fwr = new FileWriter(file, true);
        BufferedWriter bfw = new BufferedWriter(fwr);
        str = str + "#";
        String line = "", tempLine = "";

        while ((line = bfr.readLine()) != null) {
            //System.out.println(line);
            if (!line.contains(str)) {
                tempLine = tempLine + line;
                list.add(line);

            }

        }
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();

        for (int i = 0; i < list.size(); i++) {
            bfw.write((String) list.get(i));
            bfw.newLine();
        }
        bfw.close();
        String[] liste = tempLine.split("#");

        return liste;

    }

    public String[][] listele(String dosya) throws IOException {
//        ArrayList list=new ArrayList();
        // ArrayList liste2=new ArrayList();
        int satir = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        String[][] matris;
        File f = new File(dosya);
        if (!f.exists()) {
            f.createNewFile();
        }
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String str, line = " ";
        while ((str = br.readLine()) != null) {
            satir++;
            line = line + str;
        }
        String[] liste = line.split("#");
        /*for(String a: liste){
             System.out.println(a);
        }
         */
        matris = new String[satir][5];
        for (i = 0; i < satir; i++) {
            while (j < 5) {
                matris[i][j] = liste[k];
                j++;
                k++;
            }
            j = 0;

        }
        return matris;
    }

    public boolean dogrulama(String dosya, String username, String sifre) throws IOException {
        int satir = 0;
        boolean user,password;
        File file = new File(dosya);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileR = new FileReader(file);
        BufferedReader bfr = new BufferedReader(fileR);

        FileWriter fwr = new FileWriter(file, true);
        BufferedWriter bfw = new BufferedWriter(fwr);
        username = username + "#";
        sifre=sifre+"#";
        String line;

        while ((line = bfr.readLine()) != null) {
            if (line.contains(username)){
                 if (line.contains(sifre)){
                      return true;  
            }
        }
       
    }
 return false;
    }
}

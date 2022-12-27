package DAO;

import java.io.IOException;
import ogrenciOtomasyonu.ogrenci;

/**
 *
 * @author baran
 */
public class ogrenciDAO extends DAO {

    public void ekle(ogrenci ogr) throws IOException {
        super.ekle(ogr);
    }
    @Override
    public String [] sil(String dosya,String str) throws IOException{
        String [] liste=super.sil(dosya, str);
        return liste;
        
    }

    @Override
    public String[][] listele(String dosya) throws IOException {
        String[][] liste = super.listele(dosya);
        return liste;
    }
     public boolean dogrulama(String dosya, String username, String sifre) throws IOException {
         boolean giris=super.dogrulama(dosya, username, sifre);
        return giris;
     
     }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ogrenciOtomasyonu;

import DAO.dersProgramiDAO;

/**
 *
 * @author baran
 */
public class dersProgrami {

    private int dersİd;
    private int dersSaati;
    private akademi dersHocasi;
    private ogrenci dersAlanOgrenci;

    public dersProgrami() {
    }

    public dersProgrami(int dersİd, int dersSaati, akademi dersHocasi, ogrenci dersAlanOgrenci) {
        this.dersİd = dersİd;
        this.dersSaati = dersSaati;
        this.dersHocasi = dersHocasi;
        this.dersAlanOgrenci = dersAlanOgrenci;
    }

    public int getDersİd() {
        return dersİd;
    }

    public void setDersİd(int dersİd) {
        this.dersİd = dersİd;
    }

    public int getDersSaati() {
        return dersSaati;
    }

    public void setDersSaati(int dersSaati) {
        this.dersSaati = dersSaati;
    }

    public akademi getDersHocasi() {
        return dersHocasi;
    }

    public void setDersHocasi(akademi dersHocasi) {
        this.dersHocasi = dersHocasi;
    }

    public ogrenci getDersAlanOgrenci() {
        return dersAlanOgrenci;
    }

    public void setDersAlanOgrenci(ogrenci dersAlanOgrenci) {
        this.dersAlanOgrenci = dersAlanOgrenci;
    }

    @Override
    public String toString() {
        return "dersİd=" + dersİd
                + ", dersSaati=" + dersSaati
                + ", dersHocasi=" + dersHocasi
                + ", dersAlanOgrenci=" + dersAlanOgrenci;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ogrenciotomasyonu;

import java.util.Date;

/**
 *
 * @author baran
 */
public class dersler {
    private String dersİd;
    private akademi dersHoca;
    private ogrenci dersOgr;
    private String dersAd;
    private Date saati;
    private int kredi;

    public dersler() {
    }

    public dersler(String dersİd, akademi dersHoca, ogrenci dersOgr, String dersAd, Date saati, int kredi) {
        this.dersİd = dersİd;
        this.dersHoca = dersHoca;
        this.dersOgr = dersOgr;
        this.dersAd = dersAd;
        this.saati = saati;
        this.kredi = kredi;
    }
    public akademi getDersHoca() {
        return dersHoca;
    }

    public void setDersHoca(akademi dersHoca) {
        this.dersHoca = dersHoca;
    }

    public ogrenci getDersOgr() {
        return dersOgr;
    }

    public void setDersOgr(ogrenci dersOgr) {
        this.dersOgr = dersOgr;
    }

    public String getDersAd() {
        return dersAd;
    }

    public void setDersAd(String dersAd) {
        this.dersAd = dersAd;
    }

    public Date getSaati() {
        return saati;
    }

    public void setSaati(Date saati) {
        this.saati = saati;
    }

    public int getKredi() {
        return kredi;
    }

    public void setKredi(int kredi) {
        this.kredi = kredi;
    }
    public String getDersİd() {
        return dersİd;
    }

    public void setDersİd(String dersİd) {
        this.dersİd = dersİd;
    }

}

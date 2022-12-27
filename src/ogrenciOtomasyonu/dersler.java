/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ogrenciOtomasyonu;

import java.util.Date;

/**
 *
 * @author baran
 */
public class dersler {
    private int dersİd;
    private String dersHoca;
    private ogrenci dersOgr;
    private String dersAd;
    private Date saati;
    private int kredi;

    public dersler() {
    }

    public dersler(int dersİd, String dersAd,String dersHoca) {
        this.dersİd = dersİd;
        this.dersHoca = dersHoca;
        this.dersAd = dersAd;
    }
    public String getDersHoca() {
        return dersHoca;
    }

    public void setDersHoca(String dersHoca) {
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
    public int getDersİd() {
        return dersİd;
    }

    public void setDersİd(int dersİd) {
        this.dersİd = dersİd;
    }

    @Override
    public String toString() {
        return    dersİd +"#" +dersAd + "#"+dersHoca+"# # #";
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ogrenciOtomasyonu;

/**
 *
 * @author baran
 */
public class not {

    private String durum;
    private float ort;
    private  int vize;
    private int final1;
    private String harfnotu;
    private dersler ders;
    private akademi akademi;
    public not() {
    }

    public not(String durum, float ort) {
        this.durum = durum;
        this.ort = ort;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public float getOrt() {
        return ort;
    }

    public void setOrt(float ort) {
        this.ort = ort;
    }

    public int getVize() {
        return vize;
    }

    public void setVize(int vize) {
        this.vize = vize;
    }

    public int getFinal1() {
        return final1;
    }

    public void setFinal1(int final1) {
        this.final1 = final1;
    }

    public String getHarfnotu() {
        return harfnotu;
    }

    public void setHarfnotu(String harfnotu) {
        this.harfnotu = harfnotu;
    }

    public dersler getDers() {
        return ders;
    }

    public void setDers(dersler ders) {
        this.ders = ders;
    }

    public akademi getAkademi() {
        return akademi;
    }

    public void setAkademi(akademi akademi) {
        this.akademi = akademi;
    }

    @Override
    public String toString() {
        return "not{" + "durum=" + durum + ", ort=" + ort + ", vize=" + vize + ", final1=" + final1 + ", harfnotu=" + harfnotu + ", ders=" + ders + ", akademi=" + akademi + '}';
    }

  

}

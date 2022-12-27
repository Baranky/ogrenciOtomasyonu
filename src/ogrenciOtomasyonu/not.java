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

    @Override
    public String toString() {
        return "durum=" + durum
                + " ort=" + ort;
    }

}

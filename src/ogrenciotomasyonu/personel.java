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
public class personel {

    private String gorevi;
    private int maas;
    private String adSoyad;
    private int yas;
    private int tc;
    private String mail;
    private Date baslamaTarihi;
    private String password;
    private String username;

    public personel() {
    }

    public personel(String gorevi, int maas, String adSoyad, int yas, int tc, String mail, Date baslamaTarihi, String password, String username) {
        this.gorevi = gorevi;
        this.maas = maas;
        this.adSoyad = adSoyad;
        this.yas = yas;
        this.tc = tc;
        this.mail = mail;
        this.baslamaTarihi = baslamaTarihi;
        this.password = password;
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public Date getBaslamaTarihi() {
        return baslamaTarihi;
    }

    public void setBaslamaTarihi(Date baslamaTarihi) {
        this.baslamaTarihi = baslamaTarihi;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "gorevi=" + gorevi
                + " maas=" + maas
                + " adSoyad=" + adSoyad
                + " yas=" + yas
                + " tc=" + tc
                + " mail=" + mail
                + " baslamaTarihi=" + baslamaTarihi
                + " password=" + password
                + " username=" + username;
    }

}

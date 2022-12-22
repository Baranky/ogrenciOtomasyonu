package ogrenciotomasyonu;

import java.net.IDN;

public class ogrenci  {

  

    private int okulNo;
    private String adSoyad;
    private int sinif;
    private int id;
    private int tc;
    private String email;
    private String telNo;
    private String aldıgıDersler;
    private String userName;
    private String password;

    public ogrenci() {
    }

    public ogrenci(int okulNo, String adSoyad, int sinif, int id, int tc, String email, String telNo, String aldıgıDersler, String userName, String password) {
        this.okulNo = okulNo;
        this.adSoyad = adSoyad;
        this.sinif = sinif;
        this.id = id;
        this.tc = tc;
        this.email = email;
        this.telNo = telNo;
        this.aldıgıDersler = aldıgıDersler;
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getEmail() {
        return email;
    }

    public String getTelNo() {
        return telNo;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public String getAldıgıDersler() {
        return aldıgıDersler;
    }

    public void setAldıgıDersler(String aldıgıDersler) {
        this.aldıgıDersler = aldıgıDersler;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "okulNo=" + okulNo
                + " adSoyad=" + adSoyad
                + " sinif=" + sinif
                + " id=" + id
                + " tc=" + tc
                + " email=" + email
                + " telNo=" + telNo
                + " aldigiDersler=" + aldıgıDersler
                + " userName=" + userName
                + " password=" + password;
    }

}

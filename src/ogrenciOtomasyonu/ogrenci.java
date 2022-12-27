package ogrenciOtomasyonu;

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

    public ogrenci( String adSoyad, int sinif, int id) {
        //this.okulNo = okulNo;
        this.adSoyad = adSoyad;
        this.sinif = sinif;
        this.id = id;
        //this.tc = tc;
        //this.email = email;
       // this.telNo = telNo;
        //this.aldıgıDersler = aldıgıDersler;
        //this.userName = userName;
        //this.password = password;
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

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
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
        return  sinif+"#"+adSoyad+"#"+ id+"# # #";   
              
    }

}

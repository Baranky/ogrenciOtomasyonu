package ogrenciotomasyonu;

public class idari {

    private String kademe;
    private String yetki;
    private String maas;
    private String mail;
    private String telNo;
    private String userName;
    private String password;

    public idari() {
    }

    public idari(String kademe, String yetki, int yas, String maas, String mail, String telNo, String userName, String password) {
        this.kademe = kademe;
        this.yetki = yetki;
        this.maas = maas;
        this.mail = mail;
        this.telNo = telNo;
        this.userName = userName;
        this.password = password;
    }

    public String getKademe() {
        return kademe;
    }

    public void setKademe(String kademe) {
        this.kademe = kademe;
    }

    public String getYetki() {
        return yetki;
    }

    public void setYetki(String yetki) {
        this.yetki = yetki;
    }

    public String getMaas() {
        return maas;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelNo() {
        return telNo;
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
        return "kademe=" + kademe
                + " yetki=" + yetki
                + " maas=" + maas
                + " mail=" + mail
                + " telNo=" + telNo
                + " userName=" + userName
                + " password=" + password;

    }

}

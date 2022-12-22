package ogrenciotomasyonu;

public class akademi {

    private String adSoyad;
    private int maas;
    private String alan;
    private dersler verdigiDers;
    private int tc;
    private String mail;
    private String telNo;
    private String userName;
    private String password;

    public akademi() {
    }

    public akademi(String adSoyad, int maas, String alan, dersler verdigiDers, int tc, String mail, String telNo, String userName, String password, int maaş) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        this.alan = alan;
        this.verdigiDers = verdigiDers;
        this.tc = tc;
        this.mail = mail;
        this.telNo = telNo;
        this.userName = userName;
        this.password = password;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }

    public dersler getVerdigiDers() {
        return verdigiDers;
    }

    public void setVerdigiDers(dersler verdigiDers) {
        this.verdigiDers = verdigiDers;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
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
        return "adSoyad=" + adSoyad
                + " maas=" + maas
                + " alan=" + alan
                + " verdigiDers=" + verdigiDers
                + " tc=" + tc
                + " mail=" + mail
                + " telNo=" + telNo
                + " userName=" + userName
                + " password=" + password;
    }

}

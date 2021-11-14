package com.bilgeadam.ornek;

public class Oyuncu {

    private static int sayac;
    private int no;
    private String ad;
    private String soyad;
    //static tanımlanırsa class variable'dir.
    //bir obje değeri değiştirirse
    //diğer objelerde değişen değeri görür
    //static demezsek instance variable'dir
    //her obje değişkenlerin ilk değeriyle başlar


    public Oyuncu(int no, String ad, String soyad) {
        this.no = no;

    }

    public static int getSayac() {
        return sayac;
    }

    public static void setSayac(int sayac) {
        Oyuncu.sayac = sayac;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }


    public Oyuncu() {

        sayac = sayac + 1;
    }
}
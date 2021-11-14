package com.bilgeadam.ornek;

public class StaticDeneme {

    //Instance variable
    int sayi1;

    // Class variable değişken static ise class variable'dir.
    static int sayi2;


    public static void main(String[] args) {

        // static olmayan değişkene ,static metoddan erişilemez.
        //erişmek istiyorsak, class'tan kendi objesini
        //oluşturarak erişeceğiz.

        // Local variable'ı biz initialize etmek zorundayız.
        // Yeni ilke değer vermek zorundayız.
        int sayi3=0;

        StaticDeneme sd = new StaticDeneme();

        System.out.println("Sayi1: "+sd.sayi1);
        System.out.println("Sayi2: "+sayi2);
        System.out.println("Sayi3:"+sayi3);

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deneme4;

public class Kitap {
    private String kitapAdi;//Kitap bilgileri
    private String yazarAdi;
    private String basimYili;
    private String kategori;
    private String yayinevi;

    public Kitap(String kitapAdi, String yazarAdi, String basimYili, String kategori, String yayinevi) {//Constructor
        this.kitapAdi = this.kitapAdi;
        this.yazarAdi = yazarAdi;
        this.basimYili = basimYili;
        this.kategori = kategori;
        this.yayinevi = yayinevi;
    }
//Getter ve setter metotları
    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public String getBasimYili() {
        return basimYili;
    }

    public void setBasimYili(String basimYili) {
        this.basimYili = basimYili;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }
}
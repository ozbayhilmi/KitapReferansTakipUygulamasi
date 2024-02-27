/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deneme4;

/**
 *
 * @author HP
 */
public class User {
    private String kullanici_adi;
    private String sifre;

    public User(String kullanici_adi, String sifre) {
        this.kullanici_adi = kullanici_adi;
        this.sifre = sifre;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
    
}
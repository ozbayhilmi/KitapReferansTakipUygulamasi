package com.mycompany.deneme4;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class KitapListesi extends Kitap implements IFKitapEkleCikar{
    
    private static ArrayList <Kitap> kitapListesi = new ArrayList<Kitap>(); //Kitapları tutmak için arraylist

    public static ArrayList<Kitap> getKitapListesi() {//getter
        return kitapListesi;
    }

    public static void setKitapListesi(ArrayList<Kitap> kitapListesi) {//setter
        KitapListesi.kitapListesi = kitapListesi;
    }
       
    public KitapListesi(String kitapAdi, String yazarAdi, String basimYili, String kategori, String yayinevi) {
        super(kitapAdi, yazarAdi, basimYili, kategori, yayinevi);
    }
    @Override
    public void kitapEkle(Kitap kitap) {//kitapekle metotu
        kitapListesi.add(kitap);
    }
    @Override
    public void kitapSil(Kitap kitap) {//kitapsil metodu
        kitapListesi.remove(kitap);
    }
    
}
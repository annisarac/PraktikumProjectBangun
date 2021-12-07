/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;
import bangundatar.*;
import bangunruang.*;
/**
 *
 * @author news
 */
public class MainClass {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        Lingkaran l = new Lingkaran();
        PersegiPanjang pp = new PersegiPanjang();
        
        Tabung t = new Tabung();
        Balok b = new Balok();
        Bola b2 = new Bola();
        
        //Persegi
        System.out.println("Luas dan Keliling Persegi : ");
        p.sisi = 8;
        p.hitungLuas();
        p.hitungKeliling();
        p.tampilHasil();
        
        System.out.println("----------------------------------------------------------------------------");
        
        //Persegi Panjang
        System.out.println("Luas dan Keliling Persegi Panjang : ");
        pp.panjang = 12;
        pp.lebar = 5;
        pp.hitungLuas();
        pp.hitungKeliling();
        pp.tampilHasil();
        
        System.out.println("----------------------------------------------------------------------------");
        
        //Lingkaran
        System.out.println("Luas dan Keliling Lingkaran : ");
        l.jarijari = 7;
        l.hitungLuas();
        l.hitungKeliling();
        l.tampilHasil();
        
        
        System.out.println("----------------------------------------------------------------------------");
        
        //Tabung
        System.out.println("Volume dan Luas Permukaan Tabung : ");
        t.jarijari = 7;
        t.tinggi = 10;
        t.hitungVolume();
        t.hitungLuasPermukaan();
        t.tampilHasil();
        
        System.out.println("----------------------------------------------------------------------------");
        
        //Balok
        System.out.println("Volume dan Luas Permukaan Balok : ");
        b.panjang = 10;
        b.lebar = 7;
        b.tinggi = 3;
        b.hitungVolume();
        b.hitungLuasPermukaan();
        b.tampilHasil();

        
        System.out.println("----------------------------------------------------------------------------");
        
        //Bola
        System.out.println("Volume dan Luas Permukaan Bola : ");
        b2.jarijari = 7;
        b2.hitungVolume();
        b2.hitungLuasPermukaan();
        b2.tampilHasil();
    }
}

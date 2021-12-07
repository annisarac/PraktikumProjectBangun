/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author news
 */
public class Balok extends BangunRuang{
    public double panjang, lebar, tinggi;
     
    public double hitungVolume(){
        double volume = panjang * lebar * tinggi;
        return volume;
    }
    
    public double hitungLuasPermukaan(){
 	  double luas = 2 * ((panjang * lebar) + (lebar * tinggi) + (tinggi* panjang));
          return luas;
    }
}

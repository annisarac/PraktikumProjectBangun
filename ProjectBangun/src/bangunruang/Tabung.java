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
public class Tabung extends BangunRuang {
    public double jarijari, tinggi;
     
    public double hitungVolume(){
        double volume = Math.PI * Math.pow(jarijari, 2) * this.tinggi;
        return volume;
    }
    
    public double hitungLuasPermukaan(){
 	  double luas = Math.PI * this.jarijari *(jarijari + (2 * tinggi));
          return luas;
    }
}

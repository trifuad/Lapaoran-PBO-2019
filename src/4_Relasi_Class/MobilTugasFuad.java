/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author MADHA
 */
public class MobilTugasFuad {
     private String nama;
     private int harga;
     private int diskon; 
     
     public MobilTugasFuad (String nama,int harga){
         this.nama = nama;
         this.harga = harga ;
     }
     public MobilTugasFuad(){
         this.nama = nama;
         this.harga = harga;
     }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }
     
    public int hitungHarga(){
        return harga - diskon;
    }
    
    public String info (){
    String info = " ";
    info += "Merk Mobil = " + this.nama +"\n";
    info += "Harga      = " + this.harga+"\n";
    info += "Diskon     = " + this.diskon + "\n";
    return info;
    }
}

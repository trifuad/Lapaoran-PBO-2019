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
public class Sopir1841720139Fuad {
    private String nama ;
    private int biaya ;
    
    public Sopir1841720139Fuad (){
        this.nama = nama;
        this.biaya = biaya;
        
    }
    
    public Sopir1841720139Fuad (String nama, int biaya){
        this.nama = nama ;
        this.biaya = biaya ;
    }

    public String getNamaFuad() {
        return nama;
    }

    public int getBiayaFuad() {
        return biaya;
    }

    public void setNamaFuad(String nama) {
        this.nama = nama;
    }

    public void setBiayaFuad(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiayaSopirFuad(int hari) {
        return biaya * hari ;
    }
}

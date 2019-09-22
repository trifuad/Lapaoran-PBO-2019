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
public class Mobil1841720139Fuad {
private String merk;
private int biaya;

    public Mobil1841720139Fuad(){
        this.merk = merk;
        this.biaya = biaya;
    }
    
    public Mobil1841720139Fuad (String nama,int biaya){
        this.biaya = biaya;
        this.merk = nama;
    }

    public String getMerkFuad() {
        return merk;
    }

    public int getBiayaFuad() {
        return biaya;
    }

    public void setMerkFuad(String merk) {
        this.merk = merk;
    }

    public void setBiayaFuad(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiayaMobilFuad(int hari){
        return biaya * hari ;
    }
}

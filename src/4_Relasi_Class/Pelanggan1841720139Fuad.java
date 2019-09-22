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
public class Pelanggan1841720139Fuad {
    private String nama;
    private Mobil1841720139Fuad mobil;
    private Sopir1841720139Fuad sopir;
    private int hari ;
    
    public  Pelanggan1841720139Fuad(){
        this.nama = nama;
        this.mobil = mobil;
        this.sopir = sopir;
        this. hari = hari ;
    }
    
    public  Pelanggan1841720139Fuad(String nama, Mobil1841720139Fuad mobil,Sopir1841720139Fuad sopir,int hari){
        this.nama = nama;
        this.mobil = mobil;
        this.sopir = sopir;
        this. hari = hari ;
    }

    public String getNamaFuad() {
        return nama;
    }

    public Mobil1841720139Fuad getMobilFuad() {
        return mobil;
    }

    public Sopir1841720139Fuad getSopirFuad() {
        return sopir;
    }

    public int getHariFuad() {
        return hari;
    }

    public void setNamaFuad(String nama) {
        this.nama = nama;
    }

    public void setMobilFuad(Mobil1841720139Fuad mobil) {
        this.mobil = mobil;
    }

    public void setSopirFuad(Sopir1841720139Fuad sopir) {
        this.sopir = sopir;
    }

    public void setHariFuad(int hari) {
        this.hari = hari;
    }
    
    public int hitungBiayaTotalFuad(){
        return mobil.hitungBiayaMobilFuad (hari) + sopir.hitungBiayaSopirFuad(hari);
    }
}

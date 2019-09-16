/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author MADHA
 */
public class Anggota1841720139Fuad  {
    private String nama;
    private String alamat;
    private float simpanan;
    
    Anggota1841720139Fuad(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }
    
    public void setNamaFuad(String nama){
        this.nama = nama;
    }
    public void setAlamatFuad(String alamat){
        this.alamat = alamat;
    }
    public String getNamaFuad(){
        return nama;
    }
    public String getAlamatFuad(){
        return alamat;
    }
    
    public float getSimpananFuad(){
        return simpanan;
    }
    public void setorFuad(float uang){
        simpanan +=uang;
    }
    public void pinjamFuad(float uang){
        simpanan -=uang;
    }
}

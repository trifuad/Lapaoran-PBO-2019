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

public class AnggotaTugasUbah1841720139Fuad {
     private String nama;
     private String nomorKtp;     
     private int limitPinjaman;
     private int jumlahPinjaman; 
 
    public AnggotaTugasUbah1841720139Fuad(String nomorKtp, String nama, int limitPinjaman) {
        this.nama = nama;
        this.nomorKtp = nomorKtp;
        this.limitPinjaman = limitPinjaman;
    }
    public String getNamaFuad(){
        return nama;
    }
    public int getLimitPinjamanFuad(){
        return limitPinjaman;
    }
    public int getJumlahPinjamanFuad(){
        return jumlahPinjaman;
    }
    public void pinjamFuad(int pinjam){
        if (pinjam>limitPinjaman)
        {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }else{
            jumlahPinjaman+=pinjam;
        }
    }
    public void angsurFuad(int angsur){
        if(angsur < (jumlahPinjaman*0.1)){
            System.out.println("Maaf, angsuran harus 10% dari jumlah uang yang dipinjamkan");
        }else {
            jumlahPinjaman -= angsur;
        }
    }
}

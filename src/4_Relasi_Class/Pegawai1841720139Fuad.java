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
public class Pegawai1841720139Fuad {
    private String nip;
    private String nama;
    
    public Pegawai1841720139Fuad(){
        this.nama = nama;
        this.nip = nip;
    }
    
     public Pegawai1841720139Fuad(String nip,String nama){
        this.nama = nama;
        this.nip = nip;
    }

    public String getNipFuad() {
        return nip;
    }

    public String getNamaFuad() {
        return nama;
    }

    public void setNipFuad(String nip) {
        this.nip = nip;
    }

    public void setNamaFuad(String nama) {
        this.nama = nama;
    }
     
    public String info(){
        String info = "";
        info += "Nip : "+this.nip + "\n";
        info +="Nama : "+this.nama + "\n";
        return info;
    }
}

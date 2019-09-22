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
public class KeretaApi1841720139Fuad {
    private String nama;
    private String kelas;
    private Pegawai1841720139Fuad masinis;
    private Pegawai1841720139Fuad asisten;
    
    public KeretaApi1841720139Fuad(String nama,String kelas,Pegawai1841720139Fuad masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }
    
    public KeretaApi1841720139Fuad(String nama,String kelas,Pegawai1841720139Fuad masinis,Pegawai1841720139Fuad asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNamaFuad() {
        return nama;
    }

    public String getKelasFuad() {
        return kelas;
    }

    public Pegawai1841720139Fuad getMasinisFuad() {
        return masinis;
    }

    public Pegawai1841720139Fuad getAsistenFuad() {
        return asisten;
    }

    public void setNamaFuad(String nama) {
        this.nama = nama;
    }

    public void setKelasFuad(String kelas) {
        this.kelas = kelas;
    }

    public void setMasinisFuad(Pegawai1841720139Fuad masinis) {
        this.masinis = masinis;
    }

    public void setAsistenFuad(Pegawai1841720139Fuad asisten) {
        this.asisten = asisten;
    }
    
    public String info (){
        String info = "";
        info += "Nama : "+this.nama+"\n";
        info += "Kelas : "+this.kelas+"\n";
        info += "Masinis : "+this.masinis.info()+"\n";
        info += "Asisiten : "+this.asisten.info()+"\n";
        return info;
    }
}

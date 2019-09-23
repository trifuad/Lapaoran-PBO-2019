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
public class Penumpang1841720139Fuad {
    private String ktp;
    private String nama;
    
    public Penumpang1841720139Fuad (String nama,String ktp){
        this.ktp = ktp ;
        this.nama = nama ;
    }

    public String getKtpFuad() {
        return ktp;
    }

    public String getNamaFuad() {
        return nama;
    }

    public void setKtpFuad(String ktp) {
        this.ktp = ktp;
    }

    public void setNamaFuad(String nama) {
        this.nama = nama;
    }
    
    public String info(){
        String info = "";
        info += "Ktp"+ ktp + "\n";
        info += "Nama"+ nama+"\n";
        return info;
    } 
    
}

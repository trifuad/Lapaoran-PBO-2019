/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author MADHA
 */
public class Karyawan1841720139Fuad {
    private String nama,nip,golongan;
    private double gaji ;

    public void msetNamaFuad(String nama) {
        this.nama = nama;
    }

    public void msetNipFuad(String nip) {
        this.nip = nip;
    }

    public void msetGolonganFuad(String golongan) {
        this.golongan = golongan;
        
        switch(golongan.charAt(0)){
            case'1':this.gaji=5000000;
            break;
            case'2':this.gaji=3000000;
            break;
            case'3':this.gaji=2000000;
            break;
            case'4':this.gaji=1000000;
            break;
            case'5':this.gaji=750000;
            break;
        }
    }

    public void msetGajiFuad(double gaji) {
        this.gaji = gaji;
    }

    public String mgetNamaFuad() {
        return nama;
    }

    public String mgetNipFuad() {
        return nip;
    }

    public String mgetGolonganFuad() {
        return golongan;
    }

    public double mgetGajiFuad() {
        return gaji;
    }
     
    
}

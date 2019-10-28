/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8.Praktikum1;

/**
 *
 * @author MADHA
 */
public class Orang1841720139Fuad {
    private String nama ;
    private Hewan1841720139Fuad hewanPeliharaan ;

    public Orang1841720139Fuad(String nama) {
        this.nama = nama;
    }

    public void peliharaHewan (Hewan1841720139Fuad hewanPeliharaan) {
        this.hewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara");
        this.hewanPeliharaan.bergerak();
        System.out.println("----------------------------------------");
    }
    
    
    
    
}

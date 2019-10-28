/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8.Praktikum2;

/**
 *
 * @author MADHA
 */
public class Rektor1841720139Fuad {
    public void beriSertifikatCumlaude(ICumlaude1841720139Fuad mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana anda bisa cumlaude?");
        mahasiswa.kuliah();
        mahasiswa.lulus();
        mahasiswa.mreaihIPKTinggi();
        
        System.out.println("-----------------------------------------------");
    }
    
    public void beriSertifikatMawapres(IBerprestasi1841720139Fuad mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKopentisi();
        mahasiswa.membuatPublikasiilmiah();
        System.out.println("-----------------------------------------------");
    }
}

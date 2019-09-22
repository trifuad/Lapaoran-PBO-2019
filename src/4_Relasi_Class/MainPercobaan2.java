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
public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil1841720139Fuad m =new Mobil1841720139Fuad();
        m.setMerkFuad("Mazda 3");
        m.setBiayaFuad(500000);
        Sopir1841720139Fuad s = new Sopir1841720139Fuad();
        s.setNamaFuad("Tri Fuad");
        s.setBiayaFuad(100000);
        Pelanggan1841720139Fuad p = new Pelanggan1841720139Fuad ();
        p.setNamaFuad("Tri Fuad");
        p.setMobilFuad(m);
        p.setSopirFuad(s);
        p.setHariFuad(2);
        
        System.out.println("Biaya Total = "+ p.hitungBiayaTotalFuad());
    }
}

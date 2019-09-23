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
public class MainTugas4 {
    public static void main(String[] args) {
       MobilTugasFuad m = new MobilTugasFuad ();
       m.setNama("BMW M2");
       m.setHarga(1000000000);
       m.setDiskon(10000000);
       
       PembeliTugasFuad p = new PembeliTugasFuad();
       p.setID(1841720139);
       p.setNama("Tri Fuad");
       
       ServiceTugasFuad s = new ServiceTugasFuad();
       s.setKetService("Ganti Piston");
       s.setBiaya(40000000);
       s.setDiskon(500000);
       
       TransaksiTugasFuad t = new TransaksiTugasFuad();
       t.setMobil(m);
       t.setP(p);
       t.setService(s);
       t.cetak();
        System.out.println("Total Biaya = "+t.hitungBiayaTotal());
    
    }
  
}

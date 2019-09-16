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
public class KoperasiDemo1841720139Fuad {
    public static void main(String[] args) {
        Anggota1841720139Fuad anggota1 = new Anggota1841720139Fuad("fuad","jalan pakisaji");
        System.out.println("Simpanan " +anggota1.getNamaFuad()+": Rp "+anggota1.getSimpananFuad());
        
        anggota1.setNamaFuad("TRI FUAD");
        anggota1.setAlamatFuad("Jlan Raya Segaran no 30");
        anggota1.setorFuad(100000);
        System.out.println("Simpanan "+anggota1.getNamaFuad()+ " : Rp "+ anggota1.getSimpananFuad());
        
        anggota1.pinjamFuad(5000);
        System.out.println("Simpanan "+anggota1.getNamaFuad()+ " : Rp "+ anggota1.getSimpananFuad());
        
    }
}

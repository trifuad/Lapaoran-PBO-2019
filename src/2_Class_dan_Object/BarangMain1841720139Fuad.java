/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author MADHA
 */
public class BarangMain1841720139Fuad {

    public static void main(String[] args){
        TugasBarang1841720139Fuad brg = new TugasBarang1841720139Fuad(); 
 
    brg.kode="36pl";
    brg.namaBarang="celana";
    brg.hargaDasar=100000; 
    brg.diskon=0.2f; 
    brg.hitungHargaJualFuad(100000, 0.2f);
    brg.tampilDataFuad(); 
}
}

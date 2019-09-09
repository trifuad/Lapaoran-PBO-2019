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
public class TestBarang1841720139Fuad {
    public static void main (String args []) {
    Barang1841720139Fuad brg1 = new Barang1841720139Fuad();
    brg1.namaBrg = "pensil";
    brg1.jenisBrg= "ATK";
    brg1.stok = 10;
    brg1.tampilBarangFuad();
    // menampilka dan mengisi argumen untuk menambahkan stockbarang
        System.out.println("stock baru adalah " +brg1.tambahStokFuad(20));
    }
}

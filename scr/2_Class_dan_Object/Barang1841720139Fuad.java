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
public class Barang1841720139Fuad {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarangFuad(){
    System.out.println ("Nama Barang     :"+namaBrg);
    System.out.println ("Jenis Barang    :"+jenisBrg);
    System.out.println ("Stok       :+stok");
    }
    
    public int tambahStokFuad (int brgMasuk){
    int stokBaru=brgMasuk+stok;
    return stokBaru;
    }
    
}



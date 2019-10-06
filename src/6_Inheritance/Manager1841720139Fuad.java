/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6.jobsheet;

/**
 *
 * @author MADHA
 */
public class Manager1841720139Fuad extends Karyawan1841720139Fuad{
    public int tunjangan;

    public Manager1841720139Fuad() {
    }
    
    public void tampilDataManagerFuad(){
        super.tampilDataKaryawanFuad();
        System.out.println("tunjangan   = "+tunjangan);
        System.out.println("total gaji  = "+(super.gaji+tunjangan));
    }
}

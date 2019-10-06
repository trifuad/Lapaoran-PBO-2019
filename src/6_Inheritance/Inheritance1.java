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
public class Inheritance1 {
    public static void main(String[] args) {
        Manager1841720139Fuad m = new Manager1841720139Fuad();
        m.nama="Fuad";
        m.alamat="jl.segaran";
        m.umur=20;
        m.jk="laki-laki";
        m.gaji=10000000;
        m.tunjangan=5000000;
        m.tampilDataManagerFuad();
        
        Staff1841720139Fuad s = new Staff1841720139Fuad();
        s.nama="Tri";
        s.alamat="jl.jalan";
        s.umur=19;
        s.jk="laki-laki";
        s.gaji=3000000;
        s.lembur=500000;
        s.potongan=50000;
        s.tampilDataStaffFuad();
    }
}

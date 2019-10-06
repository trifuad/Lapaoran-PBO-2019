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
public class inheritance2 {
    public static void main(String[] args) {
        StaffTetap1841720139Fuad ST = new StaffTetap1841720139Fuad("Budi","Malang","laki-laki",20,200000,250000,200000,"2A",100000);
        ST.tampilStaffTetapFuad();
        
        StaffHarian1841720139Fuad SH = new StaffHarian1841720139Fuad("Indah","Malang","Perempuan",27,10000,200000,50000,100);
        SH.tampilStaffHarianFuad();
    }
}

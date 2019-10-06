/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6.jobsheet;

/**
 *
 * @author Vivi Agustina
 */
public class StaffHarian1841720139Fuad extends Staff1841720139Fuad {
    public int jmlJamKerja;
    
    public StaffHarian1841720139Fuad(){
        
    }
    public StaffHarian1841720139Fuad(String nama,String alamat,String jk,int umur,int gaji,int lembur,int potongan,int jmlJamKerja){
        super(nama,alamat,jk,umur,gaji,lembur,potongan);
        this.jmlJamKerja=jmlJamKerja;
        
    }
    public void tampilStaffHarianFuad(){
        System.out.println("=======================Data Staff Harian=========================");
        super.tampilDataStaffFuad();
        System.out.println("Jumlah Jam Kerja    = "+jmlJamKerja);
        System.out.println("gaji Bersih         = "+(gaji*jmlJamKerja+lembur-potongan));
    }
                
}


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
public class StaffTetap1841720139Fuad extends Staff1841720139Fuad {
    public String golongan;
    public int asuransi;
    
    StaffTetap1841720139Fuad(){
        
    }
    public StaffTetap1841720139Fuad(String nama,String alamat,String jk,int umur,
        int gaji,int lembur,int potongan,String golongan,int asuransi){
        super (nama,alamat,jk,umur,gaji,lembur,potongan);
        this.golongan=golongan;
        this.asuransi=asuransi;
    }
    public void tampilStaffTetapFuad(){
        System.out.println("==========================Data Staff Tetap=====================");
        super.tampilDataStaffFuad();
        System.out.println("Golongan           = "+golongan);
        System.out.println("Jumlah Asuransi    = "+asuransi);
        System.out.println("Gaji Bersih        = "+(gaji+lembur-potongan-asuransi));
    }
}
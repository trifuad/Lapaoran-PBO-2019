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
public class Staff1841720139Fuad extends Karyawan1841720139Fuad{
    public int lembur, potongan;

    public Staff1841720139Fuad() {
    }

    public Staff1841720139Fuad(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan){
        super.nama=nama;
        super.alamat=alamat;
        super.jk=jk;
        super.umur=umur;
        super.gaji=gaji;
        this.lembur=lembur;
        this.potongan=potongan;
    }
    
    
    public void tampilDataStaffFuad(){
        super.tampilDataKaryawanFuad();
        System.out.println("Lembur            = "+lembur);
        System.out.println("potongan          = "+potongan);
        System.out.println("total gaji        = "+(gaji+lembur-potongan));
    }
}

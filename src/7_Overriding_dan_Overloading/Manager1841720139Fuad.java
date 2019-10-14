/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author MADHA
 */
public class Manager1841720139Fuad extends Karyawan1841720139Fuad{
    private double tunjangan;
    private String bagian;
    private Staff1841720139Fuad st[];

    public double mgetTunjanganFuad() {
        return tunjangan;
    }

    public void msetTunjanganFuad(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String mgetBagianFuad() {
        return bagian;
    }

    public void msetBagianFuad(String bagian) {
        this.bagian = bagian;
    }

    public void msetStFuad(Staff1841720139Fuad[] st) {
        this.st = st;
    }
    
    public void mviewStaffFuad(){
        int i;
        System.out.println("-----------------------");
        for(i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("-----------------------");
    }
    
   public void lihatInfo(){
       System.out.println("Manager  : "+this.mgetBagianFuad());
       System.out.println("NIP      : "+this.mgetNipFuad());
       System.out.println("Nama     : "+this.mgetNamaFuad());
       System.out.println("Golongan : "+this.mgetGolonganFuad());
       System.out.printf("Tunjangan :%.0f\n",this.mgetTunjanganFuad());
       System.out.printf("Gaji      :%.0f\n",this.mgetGajiFuad());
       System.out.println("Bagian    : "+this.mgetBagianFuad());
       this.mviewStaffFuad();
    }
    @Override
   public double mgetGajiFuad(){
   return super.mgetGajiFuad()+tunjangan;
   }
}

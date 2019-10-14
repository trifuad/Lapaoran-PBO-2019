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
public class Staff1841720139Fuad extends Karyawan1841720139Fuad{
    private int lembur;
    private double gajiLembur;

    public int mgetLemburFuad() {
        return lembur;
    }

    public void msetLemburFuad(int lembur) {
        this.lembur = lembur;
    }

    public double mgetGajiLemburFuad() {
        return gajiLembur;
    }

    public void msetGajiLemburFuad(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double mgetGajiFuad(int lembur, double gajiLembur) {
       return super.mgetGajiFuad()+lembur*gajiLembur;
    }
    
    public double mgetGajiFuad() {
       return super.mgetGajiFuad()+lembur*gajiLembur;
    }
    
    public void lihatInfo(){
        System.out.println("NIP     : "+this.mgetNipFuad());
        System.out.println("Nama    : "+this.mgetNamaFuad());
        System.out.println("Golongan: "+this.mgetGolonganFuad());
        System.out.println("Jml Lembur : "+this.mgetLemburFuad());
        System.out.printf("Gaji Lembur :%.0f\n",this.mgetGajiLemburFuad());
        System.out.printf("Gaji        :%.0f\n",this.mgetGajiFuad());
    }
    
    
}

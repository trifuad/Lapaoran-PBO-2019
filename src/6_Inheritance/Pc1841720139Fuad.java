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
public class Pc1841720139Fuad extends Komputer1841720139Fuad{
    public int ukuranMonitor;
    
    Pc1841720139Fuad(){
        
    }
    public Pc1841720139Fuad(String merk, int kecProsesor,int sizeMemory,String jnsProsesor,int ukuranMonitor){
        super.merk = merk;
        super.kecProsesor = kecProsesor;
        super.sizeMemory = sizeMemory;
        super.jnsProsesor = jnsProsesor;
        this.ukuranMonitor = ukuranMonitor;
    }
    public void tampilPcFuad(){
        super.tampilDataFuad();
        System.out.println("Ukuran PC: "+ ukuranMonitor);
    }
}



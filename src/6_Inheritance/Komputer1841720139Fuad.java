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
public class Komputer1841720139Fuad {
    public String merk;
    public String jnsProsesor;
    public int kecProsesor;
    public int sizeMemory;
    
    
    Komputer1841720139Fuad(){
        
    }
    public Komputer1841720139Fuad(String merk,int kecProsesor, int sizeMemory, String jnsProsesor){
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;   
    }
    public void tampilDataFuad(){
        System.out.println("Merk:  "+merk);
        System.out.println("Jenis Prosesor:  "+jnsProsesor);
        System.out.println("Kecepatan Prosesor: "+kecProsesor);
        System.out.println("Size Memory: "+sizeMemory);
    }
}

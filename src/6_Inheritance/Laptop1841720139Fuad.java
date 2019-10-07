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
public class Laptop1841720139Fuad extends Komputer1841720139Fuad {
 public String jnsBatrei;
 
 Laptop1841720139Fuad(){
     
 }
 public Laptop1841720139Fuad(String merk, int kecProsesor, int sizeMemory, String jnsProsesor,  String jnsBateai){
    super.merk = merk;
    super.kecProsesor = kecProsesor;
    super.sizeMemory = sizeMemory;
        super.jnsProsesor = jnsProsesor;
        this.jnsBatrei = jnsBatrei;
    }
    public void tampilLaptopFuad(){
        
        System.out.println("Jenis Baterai ="+ jnsBatrei);
   
    }
}

 


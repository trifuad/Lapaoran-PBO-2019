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
public class Mac1841720139Fuad extends Laptop1841720139Fuad {
    public String security;
    
    Mac1841720139Fuad(){
        
    }
    public Mac1841720139Fuad(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security){
        super.merk = merk;
        super.kecProsesor = kecProsesor;
        super.sizeMemory = sizeMemory;
        super.jnsProsesor = jnsProsesor;
        super.jnsBatrei = jnsBatrei;
        this.security = security; 
        
    }
    public void tampilMacFuad(){
        super.tampilDataFuad();
        System.out.println("Security: "+ security);
    }
}

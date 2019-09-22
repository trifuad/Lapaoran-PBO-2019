/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author MADHA
 */
public class Processor1841720139Fuad {
    private String merk;
    private double cache;
    
    public Processor1841720139Fuad (String merk,double cache){
    this.merk = merk;
    this.cache = cache;
    }
public Processor1841720139Fuad (){
    this.merk = merk;
    this.cache = cache;
    }
    public String getMerkFuad() {
        return merk;
    }

    public double getCacheFuad() {
        return cache;
    }

    public void setMerkFuad(String merk) {
        this.merk = merk;
    }

    public void setCacheFuad(double cache) {
        this.cache = cache;
    }
    public void info(){
        System.out.printf("Merk Processor = %s\n " , merk);
        System.out.printf("Cache Memory  = %.2f\n " , cache);
    }
   
    
}

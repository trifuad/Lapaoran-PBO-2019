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
public class Laptop1841720139Fuad {
    private String merk;
    private Processor1841720139Fuad proc;
    
    public Laptop1841720139Fuad (){
    this.merk = merk ;
    this.proc = proc ; 
    }

   public Laptop1841720139Fuad (String merk,Processor1841720139Fuad proc){
   this.merk = merk;
   this.proc = proc;
   }

    public String getMerkFuad() {
        return merk;
    }

    public Processor1841720139Fuad getProcFuad() {
        return proc;
    }

    public void setMerkFuad(String merk) {
        this.merk = merk;
    }

    public void setProcFuad(Processor1841720139Fuad proc) {
        this.proc = proc;
    }
    public void info() { System.out.println("Merk Laptop = " + merk); 
    proc.info(); 
    } 
 
    
}

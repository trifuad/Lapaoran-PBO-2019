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
public class MainPercobaan1 {
    public static void main(String[] args) {
        
   
    Processor1841720139Fuad p = new Processor1841720139Fuad ("core",3);
    Laptop1841720139Fuad Ll = new  Laptop1841720139Fuad ();
    Laptop1841720139Fuad L= new  Laptop1841720139Fuad ("Thinkpad",new Processor1841720139Fuad("intel i5",3));
    L.info();
    
   Processor1841720139Fuad p1 = new Processor1841720139Fuad ();
   p1.setMerkFuad("core");
   p1.setCacheFuad(4);
   
   
   Laptop1841720139Fuad L1 = new Laptop1841720139Fuad();
   L1.setMerkFuad("intel 15");
   L1.setProcFuad(p1);
   L1.info();
    } 
    
    
    
    
}

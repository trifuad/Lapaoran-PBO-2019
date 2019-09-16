/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author MADHA
 */
public class Motor1841720139Fuad {
    public int kecepatan = 0;
    public boolean kontakOn = false ;
    
    public void printStatusFuad(){
    if (kontakOn == true ){
        System.out.println("kontak ON");
    }
    else {
        System.out.println("kontak OFF");
    }
        System.out.println("kecepatan " + kecepatan +"\n");
    }
}
   

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
public class MotorModif1841720139Fuad {
     private int kecepatan = 0;
     private boolean kontakOn = false ;
    
    public void nyalakanMesinFuad(){
    kontakOn = true;
    }
    public void matikanMesinFuad(){
    kontakOn = false;
    kecepatan = 0;
    }
    public void tambahKecepatanFuad(){
        if (kontakOn == true){
            kecepatan += 5;
        }else {
            System.out.println("kecepatan tidak dapat bertambah karena mesin off \n");
        }
    }
    public void kurangKecepatanFuad(){
        if (kontakOn == true){
            kecepatan -= 5;
        }else {
            System.out.println("kecepatan tidak dapat berkurang karena mesin off \n");
        }
    }
    
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

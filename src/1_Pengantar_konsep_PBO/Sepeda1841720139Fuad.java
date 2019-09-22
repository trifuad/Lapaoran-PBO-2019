/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester3;

/**
 *
 * @author Fuad
 */
public class Sepeda1841720139Fuad {

    private String mMerek ; 
    private int mKecepatan ;
    private int mGear ;
    
    public void setMerekFuad(String NEW_VALUE ){
        mMerek = NEW_VALUE; 
    }
    
    public void gantiGearFuad (int NEW_VALUE) {
        mGear = NEW_VALUE; 

    }
    public void tambahKecepatanFuad(int INCREMENT){
        mKecepatan = mKecepatan + INCREMENT;
    }
    public void remFuad(int DECREMENT){
       mKecepatan = mKecepatan- DECREMENT;
    }
    
    public void cetakStatusFuad(){
            System.out.println("merek= "+ mMerek);
            System.out.println("kecepatan= "+ mKecepatan);
            System.out.println("Gear= "+ mGear);
    }
    
}

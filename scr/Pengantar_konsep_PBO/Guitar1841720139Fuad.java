/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester3;

/**
 *
 * @author fuad
 */
public class Guitar1841720139Fuad {
    private String mMerek;
    private String mTipe;
    private char mSize;
    private int mVol;
    
    public void sMerekFuad(String NEW_VALUE ){
    mMerek = NEW_VALUE; 
    }
    
    public void sTipeFuad(String NEW_VALUE ){
    mTipe = NEW_VALUE; 
    }
   
    public void sUkuranFuad(char NEW_VALUE ){
    mSize = NEW_VALUE; 
    }
    
    public void sVolumeFuad(int NEW_VALUE ){
    mVol = NEW_VALUE; 
    }
    
    public void sCetakStatusFuad(){
            System.out.println("Merek= "+ mMerek);
            System.out.println("Tipe= "+ mTipe);
            System.out.println("Ukuran= "+ mSize);
            System.out.println("Volume= "+ mVol);
    }
    
}

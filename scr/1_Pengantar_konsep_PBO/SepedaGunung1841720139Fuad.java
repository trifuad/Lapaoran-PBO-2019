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
public class SepedaGunung1841720139Fuad extends Sepeda1841720139Fuad {
    private String mTipeSuspensi;
            
    public void setTipeSuspensiFuad(String NEW_VALUE){
        mTipeSuspensi = NEW_VALUE;
    }
    
    public void cetakStatusFuad(){
        super.cetakStatusFuad();
        System.out.println("Tipe suspensi: " + mTipeSuspensi);
    }

   
}
        

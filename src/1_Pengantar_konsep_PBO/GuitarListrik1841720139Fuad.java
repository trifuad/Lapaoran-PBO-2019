/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester3;

/**
 *
 * @author MADHA
 */
public class GuitarListrik1841720139Fuad extends Guitar1841720139Fuad{
    private String mEfek;
   
    public void sEfekGuitarFuad(String NEW_VALUE){
    mEfek = NEW_VALUE;
    }
    
    public void sGuitarListrikFuad(){
    super.sCetakStatusFuad();
        System.out.println("Nama efek" + mEfek);
    }
}


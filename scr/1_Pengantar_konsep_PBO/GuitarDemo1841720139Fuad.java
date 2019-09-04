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
public class GuitarDemo1841720139Fuad {
    public static void main(String[] args) {
        //pangggil dua buah objek guitar
        Guitar1841720139Fuad gtr1 = new Guitar1841720139Fuad();
        Guitar1841720139Fuad gtr2 = new Guitar1841720139Fuad();
        GuitarListrik1841720139Fuad gtr3 = new GuitarListrik1841720139Fuad();
        
        //panggil method didalam ojek sepeda
        gtr1.sMerekFuad("Yamaha");
        gtr1.sTipeFuad("Acustic");
        gtr1.sUkuranFuad('M');
        gtr1.sVolumeFuad(50);
        gtr1.sCetakStatusFuad();
        
        gtr2.sMerekFuad("Gibson");
        gtr2.sTipeFuad("ukulele");
        gtr2.sUkuranFuad('S');
        gtr2.sVolumeFuad(35);
        gtr2.sCetakStatusFuad();
        
        gtr3.sMerekFuad("Fender");
        gtr3.sTipeFuad("Guitar Listrik");
        gtr3.sUkuranFuad('L');
        gtr3.sVolumeFuad(75);
        gtr3.sEfekGuitarFuad("delay loop");
        gtr3.sCetakStatusFuad();
        
    }
    
    
}

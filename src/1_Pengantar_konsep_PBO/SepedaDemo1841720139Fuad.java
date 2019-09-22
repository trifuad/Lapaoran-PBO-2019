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
public class SepedaDemo1841720139Fuad {
    public static void main(String[] args) {
        //pangggil dua buah objek sepeda
        Sepeda1841720139Fuad spd1 = new Sepeda1841720139Fuad();
        Sepeda1841720139Fuad spd2 = new Sepeda1841720139Fuad();
        SepedaGunung1841720139Fuad spd3 = new SepedaGunung1841720139Fuad();
        
        //panggil method didalam ojek sepeda
        spd1.setMerekFuad("polygone");
        spd1.tambahKecepatanFuad(10);
        spd1.gantiGearFuad(2);
        spd1.cetakStatusFuad();
        
        spd2.setMerekFuad("wim Cycle");
        spd2.tambahKecepatanFuad(10);
        spd2.gantiGearFuad(2);
        spd2.remFuad(5);
        spd2.gantiGearFuad(3);
        spd2.cetakStatusFuad();
        
        spd3.setMerekFuad("klinee");
        spd3.tambahKecepatanFuad(5);
        spd3.gantiGearFuad(7);
        spd3.setTipeSuspensiFuad("gas suspension");
        spd3.cetakStatusFuad();
       
    }
}

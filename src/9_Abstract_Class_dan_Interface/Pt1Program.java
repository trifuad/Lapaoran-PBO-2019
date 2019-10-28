/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8.Praktikum1;

/**
 *
 * @author MADHA
 */
public class Pt1Program {
    public static void main(String[] args) {
        Kucing1841720139Fuad kucingKampung = new Kucing1841720139Fuad ();
        Ikan1841720139Fuad lumbaLumba = new Ikan1841720139Fuad ();
        
        Orang1841720139Fuad ani = new Orang1841720139Fuad("Ani");
        Orang1841720139Fuad budi = new Orang1841720139Fuad("Budi");
        
        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
    
}

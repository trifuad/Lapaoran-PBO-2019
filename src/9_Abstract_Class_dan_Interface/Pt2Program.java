/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8.Praktikum2;

/**
 *
 * @author MADHA
 */
public class Pt2Program {


    public static void main(String[] args) {
        Rektor1841720139Fuad pakRektor = new Rektor1841720139Fuad();
        
        Sarjana1841720139Fuad sarjanaCumlaude = new Sarjana1841720139Fuad("Fuad");
        PascaSarjana1841720139Fuad masterCumlaude = new PascaSarjana1841720139Fuad("Amalia");
        
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);
        
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}

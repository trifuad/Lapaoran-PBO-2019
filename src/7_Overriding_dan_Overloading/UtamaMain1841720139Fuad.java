/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author MADHA
 */
public class UtamaMain1841720139Fuad {
     public static void main(String[] args) {
         System.out.println("program testing class manager dan staff");
        Manager1841720139Fuad man[]=new Manager1841720139Fuad[2];
        Staff1841720139Fuad staff1[]=new Staff1841720139Fuad[2];
        Staff1841720139Fuad staff2[]=new Staff1841720139Fuad[3];
        
        man[0]=new Manager1841720139Fuad();
        man[0].msetNamaFuad("fauzi");
        man[0].msetNipFuad("101");
        man[0].msetGolonganFuad("1");
        man[0].msetTunjanganFuad(5000000);
        man[0].msetBagianFuad("Administrasi");
        
        man[1]=new Manager1841720139Fuad();
        man[1].msetNamaFuad("Fuad");
        man[1].msetNipFuad("102");
        man[1].msetGolonganFuad("1");
        man[1].msetTunjanganFuad(2500000);
        man[1].msetBagianFuad("Pemasaran");
        
         staff1[0]=new Staff1841720139Fuad();
        staff1[0].msetNamaFuad("Dina");
        staff1[0].msetNipFuad("0003");
        staff1[0].msetGolonganFuad("2");
        staff1[0].msetLemburFuad(10);
        staff1[0].msetGajiLemburFuad(10000);
        
         staff1[1]=new Staff1841720139Fuad();
        staff1[1].msetNamaFuad("Andri");
        staff1[1].msetNipFuad("0005");
        staff1[1].msetGolonganFuad("2");
        staff1[1].msetLemburFuad(10);
        staff1[1].msetGajiLemburFuad(55000);
        man[0].msetStFuad(staff1);
        
        
         staff2[0]=new Staff1841720139Fuad();
        staff2[0].msetNamaFuad("Hendra");
        staff2[0].msetNipFuad("004");
        staff2[0].msetGolonganFuad("3");
        staff2[0].msetLemburFuad(15);
        staff2[0].msetGajiLemburFuad(55000);
        
        staff2[1]=new Staff1841720139Fuad();
        staff2[1].msetNamaFuad("arie");
        staff2[1].msetNipFuad("0006");
        staff2[1].msetGolonganFuad("4");
        staff2[1].msetLemburFuad(5);
        staff2[1].msetGajiLemburFuad(10000);
        
         staff2[2]=new Staff1841720139Fuad();
        staff2[2].msetNamaFuad("Mentari");
        staff2[2].msetNipFuad("0007");
        staff2[2].msetGolonganFuad("3");
        staff2[2].msetLemburFuad(6);
        staff2[2].msetGajiLemburFuad(10000);
        man[1].msetStFuad(staff2);
        
        man[0].lihatInfo();
        man[1].lihatInfo();
        
        
    }
}

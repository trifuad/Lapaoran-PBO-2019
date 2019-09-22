/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author MADHA
 */
public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai1841720139Fuad masinis = new Pegawai1841720139Fuad ("1234","Spongebob Fuad");
        Pegawai1841720139Fuad asisten = new Pegawai1841720139Fuad ("4567","Patric Tri");
        KeretaApi1841720139Fuad keretaapi = new KeretaApi1841720139Fuad("Gaya Baru","Bisnis",masinis,asisten);
        
        System.out.println(keretaapi.info());
    }
}

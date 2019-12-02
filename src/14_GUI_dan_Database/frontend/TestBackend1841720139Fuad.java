/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;


import backend.*;

public class TestBackend1841720139Fuad {
    public static void main(String[] args) {
        Kategori1841720139Fuad kat1 = new Kategori1841720139Fuad("Novel", "Koleksi buku novel");
        Kategori1841720139Fuad kat2 = new Kategori1841720139Fuad("Referensi", "Buku referensi ilmiah");
        Kategori1841720139Fuad kat3 = new Kategori1841720139Fuad("Komik", "Komik anak-anak");
        
        //test insert
        kat1.save();
        kat2.save();
        kat3.save();
        
        //test update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();
        
        //test delete
        kat3.delete();
        
        //test select all
        for(Kategori1841720139Fuad k : new Kategori1841720139Fuad().getAll()){
            System.out.println("Nama: "+k.getNama()+", Ket: "+k.getKeterangan());
        }
        
        //test search
        for(Kategori1841720139Fuad k : new Kategori1841720139Fuad().search("ilmiah")){
            System.out.println("Nama: "+k.getNama()+", Ket: "+k.getKeterangan());
        }
    }
}

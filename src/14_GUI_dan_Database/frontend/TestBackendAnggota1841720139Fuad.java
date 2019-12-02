/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota1841720139Fuad;


public class TestBackendAnggota1841720139Fuad {
    public static void main(String[] args) {
        Anggota1841720139Fuad agt1 = new Anggota1841720139Fuad("Hunayn", "Sidaorjo", "081222200039");
        Anggota1841720139Fuad agt2 = new Anggota1841720139Fuad("Ardan", "Bojonegoro", "085212526856");
        Anggota1841720139Fuad agt3 = new Anggota1841720139Fuad("Dina", "Malang", "085755216488");
        
        //test insert
        agt1.save();
        agt2.save();
        agt3.save();
        
        //test update
        agt2.setAlamat("Jawa Timur");
        agt2.save();
        
        //test delete
        agt3.delete();
        
        //tes select all
        for(Anggota1841720139Fuad k : new Anggota1841720139Fuad().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Alamat : " + k.getAlamat() + ", Telepon : " + k.getTelepon());
        }
        
        //test search
        for(Anggota1841720139Fuad a : new Anggota1841720139Fuad().search("Timur")){
            System.out.println("Nama: " + a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon : " + a.getTelepon());
        }
    }
}

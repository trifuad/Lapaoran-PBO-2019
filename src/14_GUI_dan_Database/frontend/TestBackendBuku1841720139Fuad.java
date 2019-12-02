/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.*;


public class TestBackendBuku1841720139Fuad {
    public static void main(String[] args) {
        Kategori1841720139Fuad novel = new Kategori1841720139Fuad().getById(39);
        Kategori1841720139Fuad referensi = new Kategori1841720139Fuad().getById(40);

        Buku1841720139Fuad buku1 = new Buku1841720139Fuad(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720139Fuad buku2 = new Buku1841720139Fuad(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720139Fuad buku3 = new Buku1841720139Fuad(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");

        // test insert
        buku1.save();
        buku2.save();

        // test update
        buku2.setJudul("Aljabar Linier");
        buku2.save();

        // test delete
        buku3.delete();

        // test select all
        for(Buku1841720139Fuad b : new Buku1841720139Fuad().getAll())
        {
        System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }

        // test search
        for(Buku1841720139Fuad b : new Buku1841720139Fuad().search("timun"))
        {
        System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    }
}

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
public class PascaSarjana1841720139Fuad extends Mahasiswa1841720139Fuad implements ICumlaude1841720139Fuad,IBerprestasi1841720139Fuad {

    public PascaSarjana1841720139Fuad(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void mreaihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override
    public void kuliah() {
        System.out.println("Aku mahasiswa, namaku "+ this.nama);
        System.out.println("Aku berkuliah di kampus.");    }

    @Override
    public void menjuaraiKopentisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiilmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
    
}

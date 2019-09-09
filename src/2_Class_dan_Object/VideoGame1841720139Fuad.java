/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author MADHA
 */
public class VideoGame1841720139Fuad {
    private String id;
    private String namaMember;
    private String namaGame;
    private int lamaSewa;
    private int hargaSewa;
    private int totalBayar;
    
    public void setIdFuad(String newValue){
    id = newValue ;
    }
    
    public void setNamaFuad(String nilaiNama){
    namaMember = nilaiNama;
    }
    
    public void setGameFuad(String game){
    namaGame = game;
    }
    
    public void setLamaFuad (int lamaSewanya){
    lamaSewa = lamaSewanya;
    }
    
    public int setHargaFuad(int nilaiHarga){
    hargaSewa = nilaiHarga;
    return hargaSewa;
    }
    
    public int totalFuad(){
    totalBayar = lamaSewa*hargaSewa;
    return totalBayar;
    }
    
    public void tampilDataFuad(){
        System.out.println("ID : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Lama Sewa : "+lamaSewa+"hari");
        System.out.println("Sewa harga per hari : Rp. "+hargaSewa);
    }
    
}

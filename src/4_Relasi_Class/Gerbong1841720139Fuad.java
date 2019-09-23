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
public class Gerbong1841720139Fuad {
    private String kode;
    private Kursi1841720139Fuad[] arrayKursi;
    
    public Gerbong1841720139Fuad(String kode,int jumlah){
        this.kode = kode;
        this.arrayKursi= new Kursi1841720139Fuad[jumlah];
        this.initKursi();
    }
    
    private void initKursi(){
        for (int i =0; i < arrayKursi.length;i++){
            this.arrayKursi[i] = new Kursi1841720139Fuad(String.valueOf (i+1));
        }
    }

    public String getKodeFuad() {
        return kode;
    }

    public Kursi1841720139Fuad[] getArrayKursiFuad() {
        return arrayKursi;
    }

    public void setKodeFuad(String kode) {
        this.kode = kode;
    }

    public void setArrayKursiFuad(Kursi1841720139Fuad[] arrayKursi) {
        this.arrayKursi = arrayKursi;
    }
    
    public String info(){
        String info = "";
        info += "Kode: "+ kode + "\n";
        for(Kursi1841720139Fuad kursi : arrayKursi){
            info += kursi.info();
        }
        return info;
    }
    
    public void setPenumpangFuad(Penumpang1841720139Fuad penumpang,int nomor){
        this.arrayKursi[nomor-1].setPenumpangFuad(penumpang);
    }
}

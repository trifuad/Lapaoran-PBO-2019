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
public class Kursi1841720139Fuad {
    private String nomor;
    private Penumpang1841720139Fuad penumpang;
    
    public Kursi1841720139Fuad(String nomor){
        this.nomor = nomor;
       
    }



    public String getNomorFuad() {
        return nomor;
    }

    public Penumpang1841720139Fuad getPenumpangFuad() {
        return penumpang;
    }

    public void setNomorFuad(String nomor) {
        this.nomor = nomor;
    }

    public void setPenumpangFuad(Penumpang1841720139Fuad penumpang) {
        this.penumpang = penumpang;
    }
    
    public String info(){
        String info = "";
        info += "Nomor : "+nomor+"\n";
        if (this.penumpang != null){
            info += "Penumpang :\n"+penumpang.info()+"\n";
        }
        return info;
    }
    
}

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
public class ServiceTugasFuad {
    private String ketService;
    private int biaya;
    private int diskon;
    

public ServiceTugasFuad(){
    this.ketService = ketService;
    this.biaya = biaya;
}   
    

    public ServiceTugasFuad(String ketService, int biaya) {
        this.ketService = ketService;
        this.biaya = biaya;
    }
    

    public String getKetService() {
        return ketService;
    }

    public int getBiaya() {
        return biaya;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setKetService(String ketService) {
        this.ketService = ketService;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }
    public int hitungBiayaService(){
        return biaya - diskon;
    }
    public String info(){
    String info = " ";
    info += "Keterngan Service  = " + this.ketService + "\n";
    info += "Biaya              = " + this.biaya+ "\n";
    info += "Diskon             = " + this.diskon+ "\n";
    return info;
    }
    
    
}

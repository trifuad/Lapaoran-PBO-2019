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
public class TransaksiTugasFuad {
    private MobilTugasFuad mobil;
    private PembeliTugasFuad pembeli;
    private ServiceTugasFuad service;
    private PembeliTugasFuad p;
    private ServiceTugasFuad diskon;

    public TransaksiTugasFuad(MobilTugasFuad mobil, PembeliTugasFuad pembeli, ServiceTugasFuad service, PembeliTugasFuad p, ServiceTugasFuad diskon) {
        this.mobil = mobil;
        this.pembeli = pembeli;
        this.service = service;
        this.p = p;
        this.diskon = diskon;
    }
     public TransaksiTugasFuad() {
        this.mobil = mobil;
        this.pembeli = pembeli;
        this.service = service;
        this.p = p;
        this.diskon = diskon;
    }
    public void setMobil(MobilTugasFuad mobil) {
        this.mobil = mobil;
    }

    public void setService(ServiceTugasFuad service) {
        this.service = service;
    }

    public void setP(PembeliTugasFuad p) {
        this.p = p;
    }

    public void setDiskon(ServiceTugasFuad diskon) {
        this.diskon = diskon;
    }

    public MobilTugasFuad getMobil() {
        return mobil;
    }

    public PembeliTugasFuad getPembeli() {
        return pembeli;
    }

    public ServiceTugasFuad getService() {
        return service;
    }

    public PembeliTugasFuad getP() {
        return p;
    }

    public ServiceTugasFuad getDiskon() {
        return diskon;
    }
    
    public int hitungBiayaTotal(){
        return mobil.hitungHarga()+service.hitungBiayaService();
    }
    
    public void cetak (){
        System.out.println("Pembeli  \n"+p.info());
        System.out.println("Mobil     \n"+mobil.info());
        System.out.println("Service    \n"+service.info());
    }
}

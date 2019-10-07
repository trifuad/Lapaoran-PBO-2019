/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6.jobsheet;

/**
 *
 * @author Vivi Agustina
 */
public class MainTugas {
    public static void main(String[] args) {
        Mac1841720139Fuad mac = new Mac1841720139Fuad();
        mac.security = "AVG";
        mac.jnsBatrei = "8h";
        mac.merk = "Apple";
        mac.jnsProsesor = "core i7";
        mac.kecProsesor = 2048;
        mac.sizeMemory = 4;
        mac.tampilMacFuad();
        System.out.println("============================");
        
        Windows1841720139Fuad w = new Windows1841720139Fuad();
        w.fitur = "WINDOWS";
        w.merk = "Lenovo";
        w.jnsProsesor = "core i7";
        w.kecProsesor = 890;
        w.sizeMemory = 4;
        w.tampilWindowsFuad();
        System.out.println("============================");
        
        Pc1841720139Fuad p = new Pc1841720139Fuad();
        p.ukuranMonitor = 14;
        p.merk = "SAMSUNG";
        p.jnsProsesor = "core i5";
        p.kecProsesor = 8;
        p.sizeMemory = 1000;
        p.tampilPcFuad();
    }
}

   
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
public class PembeliTugasFuad {
    private int ID;
    private String nama;

    public PembeliTugasFuad(int ID, String nama) {
        this.ID = ID;
        this.nama = nama;
    }
    public PembeliTugasFuad() {
        this.ID = ID;
        this.nama = nama;
    }
    

    public int getID() {
        return ID;
    }

    public String getNama() {
        return nama;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String info(){
    String info = " ";
    info += "Nama       = " + this.nama + "\n";
    info += "Nomor ID   = " + this.ID + "\n";
    return info;
    }
    
}

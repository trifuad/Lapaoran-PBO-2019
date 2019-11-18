/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12;

/**
 *
 * @author MADHA
 */
import java.util.ArrayList;
public class InputData1841720139Fuad {
    ArrayList<Mahasiswa1841720139Fuad> ListMahasiswa;

    public InputData1841720139Fuad() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiData (String Nim,String Nama,String Alamat){
        Mahasiswa1841720139Fuad mhs = new Mahasiswa1841720139Fuad(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720139Fuad> getData(){
        return ListMahasiswa;
    }
    
    
}

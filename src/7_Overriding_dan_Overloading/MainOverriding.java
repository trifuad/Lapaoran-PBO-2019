
package minggu7;


public class MainOverriding {
    public static void main(String[] args) {
        Manusia1841720139 m = new Dosen1841720139Fuad();
        Dosen1841720139Fuad d = new Dosen1841720139Fuad();
        Mahasiswa1841720139Fuad mhs = new Mahasiswa1841720139Fuad();
         
        m.mbernafasFuad();
        m.makanFuad();
        System.out.println("=================");
        
        d.makanFuad();
        d.lemburFuad();
        System.out.println("=================");
        
        mhs.makanFuad();
        mhs.tidurFuad();
        System.out.println("=================");
        
        m=d;
        m.makanFuad();
    }
           
}

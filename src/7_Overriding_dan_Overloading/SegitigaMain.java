
package minggu7;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga1841720139Fuad sgt = new Segitiga1841720139Fuad();
            sgt.mtotalSudutFuad(120);
            sgt.mtotalSudutFuad(60,90);
            sgt.mkelilingFuad(4,2,6);
            sgt.mkelilingFuad(6,9);
            
            System.out.println("Total Sudut: "+sgt.mtotalSudutFuad(120));
            System.out.println("Total Sudut: "+sgt.mtotalSudutFuad(60,90));
            System.out.println("Keliling: "+sgt.mkelilingFuad(4, 2, 6));
            System.out.println("c: "+sgt.mkelilingFuad(6, 9));
        }
    }
         


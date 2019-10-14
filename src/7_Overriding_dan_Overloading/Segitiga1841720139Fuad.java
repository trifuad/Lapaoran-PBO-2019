
package minggu7;

public class Segitiga1841720139Fuad {
    private int sudut;
    
    public int mtotalSudutFuad(int sudutA){
        sudut = 180 - sudutA;
        return sudut; 
    }
    public int mtotalSudutFuad(int sudutA, int sudutB){
        sudut = 180 - (sudutA+sudutB);
        return sudut;
    }
    public int mkelilingFuad(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    public double mkelilingFuad(int sisiA, int sisiB){
        double keliling = Math.sqrt(Math.pow(sisiA, 2)+ Math.pow(sisiB, 2));
        
        return keliling;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author MADHA
 */
public class PerkalianKu1841720139 {
    
    void perkalianFuad(int a,int b){
        System.out.println(a * b);
    }
    
    void perkalianFuad(int a,int b,int c){
        System.out.println(a * b * c);
    }
    
    void perkalianFuad (double a,double b){
        System.out.println(a*b);
    }
    
    public static void main(String[] args) {
        PerkalianKu1841720139 objek = new PerkalianKu1841720139();
        objek.perkalianFuad(25, 43);
        objek.perkalianFuad(34, 23, 56);
        objek.perkalianFuad(34.56, 23.7);
    }
}

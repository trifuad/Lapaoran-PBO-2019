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
public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang1841720139Fuad p = new Penumpang1841720139Fuad ("12345","Mr. Krab Fuad");
        Gerbong1841720139Fuad gerbong = new Gerbong1841720139Fuad ("A",10);
        gerbong.setPenumpangFuad(p,1);
        System.out.println(gerbong.info());
    }
}

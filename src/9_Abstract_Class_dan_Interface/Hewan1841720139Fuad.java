/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8.Praktikum1;

/**
 *
 * @author MADHA
 */
public abstract class  Hewan1841720139Fuad {
    private int umur;

    protected Hewan1841720139Fuad() {
        this.umur = 10;
    }
    
    public void bertambahUmurFuad(){
        this.umur += 1;
    }
    
    public abstract void bergerak();
    
}

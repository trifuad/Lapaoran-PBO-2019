/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6.jobsheet;

/**
 *
 * @author MADHA
 */
public class Tabung1841720139Fuad extends Bangun1841720139Fuad{
    protected int t;
    
    public void setSuperPhiFuad(double phi){
        super.phi = phi;
    }
    
    public void setSuperRFuad(int r){
        super.r = r ;
    }
    
    public void setTFuad(int t){
        this.t = t;
    }
    
    public void volumeFuad(){
        System.out.println("volume tabung adalah : "+(super.phi*super.r*super.r*this.t));
    }
}

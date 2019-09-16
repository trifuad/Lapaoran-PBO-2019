/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author MADHA
 */
public class Lingkaran1841720139Fuad {
    private double phi; 
    private double r; 
    private double luas; 
    private double keliling; 
 
    public void setPhiFuad(double nilaiPhi){
        phi = nilaiPhi;
    }     
    
        
    public void setJariFuad(double nilaiR){
        r = nilaiR;      
        } 
    public double hitungLuasFuad(){
        luas = phi*r*r;         
        return luas;     
        } 
 
    public double hitungKelilingFuad(){
        keliling = 2*r*phi;
        return keliling;     
    } 
    public void tampilDataFuad(){
        System.out.println("Phi : "+phi);
        System.out.println("Jari-jari: "+r);
    }
}
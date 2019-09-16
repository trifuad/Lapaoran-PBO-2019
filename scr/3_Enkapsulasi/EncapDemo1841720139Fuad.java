/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author MADHA
 */
public class EncapDemo1841720139Fuad {
    private String name;
    private int age;
    
    public String getNameFuad(){
    return name;
    }
    
    public void setNameFuad(String newName){
    name = newName;
    }
    
    public int getAgeFuad(){
    return age;
    }
    
    public void setAgeFuad(int newAge){
    if(newAge > 10){
        age = 30;
    }else {
        age = newAge;
    }
    }
}

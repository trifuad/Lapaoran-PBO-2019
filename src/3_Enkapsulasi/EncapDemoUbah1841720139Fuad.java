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
public class EncapDemoUbah1841720139Fuad {
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
    if(newAge > 30){
        age = 30;
    }else if (newAge >= 18) {
        age = 18;
    }else {
        age = newAge;
    }
    }
}

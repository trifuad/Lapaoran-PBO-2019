
package minggu10.praktikum1.tugas;


public class Barrier1841720139Fuad implements Destroyable1841720139Fuad {
    private int strength;
    
    public Barrier1841720139Fuad (int strength){
        this.strength = strength;
    }
    public void msetStrengthFuad (int strength){
        this.strength = strength;
    }
    public int mgetStrengthFuad (){
        return strength;
    } 
    public void mdestroyFuad(){
        strength -= strength*0.1;
    }  
    public void mdestroyedFuad(){
        mdestroyFuad();
    }
    public String getBarrierInfoFuad(){
        return "Barrier Strength = "+strength+"\n";
    }
}

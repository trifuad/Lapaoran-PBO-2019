
package minggu10.praktikum1.tugas;


public abstract class Zombie1841720139Fuad implements Destroyable1841720139Fuad { 
    protected int health;    
    protected int level;     
    
    public String getZombieInfo(){  
        return "\nHealth = "+health+"\nLevel = "+level;
    }         
    public abstract void mhealFuad();    
    @Override    
    public abstract void mdestroyedFuad(); 
} 
   

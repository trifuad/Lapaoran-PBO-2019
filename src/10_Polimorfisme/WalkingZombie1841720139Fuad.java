
package minggu10.praktikum1.tugas;


public class WalkingZombie1841720139Fuad extends Zombie1841720139Fuad {
    public WalkingZombie1841720139Fuad(int health, int level){
        this.health = health;
        this.level = level;
    }
    public void mhealFuad(){
        if (level == 1){
            health += health*0.2;
        }else if (level == 2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }   
    public void mdestroyedFuad(){
        health -= health*0.19;
    }
    public String getZombieInfo(){
        String info = "Walking Zombie Data = ";
        info += super.getZombieInfo()+"\n";
        return info;
    }
}


package minggu10.praktikum1.tugas;

public class JumpingZombie1841720139Fuad extends Zombie1841720139Fuad {
    public JumpingZombie1841720139Fuad (int health, int level){
        this.level = level;
        this.health = health;
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
        health -= health*0.093;
    }
    public String getZombieInfo(){
        String info = "Jumping Zombie Data = ";
        info += super.getZombieInfo()+"\n";
        return info;
    }
}

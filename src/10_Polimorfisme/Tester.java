
package minggu10.praktikum1.tugas;


public class Tester {

    public static void main(String[] args) {
        WalkingZombie1841720139Fuad wz = new WalkingZombie1841720139Fuad(100,1);
        JumpingZombie1841720139Fuad jz = new JumpingZombie1841720139Fuad(100,2);
        Barrier1841720139Fuad b = new Barrier1841720139Fuad (100);
        Plant p = new Plant();
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfoFuad());
        System.out.println("---------------------");
        for (int i = 0; i<4; i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfoFuad());
    } 
}

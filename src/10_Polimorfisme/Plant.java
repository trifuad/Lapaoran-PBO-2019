
package minggu10.praktikum1.tugas;


public class Plant {
    public void doDestroy (Destroyable1841720139Fuad d){
        if (d instanceof WalkingZombie1841720139Fuad){
            WalkingZombie1841720139Fuad wz = (WalkingZombie1841720139Fuad) d;
            wz.mdestroyedFuad();
        }else if (d instanceof JumpingZombie1841720139Fuad){
            JumpingZombie1841720139Fuad jz = (JumpingZombie1841720139Fuad) d;
            jz.mdestroyedFuad();
        }else if (d instanceof Barrier1841720139Fuad){
            Barrier1841720139Fuad b = (Barrier1841720139Fuad) d;
            b.mdestroyedFuad();
        }
    }
}

package minggu10.praktikum1;
public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee1841720139Fuad pEmp = new PermanentEmployee1841720139Fuad("Dedik", 500);
        Employee1841720139Fuad e;
        e = pEmp;
        System.out.println(""+e.mgetEmployeeInfoFuad());
        System.out.println("----------------------");
        System.out.println("" +pEmp.mgetEmployeeInfoFuad());
    }
}
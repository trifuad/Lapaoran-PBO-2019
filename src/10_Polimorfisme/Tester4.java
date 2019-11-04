package minggu10.praktikum1;
public class Tester4 {
    public static void main(String[] args) {
        Owner1841720139Fuad ow = new Owner1841720139Fuad();
        ElectricityBill1841720139Fuad eBill = new ElectricityBill1841720139Fuad(5, "R-1");
        ow.pay(eBill);
        System.out.println("-------------------------------");
        
        PermanentEmployee1841720139Fuad pEmp = new PermanentEmployee1841720139Fuad("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("-------------------------------");
        
        InternshipEmployee1841720139Fuad iEmp = new InternshipEmployee1841720139Fuad("Sunarto", 5);
        ow.mshowMyEmployeeFuad(pEmp);
        System.out.println("-------------------------------");
        ow.mshowMyEmployeeFuad(iEmp);
}
}
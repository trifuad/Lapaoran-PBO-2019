package minggu10.praktikum1;
public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee1841720139Fuad pEmp = new PermanentEmployee1841720139Fuad("Dedik", 500);
        InternshipEmployee1841720139Fuad iEmp = new InternshipEmployee1841720139Fuad("Sunarto", 5);
        ElectricityBill1841720139Fuad eBill = new ElectricityBill1841720139Fuad(5, "A-1");
        Employee1841720139Fuad e[] = {pEmp, iEmp};
        Payable1841720139Fuad p[] = {pEmp, eBill};
       // Employee1841720139Fuad e2[] = {pEmp, iEmp, eBill};
    }
}
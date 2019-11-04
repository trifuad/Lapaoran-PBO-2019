package minggu10.praktikum1;

public class Owner1841720139Fuad {
    public void pay(Payable1841720139Fuad p){
        System.out.println("Total payment ="+p.mgetPaymentAmountFuad());
        if(p instanceof ElectricityBill1841720139Fuad){
            ElectricityBill1841720139Fuad eb=(ElectricityBill1841720139Fuad)p;
            System.out.println(""+eb.getBillInfoFuad());
        }else if(p instanceof PermanentEmployee1841720139Fuad){
            PermanentEmployee1841720139Fuad pe = (PermanentEmployee1841720139Fuad)p;
            pe.mgetEmployeeInfoFuad();
            System.out.println(""+pe.mgetEmployeeInfoFuad());
        }
    }
    public void mshowMyEmployeeFuad(Employee1841720139Fuad e){
        System.out.println(""+e.mgetEmployeeInfoFuad());
        if(e instanceof PermanentEmployee1841720139Fuad)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
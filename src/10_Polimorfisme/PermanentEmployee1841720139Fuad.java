package minggu10.praktikum1;

public class PermanentEmployee1841720139Fuad extends Employee1841720139Fuad implements Payable1841720139Fuad{
    private int salary;
    
    public PermanentEmployee1841720139Fuad(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public int mgetSalaryFuad() {
        return salary;
    }
    
    @Override
    public int mgetPaymentAmountFuad() {
        return (int) (salary+0.5*salary);
    }
    @Override
    public String mgetEmployeeInfoFuad() {
        String info = super.mgetEmployeeInfoFuad()+"\n";
        info += "Registered as permanent employee with salary " +salary+"\n";
        return info;
    }
}
package minggu10.praktikum1;

public class InternshipEmployee1841720139Fuad extends Employee1841720139Fuad{
    private int length;
    
    public InternshipEmployee1841720139Fuad(String name, int length) {
        this.length = length;
        this.name = name;
    }
    public int mgetLengthFuad() {
        return length;
    }
    @Override
    public String mgetEmployeeInfoFuad() {
        String info = super.mgetEmployeeInfoFuad() + "\n";
        info += "Registered as internship employee for "+length+" month/s\n";
        return info;
    }
}
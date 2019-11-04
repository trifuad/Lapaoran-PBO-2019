package minggu10.praktikum1;

public class ElectricityBill1841720139Fuad implements Payable1841720139Fuad{
    private int kwh;
    private String category;

    public ElectricityBill1841720139Fuad(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public int mgetKwhFuad() {
        return kwh;
    }

    public void msetKwhFuad(int kwh) {
        this.kwh = kwh;
    }

    public String mgetCategoryFuad() {
        return category;
    }

    public void msetCategoryFuad(String category) {
        this.category = category;
    }

    @Override
    public int mgetPaymentAmountFuad() {
        return kwh * mgetBasePriceFuad();
    }

    public int mgetBasePriceFuad() {
        int bPrice = 0;
        switch (category) {
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }

    public String getBillInfoFuad() {
        return "kWH = " + kwh + "\n"
                + "Category = " + category + "(" + mgetBasePriceFuad() + " per kWH)\n";
    }
    public void infoFuad() {
        System.out.print("Hallooo");
    }
}
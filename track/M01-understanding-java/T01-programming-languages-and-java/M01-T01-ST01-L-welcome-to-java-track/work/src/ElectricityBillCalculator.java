public class ElectricityBillCalculator {
    public static void main(String[] args) {
        String name = "Rahul";
        int units = 350;
        double bill = 0;
        double surcharge = 0;
        double totalBill = 0;
        if (units <= 0) {
            System.out.println("Invalid units");
        } else if (units <= 100) {
            bill = units * 2;

        } else if (units <= 200) {
            bill = units * 3;

        } else if (units <= 300) {
            bill = units * 5;

        } else {
            bill = units * 7;

        }
        if (bill > 1000) {
            surcharge = bill * 5.0 / 100;
        }
        totalBill = surcharge + bill;
        System.out.println("CustomerName: " + name);
        System.out.println("UnitsConsumed: " + units);
        System.out.println("ElectricityBill: " + bill);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("TotalBill: " + totalBill);
    }
}

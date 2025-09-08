public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000.0;

    public CarRental() {
        customerName = "Customer";
        carModel = "Basic";
        rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // 👇 Add this to make it runnable
    public static void main(String[] args) {
        CarRental rental = new CarRental("Drishya", "Swift", 5);
        double cost = rental.calculateTotalCost();
        System.out.println("Total cost: ₹" + cost);
    }
}
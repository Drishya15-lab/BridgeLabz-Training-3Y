public class Vehicle {
    static double registrationFee = 5000.00;

    final String vehicleNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Vehicle Number: " + vehicleNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: ₹" + registrationFee);
        }
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(5500.00);

        Vehicle v1 = new Vehicle("UP85AB1234", "Ritika Sharma", "Car");
        Vehicle v2 = new Vehicle("UP85XY5678", "Manish Verma", "Bike");

        v1.displayDetails();
        System.out.println();
        v2.displayDetails();
    }

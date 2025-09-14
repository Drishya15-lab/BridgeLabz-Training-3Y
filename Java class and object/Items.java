public class Item {
    String itemCode;
    String itemName;
    double price;

    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: ₹" + price);
    }

    public void calculateTotalCost(int quantity) {
        double total = price * quantity;
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + total);
    }

    public static void main(String[] args) {
        Item item1 = new Item("ITM101", "Wireless Mouse", 799.00);
        item1.displayDetails();
        item1.calculateTotalCost(3);
    }
}

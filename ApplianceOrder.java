import java.util.Scanner;

// Abstract class representing a general appliance
abstract class Appliance {
    private String name;
    private double price;

    // Constructor
    public Appliance(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to display price, which can be overridden
    public abstract void displayPrice();

    // Abstract method to get the description
    public abstract String getDescription();
}

// Subclass representing an electronic appliance (inherits from Appliance)
class ElectronicAppliance extends Appliance {
    
    // Constructor
    public ElectronicAppliance(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayPrice() {
        System.out.println(this.getName() + " - $" + this.getPrice());
    }

    @Override
    public String getDescription() {
        return "This is an electronic appliance: " + this.getName();
    }
}

// Main class handling the order
public class ApplianceOrder {
    // Appliance data (now with 10 appliances)
    static Appliance[] appliances = {
        new ElectronicAppliance("Refrigerator", 500.0), 
        new ElectronicAppliance("Washing Machine", 300.0),
        new ElectronicAppliance("Microwave", 150.0),
        new ElectronicAppliance("Air Conditioner", 400.0),
        new ElectronicAppliance("Dishwasher", 250.0),
        new ElectronicAppliance("Blender", 75.0),
        new ElectronicAppliance("Vacuum Cleaner", 120.0),
        new ElectronicAppliance("Coffee Maker", 100.0),
        new ElectronicAppliance("Toaster", 50.0),
        new ElectronicAppliance("Rice Cooker", 80.0)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the appliance list with prices
        System.out.println("Available Appliances and Prices:");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < appliances.length; i++) {
            appliances[i].displayPrice();
        }

        // Ask for the number of appliances the user wants to buy
        double totalCost = 0;
        boolean finishOrder = false;

        while (!finishOrder) {
            System.out.println("\nEnter the appliance number you want to purchase (1-10) or 0 to finish the order:");
            int choice = scanner.nextInt();

            if (choice == 0) {
                finishOrder = true;
            } else if (choice >= 1 && choice <= appliances.length) {
                System.out.println("You selected " + appliances[choice - 1].getName() + ".");
                System.out.println("Enter the quantity you want to purchase:");
                int quantity = scanner.nextInt();

                // Add the cost to the total
                totalCost += appliances[choice - 1].getPrice() * quantity;
                System.out.println("Added " + quantity + " " + appliances[choice - 1].getName() + "(s) to your order.");
            } else {
                System.out.println("Invalid choice. Please select a valid appliance number.");
            }
        }

        // Display the total cost
        System.out.println("\nYour total cost is: $" + totalCost);

        // Choose the payment counter
        boolean validCounter = false;
        int counterChoice = 0;

        while (!validCounter) {
            System.out.println("\nPlease choose a counter to pay:");
            System.out.println("1. Counter 1");
            System.out.println("2. Counter 2");
            System.out.println("3. Counter 3");
            System.out.print("Enter the counter number (1-3): ");
            counterChoice = scanner.nextInt();

            if (counterChoice >= 1 && counterChoice <= 3) {
                validCounter = true;
            } else {
                System.out.println("Invalid counter. Please select a valid counter.");
            }
        }

        // Final confirmation
        System.out.println("\nYou have chosen Counter " + counterChoice + " to complete your payment.");
        System.out.println("Thank you for your order!");

        scanner.close();
    }
}

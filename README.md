Appliance Order System
Overview
The Appliance Order System allows users to select appliances from a list, specify quantities, and calculate the total cost of their selected appliances. Users can then choose a counter to complete their order. This program demonstrates concepts of object-oriented programming (OOP), including Encapsulation, Inheritance, Polymorphism, and Abstraction.

Features
Displays a list of 10 appliances with their prices.
Allows users to choose appliances and specify quantities.
Calculates the total cost based on selected items and quantities.
Prompts the user to choose a payment counter.
Utilizes OOP principles like encapsulation, inheritance, polymorphism, and abstraction.
OOP Concepts Implemented
1. Encapsulation
The appliance details (name and price) are encapsulated in the Appliance class. Access to these fields is controlled through getter and setter methods.

2. Inheritance
The ElectronicAppliance class inherits from the Appliance class. This allows the reuse of common properties and methods (like name and price) in a subclass, demonstrating code reuse.

3. Polymorphism
The displayPrice() method is overridden in the ElectronicAppliance subclass. This demonstrates polymorphism by allowing different appliance objects to have their own implementation of the displayPrice() method.

4. Abstraction
The Appliance class is abstract, which means it cannot be instantiated directly. The displayPrice() and getDescription() methods are abstract, allowing the subclasses to implement their specific versions of these methods.

Getting Started
Requirements:
Java 8 or higher
How to Run:
Clone or Download the repository.
Navigate to the folder containing the ApplianceOrder.java file.
Open a terminal (command prompt) and compile the Java file:
bash
Copy code
javac ApplianceOrder.java
Once compiled, run the program:
bash
Copy code
java ApplianceOrder
Program Output:
The program will display the available appliances and their prices, allow you to select which appliances to buy, and ask you for the quantity. After making your selections, the total cost will be calculated. You will then be prompted to choose a counter for payment. Finally, the program will confirm your order.

Example output:

typescript
Copy code
Available Appliances and Prices:
------------------------------------------------
Refrigerator - $500.0
Washing Machine - $300.0
Microwave - $150.0
Air Conditioner - $400.0
Dishwasher - $250.0
Blender - $75.0
Vacuum Cleaner - $120.0
Coffee Maker - $100.0
Toaster - $50.0
Rice Cooker - $80.0

Enter the appliance number you want to purchase (1-10) or 0 to finish the order:
1
You selected Refrigerator.
Enter the quantity you want to purchase:
2
Added 2 Refrigerator(s) to your order.

Enter the appliance number you want to purchase (1-10) or 0 to finish the order:
3
You selected Microwave.
Enter the quantity you want to purchase:
1
Added 1 Microwave(s) to your order.

Enter the appliance number you want to purchase (1-10) or 0 to finish the order:
0

Your total cost is: $1150.0

Please choose a counter to pay:
1. Counter 1
2. Counter 2
3. Counter 3
Enter the counter number (1-3): 2

You have chosen Counter 2 to complete your payment.
Thank you for your order!
Code Structure:
1. Appliance (abstract class)
This is the parent class that represents a general appliance. It includes the appliance's name, price, and two abstract methods: displayPrice() and getDescription(). These methods are meant to be implemented by subclasses.

2. ElectronicAppliance (subclass)
This class inherits from Appliance. It implements the displayPrice() and getDescription() methods, providing specific details for each appliance.

3. ApplianceOrder (main class)
The main class that handles the user interface. It displays the available appliances, takes the user's input for selections, calculates the total cost, and handles the payment counter selection.

Customization
You can easily customize the appliance list by adding or modifying the appliances and their prices in the appliances array. You can also add additional features such as discounts or special offers by extending the existing classes.

License
This project is licensed under the MIT License - see the LICENSE file for details.

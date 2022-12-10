/*
1a. Design and create a class named Retail Item that holds data about an item in a retail store. The class should have the following fields:
• Description - The description field references a String object that holds a brief description of the item.
• Units - The units field is an int variable that holds the number of units currently in inventory.
• Price - The price field is a double that holds the item’s retail price.
Write a constructor that accepts arguments for each field, appropriate mutator methods that store values in these fields, and accessor methods that return the values in these fields. Write the main method which creates three Retail Item objects and invokes appropriate methods.
 */

// Retail Items Class
class Retail {
    private String desc;
    private int units;
    private double price;

    Retail(String desc, int units, int price) {
        this.desc = desc;
        this.units = units;
        this.price = price;
    }

    // Setters for private data members

    public void unitsUpdater(int u) {
        this.units = u;
    }

    public void priceUpdater(int p) {
        this.price = p;
    }

    // Getters for private data members

    public String getDesc() {
        return this.desc;
    }

    public int getUnits() {
        return this.units;
    }

    public double getPrice() {
        return this.price;
    }
}

public class _1a{
    public static void main(String[] args) {
        Retail r1 = new Retail("Book", 100, 200);
        Retail r2 = new Retail("Mobile", 20, 15000);

        System.out.println("Item: " + r1.getDesc() + ", No of units: " + r1.getUnits() + ", Price: " + r1.getPrice());
        System.out.println("Updating No of units and price of " + r1.getDesc());
        r1.unitsUpdater(500);
        r1.priceUpdater(50);
        System.out.println("Item: " + r1.getDesc() + ", No of units: " + r1.getUnits() + ", Price: " + r1.getPrice());
        System.out.println();

        System.out.println("Item: " + r2.getDesc() + ", No of units: " + r2.getUnits() + ", Price: " + r2.getPrice());
        System.out.println("Updating No of units and price of " + r2.getDesc());
        r2.unitsUpdater(500);
        r2.priceUpdater(50);
        System.out.println("Item: " + r2.getDesc() + ", No of units: " + r2.getUnits() + ", Price: " + r2.getPrice());
    }
}
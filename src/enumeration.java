// Define enum status with constants
enum status {
    Running, Failed, Pending, Success;
}

// Define enum Laptop_enum with constants, each having an optional price
enum Laptop_enum {
    MacBook(2500), Samsung(2000), Dell, Hp(1500);

    private int price; // price field

    // Default constructor for Dell
    private Laptop_enum() {
        this.price = 2500;
    }

    // Constructor that sets price
    private Laptop_enum(int price) {
        this.price = price;
    }

    // Getter for price
    public int getPrice() {
        return this.price;
    }

    // Setter for price
    public void setPrice(int price) {
        this.price = price;
    }
}

public class enumeration {
    public static void main(String[] args) {

        // Demonstrating the basic enum 'status'
        status s = status.Running;
        System.out.println("Current Status: " + s); // Output: Running
        System.out.println("Ordinal of Running: " + s.ordinal()); // Output: 0

        // Loop through all enum values
        for (status sItem : status.values()) {
            System.out.print(sItem + " : " + sItem.ordinal() + " -> ");
            switch (sItem) {
                case Running:
                    System.out.println("All Good");
                    break;
                case Failed:
                    System.out.println("Try Again");
                    break;
                case Pending:
                    System.out.println("Please Wait");
                    break;
                case Success:
                    System.out.println("Completed");
                    break;
                default:
                    System.out.println("Something went wrong");
            }
        }

        System.out.println();

        // Demonstrating Laptop_enum with constructors
        Laptop_enum lap = Laptop_enum.MacBook;
        System.out.println("Laptop: " + lap + ", Price: " + lap.getPrice()); // Output: 2500

        // Loop through all Laptop_enum values
        for (Laptop_enum l : Laptop_enum.values()) {
            System.out.println("Laptop: " + l + ", Price: " + l.getPrice());
        }

        System.out.println();

        // Modify price of MacBook using setter
        Laptop_enum changeValueMac = Laptop_enum.MacBook;
        changeValueMac.setPrice(10000); // Update price to 10000

        // Verify the updated price for MacBook
        for (Laptop_enum Larr : Laptop_enum.values()) {
            System.out.println("Laptop: " + Larr + ", Updated Price: " + Larr.getPrice());
        }
    }
}

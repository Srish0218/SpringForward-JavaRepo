import java.util.*;

class Inventory{
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold){
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }
    public int getThreshold(){
        return  this.threshold;
    }
    public int getInventoryId(){
        return Integer.parseInt(this.inventoryId);
    }

}

public class problem13_Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the inventory details: \n");
        Inventory[] inventories = new Inventory[4];
        for(int i = 0; i< inventories.length; i++){
            System.out.println("Enter the inventory ID: " + (i + 1 ));
            String inventoryId = sc.nextLine();
            System.out.println("Enter the maximum quantity: " + (i + 1 ));
            int maximumQuantity = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the current quantity: " + (i + 1 ));
            int currentQuantity = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the threshold: " + (i + 1 ));
            int threshold = sc.nextInt();
            sc.nextLine();
            inventories[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
        }

        System.out.println("Enter required threshold: ");
        int requiredThreshold = sc.nextInt();
        sc.nextLine();

        List<Inventory> finalResult = replenish(inventories, requiredThreshold);
        for(Inventory I : finalResult){
            if(I.getThreshold() >= 75){
                System.out.println(I.getInventoryId() + " Critical Filling");
            } else if (I.getThreshold() >= 74 && I.getThreshold() <= 50) {
                System.out.println(I.getInventoryId() + " Moderate Filling");
            }else {
                System.out.println(I.getInventoryId() + " Non-Critical Filling");
            }
        }
    }

    public static List<Inventory> replenish(Inventory[] inventories , int requiredThreshold){
        List<Inventory> result = new ArrayList<>();
        for(Inventory inventory : inventories){
            if(inventory.getThreshold() <= requiredThreshold){
                result.add(inventory);
            }
        }
        return result;
    }
}

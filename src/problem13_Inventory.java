/*
Create class Inventory with below attributes:

inventoryId - String
maximumQuantity - int
currentQuantity - int
threshold - int

Create class Solution and implement static method "Replenish" in the Solution class.
This method will take array of Inventory objects and a limit int as parameters.
And will return another array of Inventory objects where the limit int is greater than or equal to the original array of
Inventory object's threshold attribute.

Write necessary getters and setters.

Before calling "Replenish" method in the main method, read values for four Inventory objects referring the attributes in above
sequence along with a int limit.Then call the "Replenish" method and write logic in main method to print "Critical Filling",
if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print
"Moderate Filling". Else print "Non-Critical Filling"

Input
---------------------------
1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45

Output
----------------------------
2 Non-Critical Filling
3 Non-Critical Filling
4 Non-Critical Filling
 */


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

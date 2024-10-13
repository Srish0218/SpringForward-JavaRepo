/*
 Create the class Flowers with below attribute:

flowerId-int;
flowerName-String;
price-int;
rating-int;
type-String;

The above attributes must be private,write getters and setters and parametrized constructor as well.

Create class MyClass with main method.

Implement one static method:findMinPriceByType in MyClass class.

findMinPriceByType Method:

This method will take two input parameters:Array of Flower objects and String parameter.This method will return the minimum
priced flower object from  array of Flower objects for the given type(String parameter),only if the rating is greater than
3. If no Flowers with the above conditions are present in the array of the flower objects,then the method will return null.

For this method-The main method  should print the flowerId from the returned object if the returned value is not null.
else it should print "There is no flower with given type".

**********************************************************************

input1:

123
Yellow trout lilly
3000
5
ephemerals
345
snowdrop
2500
4
ephemerals
321
Yarrow
1000
4
perennials
213
red trillium
2250
4
ephemerals
ephemerals

output:
213

**********************

input2:

123
Yellow trout lilly
3000
5
ephemerals
345
snowdrop
2500
4
ephemerals
321
Yarrow
1000
4
perennials
213
red trillium
2250
4
ephemerals
Biennial

output2:
There is no flower with given type.
 */
import java.util.*;

class Flowers {
    private int flowerId;
    private String flowerName;
    private int price;
    private int rating;
    private String type;

    public Flowers(int flowerId, String flowerName, int price, int rating, String type) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public String getType() {
        return type;
    }
}

public class Problem42_Flowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flowers[] flowers = new Flowers[4];

        for (int i = 0; i < flowers.length; i++) {
            System.out.println("Enter flower Id: ");
            int flowerId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter flower Name: ");
            String flowerName = sc.nextLine();
            System.out.println("Enter flower Price: ");
            int price = sc.nextInt();
            System.out.println("Enter flower Rating: ");
            int rating = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter flower Type: ");
            String type = sc.nextLine();

            flowers[i] = new Flowers(flowerId, flowerName, price, rating, type);
        }

        System.out.println("Enter flower type parameter: ");
        String typeParameter = sc.nextLine();

        Flowers flowerMinPriceByType = findMinPriceByType(flowers, typeParameter);
        if (flowerMinPriceByType != null) {
            System.out.println(flowerMinPriceByType.getFlowerId());
        } else {
            System.out.println("There is no flower with given type.");
        }
    }

    public static Flowers findMinPriceByType(Flowers[] flowers, String typeParameter) {
        Flowers minFlower = null;
        for (Flowers flower : flowers) {
            if ((flower.getType().equalsIgnoreCase(typeParameter) && flower.getRating() > 3) && (minFlower == null || flower.getPrice() < minFlower.getPrice())) {
                minFlower = flower;
            }
        }
        return minFlower;
    }
}

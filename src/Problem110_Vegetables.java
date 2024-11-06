/*
Create a class Vegetable with below attributes:

VegetableId - int
VegetableName - String
Price - int
Rating - int

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods - findMinimumPriceByRating in Solution class.

findMinimumPriceByRating method:
-----------------------------------------------
The method will return minimum price object from array of vegetable objects, whichever by rating greater than given rating.
If no vegetable with the above condition is present in the array of vegetable object, then the mothod return null.

Note :
No vegetable has the same price.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findMinimumPriceByRating method - The main method should print the id of vegetable object or it should print
"No such Vegetables".

Eg: 1002
where 1002 is the id whose price is lowest

Before calling these static methods in main, use Scanner object to read the values of four Vegetable objects referring
attributes in the above mentioned attribute sequence.
Next, read the value of int parameter for rating.

Consider below sample input and output:

Input1
---------------------------
1001
Carrot
90
5
1002
Tomato
40
4
1003
Bectroot
80
4
1004
Onion
78
3
2

Output1
-------------------------------
1002
=====================================================================================
Input2
---------------------------
1001
Carrot
90
5
1002
Tomato
40
4
1003
Bectroot
80
4
1004
Onion
78
3
7

Output2
----------------------------
No such Vegetables
 */

import java.util.*;

class Vegetables{
    private int VegetableId;
    private String VegetableName;
    private int Price;
    private int Rating;

    public Vegetables(int VegetableId, String VegetableName, int Price, int Rating){
        this.VegetableId = VegetableId;
        this.VegetableName = VegetableName;
        this.Price = Price;
        this.Rating = Rating;
    }
    public int getVegetableId(){
        return VegetableId;
    }

    public int getPrice(){
        return Price;
    }
    public int getRating(){
        return Rating;
    }

}

public class Problem110_Vegetables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vegetables: ");
        Vegetables[] vegetables = new Vegetables[sc.nextInt()];
        sc.nextLine();
        for(int i = 0; i < vegetables.length; i++){
            System.out.println("Enter Vegetable ID: ");
            int vegetableId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Vegetable Name: ");
            String vegetableName = sc.nextLine();
            System.out.println("Enter Vegetable Price: ");
            int vegetablePrice = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Vegetable Rating: ");
            int vegetableRating = sc.nextInt();
            sc.nextLine();

            vegetables[i] = new Vegetables(vegetableId, vegetableName, vegetablePrice, vegetableRating);
        }
        System.out.println("Enter vegetable rating Parameter: ");
        int ratingParameter = sc.nextInt();
        sc.nextLine();

        Vegetables minPricedVegetable = findMinimumPriceByRating(vegetables , ratingParameter);
        System.out.println(minPricedVegetable != null ? minPricedVegetable.getVegetableId() : "No such Vegetable");
    }
    public static Vegetables findMinimumPriceByRating(Vegetables[] vegetables, int rating){
        if(vegetables.length ==0){
            return null;
        }
        Vegetables minPricedVegetable = vegetables[0];
        for(Vegetables vegetable : vegetables){
            if(vegetable.getRating() > rating){
                if(minPricedVegetable.getPrice() > vegetable.getPrice()){
                    minPricedVegetable = vegetable;
                }
            }
        }
        return minPricedVegetable;
    }
}

/*
Create a class Resort with the below attributes:

resortId - int
resortName - String
Category - String
resortPrice - double
resortRating - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.

Implement two static methods - findAvgPrice in Solution class.

findAvgPrice method:
----------------------------------
This method will take two input parameters - array of Resort objects and a string parameter.
The method will return the average of the prices from resort objects whose Category matched with passed as parameter and rating
will greater than 4.
If no resort present found, then the method should return 0.

Note : All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.

For findAvgPrice method - The main method should print the average price as it is if the returned value is
greater than 0, or it should print "No such Resort found".

Before calling these static methods in main, use Scanner object to read the values of four resort objects referring attributes
in the above mentioned attribute sequence. Next, read the value for category.

Input
----------
1004
ABC
3 star
5400.00
4.5
1001
DEF
5 star
4781.45
4.0
1002
GHI
3 star
6235.72
4.2
1008
JKL
2 star
7454.00
4.2
3 star

Output
----------
The average price of 3 star:5817
 */

import java.util.*;

class Resort{
    private int resortId;
    private String resortName;
    private String Category;
    private double resortPrice;
    private double resortRating;

    public Resort(int resortId, String resortName, String Category, double resortPrice, double resortRating){
        this.resortId = resortId;
        this.resortName = resortName;
        this.Category = Category;
        this.resortPrice = resortPrice;
        this.resortRating = resortRating;
    }

    public String getCategory(){
        return Category;
    }
    public double getResortPrice(){
        return resortPrice;
    }
    public double getResortRating(){
        return resortRating;
    }

}

public class Problem55_Resort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter resort details: ");
        Resort[] resorts = new Resort[4];
        for(int i = 0;i < resorts.length; i++){
            System.out.println("Enter resort id: ");
            int resortId = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter resort name: ");
            String resortName = sc.nextLine();

            System.out.println("Enter resort category: ");
            String Category = sc.nextLine();

            System.out.println("Enter resort price: ");
            double resortPrice = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter resort rating: ");
            double resortRating = sc.nextDouble();
            sc.nextLine();

            resorts[i] = new Resort(resortId, resortName, Category, resortPrice, resortRating);
        }
        System.out.println("Enter resort category parameter: ");
        String categoryParameter = sc.nextLine();

        double avgPrices = findAvgPrice(resorts , categoryParameter);
        System.out.println(avgPrices != 0 ? "The average price of " + categoryParameter + " : " + avgPrices : "No such Resort found");


    }

    public static double findAvgPrice(Resort[] resorts , String categoryParameter){
        double sumPrices = 0;
        double countPrice = 0;
        for(Resort resort: resorts){
            if(resort.getCategory().equals(categoryParameter) && resort.getResortRating() > 4){
                sumPrices += resort.getResortPrice();
                countPrice ++;
            }
        }
        return sumPrices/countPrice;
    }
}

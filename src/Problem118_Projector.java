/*
Create a class Projector with below attributes:

projectorld - int
projectorName - String
price-Int (per unit)
rating - int
availablein-String (Amazon, Flipkart, TataClig)

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement one static method-find MaximumPriceByRating in Solution class.

Find MaximumPrice By Rating method:
The method will return the maximum priced Projector object from array of Projector objects whichever has rating greater
than the given rating and which is available in TataCilo.
If no Projector with the above conditions is present in the array of Projector objects, then the method should
return null

Note: No two Projector will have the same price.

All the searches should be case insensitive.
The above mentioned static method should be called from the main method.
For find MaximumPriceByRating method-The main method should print the projectorid from returned object
If the returned value is not null else it should print "No such Projector".
Eg: 1001
where 1001 is the projectorid which has the maximum price.
Before calling these static methods in main, use Scanner object to read the values of four Projector objects referring
attributes in the above mentioned attribute sequence.
Next, read the value of one int parameter for capturing rating value.
Consider below sample input and output:
Sample Testcasel:

Input:

1001
Epson
30000
5
TataCliq
1002
BenQ
40000
4
Amazon
1003
Sony
60000
5
TataCila
1004
Optomo
7000
3
Flipkart
3

Output:
1003

Sample Testcase2:

Input:

1001
Epson
30000
5
Flipkart
1002
BenQ
40000
4
Amazon
1003
Sony
80000
5
TataCllq
1004
Optome
7000
3
Flipkart
5

Output:

No such Projector
 */

import java.util.*;

class Projector {
    private int projectorId;
    private String projectorName;
    private int price;                           // (per unit)
    private int rating ;
    private String availableIn;                  //(Amazon, Flipkart, TataClig)

    public Projector(int projectorId , String projectorName , int price , int rating , String availableIn){
        this.projectorId = projectorId;
        this.projectorName = projectorName;
        this.price = price;
        this.rating = rating;
        this.availableIn = availableIn;
    }
    public int getProjectorId(){
        return projectorId;
    }
    public String getProjectorName(){
        return projectorName;
    }
    public int getPrice(){
        return price;
    }
    public int getRating(){
        return rating;
    }
    public String getAvailableIn(){
        return availableIn;
    }

}

public class Problem118_Projector {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter number of projectors: ");
        Projector[] projectors = new Projector[sc.nextInt()];

        for(int i = 0 ; i < projectors.length ; i++){
            System.out.println("Enter projector id: ");
            int projectorId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter projector name: ");
            String projectorName = sc.nextLine();
            System.out.println("Enter price: ");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter rating: ");
            int rating = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter available in: ");
            String availableIn = sc.nextLine();
            projectors[i] = new Projector(projectorId , projectorName , price , rating , availableIn);
        }
        System.out.println("Enter rating parameter: ");
        int ratingParameter = sc.nextInt();
        sc.nextLine();
        Projector projector = findMaximumPriceByRating(projectors , ratingParameter , "Tatacliq");
        if(projector != null){
            System.out.println(projector.getProjectorId());
        }
        else{
            System.out.println("No such Projector");
        }


    }
    public static Projector findMaximumPriceByRating(Projector[] projectors , int ratingParameter , String availableIn){
        Projector max = null;
        for(Projector projector : projectors){
            if(projector.getRating() > ratingParameter && projector.getAvailableIn().equalsIgnoreCase(availableIn)){
                if(max == null || max.getPrice() < projector.getPrice()){
                    max = projector;
                }
            }
        }
        return max;
    }
}

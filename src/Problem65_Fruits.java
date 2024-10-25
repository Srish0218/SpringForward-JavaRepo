/*
Create a class Fruits with below attributes as private
● int fruitId
● String fruitName
● int price
● int rating

Write getters, setters and parameterized constructor in the abovementioned attribute
sequence as required.

Create class Solution with main method

Implement One static method-

● findMaximumPriceByRating

findMaximumPriceByRating in the solution class.
This method will take array of Fruit objects, int paramater and returns the maximum priced fruit
object from array of Fruit objects whichever has rating greater than the rating
(rating parameter passed). This method should be called from main method.

Write code to perform following tasks:

1. Take necessary input variable and call findMaximumPriceByRating.

For this method- The main method should print the fruitId from returnedobject. As if the
returned value is not null, or it should print "No such Fruit".

Note:- Before calling this static method, use Scanner object to read thevalues of four Fruits
objects. No two Fruits will have same price. All thesearches should be case insensitive.
Consider below sample input and output to test your code.


Input
-------------------
555
Apple
200
5
777
Orange
150
4
333
Banana
100
4
888
Avocado
250
4
3

Output
-----------------
888
 */

import java.util.ArrayList;
import java.util.Scanner;

class Fruits{
    private int fruitId;
    private String fruitName;
    private int price;
    private int rating;
    public Fruits(int fruitId, String fruitName, int price, int rating) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }
    public int getFruitId() {
        return fruitId;
    }
}

public class Problem65_Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fruit details: ");
        Fruits[] fruits = new Fruits[4];
        for(int i = 0; i < fruits.length; i++){
            System.out.println("Enter fruit id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter fruit name : ");
            String fruitName = sc.nextLine();
            System.out.println("Enter fruit price : ");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter rating : ");
            int rating = sc.nextInt();
            sc.nextLine();

            fruits[i] = new Fruits(id, fruitName, price, rating);
        }
        System.out.println("Enter fruit rating parameter: ");
        int ratingParameter = sc.nextInt();
        sc.nextLine();

        Fruits fruitsWithMaxPrice = findMaximumPriceByRating(fruits , ratingParameter);
        System.out.println(fruitsWithMaxPrice == null ? "No such Fruit" : fruitsWithMaxPrice.getFruitId());

    }
    public static Fruits findMaximumPriceByRating(Fruits[] fruits , int ratingParameter){
        ArrayList<Fruits> fruitsList = new ArrayList<>();
        for(Fruits fruit : fruits){
            if (fruit.getRating() > ratingParameter){
                fruitsList.add(fruit);
            }
        }
        if (fruitsList.isEmpty()){
            return null;
        }

        fruitsList.sort((s1 , s2) -> Integer.compare(s2.getPrice(), s1.getPrice()));
        return fruitsList.getFirst();
    }
}

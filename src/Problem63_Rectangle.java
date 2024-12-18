/*
Create a class Rectangle with the following attributes:

length - double
breadth - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - calculateArea and calculatePerimeter in Solution class.

calculateArea method:
This method will take a Rectangle object as input.
The method will calculate the area of the rectangle and return it as a double.

calculatePerimeter method:
This method will take a Rectangle object as input.
The method will calculate the perimeter of the rectangle and return it as a double.

These above mentioned static methods should be called from the main method.

For calculateArea method - The main method should print the area returned by the method.

For calculatePerimeter method - The main method should print the perimeter returned by the method.

Before calling these static methods in main, use Scanner object to read the values of two Rectangle objects referring
attributes in the above mentioned attribute sequence.

Example Input:
5.5
3.2
7.0
4.5

Example Output:
17.6
17.4
31.5
23.0
 */


import java.util.Scanner;

class Rectangle{
    private double length , breadth;
    public Rectangle(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
}

public class Problem63_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle[] rectangles = new Rectangle[2];
        System.out.println("Enter rectangle details: \n");
        for(int i = 0 ; i < rectangles.length ; i++){
            System.out.print("Enter length of rectangle: " + (i + 1) + ": ");
            double length = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter breadth of rectangle: " + (i + 1) + ": ");
            double breadth = sc.nextDouble();
            sc.nextLine();

            rectangles[i] = new Rectangle(length , breadth);
        }

        for(int i = 0 ; i < rectangles.length ; i++){
            System.out.println("The area of the rectangle" + ( i + 1) + " : ");
            System.out.println(calculateArea(rectangles[i].getLength(), rectangles[i].getBreadth()));

            System.out.println("The perimeter of the rectangle" + ( i + 1) + " : ");
            System.out.println(calculatePerimeter(rectangles[i].getLength(), rectangles[i].getBreadth()));
        }
    }
    public static double calculateArea(double length , double breadth){
        return length * breadth;
    }
    public static double calculatePerimeter(double length , double breadth){
        return 2 * (length + breadth);
    }
}

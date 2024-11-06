/*
Create a class Car with the following attributes:

make - String
model - String
year - int
price - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - findMostExpensiveCar and getCarByMakeAndModel in Solution class.

findMostExpensiveCar method:
This method will take an array of Car objects as input.
The method will return the Car object with the highest price.
If the array is empty, the method should return null.

getCarByMakeAndModel method:
This method will take three input parameters - array of Car objects, make and model (both strings).
The method will return the Car object that matches the make and model attributes passed as parameters.
If no car with the given make and model is present in the array of car objects, then the method should return null.

Note: The search should be case insensitive.

These above mentioned static methods should be called from the main method.

For findMostExpensiveCar method - The main method should print the make, model, year and price of the returned Car object.
If the returned value is null then it should print "Sorry - No car is available".

For getCarByMakeAndModel method - The main method should print the year and price of the returned Car object. If the returned
value is null then it should print "Sorry - No car is available".

Before calling these static methods in main, use Scanner object to read the values of four Car objects referring attributes in
the above mentioned attribute sequence. Next, read the values for make and model.

Input:
-----------------
Mercedes
S-Class
2020
1250000
BMW
5-Series
2019
900000
Audi
A4
2022
800000
Jaguar
F-PACE
2021
1100000
Audi
A4

Output:
---------------------
Mercedes
S-Class
1250000.0
2020
2022
800000.0
 */

import java.util.*;
class CarModel{
    private String make;
    private String model;
    private int year;
    private double price;

    public CarModel(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return getMake() + "\n" + getModel() + "\n" + getPrice() + "\n" + getYear();
    }
}

public class Problem113_Car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of car models: ");
        CarModel[] carModels = new CarModel[sc.nextInt()];
        for (int i = 0; i < carModels.length; i++) {
            System.out.println("Enter make " + i + ": ");
            String make = sc.next();
            System.out.println("Enter model " + i + ": ");
            String model = sc.next();
            System.out.println("Enter year " + i + ": ");
            int year = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter price " + i + ": ");
            double price = sc.nextDouble();
            sc.nextLine();

            carModels[i] = new CarModel(make, model, year, price);
        }
        System.out.println("Enter car Make Parameter: ");
        String makeParameter = sc.next();
        System.out.println("Enter car Model: ");
        String modelParameter = sc.next();

        CarModel mostExpensiveCar = findMostExpensiveCar(carModels);
        System.out.println(mostExpensiveCar != null ? mostExpensiveCar : "Sorry - No car is available") ;

        CarModel carByModel = getCarByMakeAndModel(carModels , makeParameter , modelParameter);
        if (carByModel != null) {
            System.out.println(carByModel.getYear() + "\n" + carByModel.getPrice());
        }


    }
    public static CarModel findMostExpensiveCar(CarModel[] carModels){
        CarModel mostExpensiveCar = null;
        for (CarModel carModel : carModels) {
            if (mostExpensiveCar == null || carModel.getPrice() > mostExpensiveCar.getPrice()) {
                mostExpensiveCar = carModel;
            }
        }

        return mostExpensiveCar;
    }
    public static CarModel getCarByMakeAndModel(CarModel[] carModels, String make, String model){
        for (CarModel carModel : carModels) {
            if (carModel.getMake().equalsIgnoreCase(make) && carModel.getModel().equalsIgnoreCase(model)) {
                return carModel;
            }
        }
        return null;
    }
}

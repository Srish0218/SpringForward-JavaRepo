/*
Create a class Phone with below attributes:

phoneId - int
os - String
brand - String
price - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with main method.

Implement two static methods - findPriceForGivenBrand and getPhoneIdBasedOnOs in Solution class.

findPriceForGivenBrand method:
----------------------------------
This method will take two input parameters - array of Phone objects and string
parameter brand. The method will return the sum of the price attribute from phone objects for the brand passed
as parameter. If no phones with the given brand is present in the array of phone objects, then the method should
return 0.

getPhoneIdBasedOnOs method:
----------------------------------
This method will take a String parameter os, along with the array of Phone objects.
The method will return the phone object, if the input String parameter matches with the os attribute of the phone
object and its price attribute is greater than or equal to 50000. If any of the conditions are not met, then the
method should return null.

Note : No phone object would have the same value for os attribute. All phone object would have the price greater than 0.
All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.

For findPriceForGivenBrand method - The main method should print the price as it is if the returned price is greater
than 0, or it should print "The given Brand is not available".

For getPhoneIdBasedOnOs method - The main method should print the phoneId of the returned phone object. If the returned
value is null then it should print "No phones are available with specified os and price range".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring
attributes in the above mentioned attribute sequence. Next, read the value for brand and os.

Input
--------------
111
iOS
Apple
30000
222
android
Samsung
50000
333
Symbian
HTC
12000
444
Paranoid
HTC
89000
Blackberry
aNdRoid

Output
------------------
The given Brand is not available
222
 */

import java.util.*;

class Phone{
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
    public String getOs() {
        return os;
    }
    public int getPhoneId() {
        return phoneId;
    }
}


public class Problem39_Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the phone details: \n");
        Phone[] phones = new Phone[4];
        for (int i = 0; i < phones.length; i++) {
            System.out.println("Enter the phone Id: ");
            int phoneId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the OS: ");
            String os = sc.nextLine();
            System.out.println("Enter the Brand: ");
            String brand = sc.nextLine();
            System.out.println("Enter the Price: ");
            int price = sc.nextInt();
            sc.nextLine();
            phones[i] = new Phone(phoneId, os, brand, price);
        }
        System.out.println("Enter phone brand parameter: ");
        String brandParameter = sc.nextLine();
        System.out.println("Enter phone OS parameter: ");
        String osParameter = sc.nextLine();

        int sumPrice = findPriceForGivenBrand(phones , brandParameter);
        System.out.println(sumPrice == 0 ? "The given Brand is not available" : sumPrice);

        Phone phoneIdByOS = getPhoneIdBasedOnOs(phones , osParameter);
        System.out.println(phoneIdByOS == null ? "No phones are available with specified os and price range" : phoneIdByOS.getPhoneId());




    }
    private static int findPriceForGivenBrand(Phone[] phones, String brandParameter) {
        int sumPrice = 0;
        for (Phone phone : phones) {
            if(phone.getBrand().equalsIgnoreCase(brandParameter)) {
                sumPrice += phone.getPrice();
            }
        }
        return sumPrice;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String osParameter) {
        Phone[] phoneOs = new Phone[1];
        for (Phone phone : phones) {
            if(phone.getOs().equalsIgnoreCase(osParameter) && phone.getPrice() >= 50000 ) {
                phoneOs[0] = phone;

            }
        }

        return phoneOs[0] == null ? null : phoneOs[0];
    }
}

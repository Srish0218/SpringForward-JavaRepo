/*
Create a class MobileDetails with the below attributes:

MobileId – int
Price - int
Brand – String
isFlagShip – boolean

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class MobileDetails with main method.

Implement two static methods – getTotalPrice() and getSecondMin() in MobileDetails class.

getTotalPrice method:
----------------------------------------
This method will take two int input parameters which take object array and string brand. The method will return the total
price of mobiles of that brand.

If no mobile with the given brand is present in the array of MobileDetails objects, then the method should return 0.

getSecondMin method:
----------------------------------------
This method will take object array which will return the second minimum price from the array and name of that mobile brand.

The above mentioned static methods should be called from the main method.

For getTotalPrice method: The main method should print the total price as it is, if the returned
value is not null, or it should print “There are no mobile with given brand”.

Before calling these static methods in main, use Scanner object to read the values of five objects referring attributes
in the above mentioned attribute sequence.

Input :
---------------------------------------
101
25000
Samsung
True
102
19000
Redmi
False
103
28000
Nokia
True
104
25000
Realme
False
105
40000
Samsung
True
Samsung

Output :
-----------------------------------------
65000
Samsung : 25000
Realme : 25000
 */

import java.util.*;

class MobileDetails {
    private int MobileId;
    private int Price;
    private String Brand;
    private boolean isFlagShip;

    public MobileDetails(int MobileId, int Price, String Brand, boolean isFlagShip) {
        this.MobileId = MobileId;
        this.Price = Price;
        this.Brand = Brand;
        this.isFlagShip = isFlagShip;
    }

    public int getPrice(){
        return Price;
    }
    public String getBrand() {
        return Brand;
    }
}

public class Problem107_MobileDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Mobile Ids: ");
        MobileDetails[] mobiles = new MobileDetails[sc.nextInt()];
        for (int i = 0; i < mobiles.length; i++) {
            System.out.print("Enter Mobile Id: ");
            int mobileId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Mobile Price: ");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Brand: ");
            String brand = sc.nextLine();
            System.out.println("Enter IsFlagShip: ");
            boolean isFlagShip = sc.nextBoolean();
            sc.nextLine();
            mobiles[i] = new MobileDetails(mobileId, price, brand, isFlagShip);
        }
        System.out.println("Enter mobile brand parameter: ");
        String brandParameter = sc.nextLine();

        int priceByBrand = getTotalPrice(mobiles , brandParameter);
        System.out.println(priceByBrand > 0 ? priceByBrand : "There are no mobile with given brand");

        ArrayList<MobileDetails> mobileByPrice = getSecondMin(mobiles);
        if (mobileByPrice != null) {
            for(MobileDetails mobile : mobileByPrice) {
                System.out.println(mobile.getBrand() + " : " + mobile.getPrice());
            }
        }else{
            System.out.println("No mobile found");
        }



    }
    private static int getTotalPrice(MobileDetails[] mobiles, String brandParameter) {
        int totalPrice = 0;
        for(MobileDetails mobile : mobiles) {
            if(mobile.getBrand().equalsIgnoreCase(brandParameter)) {
                totalPrice += mobile.getPrice();
            }
        }
        return totalPrice;
    }
    private static ArrayList<MobileDetails> getSecondMin(MobileDetails[] mobiles) {
        ArrayList<MobileDetails> secondMin = new ArrayList<>();
        int firstMinPrice = Integer.MAX_VALUE;
        int secondMinPrice = Integer.MAX_VALUE;
        // First pass to find the first and second minimum prices
        for (MobileDetails mobile : mobiles) {
            if (mobile.getPrice() < firstMinPrice) {
                secondMinPrice = firstMinPrice;
                firstMinPrice = mobile.getPrice();
            } else if (mobile.getPrice() > firstMinPrice && mobile.getPrice() < secondMinPrice) {
                secondMinPrice = mobile.getPrice();
            }
        }

        // Second pass to collect all mobiles with the second minimum price
        for (MobileDetails mobile : mobiles) {
            if (mobile.getPrice() == secondMinPrice) {
                secondMin.add(mobile);
            }
        }
        if (!secondMin.isEmpty()) {
            return null;
        }

        return secondMin;
    }

}

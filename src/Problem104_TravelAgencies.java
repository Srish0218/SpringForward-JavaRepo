/*
Create a class TravelAgencies with below attributes:

regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and
agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return the highest package
price from the given array of objects.

agencyDetailsForGivenldAndType method:

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
parameter packageType. The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can
have more than one package type. Travel agency and package type combination is unique. All the searches should
be case insensitive.

The above mentioned static methods should be called from the main method.


For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is.
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned
object.The AgencyName and price should be concatinated with : while printing.
---------
Input
---------
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond
-------------------------------
Output
-------------------------------
50000
Cox and Kings:40000
 */


import java.util.*;

class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String pakageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String pakageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.pakageType = pakageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
    public int getRegNo() {
        return regNo;
    }
    public String getAgencyName() {
        return agencyName;
    }
    public String getPakageType() {
        return pakageType;
    }
    public int getPrice() {
        return price;
    }
    public boolean isFlightFacility() {
        return flightFacility;
    }
}

public class Problem104_TravelAgencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of agencies: ");
        TravelAgencies[] agencies = new TravelAgencies[sc.nextInt()];
        for (int i = 0; i < agencies.length; i++) {
            System.out.println("Enter registration no: ");
            int regNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter agency name: ");
            String agencyName = sc.nextLine();
            System.out.println("Enter pakage type: ");
            String packageType = sc.nextLine();
            System.out.println("Enter price: ");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter flight facility: ");
            boolean flightFacility = sc.nextBoolean();
            sc.nextLine();

            agencies[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
        }
        System.out.println("Enter reg no parameter: ");
        int regNoParameter = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter package type parameter: ");
        String packageTypeParameter = sc.nextLine();

        int agencyWithHighestPackage = findAgencyWithHighestPackagePrice(agencies);
        System.out.println(agencyWithHighestPackage);

        TravelAgencies agencyDetails = agencyDetailsForGivenldAndType(agencies , regNoParameter , packageTypeParameter);
        System.out.println(agencyDetails != null ? agencyDetails.getAgencyName() + ":" + agencyDetails.getPrice() : "No agency as required attribute.");

    }
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
        int highestPackagePrice = agencies[0].getPrice();
        for(TravelAgencies agency : agencies) {
            if(agency.getPrice() > highestPackagePrice) {
                highestPackagePrice = agency.getPrice();
            }

        }
        return highestPackagePrice;
    }
    public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] agencies, int regNoParameter, String packageTypeParameter) {
        for(TravelAgencies agency : agencies) {
            if(agency.getRegNo() == regNoParameter && agency.getPakageType().equalsIgnoreCase(packageTypeParameter)) {
                return agency;
            }
        }
        return null;
    }
}

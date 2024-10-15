/*
Create a class Hotel with the below attributes:

hotelId - int
hotelName - String
dateOfBooking – String (in the format dd-mon-yyyy)
noOfRoomsBooked – int
wifiFacility – String
totalBill- double

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement two static methods – noOfRoomsBookedInGivenMonth and searchHotelByWifiOption in Solution class.

noOfRoomsBookedInGivenMonth method:
This method will take two input parameter - array of Hotel objects and a String parameter.
The method will return the total numbers of rooms booked from array of Hotel objects for the given month(String parameter passed).
If no rooms are booked for the given month in the array of Hotel objects, then the method should return 0.

searchHotelByWifiOption method:
This method will take two input parameter - array of Hotel objects and a String parameter
The method will return Hotel object with second highest totalbill, from the array of Hotel objects where wifiFacility attribute
matches with the given wifi facility(String parameter passed).
If no Hotel with the given wifi option is present in the array of Hotel objects, then the method should return null.

Note :
No two Hotel object would have the same hotelId.
No two Hotel object would have the same totalbill.
The Array either has at least two objects with specified wifi option OR  no object with specified wifi option.
All the searches should be case insensitive.
dateOfBooking is stored in the format dd-mon-yyyy(eg. 01-Jan-2022)

The above mentioned static methods should be called from the main method.

For noOfRoomsBookedInGivenMonth method - The main method should print the total number of booked rooms as it is,
if the returned value is greater than 0, else it should print "No rooms booked in the given month"

For searchHotelByWifiOption method - The main method should print the hotelId from the returned Hotel object if the returned value is not null.
If the returned value is null then it should print "No such option available".

Before calling these static methods in main, use Scanner object to read the values of four Hotel objects referring attributes in the above mentioned attribute sequence.
Next, read the value of two String parameters for capturing the month and wifi option .



Consider below sample input and output:


Input1:
101
Best Stay
01-jan-2022
10
Yes
20000
102
Apple Stay
12-Feb-2022
3
Yes
4000
103
Accord
11-May-2022
5
Yes
15000
104
Royal Park
22-Dec-2021
7
Yes
12000
May
Yes

Output1:
5
103


Input2:
101
Best Stay
01-jan-2022
10
Yes
20000
102
Apple Stay
12-Feb-2022
3
Yes
4000
103
Accord
11-May-2022
5
Yes
15000
104
Royal Park
22-Dec-2021
7
Yes
12000
May1
Yes1

Output2:
No rooms booked in the given month
No such option available


 */

import java.util.*;

class Hotel{
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;      // (in the format dd-mon-yyyy)
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int hotelId , String hotelName , String dateOfBooking , int noOfRoomsBooked, String wifiFacility, double totalBill){
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;

    }
    public String getMonth(){
        return dateOfBooking.split("-")[1];
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public int getHotelId() {
        return hotelId;
    }
}

public class Problem54_Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hotel details: ");
        Hotel[] hotels = new Hotel[4];
        for (int i = 0; i < hotels.length; i++) {
            System.out.println("Enter hotel Id: ");
            int hotelId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter hotel name: ");
            String hotelName = sc.nextLine();
            System.out.println("Enter date: ");
            String dateOfBooking = sc.nextLine();
            System.out.println("Enter number of rooms booked: ");
            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter wifi facility: ");
            String wifiFacility = sc.nextLine();
            System.out.println("Enter total bill: ");
            double totalBill = sc.nextDouble();
            sc.nextLine();

            hotels[i] = new Hotel(hotelId , hotelName , dateOfBooking , noOfRoomsBooked , wifiFacility , totalBill);
        }

        System.out.println("Enter Month parameter: ");
        String month = sc.nextLine();
        System.out.println("Enter wifi facility available parameter: ");
        String wifiFacilityAvailable = sc.nextLine();

        int noOfRooms =  noOfRoomsBookedInGivenMonth(hotels , month);
        System.out.println(noOfRooms != 0 ? noOfRooms : "No rooms booked in the given month");

        Hotel secondHighest = searchHotelByWifiOption(hotels , wifiFacilityAvailable);
        System.out.println(secondHighest != null ? secondHighest.getHotelId() : "No such option available");




    }
    public static int noOfRoomsBookedInGivenMonth(Hotel[] hotels , String month){
        int noOfRoomsCount = 0;
        for(Hotel hotel : hotels){
            if(hotel.getMonth().equalsIgnoreCase(month)){
                noOfRoomsCount += hotel.getNoOfRoomsBooked();
            }
        }
        return noOfRoomsCount;

    }
    public static Hotel searchHotelByWifiOption(Hotel[] hotels , String wifiFacility){
        List<Hotel> hotelList = new ArrayList<>();
        for(Hotel hotel : hotels){
            if(hotel.getWifiFacility().equalsIgnoreCase(wifiFacility)){
                hotelList.add(hotel);
            }
        }
        if(hotelList.size() < 2){
            return null;
        }
        return getSecondHighest(hotelList);
    }
    public static Hotel getSecondHighest(List<Hotel> hotelList){
        Hotel highest = hotelList.get(0);
        Hotel secondHighest = hotelList.get(1);
        for(Hotel hotel : hotelList){
            if(hotel.getTotalBill() > highest.getTotalBill()){
                secondHighest = highest;
                highest = hotel;
            }
            else if (hotel.getTotalBill() > secondHighest.getTotalBill() && hotel.getTotalBill() != highest.getTotalBill()){
                secondHighest = hotel;
            }
        }
        return secondHighest;
    }
}

















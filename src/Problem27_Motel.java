//Create a class Motel with the below attributes:
//
//motelId - int
//motelName - String
//dateOfBooking – String (in the format dd-mon-yyyy)
//noOfRoomsBooked – int
//cabFacility – String
//totalBill- double
//
//Restricted for circulation outside TCS Xplore 6
//The above attributes should be private, write getters, setters and parameterized constructor as
//required.
//        Create class Solution with main method.
//Implement one static method – totalNoOfRoomsBooked in Solution class.
//totalNoOfRoomsBooked method:
//This method will take two input parameter - array of Motel objects and a String parameter.
//The method will return the total numbers of rooms booked from array of Motel objects if the cab facility
//attribute matches with the given String parameter(cab facility) and the number of rooms booked is
//greater than 5.
//If no rooms are booked with the above criteria in the array of Motel objects, then the method should
//return 0.
//Note :
//No two Motel object would have the same motelId.
//dateOfBooking is stored in the format dd-mon-yyyy(eg. 01-Jan-2022)
//The above mentioned static method should be called from the main method.
//For totalNoOfRoomsBooked method - The main method should print the total number of booked rooms
//as it is, if the returned value is greater than 0, else it
//should print "No such rooms booked"
//Before calling these static methods in main, use Scanner object to read the values of four Motel objects
//referring attributes in the above mentioned attribute sequence.
//Next, read the value of one String parameter for capturing the cab facility
//
//Input
//        ___________
//1001
//M&M
//01-Dec-2022
//        5
//Yes
//30000
//        1002
//BestStay
//10-Jan-2022
//        3
//Yes
//27000
//        1003
//Novatel
//11-Jun-2022
//        5
//Yes
//25000
//        1004
//Chola
//01-Sep-2022
//        7
//Yes
//72000
//Yes
//        ___________
//OutPut
//        ___________
//7

import java.util.*;

class Motel{
    private int motelId;
    private String motelName;
    private String dateOfBooking; // (in the format dd-mon-yyyy)
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    public Motel( int motelId , String motelName , String dateOfBooking , int noOfRoomsBooked, String cabFacility, double totalBill ){
        this.motelId = motelId;
        this.motelName = motelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;

    }

    public String getCabFacility() {
        return this.cabFacility;
    }

    public int getNoOfRoomsBooked() {
        return this.noOfRoomsBooked;
    }
}


public class Problem27_Motel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Motel details: ");
        Motel[] motels = new Motel[4];
        for (int i = 0; i < motels.length; i++) {
            System.out.println("Enter Motel ID: ");
            int motelId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Motel Name: ");
            String motelName = sc.nextLine();
            System.out.println("Enter Motel Date Of Booking: ");
            String dateOfBooking = sc.nextLine();
            System.out.println("Enter Motel Number of Rooms: ");
            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Motel Cab Facility: ");
            String cabFacility = sc.nextLine();
            System.out.println("Enter Motel Total Bill: ");
            double totalBill = sc.nextDouble();
            sc.nextLine();

            motels[i] = new Motel(motelId , motelName , dateOfBooking , noOfRoomsBooked , cabFacility , totalBill);
        }

        System.out.println("Enter cab facility parameter: ");
        String cabFacilityParameter = sc.nextLine();

        System.out.println("Output: ");
        int roomsBooked = totalNoOfRoomsBooked(motels , cabFacilityParameter);
        System.out.println(roomsBooked > 0 ? roomsBooked : "No such rooms booked");

    }
    public static int totalNoOfRoomsBooked(Motel[] motels , String cabFacilityParameter){
        int total = 0;
        for (Motel motel : motels){
            if (motel.getCabFacility().equalsIgnoreCase(cabFacilityParameter) && motel.getNoOfRoomsBooked() > 5){
                return motel.getNoOfRoomsBooked();
            }
        }
        return 0;
    }
}

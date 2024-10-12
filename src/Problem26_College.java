//Create a class College with the below attributes.
//
//id-int
//
//name -String
//
//contactNo-int
//
//address-String
//
//pinCode-int
//
//
//
//Write the getters and setters and parametrized constructor in the above
//
//mentioned sequence as required.
//
//
//
//Create the class Solution with the main method.
//
//Implement the two static methods:
//
//        1.findCollegeWithMaximumPincode
//
// 2.searchCollegeByAddress
//
//
//
//findCollegeWithMaximumPincode method:
//
//Create the Static method in the Solution Class.
//
//This method will take array of the College objects and return the
//
//College object having maximum pincode if found else return null if not
//
//found.
//
//   for this method ,main method will print College object with maximum
//
//pincode if the returned value is not null.if the returned value is null ,
//
//
//then the main method will print "No college found with mentioned attribute".
//
//
//
//
//
//searchCollegeByAddress method:
//
//Create the Static method in the Solution Class.
//
//This method will take array of College objects as input and address as
//
//input and return College object having the mentioned address if found
//
//else return null if not found.
//
//        for this method main method will print College object details as it is ,
//
//        if the returned value is not null.if the returned value is null then ,
//
//
//main method will print "No college found with mentioned attribute".
//
//
//
//
//        ***************************************************************************
//
//input 1:
//
//        4
//        109
//ACT
//2500256
//mumbai
//695001
//        107
//MCE
//2500254
//malapuram
//612354
//        113
//CTE
//2500252
//chennai
//623145
//        102
//SCT
//2500255
//AP
//523641
//AP
//
//
//
//OUTPUT1:
//
//id-109
//
//name-ACT
//
//contactNo-2500256
//
//address-mumbai
//
//pincode-695001
//
//id-102
//
//name-SCT
//
//contactNo-2500255
//
//address-AP
//
//pincode-523641
//
//
//
//
//
//
//
//INPUT2:
//
//        4
//        111
//MJT
//2500251
//Calicut
//401235
//        105
//MET
//2500256
//kochi
//668745
//        115
//IIT
//2500262
//banglore
//569874
//        110
//ACT
//2500263
//delhi
//687945
//delhi
//
//
//output2:
//
//id-110
//
//name-ACT
//
//contactNo-2500263
//
//address-delhi
//
//pincode-687945
//
//id-110
//
//name-ACT
//
//contactNo-2500263
//
//address-delhi
//
//pincode-687945

import java.util.*;

class College{
    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pinCode;

    public College(int id, String name, int contactNo, String address, int pinCode){
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pinCode = pinCode;
    }
    public int getPinCode(){
        return this.pinCode;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "id-" + id + "\nname-" + name + "\ncontactNo-" + contactNo + "\naddress-" + address + "\npinCode-" + pinCode;

    }
}

public class Problem26_College {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter College Details: ");
        System.out.println("Enter number of colleges: ");
        int n = sc.nextInt();
        sc.nextLine();
        College[] colleges = new College[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter college id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter college name: ");
            String name = sc.nextLine();
            System.out.println("Enter college contactNo: ");
            int contactNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter college address: ");
            String address = sc.nextLine();
            System.out.println("Enter college pinCode: ");
            int pinCode = sc.nextInt();
            sc.nextLine();
            colleges[i] = new College(id, name, contactNo, address, pinCode);
        }

        System.out.println("Enter address parameter: ");
        String addressParameter = sc.nextLine();

        System.out.println("Output: ");

        College collegeWithMaxPincode = findCollegeWithMaximumPincode(colleges);
        System.out.println(collegeWithMaxPincode);

        College collegeByAddress = searchCollegeByAddress(colleges,addressParameter);
        System.out.println(collegeByAddress != null ? collegeByAddress : "No college found with mentioned attribute");



    }

    public static College findCollegeWithMaximumPincode(College[] colleges){
        College collegeWithMaxPincode = colleges[0];
        for(College c : colleges){
            if(collegeWithMaxPincode.getPinCode() < c.getPinCode()){
                collegeWithMaxPincode = c;
            }

        }
        return collegeWithMaxPincode;

    }

    public static College searchCollegeByAddress(College[] colleges, String addressParameter){
        List<College> collegeByAddress = new ArrayList<>();
        for (College college : colleges){
            if (college.getAddress().equalsIgnoreCase(addressParameter)){
                collegeByAddress.add(college);
            }
        }
        return collegeByAddress.getFirst();
    }
}

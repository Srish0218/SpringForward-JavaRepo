/*
Create a class Institution with below attributes:

institutionId - int
institutionName - String
noOfStudentsPlaced - int
noOfStudentsCleared- int
location - String
grade - String

Write getters, setters for the above attributes.
Create constructor which takes parameter in the above sequence except grade.

Create class Solution with main method.
Implement two static methods - FindNumClearancedByLoc and UpdateInstitutionGrade in Solution class.

FindNumClearancedByLoc method:
----------------------------------------------
This method will take two input parameters - array of Institution objects and string parameter location.
The method will return the sum of the noOfStudentsCleared attribute from institution objects for the location passed as
parameter. If no institution with the given location is present in the array of institution objects, then the method
should return 0.

UpdateInstitutionGrade method:
-----------------------------------------------
This method will take a String parameter institutionName, along with the array of Institution objects.
The method will return the institution object, if the input String parameter matches with the institutionName attribute of the
institution object. Before returning the object, the grade should be arrived based on the rating calculation mentioned below.
This grade value should be assigned to the object.If any of the above conditions are not met, then the method should return
null.

* The grade attribute should be calculated as follows:

Rating=(noOfStudentsPlaced * 100)/noOfStudentsCleared
If the rating >= 80 , then grade should be 'A'.
Else, then grade should be 'B'

**Note:**
--------------------------------------------
No institution object would have the same value for institutionName attribute.
All institution object would have the noOfStudentsPlaced value lesser than noOfStudentsCleared value.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For FindNumClearancedByLoc method - The main method should print the noOfClearance as it is, if the returned value is
greater than 0, or it should print "There are no cleared students in this particular location".

For UpdateInstitutionGrade method - The main method should print the institutionName and grade of the returned Institution
object. The instituationName and grade should be concatinated with :: while printing. eg:- TCS::A, where TCS is the
institution name and A is the grade.
If the returned value is nullthen it should print "No Institute is available with the specified name".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring attributes
in the above mentioned attribute sequence (except grade attribute). Next, read the value for location and institutionName.

Input
-------------------------------------------
111
Amrita
5000
10000
Chennai
222
Karunya
16000
20000
Coimbatore
333
AppleTech
10000
12000
Chennai
444
Aruna
6000
10000
Vellore
Chennai
Karunya

Output
----------------------------------------
22000
Karunya::A
 */

import java.util.*;

class Institution{
    private int institutionId;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade = "";

    public Institution(int institutionId , String institutionName , int noOfStudentsPlaced , int noOfStudentsCleared, String location){
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;

    }
    public String getLocation(){
        return location;
    }
    public int getNoOfStudentsCleared(){
        return noOfStudentsCleared;
    }

    public String getInstitutionName() {
        return institutionName;
    }
    public int getNoOfStudentsPlaced(){
        return noOfStudentsPlaced;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }
}

public class Problem97_Institution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of institutions: ");
        Institution[] institutions = new Institution[sc.nextInt()];
        sc.nextLine();
        for(int i = 0; i < institutions.length; i++){
            System.out.println("Enter institution " + (i + 1) + " id: " );
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter institution " + (i + 1) + " name: " );
            String name = sc.nextLine();
            System.out.println("Enter institution " + (i + 1) + " no of students placed: " );
            int noOfStudentsPlaced = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter institution " + (i + 1) + " no of students cleared: " );
            int noOfStudentsCleared = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter institution " + (i + 1) + " location: " );
            String location = sc.nextLine();
            institutions[i] = new Institution(id , name , noOfStudentsPlaced , noOfStudentsCleared , location );

        }
        System.out.println("Enter location parameter: ");
        String locationParameter = sc.nextLine();
        System.out.println("Enter institution  parameter: ");
        String institutionNameParameter = sc.nextLine();

        int sumCleared = FindNumClearancedByLoc(institutions , locationParameter);
        System.out.println(sumCleared > 0 ? sumCleared : "There are no cleared students in this particular location");

        Institution institutionGrade = UpdateInstitutionGrade(institutions , institutionNameParameter);
        if(institutionGrade == null){
            System.out.println("No Institute is available with the specified name");
        }else{
            System.out.println(institutionGrade.getInstitutionName() + "::" + institutionGrade.getGrade());
        }
    }
    public static int FindNumClearancedByLoc(Institution[] institutions , String locationParameter){
        int sumCleared = 0;
        for(Institution institution : institutions){
            if(institution.getLocation().equalsIgnoreCase(locationParameter)){
                sumCleared += institution.getNoOfStudentsCleared();
            }
        }
        return sumCleared;
    }
    public static Institution UpdateInstitutionGrade(Institution[] institutions , String institutionNameParameter){
        for(Institution institution : institutions){
            if(institution.getInstitutionName().equalsIgnoreCase(institutionNameParameter)){
                String grade = getGrade(institution.getNoOfStudentsCleared() , institution.getNoOfStudentsPlaced());
                institution.setGrade(grade);
                return institution;
            }
        }
        return null;
    }
    public static String getGrade(int noOfStudentsCleared , int noOfStudentsPlaced){
        int rating = (noOfStudentsPlaced * 100) / noOfStudentsCleared;
        return rating >= 80 ? "A" : "B";
    }
}

//Create a class AutonomousCar with the below attributes:
//
//carld – int
//brand – String
//noOfTestsConducted – int
//noOfTestsPassed- int
//environment – String
//
//        Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence
//except grade.
//
//Create class Solution with main method. Implement two static methods – findTestPassedByEnv and updateCarGrade in
//Solution class.
//
//findTestPassedByEnv method:
//
//This method will take two input parameters -array of AutonomousCar objects and string parameter environment. The method
//will return the sum of the noOfTestsPassed attribute from autonomousCar objects for the environment passed as parameter.
//If no autonomousCar with the given environment is present in the array of AutonomousCar objects, then the method should
//return 0.
//
//updateCarGrade method:
//
//This method will take a String parameter brand, along with the array of AutonomousCar objects. The method will return
//the autonomousCar object, if the input String parameter matches with the brand attribute of the autonomousCar object.
//Before returning the object, the grade should be derived based on the rating calculation mentioned below. This grade
//value should be assigned to the object. If any of the above conditions are not met, then the method should return null.
//The grade attribute should be calculated as follows: rating .(noOfTestsPassed * 100)/noOfTestsConducted
//If the rating > = 80 then grade should be ‘A1’, otherwise the grade should be ‘B2’.
//
//The above mentioned static methods should be called from the main method. For findTestPassedByEnv method – The main
//method should print the totalTestPassed as it is, if the returned value is greater than 0, or it should print “There
//are no tests passed in this particular environment”.
//
//For updateCarGrade method – The main method should print the brand and grade of the returned autonomousCar object.
//The brand and grade should be concatinated with :: while printing. eg:- Tesla::A1, where Tesla is the brand and Al
//is the grade.
//
//If the returned value is null then it should print “No Car is available with the specified brand”. Before calling these
//static methods in main, use Scanner object to read the values of four autonomousCar objects referring attributes in the
//above mentioned attribute sequence (except grade attribute). Next, read the value for environment and brand.
//
//        Input
//----------------
//        100
//Tesla
//1000
//        500
//Hills
//200
//Ford
//2000
//        1500
//Desert
//300
//Royce
//3000
//        1700
//Hills
//400
//Mercedez
//1000
//        400
//Desert
//        Desert
//Mercedez
//
//        Output
//-----------
//        1900
//Mercedez::B2



import java.util.*;

class AutonomousCar{
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;
    private String grade;

    public AutonomousCar(int carId, String brand, int noOfTestsConducted,int  noOfTestsPassed, String environment , String grade){
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
        this.grade = grade;

    }
    public String getEnvironment(){
        return this.environment;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getNoOfTestsConducted(){
        return this.noOfTestsConducted;
    }
    public int getNoOfTestsPassed(){
        return this.noOfTestsPassed;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }

    @Override
    public String toString() {
        return brand + "::" +grade;
    }
}


public class Problem23_AutonomousCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        AutonomousCar[] autoCars = new AutonomousCar[4];
        System.out.println("Enter car details: ");
        for(int i = 0; i<autoCars.length; i++){
            System.out.println("Enter car ID: ");
            int carId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter brand: ");
            String brand = sc.nextLine();
            System.out.println("Enter no of tests conducted: ");
            int noOfTestsConducted = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter no of tests passed: ");
            int noOfTestsPassed = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter environment: ");
            String environment = sc.nextLine();
            System.out.println("Grade set empty");
            String grade = "";

            autoCars[i] = new AutonomousCar(carId , brand, noOfTestsConducted, noOfTestsPassed, environment , grade);
        }
        System.out.println("Enter environment Parameter");
        String environmentParameter = sc.nextLine();
        System.out.println("Enter brand Parameter: ");
        String brandParameter = sc.nextLine();

        System.out.println("Output: ");
        int passesResults = findTestPassedByEnv(autoCars, environmentParameter);
        System.out.println(passesResults > 0 ? passesResults : "There are no tests passed in this particular environment");

        List<AutonomousCar> autoCarsList = updateCarGrade(autoCars , brandParameter);
        for(AutonomousCar autoCar : autoCarsList){
            System.out.println(autoCar);
        }
    }
    public static int findTestPassedByEnv(AutonomousCar[] autoCars, String environmentParameter){
        int passedTestSum = 0;
        for(AutonomousCar car : autoCars){
            if(car.getEnvironment().equals(environmentParameter)){
                passedTestSum += car.getNoOfTestsPassed();
            }
        }
        return passedTestSum;
    }

    public static List<AutonomousCar> updateCarGrade(AutonomousCar[] autoCars, String brandParameter){
        List<AutonomousCar> updatedCarGrade = new ArrayList<>();
        for(AutonomousCar car : autoCars){
            if(car.getBrand().equalsIgnoreCase(brandParameter)){
                car.setGrade(calculateGrade(car.getNoOfTestsConducted() , car.getNoOfTestsPassed()));
                updatedCarGrade.add(car);
            }
        }
        return updatedCarGrade;
    }

    public static String calculateGrade(int conducted, int passed){
        return ((passed * 100) / conducted) >= 80? "A1":"B2";
    }
}

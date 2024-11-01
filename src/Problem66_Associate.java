/*
Create class Associate with below attributes:
id - int
name - String
technology - String
experienceInYears - int

Create class Solution and implement static method "associatesForGivenTechnology" in the Solution class.
This method will take array of Associate objects and a searchTechnology String as parameters.
And will return another array of Associate objects where the searchTechnology String matches with the original array of
Associate object's technology attribute (case insensitive search) and experienceInYears attribute should be multiples of 5.

Write necessary getters and setters.

Before calling "associatesForGivenTechnology" method in the main method, read values for five associate objects referring
the attributes in above sequence along with a String searchTechnology.
Then call the "associatesForGivenTechnology" method and write the logic to print the id's in the main method.

Input
-----------------
101
Alex
Java
15
102
Albert
Unix
20
103
Alferd
Testing
13
104
Alfa
Java
15
105
Almas
Java
29
Java

Output
------------------
101
104
 */
import java.util.ArrayList;
import java.util.Scanner;

class Associate{
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;

    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }

    public String getTechnology() {
        return technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }
    public int getId() {
        return id;
    }
}

public class Problem66_Associate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter associate details: ");
        Associate[] associates = new Associate[5];
        for (int i = 0; i < associates.length; i++) {
            System.out.println("Enter associate Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter associate Name: ");
            String name = sc.nextLine();
            System.out.println("Enter associate Technology: ");
            String technology = sc.nextLine();
            System.out.println("Enter associate Experience In Years: ");
            int experienceInYears = sc.nextInt();
            sc.nextLine();

            associates[i] = new Associate(id, name, technology, experienceInYears);
        }
        System.out.println("Enter associate technology parameter: ");
        String technologyParameter = sc.nextLine();

        ArrayList<Associate> associatesIDs = associatesForGivenTechnology(associates , technologyParameter);
        for (Associate associate : associatesIDs) {
            System.out.println(associate.getId());
        }

    }
    public static ArrayList<Associate> associatesForGivenTechnology(Associate[] associates , String technologyParameter) {
        ArrayList<Associate> associatesArray = new ArrayList<>();
        for(Associate associate : associates) {
            if(associate.getTechnology().equals(technologyParameter) && isMultipleOf5(associate.getExperienceInYears())) {
                associatesArray.add(associate);
            }
        }
        return associatesArray;

    }
    public static boolean isMultipleOf5(int experienceInYears) {
        return (experienceInYears % 5 == 0);
    }
}

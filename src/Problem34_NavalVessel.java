/*
Create a class NavalVessel with the below attributes:

vesselld – int
vesselName – String
noOfVoyagesPlanned – int
noOfVoyagesCompleted – int
purpose – String


Write getters, setters for the above attributes. Create constructor which takes parameter in the above
sequence except classification.

Create class Solution with main method. Implement two static methods – findAvgVoyagesByPct and findVesselByGrade
in Solution class.

findAvgVoyagesByPct method:

This method will take two input parameters -array of NavalVessel objects and int parameter percentage. The method will
return the average of the noOfVoyagesCompleted attribute from NavalVessel objects which meets the percentage requirement
as mentioned below.The percentage for each navalVessel is calculated as
percentage .(noOfVoyagesCompleted * 100)/noOfVoyagesPlanned. If the above calculated percentage is greater than or equal
to the percentage passed as the parameter, then those objects should participate in the average calculation. If there are
no objects with the mentioned criteria, then the method should return 0.

findVesselByGrade method:

This method will take a String parameter purpose, along with the array of NavalVessel objects. The method will return the
NavalVessel object, if the input String parameter matches with the purpose attribute of the NavalVessel object. Before
returning the object, the classification should be derived as mentioned below. This classification value should be assigned
to the object before returning. If any of the above conditions are not met, then the method should return null. The
classification attribute should be calculated based on the percentage calculation mentioned above.
If the percentage = 100 then classification should be ‘Star’, if percentage is between 99 and 80 then classification should
be ‘Leader, if percentage is between 79 and 55 then classification should be ‘Inspirer' otherwise the classification should
be ‘Striver’ If the returned value is null then it should print “No Naval Vessel is available with the specified purpose”.

Before calling these static methods in main, use Scanner object to read the values of four NavalVessel objects referring
attributes in the above mentioned attribute sequence (except the classification attribute). Next, read the value for
percentage and purpose.

Input
-------------------
111
Rojer
100
100
Passenger
222
Kalam
200
100
Goods
333
Yashwin
400
300
Army
444
Thanishwini
500
500
Welfare
75
Army

Output
------------------
300
Yashwin%Inspirer
 */

import java.util.*;

class NavalVessel {
    private int vesselId;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification;

    public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }

    public int getNoOfVoyagesPlanned() {
        return noOfVoyagesPlanned;
    }

    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }

    @Override
    public String toString() {
        return vesselName + "# " + classification;
    }
}

public class Problem34_NavalVessel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NavalVessel[] navalVessels = new NavalVessel[4];

        for (int i = 0; i < navalVessels.length; i++) {
            System.out.println("Enter vessel Id: ");
            int vesselId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter vessel Name: ");
            String vesselName = sc.nextLine();
            System.out.println("Enter number of Voyages Planned: ");
            int noOfVoyagesPlanned = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter number of Voyages Completed: ");
            int noOfVoyagesCompleted = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter purpose: ");
            String purpose = sc.nextLine();

            navalVessels[i] = new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
        }

        System.out.println("Enter percentage parameter: ");
        double percentage = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter purpose parameter: ");
        String purposeParameter = sc.nextLine();

        double averageVoyagesByPct = findAvgVoyagesByPct(navalVessels, percentage);
        System.out.println("Average Voyages Completed: " + averageVoyagesByPct);

        NavalVessel vesselByGrade = findVesselByGrade(navalVessels, purposeParameter);
        if (vesselByGrade != null) {
            System.out.println(vesselByGrade);
        } else {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
    }

    public static double findAvgVoyagesByPct(NavalVessel[] navalVessels, double percentage) {
        double completedSum = 0;
        int count = 0;
        for (NavalVessel v : navalVessels) {
            if (findpercentVessel(v.getNoOfVoyagesCompleted(), v.getNoOfVoyagesPlanned()) > percentage) {
                completedSum += v.getNoOfVoyagesCompleted();
                count++;
            }
        }
        return count > 0 ? completedSum / count : 0;
    }

    public static double findpercentVessel(int completed, int planned) {
        return planned > 0 ? (double) completed / planned * 100 : 0;
    }

    public static NavalVessel findVesselByGrade(NavalVessel[] navalVessels, String purpose) {
        for (NavalVessel v : navalVessels) {
            if (v.getPurpose().equalsIgnoreCase(purpose)) {
                double percentage = findpercentVessel(v.getNoOfVoyagesCompleted(), v.getNoOfVoyagesPlanned());
                String classification;
                if (percentage == 100) {
                    classification = "Star";
                } else if (percentage >= 80 && percentage < 100) {
                    classification = "Leader";
                } else if (percentage >= 55 && percentage < 80) {
                    classification = "Inspirer";
                } else {
                    classification = "Striver";
                }
                v.setClassification(classification);
                return v;
            }
        }
        return null;
    }
}

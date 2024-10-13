/*
create a class Antenna with below attributes.
antennaid=int
antennaName=String
projectLead=String
antennaVSWR=double

the above attribute should be private ,write getter and setter and parametrized constructor as well.

create class MyClass with main method.
implement two static methods searchAntennaByName and sortAntennaByVSWR in MyClass class.


searchAntennaByName :
---------------------------------------
This method will take an array of Antenna objects and the string value as input parameter.The method will find out Antenna name(String parameterpassed).
It will return Antennaid if found.if there is no Antenna that matches then the method will return zero.
The main method should print the antennaid,if the returned value is not 0.if the returned value is 0 then print,"There is no antenna with the given parameter".


sortAntennaByVSWR:
--------------------------------------
This method will take an array of Antenna Objects and a double value as input.
This method will return an array of Antenna objects sorted in ascending orderof their antennaVSWR, which is less than VSWR(double value passed).

The main method should print name of the project leads from the returned array if the returned value is not null.if the returned value is null then main method
should print "No Antenna found";


input1:

111
Reconfigurable
Hema
0.4
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.3
444
Dielectric
Sai
0.65
Microstrip
0.5

output:
333
Teju
Hema


input 2:
111
Reconfigurable
Hema
0.3
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.4
444
Dielectric
Sai
0.65
Resonator
0.25

output:
There is no antenna with given parameter
No Antenna found
 */

import java.util.*;

class Antenna{
    private int antennaid;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;

    public Antenna(int antennaid, String antennaName, String projectLead, double antennaVSWR){
        this.antennaid = antennaid;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }
    public int getAntennaid(){
        return antennaid;
    }
    public String getAntennaName(){
        return antennaName;
    }

    public double getAntennaVSWR() {
        return antennaVSWR;
    }
    public String getProjectLead(){
        return projectLead;
    }
}

public class Problem41_Antenna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter antenna details: ");
        Antenna[] antennas = new Antenna[4];
        for(int i = 0; i < antennas.length; i++){
            System.out.println("Enter antenna id: ");
            int antennaId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter antenna name: ");
            String antennaName = sc.nextLine();
            System.out.println("Enter antenna projectLead: ");
            String projectLead = sc.nextLine();
            System.out.println("Enter antenna antennaVSWR: ");
            double antennaVSWR = sc.nextDouble();
            sc.nextLine();

            antennas[i] = new Antenna(antennaId , antennaName, projectLead, antennaVSWR);
        }
        System.out.println("Enter antenna name parameter: ");
        String antennaNameParameter = sc.nextLine();

        System.out.println("Enter antenna antennaVSWR parameter: ");
        double antennaVSWRParameter = sc.nextDouble();
        sc.nextLine();

        System.out.println("Output: ");

        int AntennaByName = searchAntennaByName(antennas , antennaNameParameter);
        System.out.println(AntennaByName == 0 ? "There is no antenna with the given parameter" : AntennaByName);
        List<Antenna> antennaByVSWR = sortAntennaByVSWR(antennas , antennaVSWRParameter);
        if(antennaByVSWR == null){
            System.out.println("No Antenna found");
        }else{
            for(Antenna antenna : antennaByVSWR){
                System.out.println(antenna.getProjectLead());
            }
        }


    }
    public static int searchAntennaByName(Antenna[] antennas, String antennaNameParameter){
        int antennaId = 0;
        for(Antenna antenna : antennas){
            if(antenna.getAntennaName().equals(antennaNameParameter)){
                antennaId = antenna.getAntennaid();
            }
        }
        return antennaId;
    }

    public static List<Antenna> sortAntennaByVSWR(Antenna[] antennas , double antennaVSWR){
        List<Antenna> sortedAntennasByVSWR = new ArrayList<>();
        for (Antenna antenna : antennas){
            if(antenna.getAntennaVSWR() < antennaVSWR){
                sortedAntennasByVSWR.add(antenna);
            }
        }
        if(sortedAntennasByVSWR.isEmpty()){
            return null;
        }
        sortedAntennasByVSWR.sort((s1 , s2) -> Double.compare(s1.getAntennaVSWR(),  s2.getAntennaVSWR()));
        return sortedAntennasByVSWR;

    }
}

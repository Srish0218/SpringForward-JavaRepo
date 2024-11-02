/*
Create class Sim2 with below attributes:

id - int
company - String
balance - int
ratePerSecond - double
circle - String

Create class Solution and implement static method "matchAndSort" in the Solution class.

This method will take array of Sim objects, search_circle String and search_rate double as parameters.
And will return another Sim array where the search_circle matches with the circle parameter of the original Sim array and
the search_rate double is greater than the original array of Sim object's ratePerSecond attribute which is also sorted by
means of balance attribute in descending order.

Write necessary getters and setters.

Before calling "matchAndSort" method in the main method, read values for four Sim objects referring the attributes in above
sequence along with a String search_circle and a double search_rate. Then call the "matchAndSort" method and write logic in
main method to print the id's of the result obtained.

Input
--------------------------
1
jio
430
1.32
mumbai
2
idea
320
2.26
mumbai
3
airtel
500
2.54
mumbai
4
vodafone
640
3.21
mumbai
mumbai
3.4

Output
--------------------------
4
3
1
2
 */

import java.util.*;

class Sim2{
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;

    public Sim2(int id, String company, int balance, double ratePerSecond, String circle){
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }
    public int getId(){
        return id;
    }

    public String getCircle() {
        return circle;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public int getBalance() {
        return balance;
    }
}
public class Problem99_Sim2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of sims: ");
        Sim2[] sims = new Sim2[sc.nextInt()];
        sc.nextLine();
        for(int i = 0; i < sims.length; i++){
            System.out.println("Enter sim id " + (i + 1) + ": ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter company " + (i + 1) + ": ");
            String company = sc.nextLine();
            System.out.println("Enter balance " + (i + 1) + ": ");
            int balance = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter rate per second " + (i + 1) + ": ");
            double ratePerSecond = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter circle " + (i + 1) + ": ");
            String circle = sc.nextLine();
            sims[i] = new Sim2(id, company, balance, ratePerSecond, circle);
        }
        System.out.println("Enter circle parameter: ");
        String circle = sc.nextLine();
        System.out.println("Enter rate per second parameter: ");
        double ratePerSecond = sc.nextDouble();
        sc.nextLine();

        ArrayList<Sim2> mergedSims = matchAndSort(sims , circle , ratePerSecond);
        if(mergedSims != null){
            for(Sim2 sim : mergedSims){
                System.out.println(sim.getId());
            }
        }else{
            System.out.println("No match found");
        }

    }
    public static ArrayList<Sim2> matchAndSort(Sim2[] sims, String circle, double ratePerSecond){
        ArrayList<Sim2> mergedSims = new ArrayList<>();
        for(Sim2 sim : sims){
            if(sim.getCircle().equals(circle) && sim.getRatePerSecond() < ratePerSecond){
                mergedSims.add(sim);
            }
        }
        mergedSims.sort((s1 , s2) -> Integer.compare(s2.getBalance() , s1.getBalance()));
        return mergedSims;
    }

}

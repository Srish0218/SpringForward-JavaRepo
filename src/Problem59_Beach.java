/*
Create a class Beach with the below attributes:
beachId - int
beachName - String
beachRating - int
beachCost - int
Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.
Implement two static methods - findLeastRatingWithName in Solution class.

findLeastRatingWithName method:
-----------------------------------
This method will take three input parameters - array of Beach objects and string parameter and a int parameter. The method
will return the minimum rating attribute from beach objects whose name is matched with string parameter and whose amount
is greater than the int parameter. If no data found of beach objects, then the method should return 0.

Note : All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.
For findLeastRatingWithName method - The main method should print the least rating from the beach array. If return 0, then
you should print "No beach found".

Input ->
1001
Puri
3
8600
1002
Digha
5
6200
1003
Digha
3
4000
1004
Digha
4
5500
digha
5000

Output ->
4
 */




import java.util.ArrayList;
import java.util.Scanner;

class Beach{
    private int beachId;
    private String beachName;
    private int beachRating;
    private int beachCost;

    public Beach(int beachId, String beachName, int beachRating, int beachCost) {
        this.beachId = beachId;
        this.beachName = beachName;
        this.beachRating = beachRating;
        this.beachCost = beachCost;
    }

    public int getBeachCost() {
        return beachCost;
    }

    public int getBeachRating() {
        return beachRating;
    }

    public String getBeachName() {
        return beachName;
    }
}

public class Problem59_Beach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter beach details: \n");
        Beach[] beaches = new Beach[4];
        for (int i = 0; i < beaches.length; i++) {
            System.out.println("Enter beach id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter beach name: ");
            String beachName = sc.nextLine();
            System.out.println("Enter beach rating: ");
            int rating = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter beach cost: ");
            int cost = sc.nextInt();
            sc.nextLine();
            beaches[i] = new Beach(id, beachName, rating, cost);
        }
        System.out.println("Enter beach name parameter: ");
        String beachNameParameter = sc.nextLine();
        System.out.println("Enter beach cost parameter: ");
        int costParameter = sc.nextInt();
        sc.nextLine();

        System.out.println("Output: ");

        int minRating = findLeastRatingWithName(beaches , beachNameParameter , costParameter);
        System.out.println(minRating == 0 ? "No beach found" : minRating);


    }
    public static int findLeastRatingWithName(Beach[] beaches, String beachNameParameter, int costParameter) {
        ArrayList<Integer> beachList = new ArrayList<>();
        for(Beach b : beaches) {
            if(b.getBeachName().equalsIgnoreCase(beachNameParameter) && b.getBeachCost() >= costParameter) {
                beachList.add(b.getBeachRating());
            }
        }
        return beachList.isEmpty() ? 0 : getMinRating(beachList);
    }
    public static int getMinRating(ArrayList<Integer> beachList) {
        int minRating = Integer.MAX_VALUE;
        for(Integer i : beachList) {
            if(i < minRating) {
                minRating = i;
            }
        }
        return minRating;
    }
}

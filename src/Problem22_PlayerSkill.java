//Create a class Player with below attributes:
//
//playerId - int
//skill - String
//level - String
//points - int
//
//        Write getters, setters and parameterized constructor in the above mentioned attribute
//sequence as required.
//
//        Create class Solution with the main method.
//
//Implement two static methods - findPointsForGivenSkill and getPlayerBasedOnLevel in Solution class.
//
//findPointsForGivenSkill method:
//        ------------------------------------
//This method will take two input parameters - array of Player objects
//and string parameter skill. The method will return the sum of the points attribute from player objects
//for the skill passed as parameter. If no player with the given skill is present in the array of player
//objects, then the method should return 0.
//
//getPlayerBasedOnLevel method:
//        -------------------------------------
//This method will take two String parameters level and skill, along with the array of Player objects.
//The method will return the player object, if the input String parameters matches with the level and
//skill attribute of the player object and its point attribute is greater than or equal to 20. If any
//of the conditions are not met, then the method should return null.
//
//Note : No two player object would have the same value for skill and level attribute. All player object
//would have the points greater than 0. All the searches should be case insensitive.
//
//These above mentioned static methods should be called from the main method.
//
//For findPointsForGivenSkill method - The main method should print the points as it is if the returned
//price is greater than 0, or it should print "The given Skill is not available".
//
//For getPlayerBasedOnLevel method - The main method should print the playerId of the returned player object.
//If the returned value is null then it should print "No player is available with specified level, skill
//and eligibility points".
//
//Before calling these static methods in main, use Scanner object to read the values of four Player objects
//referring attributes in the above mentioned attribute sequence. Next, read the value for skill and level.
//Please consider the skill value read above as skill parameter for both the static methods.
//
//        Input:
//        -----------
//        101
//Cricket
//        Basic
//20
//        102
//Cricket
//        Intermediate
//25
//        111
//Football
//        Intermediate
//50
//        113
//BaseBall
//        Advanced
//100
//Cricket
//        Intermediate
//
//Output:
//        --------------
//        45
//        102


import java.util.*;

class PlayerSkill {
    private int playerId;
    private String skill;
    private String level;
    private int points;

    public PlayerSkill(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;

    }
    public String getSkill() {
        return this.skill;
    }
    public int getPoints() {
        return this.points;
    }
    public int getPlayerId() {
        return this.playerId;
    }
    public String getLevel() {
        return this.level;
    }

}

public class Problem22_PlayerSkill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayerSkill[] skills = new PlayerSkill[4];
        System.out.println("Enter player skill details: ");
        for (int i = 0; i < skills.length; i++) {
            System.out.println("Enter player Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter player skill: ");
            String skill = sc.nextLine();
            System.out.println("Enter player level: ");
            String level = sc.nextLine();
            System.out.println("Enter player points: ");
            int points = sc.nextInt();
            sc.nextLine();

            skills[i] = new PlayerSkill(id, skill, level, points);

        }
        System.out.println("Enter Skill as parameter: ");
        String skillParameter = sc.nextLine();
        System.out.println("Enter Level as parameter: ");
        String levelParameter = sc.nextLine();

        System.out.println("Output: ");

        int pointsResult = findPointsForGivenSkill(skills , skillParameter);
        System.out.println(pointsResult > 0 ? pointsResult : "The given Skill is not available");

        PlayerSkill levelResult = getPlayerBasedOnLevel(skills , levelParameter , skillParameter);
        System.out.println(levelResult != null ? levelResult.getPlayerId() : "No player is available with specified level, skill \n" +
                "and eligibility points");

    }
    public static int findPointsForGivenSkill(PlayerSkill[] skills, String skillParameter) {
        int pointSum = 0;
        for(PlayerSkill skill : skills) {
            if(skill.getSkill().equalsIgnoreCase(skillParameter)){
                pointSum += skill.getPoints();
            }
        }
        return pointSum;
    }

    public static PlayerSkill getPlayerBasedOnLevel(PlayerSkill[] skills , String levelParameter , String skillParameter) {
        List<PlayerSkill> result = new ArrayList<>();
        for(PlayerSkill skill : skills) {
            if(skill.getLevel().equalsIgnoreCase(levelParameter) && skill.getSkill().equalsIgnoreCase(skillParameter) && skill.getPoints() >= 20){
                result.add(skill);
            }
        }
        if(result.isEmpty()){
            return null;
        }else
            return result.getFirst();

    }
}

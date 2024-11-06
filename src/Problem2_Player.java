/*
Q.2 Create a class Player with below attributes:
playerId - int
playerName - String
runs - int
playerType - String
matchType - String
The above attributes should be private, write getters, setters and parameterized constructor as required.
        Create class Solution with main method.
Implement two static methods - findPlayerWithLowestRuns and findPlayerByMatchType in Solution class.
findPlayerWithLowestRuns method:
This method will take array of Player objects and a String value as input parameters.
The method will return the least runs of the Player from array of Player objects for the given player type.
        (String parameter passed). If no Player with the above condition are present in array of Player objects,
then the method should return 0.
findPlayerByMatchType method:
This method will take array of Player objects and String value as input parameters and return the array of Player objects
belonging to the match type passed as input parameter in Descending order of playerId.
If no Player with the above condition are present in the array of Player objects, then the method should return null.
Note : No two Players will have the same playerId and runs.
All the searches should be case insensitive.
The above mentioned static methods should be called from the main method.
For findPlayerWithLowestRuns method - The main method should print the returned runs as it is
if the returned value is greater than 0 or it should print "No such player".
Eg: 25
where 25 is the lowest runs of the Player.
For findPlayerByMatchType method - The main method should print the playerId from the returned Player array for each
Player if the returned value is not null.
If the returned value is null then it should print "No Player with given matchType".
Eg:
        13
        11
where 13 and 11 are the playerId's.
Before calling these static methods in main, use Scanner object to read the values of four Player
objects referring attributes in the above mentioned attribute sequence.
        Next, read the value of two String parameter for capturing player type and match Type.
Consider below sample input and output:
Input1:
        11
Sachin
100
TCS IPA QUESTION ANSWER
International
One day
12
Shewag
133
International
        Test
13
Varun
78
State
        Test
14
Ashwin
67
State
One day
State
One day
Output:
        67
        14
        11
Input2:
        11
Sachin
100
International
One day
12
Shewag
133
International
        Test
13
Varun
78
State
        Test
14
Ashwin
67
State
One day
District
        T20
Output:
No such player
No Player with given matchType
*/

import java.util.*;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    // Getters
    public int getPlayerId() {
        return playerId;
    }

    public int getRuns() {
        return runs;
    }
    public String getPlayerType() {
        return playerType;
    }
    public String getMatchType() {
        return matchType;
    }

    // Override toString() to provide custom string representation of Player objects
    @Override
    public String toString() {
        return "Player ID: " + playerId +
                ", Name: " + playerName +
                ", Runs: " + runs +
                ", Type: " + playerType +
                ", Match Type: " + matchType;
    }
}

public class Problem2_Player {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];

//         Input loop to gather player information
        for (int i = 0; i < players.length; i++) {
            System.out.println("Enter ID of player " + (i + 1) + ": ");
            int id = sc.nextInt();
            sc.nextLine();  // Clear newline character
            System.out.println("Enter Name of player " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.println("Enter Runs of player " + (i + 1) + ": ");
            int runs = sc.nextInt();
            sc.nextLine();  // Clear newline character
            System.out.println("Enter Type of player " + (i + 1) + ": ");
            String playerType = sc.nextLine();
            System.out.println("Enter Match Type of player " + (i + 1) + ": ");
            String matchType = sc.nextLine();

            // Create a new Player object with gathered data
            players[i] = new Player(id, name, runs, playerType, matchType);
        }
//        players[0] = new Player(11, "Sachin", 100, "International", "One Day");
//        players[1] = new Player(12, "Shewag", 133, "International", "Test");
//        players[2] = new Player(13, "varun", 78, "State", "Test");
//        players[3] = new Player(14, "Ashwin", 67, "State", "One Day");

        // Printing loop to display player information after input is complete
        System.out.println("\nPlayer Details:");
        for (Player player : players) {
            System.out.println(player);
        }

        System.out.println("Enter Input Parameters: ");
        System.out.println("Player Type: ");
        String inputPlayerType = sc.nextLine();
        System.out.println("Match Type: ");
        String inputMatchType = sc.nextLine();
        System.out.println("Player Type: " + inputPlayerType + "\nMatch Type: " + inputMatchType);

        int result1 = findPlayerWithLowestRuns(players , inputPlayerType);
        System.out.println(result1 > 0? result1 : "No such player");

        Player[] result2 = findPlayerByMatchType(players , inputMatchType);
        if (result2!= null)
            for (Player player : result2) {
                System.out.println(player.getPlayerId());
            }
        else
            System.out.println("No Player with given matchType");


        sc.close(); // Close the scanner to avoid resource leaks
    }

    public static int findPlayerWithLowestRuns(Player[] players , String PlayerType) {
        int lowestRuns = Integer.MAX_VALUE;
        boolean found = false;
        for(Player pl : players){
            if(Objects.equals(pl.getPlayerType(), PlayerType)){
                found = true;
                if(pl.getRuns() < lowestRuns){
                    lowestRuns = pl.getRuns();
                }
            }
        }
        return found ? lowestRuns : 0;
    }
    public static Player[] findPlayerByMatchType(Player[] players, String matchType) {
        List<Player> matchedPlayers = new ArrayList<Player>();

        for (Player pl : players){
            if(Objects.equals(pl.getMatchType(), matchType)){
                matchedPlayers.add(pl);
            }
        if (matchedPlayers.isEmpty())
            return null;
        }
        // Sort the list in descending order of playerId
        matchedPlayers.sort((p1, p2) -> Integer.compare(p2.getPlayerId(), p1.getPlayerId()));
        return matchedPlayers.toArray(new Player[0]);



    }
}

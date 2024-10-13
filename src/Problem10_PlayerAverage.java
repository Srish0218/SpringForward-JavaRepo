/*
Create class Player2 with below attributes:

id - int
name - String
iccRank - int
matchesPlayed - int
runsScored - int

Create class Solution and implement static method "findAverageOfRuns" in the Solution class.
This method will take array of Player objects and a target int as parameters.
And will return another double array where the target int is lesser than or equal to the original array of Player object's
matchesPlayed attribute and contains the average run scored by each player satisfying above condition.

Write necessary getters and setters.

Before calling "findAverageOfRuns" method in the main method, read values for four Player objects referring the attributes
in above sequence along with a int target.
Then call the "findAverageOfRuns" method and write logic in main method to print "Grade A",if the calculated averageRun
value is 80 to 100. Else if the averageRun value is between 50 and 79 then print "Grade B". Else print "Grade C".

Input
------------------
100
Sachin
5
150
13000
101
Sehwag
4
120
10000
103
Dhoni
7
110
7000
104
Kohli
15
57
4400
100

Output
--------------------
Grade A
Grade A
Grade B
 */


import java.util.*;

class PlayerAverage{
    private int playerId;
    private String playerName;
    private int iccRank;
    private int noOfMatchesPlayed;
    private int totalRunsScored;

    public PlayerAverage(int playerId, String playerName, int iccRank ,int noOfMatchesPlayed, int totalRunsScored) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.iccRank = iccRank;
        this.noOfMatchesPlayed = noOfMatchesPlayed;
        this.totalRunsScored = totalRunsScored;
    }
    public int getNoOfMatchesPlayed(){
        return this.noOfMatchesPlayed;
    }
    public int getAverageRunRate() {
        return this.noOfMatchesPlayed > 0 ? this.totalRunsScored / this.noOfMatchesPlayed : 0;
    }
}

public class Problem10_PlayerAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayerAverage[] players = new PlayerAverage[4];
        System.out.println("Enter player details : ");
        for (int i = 0; i < players.length; i++) {
            System.out.println("Enter player id : " + (i + 1));
            int playerId = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter player Name : " + (i + 1));
            String playerName = sc.nextLine();

            System.out.println("Enter player icc ranking : " + (i + 1));
            int iccRank = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter player number of matches : " + (i + 1));
            int noOfMatchesPlayed = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter player total run scored : " + (i + 1));
            int totalRunsScored = sc.nextInt();
            sc.nextLine();
            players[i] = new PlayerAverage(playerId, playerName, iccRank , noOfMatchesPlayed , totalRunsScored);

        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        sc.nextLine();

        List<Integer> results = findAverageScoreOfPlayers(players , target);
        for(int runRate : results){
            if(runRate >= 80){
                System.out.println("Grade A Player");
            }else if (runRate >= 50 && runRate <= 79){
                System.out.println("Grade B Player");
            }
        }

    }
    public static List<Integer> findAverageScoreOfPlayers(PlayerAverage[] players, int target){
        List<Integer> results = new ArrayList<>();
        for(PlayerAverage player: players) {
            if(player.getNoOfMatchesPlayed() >= target)
                results.add(player.getAverageRunRate());
        }
        return results;

    }
}

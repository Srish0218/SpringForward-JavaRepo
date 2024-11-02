/*
Create class Team with below attributes:

tId - int
tName - String
tCountry - String
tRun - int

The above attributes should be private.Write Getter and Setter and parametrized constructor as required.

Create class Solution with main method.

Implement One static method-

● findPlayer

findPlayer in the solution class.
This method will take array of Team objects, int paramater run and String country and returns the Team object where taken
country is matched with the country of team object and team run is greater than the taken run.

Write code to perform following tasks:

1. In main mehod, take 1st input as integer parameter which shows the number of team object.
2. Take necessary input variable and call findPlayer.
3. All searches should be case insensitive.

For this method- The main method should print the team object. As if the returned value is not null,
or it should print "No team is found from the given country and run".

Input
------------------
3
1
Arijit
India
43
2
Doremon
China
40
3
Donal
England
32
35
China



Output
--------------
2
Doremon
China
40
 */

import java.util.*;

class Team{
    private int teamId;
    private String teamName;
    private String teamCountry;
    private int teamRuns;
    public Team(int teamId, String teamName, String teamCountry, int teamRuns){
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamCountry = teamCountry;
        this.teamRuns = teamRuns;
    }
    public String getTeamCountry(){
        return teamCountry;
    }
    public int getTeamRuns(){
        return teamRuns;
    }

    @Override
    public String toString() {
        return teamId + "\n" + teamName + "\n" + teamCountry + "\n" + teamRuns;
    }
}
public class Problem100_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of teams: ");
        Team[] teams  = new Team[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < teams.length; i++) {
            System.out.println("Enter team id: ");
            int teamId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter team name: ");
            String teamName = sc.nextLine();
            System.out.println("Enter team country: ");
            String teamCountry = sc.nextLine();
            System.out.println("Enter team run: ");
            int teamRun = sc.nextInt();
            sc.nextLine();

            teams[i] = new Team(teamId, teamName, teamCountry, teamRun);
        }
        System.out.println("Enter run parameter: ");
        int runParameter = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter team country parameter: ");
        String teamCountryParameter = sc.nextLine();

        Team teamMatched = findPlayer(teams , runParameter , teamCountryParameter);
        System.out.println(teamMatched != null ? teamMatched : "No team is found from the given country and run");
    }
    public static Team findPlayer(Team[] teams , int runParameter, String teamCountryParameter){
        for(Team team : teams){
            if(team.getTeamRuns() > runParameter && team.getTeamCountry().equals(teamCountryParameter)){
                return team;
            }
        }
        return null;
    }

}

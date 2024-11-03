/*
Create class Player3 with below attributes:

id - int
name - String
Country - String
matchesPlayed - int
runsScored - int

the above attribute should be private ,write getter and setter and parametrized constructor as well.

Create class Solution and implement static method "findPlayerName" in the Solution class.
This method will take array of Player objects and a String as country parameters and int as run parameter.
And will return another array of Player object where the String is matched with country and run scored of that Player object
is greater than the input int parameter. All the searches should be case insensitive.

Before calling "findPlayerName" method in the main method, read values for Player objects referring the attributes
in above sequence along with a int target.
Then call the "findPlayerName" method and write logic in main method to print Player object. If any of the input doesn't match
with the following attributes then print "No player found".

Note:
--------------
1. First take input as the number of player object, then the player details
2. Show the output as the dictionary order of the players name
3. First print player id, and then use ' : ' sign and after that player name
    3 : Arijit
    1 : Minaz
    5 : Priyanka

Input : 1
--------------
5
1
Arnab
India
4
94
2
Virat
UK
5
68
3
Arijit
India
82
87
4
Raj
India
21
78
5
Priyanka
India
12
86
India
80

Output : 1
-----------------
3:Arijit
1:Arnab
5:Priyanka

___________________________________________________________

Input : 2
--------------
5
1
Arnab
India
4
94
2
Virat
UK
5
68
3
Arijit
India
82
87
4
Raj
India
21
78
5
Priyanka
India
12
86
UK
80

Output : 2
--------------------
No player found
 */

import java.util.*;

class Player3{
    private int id;
    private String name;
    private String Country;
    private int matchesPlayed;
    private int runsScored;

    public Player3(int id, String name, String Country, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.Country = Country;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;

    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCountry() {
        return Country;
    }
    public int getMatchesPlayed() {
        return matchesPlayed;
    }
    public int getRunsScored() {
        return runsScored;
    }
}

public class Problem106_Player3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of players: ");
        Player3[] players = new Player3[sc.nextInt()];
        for (int i = 0; i < players.length; i++) {
            System.out.println("Enter player id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter player name: ");
            String name = sc.nextLine();
            System.out.println("Enter player country: ");
            String Country = sc.nextLine();
            System.out.println("Enter player matches: ");
            int matchesPlayed = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter player runs scored: ");
            int runsScored = sc.nextInt();
            sc.nextLine();

            players[i] = new Player3(id, name, Country, matchesPlayed, runsScored);
        }
        System.out.println("Enter player country parameter: ");
        String countryParameter = sc.nextLine();
        System.out.println("Enter player runs scored parameter: ");
        int runsScored = sc.nextInt();
        sc.nextLine();

        ArrayList<Player3> playerDetails = findPlayerName(players , countryParameter , runsScored);
        if (playerDetails == null) {
            System.out.println("No players found");
        }else{
            for (Player3 player : playerDetails) {
                System.out.println(player.getId() + " : " + player.getName());
            }
        }

        sc.close();
    }
    public static ArrayList<Player3> findPlayerName(Player3[] players, String countryParameter, int runsScored) {
        ArrayList<Player3> playerDetails = new ArrayList<>();
        for (Player3 player : players) {
            if (player.getCountry().equals(countryParameter) && player.getRunsScored() > runsScored) {
                playerDetails.add(player);
            }
        }
        if (playerDetails.isEmpty()) {
            return null;
        }
        playerDetails.sort(Comparator.comparing(Player3::getName));
//        playerDetails.sort((s1, s2) -> String.CASE_INSENSITIVE_ORDER.compare(s1.getName(), s2.getName()));
        return playerDetails;
    }
}

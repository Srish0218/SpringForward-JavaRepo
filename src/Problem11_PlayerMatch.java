import java.util.*;
class PlayerMatch{
    private int Id;
    private String country;
    private String side;
    private Double price;

    public PlayerMatch(int id, String country, String side, Double price){
        this.Id = id;
        this.country = country;
        this.side = side;
        this.price = price;
    }
    public String getSide(){
        return this.side;
    }
    public int getId(){
        return this.Id;
    }

}

public class Problem11_PlayerMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details players: ");
        PlayerMatch[] players = new PlayerMatch[4];
        for(int i = 0; i < players.length; i++){
            System.out.println("Enter Id of player " + (i + 1) + ": ");
            int Id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter country of player " + (i + 1) + ": ");
            String country = sc.nextLine();
            System.out.println("Enter side of player " + (i + 1) + ": ");
            String side = sc.nextLine();
            System.out.println("Enter price of player " + (i + 1) + ": ");
            Double price = sc.nextDouble();
            sc.nextLine();
            players[i] = new PlayerMatch(Id , country , side , price);
        }
        System.out.println("Enter Search Parameter: ");
        String searchParameter = sc.nextLine();
        List<Integer> finalResult = searchPlayerForMatch(players , searchParameter);
        Collections.sort(finalResult);
        System.out.println("Output: ");
        for(int i : finalResult){
            System.out.println(i);
        }


    }
    public static List<Integer> searchPlayerForMatch(PlayerMatch[] playerList , String searchParameter){
        List<Integer> result = new ArrayList<>();
        for(PlayerMatch p : playerList){
            if(p.getSide().equalsIgnoreCase(searchParameter))
                result.add(p.getId());
        }
        return result;
    }
}

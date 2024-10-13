import java.util.*;

public class Problem31_charCount {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        string = string.toLowerCase();
        for (String ch : string.split("")) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);

            }else{
                map.put(ch, map.get(ch) + 1);
            }

        }
        for (Map.Entry<String , Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());


        }
        System.out.println();
        System.out.println("Enter character to get its occurrence : ");
        String ch = sc.nextLine();

        int occurrence = map.get(ch);
        System.out.println(occurrence);
    }
}

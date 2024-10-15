/* Sort name by dictionary order
    Input
    -----------------
    Arijit
    Minaz
    Arnab

    Output
    -------------------
    Arijit
    Arnab
    Minaz
 */

import java.util.*;

public class Problem49_SortingName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names: ");
        int n = sc.nextInt();
        List<String> names = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            System.out.println("Enter the name of "+(i+1)+" person: ");
            String name = sc.next();
            names.add(name);
        }
        System.out.println("Output: ");
        names.sort((s1, s2) -> s1.compareTo(s2));
        for(String name : names){
            System.out.println(name);
        }
    }
}

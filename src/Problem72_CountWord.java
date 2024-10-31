/* Count number of word in a string
*Note : Always ignore the spaces if more than 1 space given between two word

Sample Input : 1
------------------------
Kalyani Goverment Engineering College

Process
---------------------------
[Kalyani, Goverment, Engineering, College]

Output
---------------------------
Number of word : 4
*************************************
Sample Input : 2
------------------------
Kalyani Goverment  Engineering College

Process
---------------------------
[Kalyani, Goverment, , Engineering, College]

Output
---------------------------
Number of word : 4
*/



import java.util.Scanner;

public class Problem72_CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        String[] wordsArray = words.split(" ");
        int count = 0;
        for (String word : wordsArray) {
            System.out.println(word);
            if(!word.isEmpty()){
                count ++;
            }
        }
        System.out.println(count);
    }

}

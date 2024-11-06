import java.util.Scanner;

public class Problem111_RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        System.out.println("Enter character to remove: ");
        char ch = sc.next().charAt(0);
        for (int i = 0; i < string.length(); i++) {
            if (!(string.charAt(i) == ch))
                System.out.print(string.charAt(i));
        }
    }
}

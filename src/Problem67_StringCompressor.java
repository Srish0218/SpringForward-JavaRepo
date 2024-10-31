import java.util.Scanner;

public class Problem67_StringCompressor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to compress: ");
        String input = scanner.nextLine();

        String result = "";
        int count = 1;

        for (int i = 1; i <= input.length(); i++) {
            // Check if the next character is different or end of string
            if (i == input.length() || input.charAt(i) != input.charAt(i - 1)) {
                result += input.charAt(i - 1) + Integer.toString(count);
                count = 1;
            } else {
                count++;
            }
        }

        System.out.println("Compressed string: " + result);
        scanner.close();
    }
}

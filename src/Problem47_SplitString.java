/*Books are identified by International Standard Book Number(ISBN). ISBNs contain
13 digits, arranged in five groups such as 978-0-13-110362-8. The first group
(GSI prefix) is currently either 978 or 979. The group identifier specifies the
language or country of origin (for example 0 and 1 are used for English speaking
countries). The publisher code identifies the publisher (13 is the code for
Prentice Hall, New Jersey). The item number is assigned by the publisher to
identify a specific book (110362 is the code for the book "The C Programming
Language" by Kernighan and Ritchie) and ISBN ends with a check digit that's used
to verify the accuracy of preceding digits. Write a program that breaks down the
ISBN entered by the user.:

Sample Input:
-----------------------
Enter ISBN: 978-0-13-110362-8

Sample Output:
-----------------------
GSI Prefix: 978
Group Identifier: 0
Publisher Code: 13
Item Number: 110362
Check Digit: 8

Note: The number of digits in each group may vary. You can't assume that the
groups have the length shown in the sample output. You can test your program
with actual ISBN values (usually found on the back cover of a book and on the
copyright page */

import java.util.*;

public class Problem47_SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ISBN as string: ");
        String string = sc.nextLine();
        String[] codes = string.split("-");
//        System.out.println(Arrays.toString(codes));
        System.out.println("Output: \n");
        System.out.println("GSI Prefix: "+ codes[0] + "\n" +
                "Group Identifier: " + codes[1] + "\n" +
                "Publisher Code: " + codes[2] + "\n" +
                "Item Number: " + codes[3] + "\n" +
                "Check Digit:: " + codes[4]);
    }
}

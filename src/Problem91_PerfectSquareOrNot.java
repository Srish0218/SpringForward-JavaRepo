/*
Write a Java program that determines whether a given integer is a perfect square.
A number is considered a perfect square if its square root is an integer.
The program should read an integer from the user and print "Perfect Square" if it is a perfect square or "Not a perfect square" if it is not.
Additionally, if the input is negative, the program should output a message indicating that negative numbers cannot be perfect squares.

Input: 16
Output: Perfect Square

Input: 20
Output: Not a perfect square

Input: -4
Output: Not a perfect square (negative number)
*/

import java.util.*;

public class Problem91_PerfectSquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        if(N <= 0)
            System.out.println("Not a perfect square");
        else
            System.out.println(isPerfectSquare(N) ? "Perfect Square" : "Not a perfect square");
    }
    public static boolean isPerfectSquare(int N) {
        for(int i = 2 ; i * i <= N ; i++){
            if( i * i == N) return true;
        }
        return false;
    }
}

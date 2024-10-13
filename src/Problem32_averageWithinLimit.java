/* Find average of a number array between two limit numbers (except the two numbers)
 * Input
 * ---------------
 *  5
    1
    2
    3
    4
    5
 *  1
 *  4
 *
 * Output
 * ---------------
 * 2
 */

import java.util.*;

public class Problem32_averageWithinLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter lower limit: ");
        int lowerLimit = sc.nextInt();
        System.out.println("Enter upper limit: ");
        int upperLimit = sc.nextInt();
        int sum = 0;

        Arrays[] arr = new Arrays[n];

        while(lowerLimit <= upperLimit){
            System.out.println(lowerLimit);
            sum += lowerLimit;
            lowerLimit++;
        }
        System.out.println("Average: " + sum/n);


        }


    }


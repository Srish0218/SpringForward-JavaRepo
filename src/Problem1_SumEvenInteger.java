/* Write a function that takes a list of numbers as input and returns the sum of all the even numbers in the list.

For example:

Enter size of Array: 4
Create an array:
10 15 20 25
The array is: [10, 15, 20, 25]
Sum of even numbers in the array: 30

 */


import java.util.*;

public class Problem1_SumEvenInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the number of elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements in array: ");

        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Enter Limit 1: ");
        int limit1 = sc.nextInt();
        System.out.println("Enter Limit 2: ");
        int limit2 = sc.nextInt();
        System.out.println("Limit 1 : " + limit1 + "\nLimit 2 : " + limit2);

        int sum = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > limit1 && arr[i] < limit2){
                sum += arr[i];
                count ++;

            }
        }
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + sum/count);
    }
}

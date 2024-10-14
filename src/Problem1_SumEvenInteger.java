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
        System.out.println("Enter Size of array: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        System.out.println("Enter the number of elements: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.println("Elements in array: ");

        for(Integer i : arr){
            if(i%2 == 0){
                sum += i;
            }
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("Sum of even numbers: "+sum);


    }
}

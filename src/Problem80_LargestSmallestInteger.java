/*
Write a program that reads in a list of integers and prints out the smallest and largest integer in the list.

Your program should first ask the user to enter the number of integers they want to input. Then it should prompt the user to
enter each integer one by one.

After all the integers have been entered, the program should output the smallest and largest integer in the list.

Input
-------------------------
Enter the number of integers: 5
Enter integer 1: 10
Enter integer 2: -5
Enter integer 3: 20
Enter integer 4: 0
Enter integer 5: 15

Output
-------------------------
Smallest integer: -5
Largest integer: 20

 */

import java.util.*;

public class Problem80_LargestSmallestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter integer: " + (i+1));
            nums.add(sc.nextInt());
            sc.nextLine();
        }
        nums.sort(Integer::compare);

        System.out.println(nums);
        System.out.println("Smallest num: "  + nums.get(0));
        System.out.println("Largest num: " + nums.get(nums.size()-1));

        System.out.println("Using methods: ");
        System.out.println("Smallest num: "  + isSmallest(nums));
        System.out.println("Largest num: " + isLargest(nums));

        sc.close();
    }

    public static int isSmallest(ArrayList<Integer> nums) {
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num < smallest){
                smallest = num;
            }
        }
        return smallest;
    }
    public static int isLargest(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num > largest){
                largest = num;
            }
        }
        return largest;
    }
}

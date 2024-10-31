/*
 Majority of an element means if an element is present in an array for more than n/2 times,
  where n is the length of the Array
  Array = {3, 3, 4, 2, 4, 4, 2, 4, 4} => 4

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem83_MajorityNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number " + (i + 1) + ": ");
            nums.add(sc.nextInt());
            sc.nextLine();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums.get(i))) {
                map.put(nums.get(i), map.get(nums.get(i)) + 1);
            }
            else{
                map.put(nums.get(i), 1);
            }

        }
        System.out.println(map);
        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                System.out.println("Majority element: " + key);
                break;
            }
        }

    }
}
